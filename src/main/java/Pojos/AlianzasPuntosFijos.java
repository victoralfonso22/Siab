package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * AlianzasPuntosFijos generated by hbm2java
 */
public class AlianzasPuntosFijos implements java.io.Serializable {

	private Integer id;
	private int tipo;
	private int sucursal;
	private int idReferencia;
	private int idColaboradorResponsable;
	private Date fecha;

	public AlianzasPuntosFijos() {
	}

	public AlianzasPuntosFijos(int tipo, int sucursal, int idReferencia,
			int idColaboradorResponsable, Date fecha) {
		this.tipo = tipo;
		this.sucursal = sucursal;
		this.idReferencia = idReferencia;
		this.idColaboradorResponsable = idColaboradorResponsable;
		this.fecha = fecha;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(int sucursal) {
		this.sucursal = sucursal;
	}

	public int getIdReferencia() {
		return this.idReferencia;
	}

	public void setIdReferencia(int idReferencia) {
		this.idReferencia = idReferencia;
	}

	public int getIdColaboradorResponsable() {
		return this.idColaboradorResponsable;
	}

	public void setIdColaboradorResponsable(int idColaboradorResponsable) {
		this.idColaboradorResponsable = idColaboradorResponsable;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}