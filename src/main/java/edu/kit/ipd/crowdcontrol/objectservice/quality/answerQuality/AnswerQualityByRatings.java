package edu.kit.ipd.crowdcontrol.objectservice.quality.answerQuality;

import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AnswerRecord;
import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingRecord;

import java.util.List;

/**
 * Created by lucaskrauss on 19.01.2016.
 * <p>
 * Implementation of the strategy-interface AnswerQualityIdentification.
 * The quality of an answer is based on its ratings. It is equal to the rounded-down
 * average rating of all ratings of the answer.
 */
public class AnswerQualityByRatings implements AnswerQualityStrategy {

    private final String algorithmName = "AnswerQualityByRatings";
    private final String algorithmDescription = "Identifies the quality of answers based on its ratings. " +
            "\nThe answer's quality is equal to the rounded average of all its ratings ";

    /**
     * Identifies the quality of an answer based on its ratings.
     * The answer's quality is equal to the average (rounded down) of all its ratings.
     *
     * @param answer  answerRecord whose quality is to be estimated
     * @param ratings of the given answer
     * @return quality of an answer
     * @throws IllegalArgumentException if rating-value isn't out of (0,9).
     */
    @Override
    public int identifyAnswerQuality(AnswerRecord answer, List<RatingRecord> ratings, int maximumQuality, int minimumQuality) throws IllegalArgumentException {

        if(ratings.size() == 1 && ratings.get(0).getRating() >= 0 && ratings.get(0).getRating() < 10){
            return ratings.get(0).getRating();
        }
        int answerQuality = 0;
        for (RatingRecord rating : ratings) {
            if (rating.getRating() > 9 || rating.getRating() < 0) {
                throw new IllegalArgumentException("Error! Illegal rating value in " + this.getClass() + "! Expected value from 0 to 9" +
                        ", but got :" + rating.getRating());
            }
            answerQuality += rating.getRating();
        }
        answerQuality = (int)Math.round(answerQuality / (double)ratings.size());
        return answerQuality;
    }

    @Override
    public String getAlgorithmName() {
        return algorithmName;
    }

    @Override
    public String getAlgorithmDescription() {
        return algorithmDescription;
    }


}
