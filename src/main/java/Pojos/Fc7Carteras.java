package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * Fc7Carteras generated by hbm2java
 */
public class Fc7Carteras implements java.io.Serializable {

	private Integer id;
	private Integer idFc7;
	private Integer idCartera;

	public Fc7Carteras() {
	}

	public Fc7Carteras(Integer idFc7, Integer idCartera) {
		this.idFc7 = idFc7;
		this.idCartera = idCartera;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdFc7() {
		return this.idFc7;
	}

	public void setIdFc7(Integer idFc7) {
		this.idFc7 = idFc7;
	}

	public Integer getIdCartera() {
		return this.idCartera;
	}

	public void setIdCartera(Integer idCartera) {
		this.idCartera = idCartera;
	}

}
