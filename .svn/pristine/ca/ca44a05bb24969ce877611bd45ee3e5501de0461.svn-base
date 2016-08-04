/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Interfaces.InterfacePermisos;
import Pojos.Permisos;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Víctor
 */
public class DaoPermisos implements InterfacePermisos {

    @Override
    public List<Permisos> getPermisosUsuario(Session session, int idUsuario) throws Exception {
        String hql = "from Permisos where idUsuario =:idUsuario and permiso=1";
        Query query = session.createQuery(hql);
        query.setParameter("idUsuario", idUsuario);        
        return (List<Permisos>) query.list();
    }

    @Override
    public void actualizarPermisosUsuario(Session session, Permisos permisos) throws Exception {
        session.update(permisos);
    }

    @Override
    public Permisos getPermisosActualizacion(Session session, int idUsuario,int idCatalogoMenu) throws Exception {
        String hql = "from Permisos where idUsuario =:idUsuario and idCatalogoMenu=:idCatalogoMenu ";
        Query query = session.createQuery(hql);
        query.setParameter("idUsuario", idUsuario);        
        query.setParameter("idCatalogoMenu", idCatalogoMenu);        
        return (Permisos)query.uniqueResult();
    }

    @Override
    public void guardarPermisosActualizacion(Session session, Permisos permisos) throws Exception {
        session.save(permisos);
        
    }
    
}
