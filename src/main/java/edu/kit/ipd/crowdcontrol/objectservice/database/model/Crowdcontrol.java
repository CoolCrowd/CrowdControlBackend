/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Crowdcontrol extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 589378989;

	/**
	 * The singleton instance of <code>crowdcontrol</code>
	 */
	public static final Crowdcontrol CROWDCONTROL = new Crowdcontrol();

	/**
	 * No further instances allowed
	 */
	private Crowdcontrol() {
		super("crowdcontrol");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmAnswerQuality.ALGORITHM_ANSWER_QUALITY,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmRatingQuality.ALGORITHM_RATING_QUALITY,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmTaskChooser.ALGORITHM_TASK_CHOOSER,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Answer.ANSWER,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Constraint.CONSTRAINT,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experiment.EXPERIMENT,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.GiftCode.GIFT_CODE,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Notification.NOTIFICATION,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Platform.PLATFORM,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Population.POPULATION,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.PopulationAnswerOption.POPULATION_ANSWER_OPTION,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.PopulationResult.POPULATION_RESULT,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Rating.RATING,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.RatingOptionExperiment.RATING_OPTION_EXPERIMENT,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.RatingOptionTemplate.RATING_OPTION_TEMPLATE,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Tag.TAG,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Template.TEMPLATE,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Worker.WORKER,
			edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.WorkerBalance.WORKER_BALANCE);
	}
}
