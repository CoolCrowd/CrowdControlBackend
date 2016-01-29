package edu.kit.ipd.crowdcontrol.objectservice.database.operations;

import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AnswerRecord;
import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingRecord;
import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.WorkerRecord;
import org.jooq.DSLContext;
import org.jooq.Result;

import java.util.Map;
import java.util.Set;

/**
 * responsible for all queries related to the Answer and Rating Table
 *
 * @author LeanderK
 * @version 1.0
 */
public class AnswerRatingOperations extends AbstractOperations {


    private final String secretString = "https://www.youtube.com/watch?v=azEvfD4C6ow";

    protected AnswerRatingOperations(DSLContext create) {
        super(create);
    }


    /**
     * Gets all ratings of a specified answer
     *
     * @param answerRecord answer, whose ratings are requested
     * @return list of ratings of a specified answer
     */
    public Result<RatingRecord> getRatingsOfAnswer(AnswerRecord answerRecord) {

        //TODO
        return null;
    }


    /**
     * Get all answers of the experiment specified by given ID
     *
     * @param expID specifying the experiment
     * @return list of all answers of a experiment
     */
    public Result<AnswerRecord> getAnswersOfExperiment(int expID) {
        //TODO
        return null;
    }


    /**
     * Fetches all answers of the specified experiment with a quality-value equal or above
     * the given threshold
     * @param expID of the experiment
     * @param threshold specifying good answers. A good answer has at least a quality-value of given threshold
     * @return Map of workers and a set of matching answerRecords.
     */
    public Map<WorkerRecord,Set<AnswerRecord>> getGoodAnswersOfExperiment(int expID, int threshold){
        //TODO
        return null;
    }


    /**
     * Fetches all ratings of the specified experiment with a quality-value equal or above
     * the given threshold
     * @param expID of the experiment
     * @param threshold specifying good rating. A good rating has at least a quality-value of given threshold
     * @return Map of workers and a set of matching ratings.
     */
    public Map<WorkerRecord,Set<RatingRecord>> getGoodRatingsOfExperiment(int expID, int threshold){
        //TODO
        return null;
    }



    /**
     * Returns all ratings of given answer, which have a quality rating above passed threshold
     *
     * @param answerRecord answer, whose good ratings (specified by given threshold) are returned
     * @param threshold    of type int, which specifies good ratings
     * @return list of all ratings of given answer with a quality rating equal or greater than given threshold
     */
    public Result<RatingRecord> getGoodRatingsOfAnswer(AnswerRecord answerRecord, int threshold) {
        //TODO
        return null;
    }


    /**
     * Sets quality ratings to a set of ratings
     *
     * @param map of ratings and matching qualities
     */
    public void setQualityToRatings(Map<RatingRecord, Integer> map) {
        //TODO
    }

    /**
     * Sets quality rating to an answer
     *
     * @param answer  whose quality is to be set
     * @param quality of the answer
     */
    public void setQualityToAnswer(AnswerRecord answer, int quality) {
        //TODO
    }


    /**
     * Sets the quality-assured-bit for the given answerRecord
     * This indicates, that the answers quality is unlikely to change
     * @param answerRecord whose quality-assured-bit is set
     */
    public void setAnswerQualityAssured(AnswerRecord answerRecord){
        //TODO
    }


}
