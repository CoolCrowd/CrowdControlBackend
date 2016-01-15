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
public class AnswerRatingOperations extends AbstractOperation {
    protected AnswerRatingOperations(DSLContext create) {
        super(create);
    }

    public  Map<AnswerRecord,List<RatingRecord>> getAnswersWithRatings(int experimentID){
        return null;
    }

    public Result<RatingRecord> getRatingsOfAnswer(AnswerRecord answerRecord){
        return null;
    }

    public Result<AnswerRecord> getAnswersOfExperiment(int expID){
        return null;
    }

    public void setQualityToRatings(Map<RatingRecord,Integer> map){}
}
