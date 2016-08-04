/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanVista;

import Dao.DaoUsuarios;
import HibernateUtil.HibernateUtil;
import Pojos.Usuarios;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

/**
 *
 * @author Víctor
 */
@Named(value = "mBUsuarios")
@ViewScoped
public class MBUsuarios implements Serializable{

    private Transaction transaction;
    private Session session;

    private List<Usuarios> listaUsuarios;

    private Usuarios usuario;

    private ArrayList<Usuarios> usuariosIniciales;

    /**
     * Creates a new instance of NewJSFManagedBea
     */
    public MBUsuarios() {
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

    public List<Usuarios> completeUsuarios(String query) {
        List<Usuarios> allUsuarios = getUsuarios();
        List<Usuarios> filteredUsuarios = new ArrayList<Usuarios>();
                 
        for (int i = 0; i < allUsuarios.size(); i++) {
            Usuarios us = allUsuarios.get(i);
            if (us.getNombre().toLowerCase().startsWith(query)) {
                filteredUsuarios.add(us);
            }
        }
        return filteredUsuarios;
    }

    public void handleSelect(SelectEvent e) {
        Usuarios u = (Usuarios) e.getObject();
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "Add Player :: Player Info: ID :: " + u.getId() + " :: Name :: " + u.getNombre(), ""));
    }

    public void handleUnSelect(UnselectEvent e) {
        Usuarios u = (Usuarios) e.getObject();
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_WARN,
                        "Remove Player :: Player Info: ID :: " + u.getUsuario() + " :: Name :: " + u.getNombre(), ""));
    }
    
    
    
    
    public Usuarios getUsuarioPorId(int id) {
        this.session = null;
        this.transaction = null;

        try {
            DaoUsuarios daoUsuarios = new DaoUsuarios();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            usuario = daoUsuarios.obtenerPorID(this.session,id);

            this.transaction.commit();

            return usuario;

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
    
    

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public List<Usuarios> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuarios> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Usuarios> getUsuariosIniciales() {
        return usuariosIniciales;
    }

    public void setUsuariosIniciales(ArrayList<Usuarios> usuariosIniciales) {
        this.usuariosIniciales = usuariosIniciales;
    }

}
