package Pojos;

// Generated Feb 15, 2016 4:42:55 PM by Hibernate Tools 4.0.0

/**
 * ColaboradorPromocional generated by hbm2java
 */
public class ColaboradorPromocional implements java.io.Serializable {

	private Integer id;
	private int idColaborador;
	private int tipoPromocional;

	public ColaboradorPromocional() {
	}

	public ColaboradorPromocional(int idColaborador, int tipoPromocional) {
		this.idColaborador = idColaborador;
		this.tipoPromocional = tipoPromocional;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getIdColaborador() {
		return this.idColaborador;
	}

	public void setIdColaborador(int idColaborador) {
		this.idColaborador = idColaborador;
	}

	public int getTipoPromocional() {
		return this.tipoPromocional;
	}

	public void setTipoPromocional(int tipoPromocional) {
		this.tipoPromocional = tipoPromocional;
	}

}
