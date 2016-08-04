package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * Enlaces2014Id generated by hbm2java
 */
public class Enlaces2014Id implements java.io.Serializable {

	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String sector;
	private String region;
	private Integer id;

	public Enlaces2014Id() {
	}

	public Enlaces2014Id(String nombres, String apellidoPaterno,
			String apellidoMaterno, String sector, String region, Integer id) {
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.sector = sector;
		this.region = region;
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

	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Enlaces2014Id))
			return false;
		Enlaces2014Id castOther = (Enlaces2014Id) other;

		return ((this.getNombres() == castOther.getNombres()) || (this
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
				&& ((this.getSector() == castOther.getSector()) || (this
						.getSector() != null && castOther.getSector() != null && this
						.getSector().equals(castOther.getSector())))
				&& ((this.getRegion() == castOther.getRegion()) || (this
						.getRegion() != null && castOther.getRegion() != null && this
						.getRegion().equals(castOther.getRegion())))
				&& ((this.getId() == castOther.getId()) || (this.getId() != null
						&& castOther.getId() != null && this.getId().equals(
						castOther.getId())));
	}

	public int hashCode() {
		int result = 17;

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
				+ (getSector() == null ? 0 : this.getSector().hashCode());
		result = 37 * result
				+ (getRegion() == null ? 0 : this.getRegion().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		return result;
	}

}
