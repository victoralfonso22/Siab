package Interfaces;

import java.util.List;

import org.hibernate.Session;

import Pojos.CodigoPostal;
import Pojos.ColaboradoresHistorial;


public interface InterfaceAdmonColab {
	
	
	  public List<ColaboradoresHistorial> getcolaboradores(Session session)throws Exception;
	  
	  public List<CodigoPostal>getcodigos(Session session)throws Exception;
	  public List<CodigoPostal>getCodigos(Session session, int colonia) throws Exception;
	  
	  
	  
	

}
