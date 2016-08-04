package Interfaces;

import java.util.List;

import org.hibernate.Session;

import Pojos.ColaboradoresHistorial;


public interface InterfaceAdmonColab {
	
	
	  public List<ColaboradoresHistorial> getcolaboradores(Session session)throws Exception;
	

}
