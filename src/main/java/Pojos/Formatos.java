package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * Formatos generated by hbm2java
 */
public class Formatos implements java.io.Serializable {

	private Integer id;
	private int folio;
	private String tipo;
	private char estatus;

	public Formatos() {
	}

	public Formatos(int folio, String tipo, char estatus) {
		this.folio = folio;
		this.tipo = tipo;
		this.estatus = estatus;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getFolio() {
		return this.folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
