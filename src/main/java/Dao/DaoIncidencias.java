/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Pojos.TiposIncidencias;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Soporte 07
 */
public class DaoIncidencias {
    
  public List<TiposIncidencias>generaLista(Session session)throws Exception{
       String hql = " from TiposIncidencias  order by tipo";
        Query query = session.createQuery(hql);
     return (List<TiposIncidencias>) query.list();  
  }
  
 public void editar (Session sesion,int id, String tipo)throws Exception{
      String hql="update TiposIncidencias set tipo=:tipo  where id =:id ";
        Query query = sesion.createQuery(hql);
        query.setParameter("id", id);
        query.setParameter("tipo", tipo);
        //query.setParameter("region", region);
        //query.setParameter("estado", estado);
        query.executeUpdate();
       
        
    }
  public void eliminarIncidencia(Session session, int id)throws Exception{
      
            String hql = "delete  from TiposIncidencias where id =:id";
            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            query.executeUpdate();
  
  }
  
    public void guardarIncidencias(Session session,String tipo){
       TiposIncidencias incidencia= new TiposIncidencias(tipo.toUpperCase());
       session.save(incidencia);
          
      }
 
 
 
 
    
}
