package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * EfectividadAcdId generated by hbm2java
 */
public class EfectividadAcdId implements java.io.Serializable {

	private int idColaborador;
	private int tipoSector;
	private int idRegion;
	private int tipo;
	private Date fechaLlamada;
	private String telefonoContacto;
	private int estatus;
	private int duracion;
	private Date fechaCampana;

	public EfectividadAcdId() {
	}

	public EfectividadAcdId(int idColaborador, int tipoSector, int idRegion,
			int tipo, Date fechaLlamada, String telefonoContacto, int estatus,
			int duracion, Date fechaCampana) {
		this.idColaborador = idColaborador;
		this.tipoSector = tipoSector;
		this.idRegion = idRegion;
		this.tipo = tipo;
		this.fechaLlamada = fechaLlamada;
		this.telefonoContacto = telefonoContacto;
		this.estatus = estatus;
		this.duracion = duracion;
		this.fechaCampana = fechaCampana;
	}

	public int getIdColaborador() {
		return this.idColaborador;
	}

	public void setIdColaborador(int idColaborador) {
		this.idColaborador = idColaborador;
	}

	public int getTipoSector() {
		return this.tipoSector;
	}

	public void setTipoSector(int tipoSector) {
		this.tipoSector = tipoSector;
	}

	public int getIdRegion() {
		return this.idRegion;
	}

	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Date getFechaLlamada() {
		return this.fechaLlamada;
	}

	public void setFechaLlamada(Date fechaLlamada) {
		this.fechaLlamada = fechaLlamada;
	}

	public String getTelefonoContacto() {
		return this.telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public int getEstatus() {
		return this.estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Date getFechaCampana() {
		return this.fechaCampana;
	}

	public void setFechaCampana(Date fechaCampana) {
		this.fechaCampana = fechaCampana;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EfectividadAcdId))
			return false;
		EfectividadAcdId castOther = (EfectividadAcdId) other;

		return (this.getIdColaborador() == castOther.getIdColaborador())
				&& (this.getTipoSector() == castOther.getTipoSector())
				&& (this.getIdRegion() == castOther.getIdRegion())
				&& (this.getTipo() == castOther.getTipo())
				&& ((this.getFechaLlamada() == castOther.getFechaLlamada()) || (this
						.getFechaLlamada() != null
						&& castOther.getFechaLlamada() != null && this
						.getFechaLlamada().equals(castOther.getFechaLlamada())))
				&& ((this.getTelefonoContacto() == castOther
						.getTelefonoContacto()) || (this.getTelefonoContacto() != null
						&& castOther.getTelefonoContacto() != null && this
						.getTelefonoContacto().equals(
								castOther.getTelefonoContacto())))
				&& (this.getEstatus() == castOther.getEstatus())
				&& (this.getDuracion() == castOther.getDuracion())
				&& ((this.getFechaCampana() == castOther.getFechaCampana()) || (this
						.getFechaCampana() != null
						&& castOther.getFechaCampana() != null && this
						.getFechaCampana().equals(castOther.getFechaCampana())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdColaborador();
		result = 37 * result + this.getTipoSector();
		result = 37 * result + this.getIdRegion();
		result = 37 * result + this.getTipo();
		result = 37
				* result
				+ (getFechaLlamada() == null ? 0 : this.getFechaLlamada()
						.hashCode());
		result = 37
				* result
				+ (getTelefonoContacto() == null ? 0 : this
						.getTelefonoContacto().hashCode());
		result = 37 * result + this.getEstatus();
		result = 37 * result + this.getDuracion();
		result = 37
				* result
				+ (getFechaCampana() == null ? 0 : this.getFechaCampana()
						.hashCode());
		return result;
	}

}
