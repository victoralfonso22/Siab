package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * Fc7bCarteras generated by hbm2java
 */
public class Fc7bCarteras implements java.io.Serializable {

	private Integer id;
	private Integer idFc7b;
	private Integer idCartera;

	public Fc7bCarteras() {
	}

	public Fc7bCarteras(Integer idFc7b, Integer idCartera) {
		this.idFc7b = idFc7b;
		this.idCartera = idCartera;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdFc7b() {
		return this.idFc7b;
	}

	public void setIdFc7b(Integer idFc7b) {
		this.idFc7b = idFc7b;
	}

	public Integer getIdCartera() {
		return this.idCartera;
	}

	public void setIdCartera(Integer idCartera) {
		this.idCartera = idCartera;
	}

}
