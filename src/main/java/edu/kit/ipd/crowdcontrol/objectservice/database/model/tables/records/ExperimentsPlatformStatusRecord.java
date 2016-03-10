/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records;


import edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.ExperimentsPlatformStatusPlatformStatus;
import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ExperimentsPlatformStatus;

import java.sql.Timestamp;

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
public class ExperimentsPlatformStatusRecord extends UpdatableRecordImpl<ExperimentsPlatformStatusRecord> implements Record4<Integer, ExperimentsPlatformStatusPlatformStatus, Timestamp, Integer> {

	private static final long serialVersionUID = 103228895;

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platform_Status.idExperiments_Platform_Status</code>.
	 */
	public void setIdexperimentsPlatformStatus(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platform_Status.idExperiments_Platform_Status</code>.
	 */
	public Integer getIdexperimentsPlatformStatus() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platform_Status.platform_status</code>.
	 */
	public void setPlatformStatus(ExperimentsPlatformStatusPlatformStatus value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platform_Status.platform_status</code>.
	 */
	public ExperimentsPlatformStatusPlatformStatus getPlatformStatus() {
		return (ExperimentsPlatformStatusPlatformStatus) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platform_Status.timestamp</code>.
	 */
	public void setTimestamp(Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platform_Status.timestamp</code>.
	 */
	public Timestamp getTimestamp() {
		return (Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platform_Status.platform</code>.
	 */
	public void setPlatform(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platform_Status.platform</code>.
	 */
	public Integer getPlatform() {
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
	public Row4<Integer, ExperimentsPlatformStatusPlatformStatus, Timestamp, Integer> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, ExperimentsPlatformStatusPlatformStatus, Timestamp, Integer> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return ExperimentsPlatformStatus.EXPERIMENTS_PLATFORM_STATUS.IDEXPERIMENTS_PLATFORM_STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ExperimentsPlatformStatusPlatformStatus> field2() {
		return ExperimentsPlatformStatus.EXPERIMENTS_PLATFORM_STATUS.PLATFORM_STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field3() {
		return ExperimentsPlatformStatus.EXPERIMENTS_PLATFORM_STATUS.TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return ExperimentsPlatformStatus.EXPERIMENTS_PLATFORM_STATUS.PLATFORM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getIdexperimentsPlatformStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformStatusPlatformStatus value2() {
		return getPlatformStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value3() {
		return getTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getPlatform();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformStatusRecord value1(Integer value) {
		setIdexperimentsPlatformStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformStatusRecord value2(ExperimentsPlatformStatusPlatformStatus value) {
		setPlatformStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformStatusRecord value3(Timestamp value) {
		setTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformStatusRecord value4(Integer value) {
		setPlatform(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformStatusRecord values(Integer value1, ExperimentsPlatformStatusPlatformStatus value2, Timestamp value3, Integer value4) {
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
	 * Create a detached ExperimentsPlatformStatusRecord
	 */
	public ExperimentsPlatformStatusRecord() {
		super(ExperimentsPlatformStatus.EXPERIMENTS_PLATFORM_STATUS);
	}

	/**
	 * Create a detached, initialised ExperimentsPlatformStatusRecord
	 */
	public ExperimentsPlatformStatusRecord(Integer idexperimentsPlatformStatus, ExperimentsPlatformStatusPlatformStatus platformStatus, Timestamp timestamp, Integer platform) {
		super(ExperimentsPlatformStatus.EXPERIMENTS_PLATFORM_STATUS);

		setValue(0, idexperimentsPlatformStatus);
		setValue(1, platformStatus);
		setValue(2, timestamp);
		setValue(3, platform);
	}
}
