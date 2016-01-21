package edu.kit.ipd.crowdcontrol.objectservice.rest;

import edu.kit.ipd.crowdcontrol.objectservice.rest.exceptions.BadRequestException;
import edu.kit.ipd.crowdcontrol.objectservice.rest.exceptions.InternalServerErrorException;
import spark.Request;

public class RequestUtil {
<<<<<<< 229a56370b7483c324a70905fffab9f0b6664906
=======
    public static String getParam(Request request, String param) {
        String paramValue = request.params(param);

        if (paramValue == null) {
            throw new InternalServerErrorException("Expected parameter '%s' not present.", param);
        }

        return paramValue;
    }
    
>>>>>>> rest: reflected recent database-api changes, changed indentify request
    public static int getParamInt(Request request, String param) {
        String paramValue = request.params(param);

        if (paramValue == null) {
            throw new InternalServerErrorException("Expected parameter '%s' not present.", param);
        }

        try {
            return Integer.parseInt(paramValue);
        } catch (NumberFormatException e) {
            throw new BadRequestException("Parameter '%s' must be a valid integer, '%s' given.", param, paramValue);
        }
    }

    public static int getQueryInt(Request request, String param, int defaultValue) {
        String paramValue = request.queryParams(param);

        if (paramValue == null) {
            return defaultValue;
        }

        try {
            return Integer.parseInt(paramValue);
        } catch (NumberFormatException e) {
            throw new BadRequestException("Query parameter '%s' must be a valid integer, '%s' given.", param, paramValue);
        }
    }

    public static boolean getQueryBool(Request request, String param, boolean defaultValue) {
        String paramValue = request.queryParams(param);

        if (paramValue == null) {
            return defaultValue;
        }

        return Boolean.parseBoolean(paramValue);
    }
}
