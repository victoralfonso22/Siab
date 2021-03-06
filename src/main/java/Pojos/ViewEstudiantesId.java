package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * ViewEstudiantesId generated by hbm2java
 */
public class ViewEstudiantesId implements java.io.Serializable {

	private int id;
	private String matricula;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Date fechaNacimiento;
	private String correo;
	private String telefonoCasa;
	private String celular;
	private String domicilio;
	private String localidad;
	private String municipio;
	private String estado;
	private String modalidad;
	private String carrera;
	private String region;
	private Integer existe;
	private String nombre;
	private String referencia;
	private Integer idReferencia;
	private int idPromotor;
	private String enlace;

	public ViewEstudiantesId() {
	}

	public ViewEstudiantesId(int id, String matricula, String nombres,
			String apellidoPaterno, String modalidad, String carrera,
			String region, String referencia, int idPromotor) {
		this.id = id;
		this.matricula = matricula;
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.modalidad = modalidad;
		this.carrera = carrera;
		this.region = region;
		this.referencia = referencia;
		this.idPromotor = idPromotor;
	}

	public ViewEstudiantesId(int id, String matricula, String nombres,
			String apellidoPaterno, String apellidoMaterno,
			Date fechaNacimiento, String correo, String telefonoCasa,
			String celular, String domicilio, String localidad,
			String municipio, String estado, String modalidad, String carrera,
			String region, Integer existe, String nombre, String referencia,
			Integer idReferencia, int idPromotor, String enlace) {
		this.id = id;
		this.matricula = matricula;
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.correo = correo;
		this.telefonoCasa = telefonoCasa;
		this.celular = celular;
		this.domicilio = domicilio;
		this.localidad = localidad;
		this.municipio = municipio;
		this.estado = estado;
		this.modalidad = modalidad;
		this.carrera = carrera;
		this.region = region;
		this.existe = existe;
		this.nombre = nombre;
		this.referencia = referencia;
		this.idReferencia = idReferencia;
		this.idPromotor = idPromotor;
		this.enlace = enlace;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
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

	public String getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getModalidad() {
		return this.modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public String getCarrera() {
		return this.carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getExiste() {
		return this.existe;
	}

	public void setExiste(Integer existe) {
		this.existe = existe;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getReferencia() {
		return this.referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Integer getIdReferencia() {
		return this.idReferencia;
	}

	public void setIdReferencia(Integer idReferencia) {
		this.idReferencia = idReferencia;
	}

	public int getIdPromotor() {
		return this.idPromotor;
	}

	public void setIdPromotor(int idPromotor) {
		this.idPromotor = idPromotor;
	}

	public String getEnlace() {
		return this.enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewEstudiantesId))
			return false;
		ViewEstudiantesId castOther = (ViewEstudiantesId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getMatricula() == castOther.getMatricula()) || (this
						.getMatricula() != null
						&& castOther.getMatricula() != null && this
						.getMatricula().equals(castOther.getMatricula())))
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
				&& ((this.getFechaNacimiento() == castOther
						.getFechaNacimiento()) || (this.getFechaNacimiento() != null
						&& castOther.getFechaNacimiento() != null && this
						.getFechaNacimiento().equals(
								castOther.getFechaNacimiento())))
				&& ((this.getCorreo() == castOther.getCorreo()) || (this
						.getCorreo() != null && castOther.getCorreo() != null && this
						.getCorreo().equals(castOther.getCorreo())))
				&& ((this.getTelefonoCasa() == castOther.getTelefonoCasa()) || (this
						.getTelefonoCasa() != null
						&& castOther.getTelefonoCasa() != null && this
						.getTelefonoCasa().equals(castOther.getTelefonoCasa())))
				&& ((this.getCelular() == castOther.getCelular()) || (this
						.getCelular() != null && castOther.getCelular() != null && this
						.getCelular().equals(castOther.getCelular())))
				&& ((this.getDomicilio() == castOther.getDomicilio()) || (this
						.getDomicilio() != null
						&& castOther.getDomicilio() != null && this
						.getDomicilio().equals(castOther.getDomicilio())))
				&& ((this.getLocalidad() == castOther.getLocalidad()) || (this
						.getLocalidad() != null
						&& castOther.getLocalidad() != null && this
						.getLocalidad().equals(castOther.getLocalidad())))
				&& ((this.getMunicipio() == castOther.getMunicipio()) || (this
						.getMunicipio() != null
						&& castOther.getMunicipio() != null && this
						.getMunicipio().equals(castOther.getMunicipio())))
				&& ((this.getEstado() == castOther.getEstado()) || (this
						.getEstado() != null && castOther.getEstado() != null && this
						.getEstado().equals(castOther.getEstado())))
				&& ((this.getModalidad() == castOther.getModalidad()) || (this
						.getModalidad() != null
						&& castOther.getModalidad() != null && this
						.getModalidad().equals(castOther.getModalidad())))
				&& ((this.getCarrera() == castOther.getCarrera()) || (this
						.getCarrera() != null && castOther.getCarrera() != null && this
						.getCarrera().equals(castOther.getCarrera())))
				&& ((this.getRegion() == castOther.getRegion()) || (this
						.getRegion() != null && castOther.getRegion() != null && this
						.getRegion().equals(castOther.getRegion())))
				&& ((this.getExiste() == castOther.getExiste()) || (this
						.getExiste() != null && castOther.getExiste() != null && this
						.getExiste().equals(castOther.getExiste())))
				&& ((this.getNombre() == castOther.getNombre()) || (this
						.getNombre() != null && castOther.getNombre() != null && this
						.getNombre().equals(castOther.getNombre())))
				&& ((this.getReferencia() == castOther.getReferencia()) || (this
						.getReferencia() != null
						&& castOther.getReferencia() != null && this
						.getReferencia().equals(castOther.getReferencia())))
				&& ((this.getIdReferencia() == castOther.getIdReferencia()) || (this
						.getIdReferencia() != null
						&& castOther.getIdReferencia() != null && this
						.getIdReferencia().equals(castOther.getIdReferencia())))
				&& (this.getIdPromotor() == castOther.getIdPromotor())
				&& ((this.getEnlace() == castOther.getEnlace()) || (this
						.getEnlace() != null && castOther.getEnlace() != null && this
						.getEnlace().equals(castOther.getEnlace())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result
				+ (getMatricula() == null ? 0 : this.getMatricula().hashCode());
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
		result = 37
				* result
				+ (getFechaNacimiento() == null ? 0 : this.getFechaNacimiento()
						.hashCode());
		result = 37 * result
				+ (getCorreo() == null ? 0 : this.getCorreo().hashCode());
		result = 37
				* result
				+ (getTelefonoCasa() == null ? 0 : this.getTelefonoCasa()
						.hashCode());
		result = 37 * result
				+ (getCelular() == null ? 0 : this.getCelular().hashCode());
		result = 37 * result
				+ (getDomicilio() == null ? 0 : this.getDomicilio().hashCode());
		result = 37 * result
				+ (getLocalidad() == null ? 0 : this.getLocalidad().hashCode());
		result = 37 * result
				+ (getMunicipio() == null ? 0 : this.getMunicipio().hashCode());
		result = 37 * result
				+ (getEstado() == null ? 0 : this.getEstado().hashCode());
		result = 37 * result
				+ (getModalidad() == null ? 0 : this.getModalidad().hashCode());
		result = 37 * result
				+ (getCarrera() == null ? 0 : this.getCarrera().hashCode());
		result = 37 * result
				+ (getRegion() == null ? 0 : this.getRegion().hashCode());
		result = 37 * result
				+ (getExiste() == null ? 0 : this.getExiste().hashCode());
		result = 37 * result
				+ (getNombre() == null ? 0 : this.getNombre().hashCode());
		result = 37
				* result
				+ (getReferencia() == null ? 0 : this.getReferencia()
						.hashCode());
		result = 37
				* result
				+ (getIdReferencia() == null ? 0 : this.getIdReferencia()
						.hashCode());
		result = 37 * result + this.getIdPromotor();
		result = 37 * result
				+ (getEnlace() == null ? 0 : this.getEnlace().hashCode());
		return result;
	}

}
