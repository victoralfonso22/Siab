package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * Fc6Boletos generated by hbm2java
 */
public class Fc6Boletos implements java.io.Serializable {

	private Integer id;
	private int idFc6;
	private int idBoleto;

	public Fc6Boletos() {
	}

	public Fc6Boletos(int idFc6, int idBoleto) {
		this.idFc6 = idFc6;
		this.idBoleto = idBoleto;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getIdFc6() {
		return this.idFc6;
	}

	public void setIdFc6(int idFc6) {
		this.idFc6 = idFc6;
	}

	public int getIdBoleto() {
		return this.idBoleto;
	}

	public void setIdBoleto(int idBoleto) {
		this.idBoleto = idBoleto;
	}

}