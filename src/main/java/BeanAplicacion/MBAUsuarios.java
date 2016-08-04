/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanAplicacion;

import Dao.DaoUsuarios;
import HibernateUtil.HibernateUtil;
import Pojos.Usuarios;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Víctor
 */
@ManagedBean(name = "mBAUsuarios", eager = true)
@ApplicationScoped
public class MBAUsuarios {

    /**
     * Creates a new instance of MBAUsuarios
     */
    private Transaction transaction;    
    private Session session;
    private List<Usuarios> listaUsuarios;
    
    List<Usuarios> usuariosIniciales;

    @PostConstruct
    public void init() {

       
        List<Usuarios> allUsuarios = getUsuarios();
        usuariosIniciales = new ArrayList<Usuarios>();
        
        Iterator<Usuarios> it = allUsuarios.iterator();
        
        while(it.hasNext()){
        usuariosIniciales.add(it.next());
        }

       /* for (int i = 0; i < allUsuarios.size(); i++) {
            Usuarios us = allUsuarios.get(i);
            usuariosIniciales.add(us);

        }*/

    }
    
     public List<Usuarios> getUsuarios() {
        this.session = null;
        this.transaction = null;

        try {
            DaoUsuarios daoUsuarios = new DaoUsuarios();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            listaUsuarios = daoUsuarios.ver(this.session);

            this.transaction.commit();

            return listaUsuarios;

        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas" + e.getMessage()));
            return null;
        } finally {
            if (this.session != null) {
                session.close();
            }
        }

    }

    
    public List<Usuarios> getUsuariosIniciales() {
        return usuariosIniciales;
    }

    public void setUsuariosIniciales(List<Usuarios> usuariosIniciales) {
        this.usuariosIniciales = usuariosIniciales;
    }
    
    
}
