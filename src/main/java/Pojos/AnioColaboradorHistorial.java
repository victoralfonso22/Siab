package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * AnioColaboradorHistorial generated by hbm2java
 */
public class AnioColaboradorHistorial implements java.io.Serializable {

	private Integer id;
	private int idColaboradorHistorial;
	private int anio;

	public AnioColaboradorHistorial() {
	}

	public AnioColaboradorHistorial(int idColaboradorHistorial, int anio) {
		this.idColaboradorHistorial = idColaboradorHistorial;
		this.anio = anio;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getIdColaboradorHistorial() {
		return this.idColaboradorHistorial;
	}

	public void setIdColaboradorHistorial(int idColaboradorHistorial) {
		this.idColaboradorHistorial = idColaboradorHistorial;
	}

	public int getAnio() {
		return this.anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

}
