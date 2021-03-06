package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * DatosColaboradorMaestroId generated by hbm2java
 */
public class DatosColaboradorMaestroId implements java.io.Serializable {

	private int idColaborador;
	private String referencia;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Integer comision;
	private String promotor;
	private String telefonoCasa;
	private String celular;
	private String correo;
	private String calle;
	private String numeroExterior;
	private String numeroInterior;
	private String colonia;
	private String ciudad;
	private String estado;
	private Integer replica;
	private String cp;
	private String region;

	public DatosColaboradorMaestroId() {
	}

	public DatosColaboradorMaestroId(int idColaborador, String nombres,
			String apellidoPaterno, String calle, String numeroExterior) {
		this.idColaborador = idColaborador;
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.calle = calle;
		this.numeroExterior = numeroExterior;
	}

	public DatosColaboradorMaestroId(int idColaborador, String referencia,
			String nombres, String apellidoPaterno, String apellidoMaterno,
			Integer comision, String promotor, String telefonoCasa,
			String celular, String correo, String calle, String numeroExterior,
			String numeroInterior, String colonia, String ciudad,
			String estado, Integer replica, String cp, String region) {
		this.idColaborador = idColaborador;
		this.referencia = referencia;
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.comision = comision;
		this.promotor = promotor;
		this.telefonoCasa = telefonoCasa;
		this.celular = celular;
		this.correo = correo;
		this.calle = calle;
		this.numeroExterior = numeroExterior;
		this.numeroInterior = numeroInterior;
		this.colonia = colonia;
		this.ciudad = ciudad;
		this.estado = estado;
		this.replica = replica;
		this.cp = cp;
		this.region = region;
	}

	public int getIdColaborador() {
		return this.idColaborador;
	}

	public void setIdColaborador(int idColaborador) {
		this.idColaborador = idColaborador;
	}

