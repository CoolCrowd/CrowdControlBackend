package edu.kit.ipd.crowdcontrol.objectservice.database.operations;

import edu.kit.ipd.crowdcontrol.objectservice.database.model.Tables;
import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.WorkerRecord;
import edu.kit.ipd.crowdcontrol.objectservice.proto.Worker;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;

import java.util.List;
import java.util.Optional;

import static edu.kit.ipd.crowdcontrol.objectservice.database.model.Tables.WORKER;

/**
 * Responsible for the operations involving the worker-table.
 *
 * @author LeanderK
 * @author Niklas Keller
 */
public class WorkerOperations extends AbstractOperations {

    public WorkerOperations(DSLContext create) {
        super(create);
    }

    /**
     * inserts the WorkerRecord into the database.
     *
     * @param workerRecord the record to insert
     *
     * @return the resulting WorkerRecord existing in the database
     */
    public WorkerRecord createWorker(WorkerRecord workerRecord) {
        workerRecord.setIdWorker(null);
        return create.transactionResult(conf -> {
            boolean existing = DSL.using(conf).fetchExists(
                    DSL.selectFrom(Tables.WORKER)
                            .where(Tables.WORKER.PLATFORM.eq(workerRecord.getPlatform()))
                            .and(Tables.WORKER.IDENTIFICATION.eq(workerRecord.getIdentification()))
            );
            if (existing) {
                throw new IllegalArgumentException("worker with the same platform and identification is" +
                        "already existing");
            }
            return create.insertInto(Tables.WORKER)
                    .set(workerRecord)
                    .returning()
                    .fetchOne();
        });
    }

    /**
     * deletes a worker.
     *
     * @param workerRecord the record to delete, the ID must be set
     *
     * @return true if deleted
     */
    public boolean deleteWorker(WorkerRecord workerRecord) throws IllegalArgumentException {
        assertHasPrimaryKey(workerRecord);
        return create.executeDelete(workerRecord) == 1;
    }

    /**
     * deletes the worker and assigns all his work to the anonymous worker.
     * <p>
     * The worker will be deleted, there is no way to pay him after this action.
     *
     * @param workerRecord the worker to
     *
     * @throws IllegalArgumentException if the primary key is not set or the worker is not existing
     *                                  in the database
     */
    public void anonymizeWorker(WorkerRecord workerRecord) throws IllegalArgumentException {
        assertHasPrimaryKey(workerRecord);

        WorkerRecord toAnonymize = create.selectFrom(Tables.WORKER)
                .where(Tables.WORKER.ID_WORKER.eq(workerRecord.getIdWorker()))
                .fetchOptional()
                .orElseThrow(() -> new IllegalArgumentException("worker: " + workerRecord.getIdWorker() + " is not existing"));

        WorkerRecord anonWorker = create.transactionResult(configuration ->
                DSL.using(configuration).selectFrom(Tables.WORKER)
                        .where(Tables.WORKER.PLATFORM.eq(toAnonymize.getPlatform()))
                        .and(Tables.WORKER.IDENTIFICATION.eq("Anonymous Worker"))
                        .fetchOptional()
                        .orElseGet(() ->
                                DSL.using(configuration).insertInto(Tables.WORKER)
                                        .set(new WorkerRecord(null, "Anonymous Worker", toAnonymize.getPlatform(), null))
                                        .returning()
                                        .fetchOne()));

        create.deleteFrom(Tables.POPULATION_RESULT)
                .where(Tables.POPULATION_RESULT.WORKER.eq(toAnonymize.getIdWorker()))
                .execute();

        create.update(Tables.ANSWER)
                .set(Tables.ANSWER.WORKER_ID, anonWorker.getIdWorker())
                .where(Tables.ANSWER.WORKER_ID.eq(toAnonymize.getIdWorker()))
                .execute();

        create.update(Tables.RATING)
                .set(Tables.RATING.WORKER_ID, anonWorker.getIdWorker())
                .where(Tables.ANSWER.WORKER_ID.eq(toAnonymize.getIdWorker()))
                .execute();

        create.update(Tables.WORKER_BALANCE)
                .set(Tables.WORKER_BALANCE.WORKER, anonWorker.getIdWorker())
                .where(Tables.WORKER_BALANCE.WORKER.eq(anonWorker.getIdWorker()))
                .execute();

        create.executeDelete(toAnonymize);
    }

