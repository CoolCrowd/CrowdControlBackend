/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExperimentRecord extends org.jooq.impl.UpdatableRecordImpl<edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.records.ExperimentRecord> implements org.jooq.Record17<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Boolean> {

	private static final long serialVersionUID = 1207828295;

	/**
	 * Setter for <code>crowdcontrolproto.experiment.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.experiment.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrolproto.experiment.question</code>.
	 */
	public void setQuestion(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.experiment.question</code>.
	 */
	public java.lang.String getQuestion() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrolproto.experiment.taskQuestion</code>.
	 */
	public void setTaskquestion(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.experiment.taskQuestion</code>.
	 */
	public java.lang.String getTaskquestion() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>crowdcontrolproto.experiment.task_picture_url</code>.
	 */
	public void setTaskPictureUrl(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.experiment.task_picture_url</code>.
	 */
	public java.lang.String getTaskPictureUrl() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>crowdcontrolproto.experiment.task_picture_license_url</code>.
	 */
	public void setTaskPictureLicenseUrl(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.experiment.task_picture_license_url</code>.
	 */
	public java.lang.String getTaskPictureLicenseUrl() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>crowdcontrolproto.experiment.task_description</code>.
	 */
	public void setTaskDescription(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.experiment.task_description</code>.
	 */
	public java.lang.String getTaskDescription() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>crowdcontrolproto.experiment.hit_title</code>.
	 */
	public void setHitTitle(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.experiment.hit_title</code>.
	 */
	public java.lang.String getHitTitle() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>crowdcontrolproto.experiment.hit_description</code>.
	 */
	public void setHitDescription(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.experiment.hit_description</code>.
	 */
	public java.lang.String getHitDescription() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>crowdcontrolproto.experiment.basicPaymentHIT</code>.
	 */
	public void setBasicpaymenthit(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.experiment.basicPaymentHIT</code>.
	 */
	public java.lang.Integer getBasicpaymenthit() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>crowdcontrolproto.experiment.basicPaymentAnswer</code>.
	 */
	public void setBasicpaymentanswer(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.experiment.basicPaymentAnswer</code>.
	 */
	public java.lang.Integer getBasicpaymentanswer() {
		return (java.lang.Integer) getValue(9);
	}

	/**
	 * Setter for <code>crowdcontrolproto.experiment.basicPaymentRating</code>.
	 */
	public void setBasicpaymentrating(java.lang.Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.experiment.basicPaymentRating</code>.
	 */
	public java.lang.Integer getBasicpaymentrating() {
		return (java.lang.Integer) getValue(10);
	}

	/**
	 * Setter for <code>crowdcontrolproto.experiment.bonusPayment</code>.
	 */
	public void setBonuspayment(java.lang.Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.experiment.bonusPayment</code>.
	 */
	public java.lang.Integer getBonuspayment() {
		return (java.lang.Integer) getValue(11);
	}

	/**
	 * Setter for <code>crowdcontrolproto.experiment.maxAnswersPerAssignment</code>.
	 */
	public void setMaxanswersperassignment(java.lang.Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.experiment.maxAnswersPerAssignment</code>.
	 */
	public java.lang.Integer getMaxanswersperassignment() {
		return (java.lang.Integer) getValue(12);
	}

	/**
	 * Setter for <code>crowdcontrolproto.experiment.maxRatingsPerAssignment</code>.
	 */
	public void setMaxratingsperassignment(java.lang.Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.experiment.maxRatingsPerAssignment</code>.
	 */
	public java.lang.Integer getMaxratingsperassignment() {
		return (java.lang.Integer) getValue(13);
	}

	/**
	 * Setter for <code>crowdcontrolproto.experiment.titel</code>.
	 */
	public void setTitel(java.lang.String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.experiment.titel</code>.
	 */
	public java.lang.String getTitel() {
		return (java.lang.String) getValue(14);
	}

	/**
	 * Setter for <code>crowdcontrolproto.experiment.budget</code>.
	 */
	public void setBudget(java.lang.Integer value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.experiment.budget</code>.
	 */
	public java.lang.Integer getBudget() {
		return (java.lang.Integer) getValue(15);
	}

	/**
	 * Setter for <code>crowdcontrolproto.experiment.running</code>.
	 */
	public void setRunning(java.lang.Boolean value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.experiment.running</code>.
	 */
	public java.lang.Boolean getRunning() {
		return (java.lang.Boolean) getValue(16);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record17 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row17<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Boolean> fieldsRow() {
		return (org.jooq.Row17) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row17<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Boolean> valuesRow() {
		return (org.jooq.Row17) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT.QUESTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT.TASKQUESTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT.TASK_PICTURE_URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT.TASK_PICTURE_LICENSE_URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT.TASK_DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT.HIT_TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT.HIT_DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT.BASICPAYMENTHIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT.BASICPAYMENTANSWER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field11() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT.BASICPAYMENTRATING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field12() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT.BONUSPAYMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field13() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT.MAXANSWERSPERASSIGNMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field14() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT.MAXRATINGSPERASSIGNMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field15() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT.TITEL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field16() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT.BUDGET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field17() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT.RUNNING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getQuestion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getTaskquestion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getTaskPictureUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getTaskPictureLicenseUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getTaskDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getHitTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getHitDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getBasicpaymenthit();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getBasicpaymentanswer();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value11() {
		return getBasicpaymentrating();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value12() {
		return getBonuspayment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value13() {
		return getMaxanswersperassignment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value14() {
		return getMaxratingsperassignment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value15() {
		return getTitel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value16() {
		return getBudget();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value17() {
		return getRunning();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value2(java.lang.String value) {
		setQuestion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value3(java.lang.String value) {
		setTaskquestion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value4(java.lang.String value) {
		setTaskPictureUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value5(java.lang.String value) {
		setTaskPictureLicenseUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value6(java.lang.String value) {
		setTaskDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value7(java.lang.String value) {
		setHitTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value8(java.lang.String value) {
		setHitDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value9(java.lang.Integer value) {
		setBasicpaymenthit(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value10(java.lang.Integer value) {
		setBasicpaymentanswer(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value11(java.lang.Integer value) {
		setBasicpaymentrating(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value12(java.lang.Integer value) {
		setBonuspayment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value13(java.lang.Integer value) {
		setMaxanswersperassignment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value14(java.lang.Integer value) {
		setMaxratingsperassignment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value15(java.lang.String value) {
		setTitel(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value16(java.lang.Integer value) {
		setBudget(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value17(java.lang.Boolean value) {
		setRunning(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.Integer value9, java.lang.Integer value10, java.lang.Integer value11, java.lang.Integer value12, java.lang.Integer value13, java.lang.Integer value14, java.lang.String value15, java.lang.Integer value16, java.lang.Boolean value17) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ExperimentRecord
	 */
	public ExperimentRecord() {
		super(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT);
	}

	/**
	 * Create a detached, initialised ExperimentRecord
	 */
	public ExperimentRecord(java.lang.Integer id, java.lang.String question, java.lang.String taskquestion, java.lang.String taskPictureUrl, java.lang.String taskPictureLicenseUrl, java.lang.String taskDescription, java.lang.String hitTitle, java.lang.String hitDescription, java.lang.Integer basicpaymenthit, java.lang.Integer basicpaymentanswer, java.lang.Integer basicpaymentrating, java.lang.Integer bonuspayment, java.lang.Integer maxanswersperassignment, java.lang.Integer maxratingsperassignment, java.lang.String titel, java.lang.Integer budget, java.lang.Boolean running) {
		super(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Experiment.EXPERIMENT);

		setValue(0, id);
		setValue(1, question);
		setValue(2, taskquestion);
		setValue(3, taskPictureUrl);
		setValue(4, taskPictureLicenseUrl);
		setValue(5, taskDescription);
		setValue(6, hitTitle);
		setValue(7, hitDescription);
		setValue(8, basicpaymenthit);
		setValue(9, basicpaymentanswer);
		setValue(10, basicpaymentrating);
		setValue(11, bonuspayment);
		setValue(12, maxanswersperassignment);
		setValue(13, maxratingsperassignment);
		setValue(14, titel);
		setValue(15, budget);
		setValue(16, running);
	}
}
