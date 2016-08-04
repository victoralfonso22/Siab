/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Interfaces.InterfaceCatalogoSecciones;
import Pojos.CatalogoSecciones;
import org.hibernate.Query;
import org.hibernate.Session;
import java.util.List;

/**
 *
 * @author Víctor
 */
public class DaoCatalogoSecciones implements InterfaceCatalogoSecciones {

    @Override
    public List<CatalogoSecciones> getCatalogoSeccionesUsuario(Session session, int idUsuario) throws Exception {
        String hql = "select cs from CatalogoMenu cm, Permisos p, CatalogoSecciones cs where cm.id = p.idCatalogoMenu and p.permiso = 1 and p.idUsuario =:idUsuario and cm.idCatalogoSecciones = cs.id group by cs.id order by cs.prioridad";
        Query query = session.createQuery(hql);
        query.setParameter("idUsuario", idUsuario);
        return (List<CatalogoSecciones>) query.list();
    }
    
    @Override
    public List<CatalogoSecciones> getCatalogoSecciones(Session session) throws Exception {
        String hql = "select cs from CatalogoMenu cm, Permisos p, CatalogoSecciones cs where cm.id = p.idCatalogoMenu and cm.idCatalogoSecciones = cs.id group by cs.id order by cs.prioridad";
        Query query = session.createQuery(hql);
        return (List<CatalogoSecciones>) query.list();
    }
    
    @Override
    public List<CatalogoSecciones> getCatalogoSeccionesId(Session session,int id) throws Exception {
        String hql = "from CatalogoSecciones where id =:id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        return (List<CatalogoSecciones>) query.list();
    }

}
