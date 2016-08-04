package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * SorteoColaboradoresHistorialId generated by hbm2java
 */
public class SorteoColaboradoresHistorialId implements java.io.Serializable {

	private int id;
	private int idBoleto;
	private int estatus;
	private int idPremio;
	private String boleto;
	private String colaborador;
	private Integer premio;
	private String tipoSector;
	private String sector;
	private Integer idRegion;
	private Integer idSorteo;
	private int contacto;
	private int anio;

	public SorteoColaboradoresHistorialId() {
	}

	public SorteoColaboradoresHistorialId(int id, int idBoleto, int estatus,
			int idPremio, int contacto, int anio) {
		this.id = id;
		this.idBoleto = idBoleto;
		this.estatus = estatus;
		this.idPremio = idPremio;
		this.contacto = contacto;
		this.anio = anio;
	}

	public SorteoColaboradoresHistorialId(int id, int idBoleto, int estatus,
			int idPremio, String boleto, String colaborador, Integer premio,
			String tipoSector, String sector, Integer idRegion,
			Integer idSorteo, int contacto, int anio) {
		this.id = id;
		this.idBoleto = idBoleto;
		this.estatus = estatus;
		this.idPremio = idPremio;
		this.boleto = boleto;
		this.colaborador = colaborador;
		this.premio = premio;
		this.tipoSector = tipoSector;
		this.sector = sector;
		this.idRegion = idRegion;
		this.idSorteo = idSorteo;
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

	public int getEstatus() {
		return this.estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public int getIdPremio() {
		return this.idPremio;
	}

	public void setIdPremio(int idPremio) {
		this.idPremio = idPremio;
	}

	public String getBoleto() {
		return this.boleto;
	}

	public void setBoleto(String boleto) {
		this.boleto = boleto;
	}

	public String getColaborador() {
		return this.colaborador;
	}

	public void setColaborador(String colaborador) {
		this.colaborador = colaborador;
	}

	public Integer getPremio() {
		return this.premio;
	}

	public void setPremio(Integer premio) {
		this.premio = premio;
	}

	public String getTipoSector() {
		return this.tipoSector;
	}

	public void setTipoSector(String tipoSector) {
		this.tipoSector = tipoSector;
	}

	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public Integer getIdRegion() {
		return this.idRegion;
	}

	public void setIdRegion(Integer idRegion) {
		this.idRegion = idRegion;
	}

	public Integer getIdSorteo() {
		return this.idSorteo;
	}

	public void setIdSorteo(Integer idSorteo) {
		this.idSorteo = idSorteo;
	}

	public int getContacto() {
		return this.contacto;
	}

	public void setContacto(int contacto) {
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
		if (!(other instanceof SorteoColaboradoresHistorialId))
			return false;
		SorteoColaboradoresHistorialId castOther = (SorteoColaboradoresHistorialId) other;

		return (this.getId() == castOther.getId())
				&& (this.getIdBoleto() == castOther.getIdBoleto())
				&& (this.getEstatus() == castOther.getEstatus())
				&& (this.getIdPremio() == castOther.getIdPremio())
				&& ((this.getBoleto() == castOther.getBoleto()) || (this
						.getBoleto() != null && castOther.getBoleto() != null && this
						.getBoleto().equals(castOther.getBoleto())))
				&& ((this.getColaborador() == castOther.getColaborador()) || (this
						.getColaborador() != null
						&& castOther.getColaborador() != null && this
						.getColaborador().equals(castOther.getColaborador())))
				&& ((this.getPremio() == castOther.getPremio()) || (this
						.getPremio() != null && castOther.getPremio() != null && this
						.getPremio().equals(castOther.getPremio())))
				&& ((this.getTipoSector() == castOther.getTipoSector()) || (this
						.getTipoSector() != null
						&& castOther.getTipoSector() != null && this
						.getTipoSector().equals(castOther.getTipoSector())))
				&& ((this.getSector() == castOther.getSector()) || (this
						.getSector() != null && castOther.getSector() != null && this
						.getSector().equals(castOther.getSector())))
				&& ((this.getIdRegion() == castOther.getIdRegion()) || (this
						.getIdRegion() != null
						&& castOther.getIdRegion() != null && this
						.getIdRegion().equals(castOther.getIdRegion())))
				&& ((this.getIdSorteo() == castOther.getIdSorteo()) || (this
						.getIdSorteo() != null
						&& castOther.getIdSorteo() != null && this
						.getIdSorteo().equals(castOther.getIdSorteo())))
				&& (this.getContacto() == castOther.getContacto())
				&& (this.getAnio() == castOther.getAnio());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + this.getIdBoleto();
		result = 37 * result + this.getEstatus();
		result = 37 * result + this.getIdPremio();
		result = 37 * result
				+ (getBoleto() == null ? 0 : this.getBoleto().hashCode());
		result = 37
				* result
				+ (getColaborador() == null ? 0 : this.getColaborador()
						.hashCode());
		result = 37 * result
				+ (getPremio() == null ? 0 : this.getPremio().hashCode());
		result = 37
				* result
				+ (getTipoSector() == null ? 0 : this.getTipoSector()
						.hashCode());
		result = 37 * result
				+ (getSector() == null ? 0 : this.getSector().hashCode());
		result = 37 * result
				+ (getIdRegion() == null ? 0 : this.getIdRegion().hashCode());
		result = 37 * result
				+ (getIdSorteo() == null ? 0 : this.getIdSorteo().hashCode());
		result = 37 * result + this.getContacto();
		result = 37 * result + this.getAnio();
		return result;
	}

}
