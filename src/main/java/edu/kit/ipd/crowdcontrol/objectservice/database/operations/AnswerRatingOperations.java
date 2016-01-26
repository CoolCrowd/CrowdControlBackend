package edu.kit.ipd.crowdcontrol.objectservice.database.operations;

import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AnswerRecord;
import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingRecord;
import org.jooq.DSLContext;
import org.jooq.Result;


import java.util.List;
import java.util.Map;

/**
 * responsible for all queries related to the Answer and Rating Table
 * @author LeanderK
 * @version 1.0
 */
public class AnswerRatingOperations extends AbstractOperations {
    protected AnswerRatingOperations(DSLContext create) {
        super(create);
    }


      /**
     * Gets all ratings of a specified answer
     * @param answerRecord answer, whose ratings are requested
     * @return list of ratings of a specified answer
     */
    public Result<RatingRecord> getRatingsOfAnswer(AnswerRecord answerRecord){
        return null;
    }


    /**
     * Get all answers of the experiment specified by given ID
     * @param expID specifying the experiment
     * @return list of all answers of a experiment
     */
    public Result<AnswerRecord> getAnswersOfExperiment(int expID){
        return null;
    }


    /**
     * Returns all ratings of given answer, which have a quality rating above passed threshold
     * @param answerRecord answer, whose good ratings (specified by given threshold) are returned
     * @param threshold of type int, which specifies good ratings
     * @return list of all ratings of given answer with a quality rating equal or greater than given threshold
     */
    public Result<RatingRecord> getGoodRatingsOfAnswer(AnswerRecord answerRecord, int threshold){
        return null;
    }


    /**
     * Sets quality ratings to a set of ratings
     * @param map of ratings and matching qualities
     */
    public void setQualityToRatings(Map<RatingRecord,Integer> map){}

    /**
     * Sets quality rating to an answer
     * @param answer whose quality is to be set
     *    @param quality of the answer
     */
    public void setQualityToAnswer(AnswerRecord answer, int quality){}


}
