/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Interfaces.InterfaceMun;
import Pojos.TiposIncidencias;
import Pojos.ViewLocalizacion;






import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author Soporte 07
 */
public class DaoVistaMun implements InterfaceMun{
    
     /*
    
    public List<ViewLocalizacion> getVista (Session session) throws Exception{
        String hql = "select f from ViewLocalizacion f where idEstado =30 group by f.municipio";
        Query query = session.createQuery(hql);
      
        
      
      // query.setParameter("nombre", hql);
       return (List<ViewLocalizacion>) query.list();
        
    }
     */
   
       public List<ViewLocalizacion> getVista (Session session, Integer idEstado) throws Exception{
        String hql = "select f from ViewLocalizacion f where idEstado =:idEstado group by f.municipio";
        Query query = session.createQuery(hql);
       
     if (idEstado == 0){
      idEstado = 30;
    }
        
        query.setParameter("idEstado", idEstado);
      // query.setParameter("nombre", hql);
       return (List<ViewLocalizacion>) query.list();
        
    }
       
       public List<ViewLocalizacion>vistaCompleta(Session sesion)throws  Exception{
    	   String hql = " from ViewLocalizacion  group by municipio order by estado ";
           Query query = sesion.createQuery(hql);
    	  return (List<ViewLocalizacion>) query.list();
    	   
       }
      
       /*
       public List<TiposIncidencias>generaLista(Session session)throws Exception{
           String hql = " from TiposIncidencias  order by tipo";
            Query query = session.createQuery(hql);
         return (List<TiposIncidencias>) query.list();  
      }*/
       
       
       
   
}
   