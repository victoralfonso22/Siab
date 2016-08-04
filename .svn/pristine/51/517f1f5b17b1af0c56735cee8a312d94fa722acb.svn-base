/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Interfaces.InterfaceTpagos;
import Pojos.TiposPagos;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Soporte 07
 */
public class DaoTpagos implements InterfaceTpagos {

    @Override
    public List<TiposPagos> generaLista(Session session) throws Exception {
         String hql = " from TiposPagos order by tipo";
        Query query = session.createQuery(hql);
    return (List<TiposPagos>) query.list();
  
    }
    
    public void eliminar(Session session, int id )throws Exception{
         String hql = "delete  from TiposPagos where id =:id";
            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            query.executeUpdate();
  
        
    }
    
    
      public void agregar(Session session, String  tipo, char movimiento, char estatus)throws Exception{
      
         TiposPagos tipoPago=new TiposPagos(tipo.toUpperCase(),movimiento,estatus);
        
     session.save(tipoPago);
      
      
      }
      
      
      public void editar(Session session,String tipo,String movimiento,int id )throws Exception{
           String hql="update TiposPagos set tipo=:tipo ,movimiento =:movimiento  where id =:id ";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        query.setParameter("tipo", tipo);
        query.setParameter("movimiento", movimiento);
        
        query.executeUpdate();
          
          
          
          
      }
      
    
}
