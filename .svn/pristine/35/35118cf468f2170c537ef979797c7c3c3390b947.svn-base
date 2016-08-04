/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Interfaces.InterfaceMunicipios;
import Pojos.Estados;
import Pojos.Municipios;



import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


/**
 *
 * @author Soporte carlos
 */
public class DaoMnunicipios implements InterfaceMunicipios{
    
   
   
    public List<Municipios> getMunicipios (Session session) throws Exception{
        String hql = "select m from Municipios m, Estados e where m.idEstado=e.id";
        Query query = session.createQuery(hql);
      // query.setParameter("nombre", hql);
        
   
        
        return (List<Municipios>) query.list();
        
    }
  
    public void registraMunicipio(Session session,String nombre,int idEstado,int idRegion) throws Exception {
      
    Municipios Municipio=new Municipios(nombre.toUpperCase(),idEstado,idRegion);
        
     session.save(Municipio);
     
        
    }
    
     public Municipios getValida(Session session, String nombre) throws Exception {
       String hql = "select  m from Municipios m where nombre =:nombre";
       Query query = session.createQuery(hql);
         query.setParameter("nombre", nombre);
      Municipios municipio = (Municipios) query.uniqueResult();
       return municipio;
   }
    
     public void eliminaMunicipio(Session session, Municipios municipio){
         
         session.delete(municipio);
     
     
     }
     
     
  public void borrarMunicipio(Session session, int id)throws Exception{
      
            String hql = "delete  from Municipios where id =:id";
            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            query.executeUpdate();
  
  }
  
  
    public List<Estados> getEstados(Session session) throws Exception{
        String hql = "select e from Estados e";
        Query query = session.createQuery(hql);
      // query.setParameter("nombre", hql);
        return (List<Estados>) query.list();
        
    }
    
    public void actualiza(Session sesion,int id, String nombre, int region, int estado)throws Exception{
      
        String hql="update Municipios set nombre=:nombre ,idRegion =:region,idEstado =:estado where id =:id ";
        Query query = sesion.createQuery(hql);
        query.setParameter("id", id);
        query.setParameter("nombre", nombre);
        query.setParameter("region", region);
        query.setParameter("estado", estado);
        query.executeUpdate();
       
        
    }
    
    
        
     
   
            
    
    
    
    
   
    
    
}
