package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Nominas generated by hbm2java
 */
public class Nominas implements java.io.Serializable {

	private Integer id;
	private int idFc2;
	private Integer idColaborador;
	private String folio;
	private Date inicioPago;
	private int numeroQuincenas;
	private int numeroBoletos;
	private int monto;
	private Integer tipoMovimiento;
	private Date fechaRegistro;
	private int idUsuario;
	private int estatus;

	public Nominas() {
	}

	public Nominas(int idFc2, String folio, Date inicioPago,
			int numeroQuincenas, int numeroBoletos, int monto,
			Date fechaRegistro, int idUsuario, int estatus) {
		this.idFc2 = idFc2;
		this.folio = folio;
		this.inicioPago = inicioPago;
		this.numeroQuincenas = numeroQuincenas;
		this.numeroBoletos = numeroBoletos;
		this.monto = monto;
		this.fechaRegistro = fechaRegistro;
		this.idUsuario = idUsuario;
		this.estatus = estatus;
	}

	public Nominas(int idFc2, Integer idColaborador, String folio,
			Date inicioPago, int numeroQuincenas, int numeroBoletos, int monto,
			Integer tipoMovimiento, Date fechaRegistro, int idUsuario,
			int estatus) {
		this.idFc2 = idFc2;
		this.idColaborador = idColaborador;
		this.folio = folio;
		this.inicioPago = inicioPago;
		this.numeroQuincenas = numeroQuincenas;
		this.numeroBoletos = numeroBoletos;
		this.monto = monto;
		this.tipoMovimiento = tipoMovimiento;
		this.fechaRegistro = fechaRegistro;
		this.idUsuario = idUsuario;
		this.estatus = estatus;
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

	public Integer getIdColaborador() {
		return this.idColaborador;
	}

	public void setIdColaborador(Integer idColaborador) {
		this.idColaborador = idColaborador;
	}

	public String getFolio() {
		return this.folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public Date getInicioPago() {
		return this.inicioPago;
	}

	public void setInicioPago(Date inicioPago) {
		this.inicioPago = inicioPago;
	}

	public int getNumeroQuincenas() {
		return this.numeroQuincenas;
	}

	public void setNumeroQuincenas(int numeroQuincenas) {
		this.numeroQuincenas = numeroQuincenas;
	}

	public int getNumeroBoletos() {
		return this.numeroBoletos;
	}

	public void setNumeroBoletos(int numeroBoletos) {
		this.numeroBoletos = numeroBoletos;
	}

	public int getMonto() {
		return this.monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public Integer getTipoMovimiento() {
		return this.tipoMovimiento;
	}

	public void setTipoMovimiento(Integer tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getEstatus() {
		return this.estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

}
