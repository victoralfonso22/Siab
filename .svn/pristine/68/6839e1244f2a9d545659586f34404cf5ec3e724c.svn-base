/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
 
import Interfaces.InterfaceFormatos;
import Pojos.Formatos;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class DaoFormatos implements InterfaceFormatos {            

    @Override
    public List<Formatos> ver(Session session) throws Exception {
        String hql = "from Formatos";
        Query query = session.createQuery(hql);       
        return (List<Formatos>) query.list();
    }
    
    public Formatos existeFormato(Session session, int folio ,String tipo) throws Exception{
             String hql = "select  f from Formatos f where folio =:folio and tipo=:tipo";
             Query query = session.createQuery(hql);
             query.setParameter("folio", folio);
             query.setParameter("tipo", tipo);
             Formatos formato=(Formatos)query.uniqueResult();
        
        return formato;
    }
    
    
    public void agregaFolioUnico(Session session, int folio, String tipo, char estatus)throws Exception{
        
       Formatos formato=new Formatos(folio, tipo, estatus);
         session.save(formato);
}
    public void cancelaFolioUnico(Session session, int folio , String estatus)throws Exception{
          String hql="update Formatos set estatus=:estatus where folio =:folio";
            Query query = session.createQuery(hql);
            query.setParameter("estatus", estatus);
            query.setParameter("folio", folio);
            query.executeUpdate();
    
    }
    
    public List<Formatos>  verificaRango(Session session, int folioI, int folioF, String tipo)throws Exception{
        
         String hql = "select f from Formatos f where folio between :folioI and :folioF and tipo=:tipo";
            Query query = session.createQuery(hql);
            query.setParameter("folioI", folioI);
            query.setParameter("folioF", folioF);
            query.setParameter("tipo", tipo);
        List<Formatos> lista= (List<Formatos>) query.list();
        
      // Formatos formatosConsulta = (Formatos) query.uniqueResult();
       /* if (lista.equals("")) {
            System.out.print("aki va la lista"+lista);
            return true;
        } else {
            return false;
        }
         
    }*/
    
    return lista;
    }
}
