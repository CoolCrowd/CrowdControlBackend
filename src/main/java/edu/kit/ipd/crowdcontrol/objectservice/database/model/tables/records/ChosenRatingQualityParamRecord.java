/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records;


import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ChosenRatingQualityParam;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ChosenRatingQualityParamRecord extends UpdatableRecordImpl<ChosenRatingQualityParamRecord> implements Record4<Integer, String, Integer, Integer> {

	private static final long serialVersionUID = 2055131165;

	/**
	 * Setter for <code>crowdcontrol.Chosen_Rating_Quality_Param.id_Algorithm_Rating_Quality_Chosen</code>.
	 */
	public void setIdAlgorithmRatingQualityChosen(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Chosen_Rating_Quality_Param.id_Algorithm_Rating_Quality_Chosen</code>.
	 */
	public Integer getIdAlgorithmRatingQualityChosen() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Chosen_Rating_Quality_Param.value</code>.
	 */
	public void setValue(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Chosen_Rating_Quality_Param.value</code>.
	 */
	public String getValue() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Chosen_Rating_Quality_Param.experiment</code>.
	 */
	public void setExperiment(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Chosen_Rating_Quality_Param.experiment</code>.
	 */
	public Integer getExperiment() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>crowdcontrol.Chosen_Rating_Quality_Param.param</code>.
	 */
	public void setParam(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Chosen_Rating_Quality_Param.param</code>.
	 */
	public Integer getParam() {
		return (Integer) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, String, Integer, Integer> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, String, Integer, Integer> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return ChosenRatingQualityParam.CHOSEN_RATING_QUALITY_PARAM.ID_ALGORITHM_RATING_QUALITY_CHOSEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return ChosenRatingQualityParam.CHOSEN_RATING_QUALITY_PARAM.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return ChosenRatingQualityParam.CHOSEN_RATING_QUALITY_PARAM.EXPERIMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return ChosenRatingQualityParam.CHOSEN_RATING_QUALITY_PARAM.PARAM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getIdAlgorithmRatingQualityChosen();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getExperiment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getParam();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChosenRatingQualityParamRecord value1(Integer value) {
		setIdAlgorithmRatingQualityChosen(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChosenRatingQualityParamRecord value2(String value) {
		setValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChosenRatingQualityParamRecord value3(Integer value) {
		setExperiment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChosenRatingQualityParamRecord value4(Integer value) {
		setParam(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChosenRatingQualityParamRecord values(Integer value1, String value2, Integer value3, Integer value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ChosenRatingQualityParamRecord
	 */
	public ChosenRatingQualityParamRecord() {
		super(ChosenRatingQualityParam.CHOSEN_RATING_QUALITY_PARAM);
	}

	/**
	 * Create a detached, initialised ChosenRatingQualityParamRecord
	 */
	public ChosenRatingQualityParamRecord(Integer idAlgorithmRatingQualityChosen, String value, Integer experiment, Integer param) {
		super(ChosenRatingQualityParam.CHOSEN_RATING_QUALITY_PARAM);

		setValue(0, idAlgorithmRatingQualityChosen);
		setValue(1, value);
		setValue(2, experiment);
		setValue(3, param);
	}
}
