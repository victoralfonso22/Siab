package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * Roles generated by hbm2java
 */
public class Roles implements java.io.Serializable {

	private Integer id;
	private String rol;

	public Roles() {
	}

	public Roles(String rol) {
		this.rol = rol;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

}
