/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RatingOptionExperimentRecord extends org.jooq.impl.UpdatableRecordImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingOptionExperimentRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -968613870;

	/**
	 * Setter for <code>crowdcontrol.Rating_Option_Experiment.id_Rating_Option_Experiment</code>.
	 */
	public void setIdRatingOptionExperiment(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Rating_Option_Experiment.id_Rating_Option_Experiment</code>.
	 */
	public java.lang.Integer getIdRatingOptionExperiment() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Rating_Option_Experiment.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Rating_Option_Experiment.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Rating_Option_Experiment.value</code>.
	 */
	public void setValue(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Rating_Option_Experiment.value</code>.
	 */
	public java.lang.Integer getValue() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>crowdcontrol.Rating_Option_Experiment.experiment</code>.
	 */
	public void setExperiment(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Rating_Option_Experiment.experiment</code>.
	 */
	public java.lang.Integer getExperiment() {
		return (java.lang.Integer) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.RatingOptionExperiment.RATING_OPTION_EXPERIMENT.ID_RATING_OPTION_EXPERIMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.RatingOptionExperiment.RATING_OPTION_EXPERIMENT.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.RatingOptionExperiment.RATING_OPTION_EXPERIMENT.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.RatingOptionExperiment.RATING_OPTION_EXPERIMENT.EXPERIMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdRatingOptionExperiment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getExperiment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RatingOptionExperimentRecord value1(java.lang.Integer value) {
		setIdRatingOptionExperiment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RatingOptionExperimentRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RatingOptionExperimentRecord value3(java.lang.Integer value) {
		setValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RatingOptionExperimentRecord value4(java.lang.Integer value) {
		setExperiment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RatingOptionExperimentRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.Integer value3, java.lang.Integer value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RatingOptionExperimentRecord
	 */
	public RatingOptionExperimentRecord() {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.RatingOptionExperiment.RATING_OPTION_EXPERIMENT);
	}

	/**
	 * Create a detached, initialised RatingOptionExperimentRecord
	 */
	public RatingOptionExperimentRecord(java.lang.Integer idRatingOptionExperiment, java.lang.String name, java.lang.Integer value, java.lang.Integer experiment) {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.RatingOptionExperiment.RATING_OPTION_EXPERIMENT);

		setValue(0, idRatingOptionExperiment);
		setValue(1, name);
		setValue(2, value);
		setValue(3, experiment);
	}
}
