package Interfaces;

import java.util.List;

import org.hibernate.Session;




import Pojos.CarteraBoleto;

public interface InterfaceCarterasBoletos {
	
	public void agregar(Session session , String cartera, String boleto)throws Exception;
	public List<CarteraBoleto> listarBoletos(Session session , String cartera)throws Exception;
	public boolean existe(Session session , String cartera, String boleto)throws Exception;
	public boolean existeCartera(Session session, String cartera)throws Exception;
	public void borrarCartera(Session session, String cartera)throws Exception;
	public int contarBoletos(Session session, String cartera)throws Exception;
}
