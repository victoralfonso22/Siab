package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * BoletosRecomendado generated by hbm2java
 */
public class BoletosRecomendado implements java.io.Serializable {

	private Integer id;
	private int idRecomendado;
	private int idBoletoRecomendado;

	public BoletosRecomendado() {
	}

	public BoletosRecomendado(int idRecomendado, int idBoletoRecomendado) {
		this.idRecomendado = idRecomendado;
		this.idBoletoRecomendado = idBoletoRecomendado;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getIdRecomendado() {
		return this.idRecomendado;
	}

	public void setIdRecomendado(int idRecomendado) {
		this.idRecomendado = idRecomendado;
	}

	public int getIdBoletoRecomendado() {
		return this.idBoletoRecomendado;
	}

	public void setIdBoletoRecomendado(int idBoletoRecomendado) {
		this.idBoletoRecomendado = idBoletoRecomendado;
	}

}