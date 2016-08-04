package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Fc1b generated by hbm2java
 */
public class Fc1b implements java.io.Serializable {

	private Integer id;
	private String folio;
	private Integer idPromotorEnlace;
	private Integer idPromotorPadre;
	private Date fechaAlta;
	private Date fechaImpresion;
	private String status;
	private Integer idUsuario;
	private Integer idSector;
	private Integer externoSector;
	private Integer externoDependencia;
	private Integer uvOfiIns;

	public Fc1b() {
	}

	public Fc1b(String folio, Integer idPromotorEnlace,
			Integer idPromotorPadre, Date fechaAlta, Date fechaImpresion,
			String status, Integer idUsuario, Integer idSector,
			Integer externoSector, Integer externoDependencia, Integer uvOfiIns) {
		this.folio = folio;
		this.idPromotorEnlace = idPromotorEnlace;
		this.idPromotorPadre = idPromotorPadre;
		this.fechaAlta = fechaAlta;
		this.fechaImpresion = fechaImpresion;
		this.status = status;
		this.idUsuario = idUsuario;
		this.idSector = idSector;
		this.externoSector = externoSector;
		this.externoDependencia = externoDependencia;
		this.uvOfiIns = uvOfiIns;
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

	public Integer getIdPromotorEnlace() {
		return this.idPromotorEnlace;
	}

	public void setIdPromotorEnlace(Integer idPromotorEnlace) {
		this.idPromotorEnlace = idPromotorEnlace;
	}

	public Integer getIdPromotorPadre() {
		return this.idPromotorPadre;
	}

	public void setIdPromotorPadre(Integer idPromotorPadre) {
		this.idPromotorPadre = idPromotorPadre;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaImpresion() {
		return this.fechaImpresion;
	}

	public void setFechaImpresion(Date fechaImpresion) {
		this.fechaImpresion = fechaImpresion;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdSector() {
		return this.idSector;
	}

	public void setIdSector(Integer idSector) {
		this.idSector = idSector;
	}

	public Integer getExternoSector() {
		return this.externoSector;
	}

	public void setExternoSector(Integer externoSector) {
		this.externoSector = externoSector;
	}

	public Integer getExternoDependencia() {
		return this.externoDependencia;
	}

	public void setExternoDependencia(Integer externoDependencia) {
		this.externoDependencia = externoDependencia;
	}

	public Integer getUvOfiIns() {
		return this.uvOfiIns;
	}

	public void setUvOfiIns(Integer uvOfiIns) {
		this.uvOfiIns = uvOfiIns;
	}

}