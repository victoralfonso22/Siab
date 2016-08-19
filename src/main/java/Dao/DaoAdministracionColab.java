package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import Pojos.CodigoPostal;
import Pojos.ColaboradoresHistorial;
import Pojos.Localidades;
import Pojos.Colaboradores;
import Pojos.Referencias;
import Pojos.Promotores;

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
	  
	  public List<Localidades>getcolonias(Session session)throws Exception{
		  String hql = " select c from Localidades  c ";
	      Query query = session.createQuery(hql); 
		  return(List<Localidades>)query.list();
		  
		  
	  }
	  
	  
	  public List<Localidades>getcolonias(Session session, int municipio)throws Exception{
		  String hql = "from  Localidades where id_municipio=:municipio";
		  Query query = session.createQuery(hql);
		  query.setParameter("municipio", municipio);
		  return(List<Localidades>)query.list();
		  
	  }
	  
	  
	  public List<Promotores>getPromotores(Session session)throws Exception{
		String hql = " select c from Promotores  c ";
	    Query query = session.createQuery(hql); 
		return(List<Promotores>)query.list();
		  
	  }
	  
	  
	  public List<Referencias>getReferencias(Session session)throws Exception{
		String hql = "from Referencias where estatus=0";
		Query query = session.createQuery(hql); 
		 query.setMaxResults(1000);
		return(List<Referencias>)query.list();
		    
	  }
	  
	  
	   public void AltaColaborador(Session session, Colaboradores colaborador )throws Exception{
           
           session.save(colaborador);
       }
       
	  
	  
	
	

}
