package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * SorteoMagnoHistorialId generated by hbm2java
 */
public class SorteoMagnoHistorialId implements java.io.Serializable {

	private int id;
	private int idBoleto;
	private int idCartera;
	private Character ubicacion;
	private Integer idColaborador;
	private Integer idEjecutivo;
	private Integer idFc2;
	private Integer idPremio;
	private Integer idPremioAsignado;
	private String nombreGanador;
	private String calleGanador;
	private String ciudadGanador;
	private String telefonoGanador;
	private Integer estatus;
	private String boleto;
	private String cartera;
	private String nombreColaborador;
	private Integer folioFc2;
	private Integer premio;
	private Integer asignado;
	private String numExtGanador;
	private String numIntGanador;
	private String cpGanador;
	private String coloniaGanador;
	private Integer contacto;
	private int anio;

	public SorteoMagnoHistorialId() {
	}

	public SorteoMagnoHistorialId(int id, int idBoleto, int idCartera, int anio) {
		this.id = id;
		this.idBoleto = idBoleto;
		this.idCartera = idCartera;
		this.anio = anio;
	}

	public SorteoMagnoHistorialId(int id, int idBoleto, int idCartera,
			Character ubicacion, Integer idColaborador, Integer idEjecutivo,
			Integer idFc2, Integer idPremio, Integer idPremioAsignado,
			String nombreGanador, String calleGanador, String ciudadGanador,
			String telefonoGanador, Integer estatus, String boleto,
			String cartera, String nombreColaborador, Integer folioFc2,
			Integer premio, Integer asignado, String numExtGanador,
			String numIntGanador, String cpGanador, String coloniaGanador,
			Integer contacto, int anio) {
		this.id = id;
		this.idBoleto = idBoleto;
		this.idCartera = idCartera;
		this.ubicacion = ubicacion;
		this.idColaborador = idColaborador;
		this.idEjecutivo = idEjecutivo;
		this.idFc2 = idFc2;
		this.idPremio = idPremio;
		this.idPremioAsignado = idPremioAsignado;
		this.nombreGanador = nombreGanador;
		this.calleGanador = calleGanador;
		this.ciudadGanador = ciudadGanador;
		this.telefonoGanador = telefonoGanador;
		this.estatus = estatus;
		this.boleto = boleto;
		this.cartera = cartera;
		this.nombreColaborador = nombreColaborador;
		this.folioFc2 = folioFc2;
		this.premio = premio;
		this.asignado = asignado;
		this.numExtGanador = numExtGanador;
		this.numIntGanador = numIntGanador;
		this.cpGanador = cpGanador;
		this.coloniaGanador = coloniaGanador;
		this.contacto = contacto;
		this.anio = anio;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdBoleto() {
		return this.idBoleto;
	}

	public void setIdBoleto(int idBoleto) {
		this.idBoleto = idBoleto;
	}

	public int getIdCartera() {
		return this.idCartera;
	}

	public void setIdCartera(int idCartera) {
		this.idCartera = idCartera;
	}

	public Character getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(Character ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Integer getIdColaborador() {
		return this.idColaborador;
	}

	public void setIdColaborador(Integer idColaborador) {
		this.idColaborador = idColaborador;
	}

	public Integer getIdEjecutivo() {
		return this.idEjecutivo;
	}

	public void setIdEjecutivo(Integer idEjecutivo) {
		this.idEjecutivo = idEjecutivo;
	}

	public Integer getIdFc2() {
		return this.idFc2;
	}

	public void setIdFc2(Integer idFc2) {
		this.idFc2 = idFc2;
	}

	public Integer getIdPremio() {
		return this.idPremio;
	}

	public void setIdPremio(Integer idPremio) {
		this.idPremio = idPremio;
	}

	public Integer getIdPremioAsignado() {
		return this.idPremioAsignado;
	}

	public void setIdPremioAsignado(Integer idPremioAsignado) {
		this.idPremioAsignado = idPremioAsignado;
	}

	public String getNombreGanador() {
		return this.nombreGanador;
	}

	public void setNombreGanador(String nombreGanador) {
		this.nombreGanador = nombreGanador;
	}

	public String getCalleGanador() {
		return this.calleGanador;
	}

	public void setCalleGanador(String calleGanador) {
		this.calleGanador = calleGanador;
	}

	public String getCiudadGanador() {
		return this.ciudadGanador;
	}

	public void setCiudadGanador(String ciudadGanador) {
		this.ciudadGanador = ciudadGanador;
	}

	public String getTelefonoGanador() {
		return this.telefonoGanador;
	}

	public void setTelefonoGanador(String telefonoGanador) {
		this.telefonoGanador = telefonoGanador;
	}

	public Integer getEstatus() {
		return this.estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public String getBoleto() {
		return this.boleto;
	}

	public void setBoleto(String boleto) {
		this.boleto = boleto;
	}

	public String getCartera() {
		return this.cartera;
	}

	public void setCartera(String cartera) {
		this.cartera = cartera;
	}

	public String getNombreColaborador() {
		return this.nombreColaborador;
	}

	public void setNombreColaborador(String nombreColaborador) {
		this.nombreColaborador = nombreColaborador;
	}

	public Integer getFolioFc2() {
		return this.folioFc2;
	}

	public void setFolioFc2(Integer folioFc2) {
		this.folioFc2 = folioFc2;
	}

	public Integer getPremio() {
		return this.premio;
	}

	public void setPremio(Integer premio) {
		this.premio = premio;
	}

	public Integer getAsignado() {
		return this.asignado;
	}

	public void setAsignado(Integer asignado) {
		this.asignado = asignado;
	}

	public String getNumExtGanador() {
		return this.numExtGanador;
	}

	public void setNumExtGanador(String numExtGanador) {
		this.numExtGanador = numExtGanador;
	}

	public String getNumIntGanador() {
		return this.numIntGanador;
	}

	public void setNumIntGanador(String numIntGanador) {
		this.numIntGanador = numIntGanador;
	}

	public String getCpGanador() {
		return this.cpGanador;
	}

	public void setCpGanador(String cpGanador) {
		this.cpGanador = cpGanador;
	}

	public String getColoniaGanador() {
		return this.coloniaGanador;
	}

	public void setColoniaGanador(String coloniaGanador) {
		this.coloniaGanador = coloniaGanador;
	}

	public Integer getContacto() {
		return this.contacto;
	}

	public void setContacto(Integer contacto) {
		this.contacto = contacto;
	}

	public int getAnio() {
		return this.anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SorteoMagnoHistorialId))
			return false;
		SorteoMagnoHistorialId castOther = (SorteoMagnoHistorialId) other;

		return (this.getId() == castOther.getId())
				&& (this.getIdBoleto() == castOther.getIdBoleto())
				&& (this.getIdCartera() == castOther.getIdCartera())
				&& ((this.getUbicacion() == castOther.getUbicacion()) || (this
						.getUbicacion() != null
						&& castOther.getUbicacion() != null && this
						.getUbicacion().equals(castOther.getUbicacion())))
				&& ((this.getIdColaborador() == castOther.getIdColaborador()) || (this
						.getIdColaborador() != null
						&& castOther.getIdColaborador() != null && this
						.getIdColaborador()
						.equals(castOther.getIdColaborador())))
				&& ((this.getIdEjecutivo() == castOther.getIdEjecutivo()) || (this
						.getIdEjecutivo() != null
						&& castOther.getIdEjecutivo() != null && this
						.getIdEjecutivo().equals(castOther.getIdEjecutivo())))
				&& ((this.getIdFc2() == castOther.getIdFc2()) || (this
						.getIdFc2() != null && castOther.getIdFc2() != null && this
						.getIdFc2().equals(castOther.getIdFc2())))
				&& ((this.getIdPremio() == castOther.getIdPremio()) || (this
						.getIdPremio() != null
						&& castOther.getIdPremio() != null && this
						.getIdPremio().equals(castOther.getIdPremio())))
				&& ((this.getIdPremioAsignado() == castOther
						.getIdPremioAsignado()) || (this.getIdPremioAsignado() != null
						&& castOther.getIdPremioAsignado() != null && this
						.getIdPremioAsignado().equals(
								castOther.getIdPremioAsignado())))
				&& ((this.getNombreGanador() == castOther.getNombreGanador()) || (this
						.getNombreGanador() != null
						&& castOther.getNombreGanador() != null && this
						.getNombreGanador()
						.equals(castOther.getNombreGanador())))
				&& ((this.getCalleGanador() == castOther.getCalleGanador()) || (this
						.getCalleGanador() != null
						&& castOther.getCalleGanador() != null && this
						.getCalleGanador().equals(castOther.getCalleGanador())))
				&& ((this.getCiudadGanador() == castOther.getCiudadGanador()) || (this
						.getCiudadGanador() != null
						&& castOther.getCiudadGanador() != null && this
						.getCiudadGanador()
						.equals(castOther.getCiudadGanador())))
				&& ((this.getTelefonoGanador() == castOther
						.getTelefonoGanador()) || (this.getTelefonoGanador() != null
						&& castOther.getTelefonoGanador() != null && this
						.getTelefonoGanador().equals(
								castOther.getTelefonoGanador())))
				&& ((this.getEstatus() == castOther.getEstatus()) || (this
						.getEstatus() != null && castOther.getEstatus() != null && this
						.getEstatus().equals(castOther.getEstatus())))
				&& ((this.getBoleto() == castOther.getBoleto()) || (this
						.getBoleto() != null && castOther.getBoleto() != null && this
						.getBoleto().equals(castOther.getBoleto())))
				&& ((this.getCartera() == castOther.getCartera()) || (this
						.getCartera() != null && castOther.getCartera() != null && this
						.getCartera().equals(castOther.getCartera())))
				&& ((this.getNombreColaborador() == castOther
						.getNombreColaborador()) || (this
						.getNombreColaborador() != null
						&& castOther.getNombreColaborador() != null && this
						.getNombreColaborador().equals(
								castOther.getNombreColaborador())))
				&& ((this.getFolioFc2() == castOther.getFolioFc2()) || (this
						.getFolioFc2() != null
						&& castOther.getFolioFc2() != null && this
						.getFolioFc2().equals(castOther.getFolioFc2())))
				&& ((this.getPremio() == castOther.getPremio()) || (this
						.getPremio() != null && castOther.getPremio() != null && this
						.getPremio().equals(castOther.getPremio())))
				&& ((this.getAsignado() == castOther.getAsignado()) || (this
						.getAsignado() != null
						&& castOther.getAsignado() != null && this
						.getAsignado().equals(castOther.getAsignado())))
				&& ((this.getNumExtGanador() == castOther.getNumExtGanador()) || (this
						.getNumExtGanador() != null
						&& castOther.getNumExtGanador() != null && this
						.getNumExtGanador()
						.equals(castOther.getNumExtGanador())))
				&& ((this.getNumIntGanador() == castOther.getNumIntGanador()) || (this
						.getNumIntGanador() != null
						&& castOther.getNumIntGanador() != null && this
						.getNumIntGanador()
						.equals(castOther.getNumIntGanador())))
				&& ((this.getCpGanador() == castOther.getCpGanador()) || (this
						.getCpGanador() != null
						&& castOther.getCpGanador() != null && this
						.getCpGanador().equals(castOther.getCpGanador())))
				&& ((this.getColoniaGanador() == castOther.getColoniaGanador()) || (this
						.getColoniaGanador() != null
						&& castOther.getColoniaGanador() != null && this
						.getColoniaGanador().equals(
								castOther.getColoniaGanador())))
				&& ((this.getContacto() == castOther.getContacto()) || (this
						.getContacto() != null
						&& castOther.getContacto() != null && this
						.getContacto().equals(castOther.getContacto())))
				&& (this.getAnio() == castOther.getAnio());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + this.getIdBoleto();
		result = 37 * result + this.getIdCartera();
		result = 37 * result
				+ (getUbicacion() == null ? 0 : this.getUbicacion().hashCode());
		result = 37
				* result
				+ (getIdColaborador() == null ? 0 : this.getIdColaborador()
						.hashCode());
		result = 37
				* result
				+ (getIdEjecutivo() == null ? 0 : this.getIdEjecutivo()
						.hashCode());
		result = 37 * result
				+ (getIdFc2() == null ? 0 : this.getIdFc2().hashCode());
		result = 37 * result
				+ (getIdPremio() == null ? 0 : this.getIdPremio().hashCode());
		result = 37
				* result
				+ (getIdPremioAsignado() == null ? 0 : this
						.getIdPremioAsignado().hashCode());
		result = 37
				* result
				+ (getNombreGanador() == null ? 0 : this.getNombreGanador()
						.hashCode());
		result = 37
				* result
				+ (getCalleGanador() == null ? 0 : this.getCalleGanador()
						.hashCode());
		result = 37
				* result
				+ (getCiudadGanador() == null ? 0 : this.getCiudadGanador()
						.hashCode());
		result = 37
				* result
				+ (getTelefonoGanador() == null ? 0 : this.getTelefonoGanador()
						.hashCode());
		result = 37 * result
				+ (getEstatus() == null ? 0 : this.getEstatus().hashCode());
		result = 37 * result
				+ (getBoleto() == null ? 0 : this.getBoleto().hashCode());
		result = 37 * result
				+ (getCartera() == null ? 0 : this.getCartera().hashCode());
		result = 37
				* result
				+ (getNombreColaborador() == null ? 0 : this
						.getNombreColaborador().hashCode());
		result = 37 * result
				+ (getFolioFc2() == null ? 0 : this.getFolioFc2().hashCode());
		result = 37 * result
				+ (getPremio() == null ? 0 : this.getPremio().hashCode());
		result = 37 * result
				+ (getAsignado() == null ? 0 : this.getAsignado().hashCode());
		result = 37
				* result
				+ (getNumExtGanador() == null ? 0 : this.getNumExtGanador()
						.hashCode());
		result = 37
				* result
				+ (getNumIntGanador() == null ? 0 : this.getNumIntGanador()
						.hashCode());
		result = 37 * result
				+ (getCpGanador() == null ? 0 : this.getCpGanador().hashCode());
		result = 37
				* result
				+ (getColoniaGanador() == null ? 0 : this.getColoniaGanador()
						.hashCode());
		result = 37 * result
				+ (getContacto() == null ? 0 : this.getContacto().hashCode());
		result = 37 * result + this.getAnio();
		return result;
	}

}
