package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Tip generated by hbm2java
 */
public class Tip implements java.io.Serializable {

	private Integer id;
	private Integer numeroTransaccion;
	private Integer importe;
	private Integer sucursal;
	private String referencia;
	private Boolean procesado;
	private Date fechaProcesado;
	private String observacion;
	private Date fecha;
	private String tipo;

	public Tip() {
	}

	public Tip(Integer numeroTransaccion, Integer importe, Integer sucursal,
			String referencia, Boolean procesado, Date fechaProcesado,
			String observacion, Date fecha, String tipo) {
		this.numeroTransaccion = numeroTransaccion;
		this.importe = importe;
		this.sucursal = sucursal;
		this.referencia = referencia;
		this.procesado = procesado;
		this.fechaProcesado = fechaProcesado;
		this.observacion = observacion;
		this.fecha = fecha;
		this.tipo = tipo;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroTransaccion() {
		return this.numeroTransaccion;
	}

	public void setNumeroTransaccion(Integer numeroTransaccion) {
		this.numeroTransaccion = numeroTransaccion;
	}

	public Integer getImporte() {
		return this.importe;
	}

	public void setImporte(Integer importe) {
		this.importe = importe;
	}

	public Integer getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Integer sucursal) {
		this.sucursal = sucursal;
	}

	public String getReferencia() {
		return this.referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Boolean getProcesado() {
		return this.procesado;
	}

	public void setProcesado(Boolean procesado) {
		this.procesado = procesado;
	}

	public Date getFechaProcesado() {
		return this.fechaProcesado;
	}

	public void setFechaProcesado(Date fechaProcesado) {
		this.fechaProcesado = fechaProcesado;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}