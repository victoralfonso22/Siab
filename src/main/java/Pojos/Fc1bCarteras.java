package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * Fc1bCarteras generated by hbm2java
 */
public class Fc1bCarteras implements java.io.Serializable {

	private Integer id;
	private Integer idFc1b;
	private Integer idCartera;
	private Integer asignado;

	public Fc1bCarteras() {
	}

	public Fc1bCarteras(Integer idFc1b, Integer idCartera, Integer asignado) {
		this.idFc1b = idFc1b;
		this.idCartera = idCartera;
		this.asignado = asignado;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdFc1b() {
		return this.idFc1b;
	}

	public void setIdFc1b(Integer idFc1b) {
		this.idFc1b = idFc1b;
	}

	public Integer getIdCartera() {
		return this.idCartera;
	}

	public void setIdCartera(Integer idCartera) {
		this.idCartera = idCartera;
	}

	public Integer getAsignado() {
		return this.asignado;
	}

	public void setAsignado(Integer asignado) {
		this.asignado = asignado;
	}

}
