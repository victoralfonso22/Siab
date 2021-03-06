package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Colaboradores generated by hbm2java
 */
public class Colaboradores implements java.io.Serializable {

	private Integer id;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Date fechaNacimiento;
	private String calle;
	private String numeroInterior;
	private String numeroExterior;
	private int idEstado;
	private int idMunicipio;
	private int idLocalidad;
	private String idCodigoPostal;
	private int idPromotor;
	private int tipo;
	private Integer idTipoColaborador;
	private String telefonoCasa;
	private String telefonoOficina;
	private String extensionOficina;
	private String celular;
	private String correo;
	private Integer idReferencia;
	private String rfc;
	private Date fechaAlta;
	private int idUsuario;
	private Integer documentacionMinima;
	private int estatus;
	private String observaciones;
	private String numeroPersonal;
	private Integer idTipoContratacion;
	private Integer idTipoPersonal;
	private Integer replica;
	private int egresadoUv;
	private String preregistro;
	private Integer idEstudiante;

	public Colaboradores() {
	}

	public Colaboradores(String nombres, String apellidoPaterno, String calle,
			String numeroExterior, int idEstado, int idMunicipio,
			int idLocalidad, String idCodigoPostal, int idPromotor, int tipo,
			String rfc, Date fechaAlta, int idUsuario, int estatus,
			String numeroPersonal, int egresadoUv) {
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.calle = calle;
		this.numeroExterior = numeroExterior;
		this.idEstado = idEstado;
		this.idMunicipio = idMunicipio;
		this.idLocalidad = idLocalidad;
		this.idCodigoPostal = idCodigoPostal;
		this.idPromotor = idPromotor;
		this.tipo = tipo;
		this.rfc = rfc;
		this.fechaAlta = fechaAlta;
		this.idUsuario = idUsuario;
		this.estatus = estatus;
		this.numeroPersonal = numeroPersonal;
		this.egresadoUv = egresadoUv;
	}

	public Colaboradores(String nombres, String apellidoPaterno,
			String apellidoMaterno, Date fechaNacimiento, String calle,
			String numeroInterior, String numeroExterior, int idEstado,
			int idMunicipio, int idLocalidad, String idCodigoPostal,
			int idPromotor, int tipo, Integer idTipoColaborador,
			String telefonoCasa, String telefonoOficina,
			String extensionOficina, String celular, String correo,
			Integer idReferencia, String rfc, Date fechaAlta, int idUsuario,
			Integer documentacionMinima, int estatus, String observaciones,
			String numeroPersonal, Integer idTipoContratacion,
			Integer idTipoPersonal, Integer replica, int egresadoUv,
			String preregistro, Integer idEstudiante) {
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.calle = calle;
		this.numeroInterior = numeroInterior;
		this.numeroExterior = numeroExterior;
		this.idEstado = idEstado;
		this.idMunicipio = idMunicipio;
		this.idLocalidad = idLocalidad;
		this.idCodigoPostal = idCodigoPostal;
		this.idPromotor = idPromotor;
		this.tipo = tipo;
		this.idTipoColaborador = idTipoColaborador;
		this.telefonoCasa = telefonoCasa;
		this.telefonoOficina = telefonoOficina;
		this.extensionOficina = extensionOficina;
		this.celular = celular;
		this.correo = correo;
		this.idReferencia = idReferencia;
		this.rfc = rfc;
		this.fechaAlta = fechaAlta;
		this.idUsuario = idUsuario;
		this.documentacionMinima = documentacionMinima;
		this.estatus = estatus;
		this.observaciones = observaciones;
		this.numeroPersonal = numeroPersonal;
		this.idTipoContratacion = idTipoContratacion;
		this.idTipoPersonal = idTipoPersonal;
		this.replica = replica;
		this.egresadoUv = egresadoUv;
		this.preregistro = preregistro;
		this.idEstudiante = idEstudiante;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumeroInterior() {
		return this.numeroInterior;
	}

	public void setNumeroInterior(String numeroInterior) {
		this.numeroInterior = numeroInterior;
	}

	public String getNumeroExterior() {
		return this.numeroExterior;
	}

	public void setNumeroExterior(String numeroExterior) {
		this.numeroExterior = numeroExterior;
	}

	public int getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	public int getIdMunicipio() {
		return this.idMunicipio;
	}

	public void setIdMunicipio(int idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public int getIdLocalidad() {
		return this.idLocalidad;
	}

	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public String getIdCodigoPostal() {
		return this.idCodigoPostal;
	}

	public void setIdCodigoPostal(String idCodigoPostal) {
		this.idCodigoPostal = idCodigoPostal;
	}

	public int getIdPromotor() {
		return this.idPromotor;
	}

	public void setIdPromotor(int idPromotor) {
		this.idPromotor = idPromotor;
	}

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Integer getIdTipoColaborador() {
		return this.idTipoColaborador;
	}

	public void setIdTipoColaborador(Integer idTipoColaborador) {
		this.idTipoColaborador = idTipoColaborador;
	}

	public String getTelefonoCasa() {
		return this.telefonoCasa;
	}

	public void setTelefonoCasa(String telefonoCasa) {
		this.telefonoCasa = telefonoCasa;
	}

	public String getTelefonoOficina() {
		return this.telefonoOficina;
	}

	public void setTelefonoOficina(String telefonoOficina) {
		this.telefonoOficina = telefonoOficina;
	}

	public String getExtensionOficina() {
		return this.extensionOficina;
	}

	public void setExtensionOficina(String extensionOficina) {
		this.extensionOficina = extensionOficina;
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

	public Integer getIdReferencia() {
		return this.idReferencia;
	}

	public void setIdReferencia(Integer idReferencia) {
		this.idReferencia = idReferencia;
	}

	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getDocumentacionMinima() {
		return this.documentacionMinima;
	}

	public void setDocumentacionMinima(Integer documentacionMinima) {
		this.documentacionMinima = documentacionMinima;
	}

	public int getEstatus() {
		return this.estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getNumeroPersonal() {
		return this.numeroPersonal;
	}

	public void setNumeroPersonal(String numeroPersonal) {
		this.numeroPersonal = numeroPersonal;
	}

	public Integer getIdTipoContratacion() {
		return this.idTipoContratacion;
	}

	public void setIdTipoContratacion(Integer idTipoContratacion) {
		this.idTipoContratacion = idTipoContratacion;
	}

	public Integer getIdTipoPersonal() {
		return this.idTipoPersonal;
	}

	public void setIdTipoPersonal(Integer idTipoPersonal) {
		this.idTipoPersonal = idTipoPersonal;
	}

	public Integer getReplica() {
		return this.replica;
	}

	public void setReplica(Integer replica) {
		this.replica = replica;
	}

	public int getEgresadoUv() {
		return this.egresadoUv;
	}

	public void setEgresadoUv(int egresadoUv) {
		this.egresadoUv = egresadoUv;
	}

	public String getPreregistro() {
		return this.preregistro;
	}

	public void setPreregistro(String preregistro) {
		this.preregistro = preregistro;
	}

	public Integer getIdEstudiante() {
		return this.idEstudiante;
	}

	public void setIdEstudiante(Integer idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

}
