/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Population implements java.io.Serializable {

	private static final long serialVersionUID = -1719818849;

	private java.lang.Integer idpopulation;
	private java.lang.String  property;
	private java.lang.String  description;
	private java.lang.String  name;
	private java.lang.Integer experiment;

	public Population() {}

	public Population(
		java.lang.Integer idpopulation,
		java.lang.String  property,
		java.lang.String  description,
		java.lang.String  name,
		java.lang.Integer experiment
	) {
		this.idpopulation = idpopulation;
		this.property = property;
		this.description = description;
		this.name = name;
		this.experiment = experiment;
	}

	public java.lang.Integer getIdpopulation() {
		return this.idpopulation;
	}

	public void setIdpopulation(java.lang.Integer idpopulation) {
		this.idpopulation = idpopulation;
	}

	public java.lang.String getProperty() {
		return this.property;
	}

	public void setProperty(java.lang.String property) {
		this.property = property;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getExperiment() {
		return this.experiment;
	}

	public void setExperiment(java.lang.Integer experiment) {
		this.experiment = experiment;
	}
}
