package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * FormasPago generated by hbm2java
 */
public class FormasPago implements java.io.Serializable {

	private Integer id;
	private String forma;
	private int estatus;

	public FormasPago() {
	}

	public FormasPago(String forma, int estatus) {
		this.forma = forma;
		this.estatus = estatus;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getForma() {
		return this.forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public int getEstatus() {
		return this.estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

}