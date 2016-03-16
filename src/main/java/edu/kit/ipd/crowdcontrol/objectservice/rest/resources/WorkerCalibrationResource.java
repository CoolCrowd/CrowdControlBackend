package edu.kit.ipd.crowdcontrol.objectservice.rest.resources;

import edu.kit.ipd.crowdcontrol.objectservice.database.operations.WorkerCalibrationOperations;
import edu.kit.ipd.crowdcontrol.objectservice.event.EventManager;
import edu.kit.ipd.crowdcontrol.objectservice.proto.CalibrationAnswer;
import spark.Request;
import spark.Response;

import static edu.kit.ipd.crowdcontrol.objectservice.rest.RequestUtil.getParamInt;

/**
 * Handles requests to worker resources.
 *
 * @author Niklas Keller
 */
public class WorkerCalibrationResource {
    private WorkerCalibrationOperations operations;
    private final EventManager eventManager;

    public WorkerCalibrationResource(WorkerCalibrationOperations operations, EventManager eventManager) {
        this.operations = operations;
        this.eventManager = eventManager;
    }

    /**
     * @param request  request provided by Spark
     * @param response response provided by Spark
     *
     * @return Created answer.
     */
    public CalibrationAnswer put(Request request, Response response) {
        CalibrationAnswer answer = request.attribute("input");
        answer = operations.insertAnswer(getParamInt(request, "id"), answer.getAnswerId());

        eventManager.WORKER_CALIBRATION_CREATE.emit(answer);

        response.status(201);

        return answer;
    }
}