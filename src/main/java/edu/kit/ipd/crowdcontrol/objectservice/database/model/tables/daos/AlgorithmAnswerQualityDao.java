/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AlgorithmAnswerQualityDao extends org.jooq.impl.DAOImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AlgorithmAnswerQualityRecord, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.AlgorithmAnswerQuality, java.lang.String> {

	/**
	 * Create a new AlgorithmAnswerQualityDao without any configuration
	 */
	public AlgorithmAnswerQualityDao() {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmAnswerQuality.ALGORITHM_ANSWER_QUALITY, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.AlgorithmAnswerQuality.class);
	}

	/**
	 * Create a new AlgorithmAnswerQualityDao with an attached configuration
	 */
	public AlgorithmAnswerQualityDao(org.jooq.Configuration configuration) {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmAnswerQuality.ALGORITHM_ANSWER_QUALITY, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.AlgorithmAnswerQuality.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.String getId(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.AlgorithmAnswerQuality object) {
		return object.getIdAlgorithmAnswerQuality();
	}

	/**
	 * Fetch records that have <code>id_Algorithm_Answer_Quality IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.AlgorithmAnswerQuality> fetchByIdAlgorithmAnswerQuality(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmAnswerQuality.ALGORITHM_ANSWER_QUALITY.ID_ALGORITHM_ANSWER_QUALITY, values);
	}

	/**
	 * Fetch a unique record that has <code>id_Algorithm_Answer_Quality = value</code>
	 */
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.AlgorithmAnswerQuality fetchOneByIdAlgorithmAnswerQuality(java.lang.String value) {
		return fetchOne(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmAnswerQuality.ALGORITHM_ANSWER_QUALITY.ID_ALGORITHM_ANSWER_QUALITY, value);
	}

	/**
	 * Fetch records that have <code>description IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.AlgorithmAnswerQuality> fetchByDescription(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmAnswerQuality.ALGORITHM_ANSWER_QUALITY.DESCRIPTION, values);
	}
}
