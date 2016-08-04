package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * TiposPagos generated by hbm2java
 */
public class TiposPagos implements java.io.Serializable {

	private Integer id;
	private String tipo;
	private char movimiento;
	private int estatus;

	public TiposPagos() {
	}

	public TiposPagos(char movimiento, int estatus) {
		this.movimiento = movimiento;
		this.estatus = estatus;
	}

	public TiposPagos(String tipo, char movimiento, int estatus) {
		this.tipo = tipo;
		this.movimiento = movimiento;
		this.estatus = estatus;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public char getMovimiento() {
		return this.movimiento;
	}

	public void setMovimiento(char movimiento) {
		this.movimiento = movimiento;
	}

	public int getEstatus() {
		return this.estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

}
