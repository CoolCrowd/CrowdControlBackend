package edu.kit.ipd.crowdcontrol.objectservice.rest.resources;

import edu.kit.ipd.crowdcontrol.objectservice.crowdworking.PlatformManager;
import edu.kit.ipd.crowdcontrol.objectservice.crowdworking.UnidentifiedWorkerException;
import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.WorkerRecord;
import edu.kit.ipd.crowdcontrol.objectservice.database.operations.WorkerOperations;
import edu.kit.ipd.crowdcontrol.objectservice.proto.Worker;
import edu.kit.ipd.crowdcontrol.objectservice.proto.WorkerList;
import edu.kit.ipd.crowdcontrol.objectservice.rest.Paginated;
import edu.kit.ipd.crowdcontrol.objectservice.rest.exceptions.BadRequestException;
import edu.kit.ipd.crowdcontrol.objectservice.rest.exceptions.NotFoundException;
import spark.Request;
import spark.Response;

<<<<<<< 229a56370b7483c324a70905fffab9f0b6664906
import java.util.Optional;
=======
import java.util.Map;
>>>>>>> rest: reflected recent database-api changes, changed indentify request

import static edu.kit.ipd.crowdcontrol.objectservice.rest.RequestUtil.*;

/**
 * Handles requests to worker resources.
 *
 * @author Niklas Keller
 */
public class WorkerResource {
    private WorkerOperations operations;
    private PlatformManager manager;

    public WorkerResource(WorkerOperations operations, PlatformManager manager) {
        this.operations = operations;
        this.manager = manager;
    }

    /**
     * @param request  request provided by Spark.
     * @param response response provided by Spark.
     *
     * @return Worker or null
     */
    public Worker identify(Request request, Response response) {
<<<<<<< 229a56370b7483c324a70905fffab9f0b6664906
        Optional<WorkerRecord> record;

        try {
            record = manager.getWorker(request.params("platform"), request.queryMap().toMap());
        } catch (UnidentifiedWorkerException e) {
            throw new BadRequestException("Could not identify worker!");
        }

        return record.map(WorkerOperations::toProto)
                .orElseThrow(() -> new NotFoundException("Resource not found."));
=======
        String platform = getParam(request, "platform");
        int experiment = getParamInt(request, "experiment");
        Map<String, String[]> parameters = request.queryMap().toMap();
        int workerID = -1; //TODO: crowdPlatform.getWorkerID(..)
                
        return operations.getWorker(workerID)
                .orElseThrow(null);
>>>>>>> rest: reflected recent database-api changes, changed indentify request
    }

    /**
     * @param request  request provided by Spark.
     * @param response response provided by Spark.
     *
     * @return A list of all workers.
     */
    public Paginated<Integer> all(Request request, Response response) {
        int from = getQueryInt(request, "from", 0);
        boolean asc = getQueryBool(request, "asc", true);

<<<<<<< 229a56370b7483c324a70905fffab9f0b6664906
        return operations.getWorkerList(from, asc, 20)
=======
        return operations.all(from, asc, 20)
>>>>>>> rest: reflected recent database-api changes, changed indentify request
                .constructPaginated(WorkerList.newBuilder(), WorkerList.Builder::addAllItems);
    }

    /**
     * @param request  request provided by Spark.
     * @param response response provided by Spark.
     *
     * @return A single worker.
     */
    public Worker get(Request request, Response response) {
        return operations.getWorker(getParamInt(request, "id"))
                .orElseThrow(() -> new NotFoundException("Resource not found."));
    }

    /**
     * @param request  request provided by Spark.
     * @param response response provided by Spark.
     *
     * @return Created worker.
     */
    public Worker put(Request request, Response response) {
        Worker worker = request.attribute("input");

<<<<<<< 229a56370b7483c324a70905fffab9f0b6664906
        // TODO identify worker

        worker = worker.toBuilder().setIdentity(null /* TODO */).build();
        worker = operations.createWorker(worker);
=======
        worker = worker.toBuilder().setIdentity(null).build();

        worker = operations.insertWorker(worker);
>>>>>>> rest: reflected recent database-api changes, changed indentify request

        response.status(201);
        response.header("Location", "/workers/" + worker.getId());

        return worker;
    }

    /**
     * @param request  request provided by Spark.
     * @param response response provided by Spark.
     *
     * @return {@code null}.
     */
    public Worker delete(Request request, Response response) {
<<<<<<< 229a56370b7483c324a70905fffab9f0b6664906
        boolean existed = operations.deleteWorker(getParamInt(request, "id"));

        if (!existed) {
=======
        try {
            operations.anonymizeWorker(getParamInt(request, "id"));
        } catch (IllegalArgumentException e) {
>>>>>>> rest: reflected recent database-api changes, changed indentify request
            throw new NotFoundException("Worker does not exist!");
        }

        return null;
    }
}
