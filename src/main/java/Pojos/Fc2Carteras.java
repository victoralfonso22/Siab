package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * Fc2Carteras generated by hbm2java
 */
public class Fc2Carteras implements java.io.Serializable {

	private Integer id;
	private int idFc2;
	private int idCartera;
	private int asignado;

	public Fc2Carteras() {
	}

	public Fc2Carteras(int idFc2, int idCartera, int asignado) {
		this.idFc2 = idFc2;
		this.idCartera = idCartera;
		this.asignado = asignado;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getIdFc2() {
		return this.idFc2;
	}

	public void setIdFc2(int idFc2) {
		this.idFc2 = idFc2;
	}

	public int getIdCartera() {
		return this.idCartera;
	}

	public void setIdCartera(int idCartera) {
		this.idCartera = idCartera;
	}

	public int getAsignado() {
		return this.asignado;
	}

	public void setAsignado(int asignado) {
		this.asignado = asignado;
	}

}
