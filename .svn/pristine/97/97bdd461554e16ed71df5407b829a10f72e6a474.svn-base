/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Interfaces.InterfacePermisosCatalogoMenu;
import Pojos.PermisosCatalogoMenu;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Víctor
 */
public class DaoPermisosCatalogoMenu implements InterfacePermisosCatalogoMenu{

    @Override
    public PermisosCatalogoMenu getCatalogoMenuSeccionPermisos(Session session, int idCatalogoMenuPer, int idUsuario) throws Exception {
        String hql = "from PermisosCatalogoMenu where id =:idCatalogoMenuPer and idUsuario=:idUsuario and permiso = 1  group by id order by prioridad";
        Query query = session.createQuery(hql);
        query.setParameter("idCatalogoMenuPer", idCatalogoMenuPer);
        query.setParameter("idUsuario", idUsuario);
        System.out.println("idCatalogoMenuPer "+idCatalogoMenuPer);
        System.out.println("idUsuario "+idUsuario);
        return (PermisosCatalogoMenu)query.uniqueResult();
    }    
    
    @Override
    public List<PermisosCatalogoMenu> getCatalogoMenuSeccion(Session session, int idCatalogoSecciones) throws Exception {
        String hql = "from PermisosCatalogoMenu where idCatalogoSecciones =:idCatalogoSecciones group by id order by prioridad";
        Query query = session.createQuery(hql);
        query.setParameter("idCatalogoSecciones", idCatalogoSecciones);        
        return (List<PermisosCatalogoMenu>)query.list();
    } 
    
    @Override
    public List<PermisosCatalogoMenu> getPermisosCatalogoMenu(Session session, int idUsuario) throws Exception {
        String hql = "from PermisosCatalogoMenu where idUsuario=:idUsuario group by modulo";
        Query query = session.createQuery(hql);     
        query.setParameter("idUsuario", idUsuario);
        return (List<PermisosCatalogoMenu>)query.list();
    }
    
    @Override
    public List<PermisosCatalogoMenu> getCatalogoMenuSeccionUsuario(Session session, int idCatalogoSecciones, int idUsuario) throws Exception {
        String hql = "from PermisosCatalogoMenu where idCatalogoSecciones =:idCatalogoSecciones and idUsuario=:idUsuario and permiso = 1 group by id order by prioridad";
        Query query = session.createQuery(hql);
        query.setParameter("idCatalogoSecciones", idCatalogoSecciones);                
        query.setParameter("idUsuario", idUsuario);
        return (List<PermisosCatalogoMenu>)query.list();
    } 
}
