package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * CodigoPostal generated by hbm2java
 */
public class CodigoPostal implements java.io.Serializable {

	private Integer id;
	private String cp;
	private int idLocalidad;

	public CodigoPostal() {
	}

	public CodigoPostal(String cp, int idLocalidad) {
		this.cp = cp;
		this.idLocalidad = idLocalidad;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCp() {
		return this.cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public int getIdLocalidad() {
		return this.idLocalidad;
	}

	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

}