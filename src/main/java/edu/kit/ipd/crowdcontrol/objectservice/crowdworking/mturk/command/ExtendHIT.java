package edu.kit.ipd.crowdcontrol.objectservice.crowdworking.mturk.command;

import com.amazonaws.mturk.requester.doc._2014_08_15.ExtendHITResponse;
import edu.kit.ipd.crowdcontrol.objectservice.crowdworking.mturk.MTurkConnection;
import edu.kit.ipd.crowdcontrol.objectservice.crowdworking.mturk.MturkRestCommand;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by marcel on 17.03.16.
 */
public class ExtendHIT extends MturkRestCommand<Boolean, ExtendHITResponse> {

    public ExtendHIT(MTurkConnection con, String hitId, int increaseMaxAssignment, long increaseTimeOutSeconds) {
        super(con, "ExtendHIT", null, "2014-08-15", ExtendHITResponse.class,
                () -> {
                    Map<String, Object> values = new HashMap<>();

                    values.put("HITId", hitId);
                    if (increaseMaxAssignment != 0)
                      values.put("MaxAssignmentsIncrement", increaseMaxAssignment+"");

                    if (increaseTimeOutSeconds != 0)
                      values.put("ExpirationIncrementInSeconds", increaseTimeOutSeconds+"");

                    return values;
                },extendHITResponse -> {
                    Utils.handleRequest(extendHITResponse.getExtendHITResult().get(0).getRequest());

                    return true;
                });
    }
}
