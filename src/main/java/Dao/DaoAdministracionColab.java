package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import Pojos.ColaboradoresHistorial;
import Pojos.Formatos;

public class DaoAdministracionColab {
	
	
	  public List<ColaboradoresHistorial> getcolaboradores (Session session)throws Exception{
		  String hql = " select c from ColaboradoresHistorial c  ";
	        Query query = session.createQuery(hql);
	     query.setMaxResults(1000);
	        return (List<ColaboradoresHistorial>) query.list();
		  
	  }
	
	

}