    /**
     * finds the worker with the passed platform and platform-identification data
     *
     * @param platform       the platform the wanted worker is working on
     * @param identification the platform-specific identification
     *
     * @return the found worker or empty
     */
    public Optional<WorkerRecord> getWorker(String platform, String identification) {
        return create.selectFrom(Tables.WORKER)
                .where(Tables.WORKER.PLATFORM.eq(platform))
                .and(Tables.WORKER.IDENTIFICATION.eq(identification))
                .fetchOptional();
    }

    /**
     * finds the worker with the passed workerId in the database
     *
     * @param workerID the primary-key of the worker
     *
     * @return the found worker or empty
     */
    public Optional<WorkerRecord> getWorker(int workerID) {
        return create.selectFrom(Tables.WORKER)
                .where(Tables.WORKER.ID_WORKER.eq(workerID))
                .fetchOptional();
    }

    /**
     * returns all the workers existing in the database
     *
     * @return a list with all the workers
     */
    public List<WorkerRecord> getAllWorkers() {
        return create.selectFrom(Tables.WORKER)
                .fetch();
    }

    /**
     * Returns a single worker based on his identity and platform.
     *
     * @param platform Platform of the worker
     * @param identity Identity of the worker
     *
     * @return the worker or empty if not found
     */
    public Optional<Worker> identifyWorker(String platform, String identity) {
        return create.fetchOptional(WORKER, WORKER.PLATFORM.eq(platform).and(WORKER.IDENTIFICATION.eq(identity)))
                .map(WorkerOperations::toProto);
    }

    /**
     * Returns a single worker.
     *
     * @param id ID of the worker
     *
     * @return the worker or empty if not found
     */
    public Optional<Worker> getWorkerProto(int id) {
        return create.fetchOptional(WORKER, WORKER.ID_WORKER.eq(id))
                .map(WorkerOperations::toProto);
    }

    /**
     * Returns a range of workers starting from {@code cursor}.
     *
     * @param cursor Pagination cursor
     * @param next   {@code true} for next, {@code false} for previous
     * @param limit  Number of records
     *
     * @return List of workers
     */
    public Range<Worker, Integer> getWorkerList(int cursor, boolean next, int limit) {
        return getNextRange(create.selectFrom(WORKER), WORKER.ID_WORKER, cursor, next, limit)
                .map(WorkerOperations::toProto);
    }

    /**
     * Creates a new worker.
     *
     * @param toStore  worker to save
     * @param identity identity of the worker
     *
     * @return Worker with ID assigned
     *
     * @throws IllegalArgumentException if the name or content is not set
     */
    public Worker createWorker(Worker toStore, String identity) {
        assertHasField(toStore, Worker.PLATFORM_FIELD_NUMBER);

        WorkerRecord record = mergeRecord(create.newRecord(WORKER), toStore);
        record.setIdentification(identity);
        record.store();

        return toProto(record);
    }

    /**
     * Converts a worker record to its protobuf representation.
     *
     * @param record worker record
     *
     * @return Worker.
     */
    public static Worker toProto(WorkerRecord record) {
        return Worker.newBuilder()
                .setId(record.getIdWorker())
                .setPlatform(record.getPlatform())
                .setEmail(record.getEmail())
                .build();
    }

    /**
     * Merges a record with the set properties of a protobuf worker.
     *
     * @param target record to merge into
     * @param worker message to merge from
     *
     * @return Merged worker record.
     */
    public static WorkerRecord mergeRecord(WorkerRecord target, Worker worker) {
        if (worker.hasField(worker.getDescriptorForType().findFieldByNumber(Worker.PLATFORM_FIELD_NUMBER))) {
            target.setPlatform(worker.getPlatform());
        }

        if (worker.hasField(worker.getDescriptorForType().findFieldByNumber(Worker.EMAIL_FIELD_NUMBER))) {
            target.setEmail(worker.getEmail());
        }

        return target;
    }
}
