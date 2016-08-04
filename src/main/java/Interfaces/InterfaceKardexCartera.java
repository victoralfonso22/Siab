package Interfaces;

import Pojos.KardexCartera;
import org.hibernate.Session;

public interface InterfaceKardexCartera {
	
	public void guardarCarteraBoveda(Session sesion, KardexCartera kardex )throws Exception;

}
