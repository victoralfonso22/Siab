package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * Quincenas generated by hbm2java
 */
public class Quincenas implements java.io.Serializable {

	private Integer idquincena;
	private Integer anio;
	private String numeroquincena;
	private Integer estatus;
	private String descripcion;

	public Quincenas() {
	}

	public Quincenas(Integer anio, String numeroquincena, Integer estatus,
			String descripcion) {
		this.anio = anio;
		this.numeroquincena = numeroquincena;
		this.estatus = estatus;
		this.descripcion = descripcion;
	}

	public Integer getIdquincena() {
		return this.idquincena;
	}

	public void setIdquincena(Integer idquincena) {
		this.idquincena = idquincena;
	}

	public Integer getAnio() {
		return this.anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getNumeroquincena() {
		return this.numeroquincena;
	}

	public void setNumeroquincena(String numeroquincena) {
		this.numeroquincena = numeroquincena;
	}

	public Integer getEstatus() {
		return this.estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}