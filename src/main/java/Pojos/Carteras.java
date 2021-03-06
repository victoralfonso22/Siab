package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * Carteras generated by hbm2java
 */
public class Carteras implements java.io.Serializable {

	private Integer id;
	private String folio;
	private int cantidad;
	private boolean estado;
	private int asignado;
	private int incidencia;

	public Carteras() {
	}

	public Carteras(String folio, int cantidad, boolean estado, int asignado,
			int incidencia) {
		this.folio = folio;
		this.cantidad = cantidad;
		this.estado = estado;
		this.asignado = asignado;
		this.incidencia = incidencia;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFolio() {
		return this.folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isEstado() {
		return this.estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getAsignado() {
		return this.asignado;
	}

	public void setAsignado(int asignado) {
		this.asignado = asignado;
	}

	public int getIncidencia() {
		return this.incidencia;
	}

	public void setIncidencia(int incidencia) {
		this.incidencia = incidencia;
	}

}
