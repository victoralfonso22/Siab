package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Promociones generated by hbm2java
 */
public class Promociones implements java.io.Serializable {

	private Integer id;
	private int idSorteo;
	private Date fechaInicio;
	private Date fechaFin;
	private String descripcion;
	private int cantidadPagada;
	private int boletosRecompensa;
	private Integer aplicaDeudores;
	private Date fechaCreacion;
	private int idUsuario;
	private Integer estatus;

	public Promociones() {
	}

	public Promociones(int idSorteo, Date fechaInicio, Date fechaFin,
			String descripcion, int cantidadPagada, int boletosRecompensa,
			Date fechaCreacion, int idUsuario) {
		this.idSorteo = idSorteo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.descripcion = descripcion;
		this.cantidadPagada = cantidadPagada;
		this.boletosRecompensa = boletosRecompensa;
		this.fechaCreacion = fechaCreacion;
		this.idUsuario = idUsuario;
	}

	public Promociones(int idSorteo, Date fechaInicio, Date fechaFin,
			String descripcion, int cantidadPagada, int boletosRecompensa,
			Integer aplicaDeudores, Date fechaCreacion, int idUsuario,
			Integer estatus) {
		this.idSorteo = idSorteo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.descripcion = descripcion;
		this.cantidadPagada = cantidadPagada;
		this.boletosRecompensa = boletosRecompensa;
		this.aplicaDeudores = aplicaDeudores;
		this.fechaCreacion = fechaCreacion;
		this.idUsuario = idUsuario;
		this.estatus = estatus;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getIdSorteo() {
		return this.idSorteo;
	}

	public void setIdSorteo(int idSorteo) {
		this.idSorteo = idSorteo;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidadPagada() {
		return this.cantidadPagada;
	}

	public void setCantidadPagada(int cantidadPagada) {
		this.cantidadPagada = cantidadPagada;
	}

	public int getBoletosRecompensa() {
		return this.boletosRecompensa;
	}

	public void setBoletosRecompensa(int boletosRecompensa) {
		this.boletosRecompensa = boletosRecompensa;
	}

	public Integer getAplicaDeudores() {
		return this.aplicaDeudores;
	}

	public void setAplicaDeudores(Integer aplicaDeudores) {
		this.aplicaDeudores = aplicaDeudores;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getEstatus() {
		return this.estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

}