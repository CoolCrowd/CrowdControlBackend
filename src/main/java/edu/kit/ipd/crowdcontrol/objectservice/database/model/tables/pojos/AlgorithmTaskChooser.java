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
public class AlgorithmTaskChooser implements java.io.Serializable {

	private static final long serialVersionUID = 2011994639;

	private java.lang.String idTaskChooser;

	public AlgorithmTaskChooser() {}

	public AlgorithmTaskChooser(
		java.lang.String idTaskChooser
	) {
		this.idTaskChooser = idTaskChooser;
	}

	public java.lang.String getIdTaskChooser() {
		return this.idTaskChooser;
	}

	public void setIdTaskChooser(java.lang.String idTaskChooser) {
		this.idTaskChooser = idTaskChooser;
	}
}
