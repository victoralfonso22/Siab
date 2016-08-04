package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import Pojos.CodigoPostal;
import Pojos.ColaboradoresHistorial;
import Pojos.Formatos;

public class DaoAdministracionColab {
	
	
	  public List<ColaboradoresHistorial> getcolaboradores (Session session)throws Exception{
		  String hql = " select c from ColaboradoresHistorial c  ";
	      Query query = session.createQuery(hql);
	     query.setMaxResults(1000);
	     return (List<ColaboradoresHistorial>) query.list();
		  
	  }
	  
	  
	  
	  public List<CodigoPostal>getcodigos(Session session)throws Exception{
		  String hql = " select c from CodigoPostal  c  ";
	      Query query = session.createQuery(hql); 
		  return(List<CodigoPostal>)query.list();
		  
		  
	  }
	  
	  
	  public List<CodigoPostal> getCodigos(Session session, int colonia) throws Exception{
		     String hql = "from  CodigoPostal where id_localidad=:colonia order by cp";
		     Query query = session.createQuery(hql);
		     query.setMaxResults(1000);
		      query.setParameter("colonia", colonia);
		      return (List<CodigoPostal>) query.list();
		        
		    }
	  
	
	

}
