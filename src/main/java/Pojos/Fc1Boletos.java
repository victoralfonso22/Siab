package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * Fc1Boletos generated by hbm2java
 */
public class Fc1Boletos implements java.io.Serializable {

	private Integer id;
	private int idFc1Carteras;
	private int idBoleto;

	public Fc1Boletos() {
	}

	public Fc1Boletos(int idFc1Carteras, int idBoleto) {
		this.idFc1Carteras = idFc1Carteras;
		this.idBoleto = idBoleto;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getIdFc1Carteras() {
		return this.idFc1Carteras;
	}

	public void setIdFc1Carteras(int idFc1Carteras) {
		this.idFc1Carteras = idFc1Carteras;
	}

	public int getIdBoleto() {
		return this.idBoleto;
	}

	public void setIdBoleto(int idBoleto) {
		this.idBoleto = idBoleto;
	}

}