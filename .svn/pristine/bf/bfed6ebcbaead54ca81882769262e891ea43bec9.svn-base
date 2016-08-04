/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Interfaces.InterfaceCatalogoMenu;
import Pojos.CatalogoMenu;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Víctor
 */
public class DaoCatalogoMenu implements InterfaceCatalogoMenu {

    Object[] resultado;

    @Override
    public List<CatalogoMenu> getCatalogoMenu(Session session, int idUsuario) throws Exception {
        String hql = "select cm from CatalogoMenu cm, Permisos p where cm.id = p.idCatalogoMenu and p.permiso = 1 and p.idUsuario =:idUsuario order by prioridad";
        Query query = session.createQuery(hql);
        query.setParameter("idUsuario", idUsuario);
        return (List<CatalogoMenu>) query.list();
    }

    @Override
    public List<CatalogoMenu> getCatalogoMenuSeccion(Session session, int idCatalogoSecciones) throws Exception {
        String hql = "from CatalogoMenu where idCatalogoSecciones =:idCatalogoSecciones  order by prioridad";
        Query query = session.createQuery(hql);
        query.setParameter("idCatalogoSecciones", idCatalogoSecciones);
        return (List<CatalogoMenu>) query.list();
    }    
}
