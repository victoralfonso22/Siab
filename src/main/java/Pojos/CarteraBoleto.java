package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * CarteraBoleto generated by hbm2java
 */
public class CarteraBoleto implements java.io.Serializable {

	private Integer id;
	private String cartera;
	private String boleto;

	public CarteraBoleto() {
	}

	public CarteraBoleto(String cartera, String boleto) {
		this.cartera = cartera;
		this.boleto = boleto;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCartera() {
		return this.cartera;
	}

	public void setCartera(String cartera) {
		this.cartera = cartera;
	}

	public String getBoleto() {
		return this.boleto;
	}

	public void setBoleto(String boleto) {
		this.boleto = boleto;
	}

}
