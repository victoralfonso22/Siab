package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Fc7b generated by hbm2java
 */
public class Fc7b implements java.io.Serializable {

	private Integer id;
	private String folio;
	private Integer idEnlace;
	private Date fechaAlta;
	private Integer idUsuario;

	public Fc7b() {
	}

	public Fc7b(String folio, Integer idEnlace, Date fechaAlta,
			Integer idUsuario) {
		this.folio = folio;
		this.idEnlace = idEnlace;
		this.fechaAlta = fechaAlta;
		this.idUsuario = idUsuario;
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

	public Integer getIdEnlace() {
		return this.idEnlace;
	}

	public void setIdEnlace(Integer idEnlace) {
		this.idEnlace = idEnlace;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

}
