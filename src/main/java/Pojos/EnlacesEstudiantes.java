package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * EnlacesEstudiantes generated by hbm2java
 */
public class EnlacesEstudiantes implements java.io.Serializable {

	private Integer id;
	private Integer idCartera;
	private String idBoleto;
	private String matricula;
	private String nombre;
	private String correo;
	private String celular;
	private Integer idSector;
	private int idFc1b;

	public EnlacesEstudiantes() {
	}

	public EnlacesEstudiantes(String idBoleto, int idFc1b) {
		this.idBoleto = idBoleto;
		this.idFc1b = idFc1b;
	}

	public EnlacesEstudiantes(Integer idCartera, String idBoleto,
			String matricula, String nombre, String correo, String celular,
			Integer idSector, int idFc1b) {
		this.idCartera = idCartera;
		this.idBoleto = idBoleto;
		this.matricula = matricula;
		this.nombre = nombre;
		this.correo = correo;
		this.celular = celular;
		this.idSector = idSector;
		this.idFc1b = idFc1b;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdCartera() {
		return this.idCartera;
	}

	public void setIdCartera(Integer idCartera) {
		this.idCartera = idCartera;
	}

	public String getIdBoleto() {
		return this.idBoleto;
	}

	public void setIdBoleto(String idBoleto) {
		this.idBoleto = idBoleto;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Integer getIdSector() {
		return this.idSector;
	}

	public void setIdSector(Integer idSector) {
		this.idSector = idSector;
	}

	public int getIdFc1b() {
		return this.idFc1b;
	}

	public void setIdFc1b(int idFc1b) {
		this.idFc1b = idFc1b;
	}

}