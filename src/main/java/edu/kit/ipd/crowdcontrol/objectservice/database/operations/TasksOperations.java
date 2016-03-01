package edu.kit.ipd.crowdcontrol.objectservice.database.operations;

import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TaskRecord;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Responsible for the operations involving the creation of tasks.
 * @author LeanderK
 * @version 1.0
 */
public class TasksOperations extends AbstractOperations {
    public TasksOperations(DSLContext create) {
        super(create);
    }

    /**
     * Inserts the TaskRecord into the database.
     * @param taskRecord the task to create
     * @return the resulting TaskRecord existing in the DB
     */
    public TaskRecord createTask(TaskRecord taskRecord) {
        taskRecord.setIdTask(null);
        return doIfDraft(taskRecord.getExperiment(), trans ->
                DSL.using(trans)
                        .insertInto(TASK)
                        .set(taskRecord)
                        .returning()
                        .fetchOne());
    }

    /**
     * Updates a Task.
     * @param taskRecord the update
     * @return whether the update was successful
     * @throws IllegalArgumentException if the record has no primary key
     */
    public boolean updateTask(TaskRecord taskRecord) throws IllegalArgumentException {
        assertHasPrimaryKey(taskRecord);
        return create.executeUpdate(taskRecord) == 1;
    }

    /**
     * Searches for a task specified by platform and experimentId.
     * @param platform the string of the platform
     * @param experimentId the primary key of the experiment
     * @return the found task or empty if not found
     */
    public Optional<TaskRecord> getTask(String platform, int experimentId) {
        return create.selectFrom(TASK)
                .where(TASK.CROWD_PLATFORM.eq(platform))
                .and(TASK.EXPERIMENT.eq(experimentId))
                .fetchOptional();
    }

    /**
     * deletes a TaskRecord matching the primary key of the passed TaskRecord
     * @param result a TaskRecord with the primary key set
     */
    public void deleteTask(TaskRecord result) {
        assertHasPrimaryKey(result);
        create.deleteFrom(TASK)
                .where(TASK.ID_TASK.eq(result.getIdTask())).execute();
    }

    public List<TaskRecord> getTasks(int id) {
        return create.selectFrom(TASK)
                .where(TASK.EXPERIMENT.eq(id))
                .fetch().stream().collect(Collectors.toList());
    }
}
