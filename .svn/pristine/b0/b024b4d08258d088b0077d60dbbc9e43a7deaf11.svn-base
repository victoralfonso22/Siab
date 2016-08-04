/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Pojos.TiposIdentificacion;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Soporte 07
 */
public class DaoDocumentacion {
    
    
    public List<TiposIdentificacion>listaDatos(Session session)throws Exception{
         String hql = " from TiposIdentificacion order by tipo";
    Query query = session.createQuery(hql);
    return (List<TiposIdentificacion>) query.list();
        
    }
    
    
    public  void eliminarDato(Session session, int id)throws Exception{
        String hql = "delete  from TiposIdentificacion where id =:id";
            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            query.executeUpdate();
    }
    
    
    public void editarDato(Session session, int id, String tipo)throws Exception{
        String hql="update TiposIdentificacion set tipo=:tipo  where id =:id ";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        query.setParameter("tipo", tipo);
        query.executeUpdate();
    }
    
    public void agregarDato(Session session , String tipo)throws Exception{
        
        TiposIdentificacion documento=new TiposIdentificacion(tipo.toUpperCase());
        session.save(documento);
  }
    
    
}
