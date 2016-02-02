/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AlgorithmTaskChooserParam extends org.jooq.impl.TableImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AlgorithmTaskChooserParamRecord> {

	private static final long serialVersionUID = 512951269;

	/**
	 * The singleton instance of <code>crowdcontrol.Algorithm_Task_Chooser_Param</code>
	 */
	public static final edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmTaskChooserParam ALGORITHM_TASK_CHOOSER_PARAM = new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmTaskChooserParam();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AlgorithmTaskChooserParamRecord> getRecordType() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AlgorithmTaskChooserParamRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Algorithm_Task_Chooser_Param.id_Algorithm_Task_Chooser_Param</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AlgorithmTaskChooserParamRecord, java.lang.Integer> ID_ALGORITHM_TASK_CHOOSER_PARAM = createField("id_Algorithm_Task_Chooser_Param", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Algorithm_Task_Chooser_Param.description</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AlgorithmTaskChooserParamRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.length(65535).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Algorithm_Task_Chooser_Param.regex</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AlgorithmTaskChooserParamRecord, java.lang.String> REGEX = createField("regex", org.jooq.impl.SQLDataType.VARCHAR.length(191).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Algorithm_Task_Chooser_Param.algorithm</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AlgorithmTaskChooserParamRecord, java.lang.String> ALGORITHM = createField("algorithm", org.jooq.impl.SQLDataType.VARCHAR.length(191).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Algorithm_Task_Chooser_Param.data</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AlgorithmTaskChooserParamRecord, java.lang.String> DATA = createField("data", org.jooq.impl.SQLDataType.VARCHAR.length(191), this, "");

	/**
	 * Create a <code>crowdcontrol.Algorithm_Task_Chooser_Param</code> table reference
	 */
	public AlgorithmTaskChooserParam() {
		this("Algorithm_Task_Chooser_Param", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Algorithm_Task_Chooser_Param</code> table reference
	 */
	public AlgorithmTaskChooserParam(java.lang.String alias) {
		this(alias, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmTaskChooserParam.ALGORITHM_TASK_CHOOSER_PARAM);
	}

	private AlgorithmTaskChooserParam(java.lang.String alias, org.jooq.Table<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AlgorithmTaskChooserParamRecord> aliased) {
		this(alias, aliased, null);
	}

	private AlgorithmTaskChooserParam(java.lang.String alias, org.jooq.Table<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AlgorithmTaskChooserParamRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, edu.kit.ipd.crowdcontrol.objectservice.database.model.Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AlgorithmTaskChooserParamRecord, java.lang.Integer> getIdentity() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.IDENTITY_ALGORITHM_TASK_CHOOSER_PARAM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AlgorithmTaskChooserParamRecord> getPrimaryKey() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.KEY_ALGORITHM_TASK_CHOOSER_PARAM_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AlgorithmTaskChooserParamRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AlgorithmTaskChooserParamRecord>>asList(edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.KEY_ALGORITHM_TASK_CHOOSER_PARAM_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AlgorithmTaskChooserParamRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AlgorithmTaskChooserParamRecord, ?>>asList(edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.REFERENCEDTASKCHOOSER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmTaskChooserParam as(java.lang.String alias) {
		return new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmTaskChooserParam(alias, this);
	}

	/**
	 * Rename this table
	 */
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmTaskChooserParam rename(java.lang.String name) {
		return new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmTaskChooserParam(name, null);
	}
}
