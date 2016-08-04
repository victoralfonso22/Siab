/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanVista;

import Dao.DaoPermisosCatalogoMenu;
import HibernateUtil.HibernateUtil;
import Pojos.PermisosCatalogoMenu;
import Pojos.ViewLocalidadCp;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Víctor
 */
@Named(value = "mBPermisosCatalogoMenu")
@ViewScoped
public class MBPermisosCatalogoMenu implements Serializable{
    
    private Transaction transaction;
    private Session session;
    
    private PermisosCatalogoMenu permisosCatalogoMenu;
    
    List<PermisosCatalogoMenu> listaCatalogoMenuSeccionesPermisos;

    /**
     * Creates a new instance of MBPermisosCatalogoMenu
     */
    public MBPermisosCatalogoMenu() {
    }
    
    public List<PermisosCatalogoMenu> getCatalogoMenuIdCatalogoSecciones(int idCatalogoSecciones) {
        this.session = null;
        this.transaction = null;

        try {
            DaoPermisosCatalogoMenu daoPermisosCatalogoMenu = new DaoPermisosCatalogoMenu();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);

            listaCatalogoMenuSeccionesPermisos = daoPermisosCatalogoMenu.getCatalogoMenuSeccion(this.session, idCatalogoSecciones);

            this.transaction.commit();

            return this.listaCatalogoMenuSeccionesPermisos;

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
    
    
    public boolean getCatalogoMenuIdCatalogoSeccionesPermisos(int idCatalogoMenuPer, int idUsuario) {
        this.session = null;
        this.transaction = null;

        try {
            DaoPermisosCatalogoMenu daoPermisosCatalogoMenu = new DaoPermisosCatalogoMenu();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            PermisosCatalogoMenu pcm = daoPermisosCatalogoMenu.getCatalogoMenuSeccionPermisos(this.session, idCatalogoMenuPer,idUsuario);

            this.transaction.commit();

            if(pcm != null){
            return true;
            }else{
            return false;}
            

        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas" + e.getMessage()));
            return false;
        } finally {
            if (this.session != null) {
                session.close();
            }
        }

    }
    
    
    
    public List<PermisosCatalogoMenu> getPermisosCatalogoMenuP(int idUsuario) {
        this.session = null;
        this.transaction = null;

        try {
            DaoPermisosCatalogoMenu daoPermisosCatalogoMenu = new DaoPermisosCatalogoMenu();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            listaCatalogoMenuSeccionesPermisos = daoPermisosCatalogoMenu.getPermisosCatalogoMenu(this.session,idUsuario);

            this.transaction.commit();

            return listaCatalogoMenuSeccionesPermisos;
            

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
    
    public List<PermisosCatalogoMenu> getPermisosCatalogoMenuUsuario(int idCatalogoSecciones) {
        this.session = null;
        this.transaction = null;

        try {
            DaoPermisosCatalogoMenu daoPermisosCatalogoMenu = new DaoPermisosCatalogoMenu();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);

            listaCatalogoMenuSeccionesPermisos = daoPermisosCatalogoMenu.getCatalogoMenuSeccionUsuario(this.session, idCatalogoSecciones, (int) httpSession.getAttribute("idUsuario"));

            this.transaction.commit();

            return this.listaCatalogoMenuSeccionesPermisos;

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

    public List<PermisosCatalogoMenu> getListaCatalogoMenuSeccionesPermisos() {
        return listaCatalogoMenuSeccionesPermisos;
    }

    public void setListaCatalogoMenuSeccionesPermisos(List<PermisosCatalogoMenu> listaCatalogoMenuSeccionesPermisos) {
        this.listaCatalogoMenuSeccionesPermisos = listaCatalogoMenuSeccionesPermisos;
    }

    public PermisosCatalogoMenu getPermisosCatalogoMenu() {
        return permisosCatalogoMenu;
    }

    public void setPermisosCatalogoMenu(PermisosCatalogoMenu permisosCatalogoMenu) {
        this.permisosCatalogoMenu = permisosCatalogoMenu;
    }
    
    
    
}