	public String getReferencia() {
		return this.referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public Integer getComision() {
		return this.comision;
	}

	public void setComision(Integer comision) {
		this.comision = comision;
	}

	public String getPromotor() {
		return this.promotor;
	}

	public void setPromotor(String promotor) {
		this.promotor = promotor;
	}

	public String getTelefonoCasa() {
		return this.telefonoCasa;
	}

	public void setTelefonoCasa(String telefonoCasa) {
		this.telefonoCasa = telefonoCasa;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumeroExterior() {
		return this.numeroExterior;
	}

	public void setNumeroExterior(String numeroExterior) {
		this.numeroExterior = numeroExterior;
	}

	public String getNumeroInterior() {
		return this.numeroInterior;
	}

	public void setNumeroInterior(String numeroInterior) {
		this.numeroInterior = numeroInterior;
	}

	public String getColonia() {
		return this.colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getReplica() {
		return this.replica;
	}

	public void setReplica(Integer replica) {
		this.replica = replica;
	}

	public String getCp() {
		return this.cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DatosColaboradorMaestroId))
			return false;
		DatosColaboradorMaestroId castOther = (DatosColaboradorMaestroId) other;

		return (this.getIdColaborador() == castOther.getIdColaborador())
				&& ((this.getReferencia() == castOther.getReferencia()) || (this
						.getReferencia() != null
						&& castOther.getReferencia() != null && this
						.getReferencia().equals(castOther.getReferencia())))
				&& ((this.getNombres() == castOther.getNombres()) || (this
						.getNombres() != null && castOther.getNombres() != null && this
						.getNombres().equals(castOther.getNombres())))
				&& ((this.getApellidoPaterno() == castOther
						.getApellidoPaterno()) || (this.getApellidoPaterno() != null
						&& castOther.getApellidoPaterno() != null && this
						.getApellidoPaterno().equals(
								castOther.getApellidoPaterno())))
				&& ((this.getApellidoMaterno() == castOther
						.getApellidoMaterno()) || (this.getApellidoMaterno() != null
						&& castOther.getApellidoMaterno() != null && this
						.getApellidoMaterno().equals(
								castOther.getApellidoMaterno())))
				&& ((this.getComision() == castOther.getComision()) || (this
						.getComision() != null
						&& castOther.getComision() != null && this
						.getComision().equals(castOther.getComision())))
				&& ((this.getPromotor() == castOther.getPromotor()) || (this
						.getPromotor() != null
						&& castOther.getPromotor() != null && this
						.getPromotor().equals(castOther.getPromotor())))
				&& ((this.getTelefonoCasa() == castOther.getTelefonoCasa()) || (this
						.getTelefonoCasa() != null
						&& castOther.getTelefonoCasa() != null && this
						.getTelefonoCasa().equals(castOther.getTelefonoCasa())))
				&& ((this.getCelular() == castOther.getCelular()) || (this
						.getCelular() != null && castOther.getCelular() != null && this
						.getCelular().equals(castOther.getCelular())))
				&& ((this.getCorreo() == castOther.getCorreo()) || (this
						.getCorreo() != null && castOther.getCorreo() != null && this
						.getCorreo().equals(castOther.getCorreo())))
				&& ((this.getCalle() == castOther.getCalle()) || (this
						.getCalle() != null && castOther.getCalle() != null && this
						.getCalle().equals(castOther.getCalle())))
				&& ((this.getNumeroExterior() == castOther.getNumeroExterior()) || (this
						.getNumeroExterior() != null
						&& castOther.getNumeroExterior() != null && this
						.getNumeroExterior().equals(
								castOther.getNumeroExterior())))
				&& ((this.getNumeroInterior() == castOther.getNumeroInterior()) || (this
						.getNumeroInterior() != null
						&& castOther.getNumeroInterior() != null && this
						.getNumeroInterior().equals(
								castOther.getNumeroInterior())))
				&& ((this.getColonia() == castOther.getColonia()) || (this
						.getColonia() != null && castOther.getColonia() != null && this
						.getColonia().equals(castOther.getColonia())))
				&& ((this.getCiudad() == castOther.getCiudad()) || (this
						.getCiudad() != null && castOther.getCiudad() != null && this
						.getCiudad().equals(castOther.getCiudad())))
				&& ((this.getEstado() == castOther.getEstado()) || (this
						.getEstado() != null && castOther.getEstado() != null && this
						.getEstado().equals(castOther.getEstado())))
				&& ((this.getReplica() == castOther.getReplica()) || (this
						.getReplica() != null && castOther.getReplica() != null && this
						.getReplica().equals(castOther.getReplica())))
				&& ((this.getCp() == castOther.getCp()) || (this.getCp() != null
						&& castOther.getCp() != null && this.getCp().equals(
						castOther.getCp())))
				&& ((this.getRegion() == castOther.getRegion()) || (this
						.getRegion() != null && castOther.getRegion() != null && this
						.getRegion().equals(castOther.getRegion())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdColaborador();
		result = 37
				* result
				+ (getReferencia() == null ? 0 : this.getReferencia()
						.hashCode());
		result = 37 * result
				+ (getNombres() == null ? 0 : this.getNombres().hashCode());
		result = 37
				* result
				+ (getApellidoPaterno() == null ? 0 : this.getApellidoPaterno()
						.hashCode());
		result = 37
				* result
				+ (getApellidoMaterno() == null ? 0 : this.getApellidoMaterno()
						.hashCode());
		result = 37 * result
				+ (getComision() == null ? 0 : this.getComision().hashCode());
		result = 37 * result
				+ (getPromotor() == null ? 0 : this.getPromotor().hashCode());
		result = 37
				* result
				+ (getTelefonoCasa() == null ? 0 : this.getTelefonoCasa()
						.hashCode());
		result = 37 * result
				+ (getCelular() == null ? 0 : this.getCelular().hashCode());
		result = 37 * result
				+ (getCorreo() == null ? 0 : this.getCorreo().hashCode());
		result = 37 * result
				+ (getCalle() == null ? 0 : this.getCalle().hashCode());
		result = 37
				* result
				+ (getNumeroExterior() == null ? 0 : this.getNumeroExterior()
						.hashCode());
		result = 37
				* result
				+ (getNumeroInterior() == null ? 0 : this.getNumeroInterior()
						.hashCode());
		result = 37 * result
				+ (getColonia() == null ? 0 : this.getColonia().hashCode());
		result = 37 * result
				+ (getCiudad() == null ? 0 : this.getCiudad().hashCode());
		result = 37 * result
				+ (getEstado() == null ? 0 : this.getEstado().hashCode());
		result = 37 * result
				+ (getReplica() == null ? 0 : this.getReplica().hashCode());
		result = 37 * result + (getCp() == null ? 0 : this.getCp().hashCode());
		result = 37 * result
				+ (getRegion() == null ? 0 : this.getRegion().hashCode());
		return result;
	}

}
