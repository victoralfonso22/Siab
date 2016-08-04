package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Estudiantes generated by hbm2java
 */
public class Estudiantes implements java.io.Serializable {

	private Integer id;
	private String matricula;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Date fechaNacimiento;
	private String correo;
	private String lada;
	private String telefono;
	private String celular;
	private String domicilio;
	private String localidad;
	private String municipio;
	private String estado;
	private String claveNivel;
	private String modalidad;
	private String carrera;
	private String region;
	private Integer lugarCarrera;
	private Integer existe;
	private Integer idSector;
	private Integer idReferencia;
	private Integer participa;

	public Estudiantes() {
	}

	public Estudiantes(String matricula, String nombres,
			String apellidoPaterno, String claveNivel, String modalidad,
			String carrera, String region) {
		this.matricula = matricula;
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.claveNivel = claveNivel;
		this.modalidad = modalidad;
		this.carrera = carrera;
		this.region = region;
	}

	public Estudiantes(String matricula, String nombres,
			String apellidoPaterno, String apellidoMaterno,
			Date fechaNacimiento, String correo, String lada, String telefono,
			String celular, String domicilio, String localidad,
			String municipio, String estado, String claveNivel,
			String modalidad, String carrera, String region,
			Integer lugarCarrera, Integer existe, Integer idSector,
			Integer idReferencia, Integer participa) {
		this.matricula = matricula;
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.correo = correo;
		this.lada = lada;
		this.telefono = telefono;
		this.celular = celular;
		this.domicilio = domicilio;
		this.localidad = localidad;
		this.municipio = municipio;
		this.estado = estado;
		this.claveNivel = claveNivel;
		this.modalidad = modalidad;
		this.carrera = carrera;
		this.region = region;
		this.lugarCarrera = lugarCarrera;
		this.existe = existe;
		this.idSector = idSector;
		this.idReferencia = idReferencia;
		this.participa = participa;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
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

	public String getLada() {
		return this.lada;
	}

	public void setLada(String lada) {
		this.lada = lada;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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

	public String getClaveNivel() {
		return this.claveNivel;
	}

	public void setClaveNivel(String claveNivel) {
		this.claveNivel = claveNivel;
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

	public Integer getLugarCarrera() {
		return this.lugarCarrera;
	}

	public void setLugarCarrera(Integer lugarCarrera) {
		this.lugarCarrera = lugarCarrera;
	}

	public Integer getExiste() {
		return this.existe;
	}

	public void setExiste(Integer existe) {
		this.existe = existe;
	}

	public Integer getIdSector() {
		return this.idSector;
	}

	public void setIdSector(Integer idSector) {
		this.idSector = idSector;
	}

	public Integer getIdReferencia() {
		return this.idReferencia;
	}

	public void setIdReferencia(Integer idReferencia) {
		this.idReferencia = idReferencia;
	}

	public Integer getParticipa() {
		return this.participa;
	}

	public void setParticipa(Integer participa) {
		this.participa = participa;
	}

}