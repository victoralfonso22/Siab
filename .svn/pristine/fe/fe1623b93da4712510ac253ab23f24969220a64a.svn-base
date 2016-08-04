/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Interfaces.InterfaceUsuarios;
import Pojos.Usuarios;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author Víctor
 */
public class DaoUsuarios implements InterfaceUsuarios {

    @Override
    public boolean registar(Session session, Usuarios usuarios) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuarios> ver(Session session) throws Exception {
        String hql = "from Usuarios";
        Query query = session.createQuery(hql);       
        return (List<Usuarios>) query.list();
    }

    @Override
    public Usuarios obtenerPorUsername(Session session, String username, String pass) throws Exception {
        String hql = "from Usuarios where usuario =:username and pass=MD5(:pass)";
        Query query = session.createQuery(hql);
        query.setParameter("username", username);
        query.setParameter("pass", pass);
        
        Usuarios usuarios = (Usuarios) query.uniqueResult();
        
        return usuarios;
    }
    
    @Override
    public Usuarios obtenerPorID(Session session, int id) throws Exception {
        String hql = "from Usuarios where id =:id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);        
        
        Usuarios usuarios = (Usuarios) query.uniqueResult();
        
        return usuarios;
    }

    @Override
    public Usuarios detalles(Session session, String usuario) throws Exception {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 @Override
    public void actualizar(Session session, String pass,String usuario) throws Exception {
        String hql = "update Usuarios set  pass=md5(:pass) where usuario =:usuario";
        Query query = session.createQuery(hql);
        query.setParameter("pass", pass);
        query.setParameter("usuario", usuario);
        query.executeUpdate();
        
        
        
    }
    
}
