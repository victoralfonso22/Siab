/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanVista;

import Dao.DaoCatalogoMenu;
import HibernateUtil.HibernateUtil;
import Pojos.CatalogoMenu;
import Pojos.Permisos;
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
@Named(value = "mBCatalogoMenu")
@ViewScoped
public class MBCatalogoMenu implements Serializable{

    private Session session;
    private Transaction transaction;

    private List<CatalogoMenu> listaCatalogoMenu;

    private List<CatalogoMenu> listaCatalogoMenuSecciones;
    
    private List listaCatalogoMenuSeccionesPermisos;

    private CatalogoMenu catalogoMenu;

    private List<Permisos> listaPermisos;

    private MBPermisos mBPermisos;

    public MBCatalogoMenu() {
    }

    public List<CatalogoMenu> getCatalogoMenuUsuario() {
        this.session = null;
        this.transaction = null;

        try {
            DaoCatalogoMenu daoCatalogoMenu = new DaoCatalogoMenu();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);

            listaCatalogoMenu = daoCatalogoMenu.getCatalogoMenu(this.session, (int) httpSession.getAttribute("idUsuario"));

            this.transaction.commit();

            return this.listaCatalogoMenu;

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

    public List<CatalogoMenu> getCatalogoMenuIdCatalogoSecciones(int idCatalogoSecciones) {
        this.session = null;
        this.transaction = null;

        try {
            DaoCatalogoMenu daoCatalogoMenu = new DaoCatalogoMenu();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);

            listaCatalogoMenuSecciones = daoCatalogoMenu.getCatalogoMenuSeccion(this.session, idCatalogoSecciones);

            this.transaction.commit();

            return this.listaCatalogoMenuSecciones;

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
    
    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public List<CatalogoMenu> getListaCatalogoMenu() {
        return listaCatalogoMenu;
    }

    public void setListaCatalogoMenu(List<CatalogoMenu> listaCatalogoMenu) {
        this.listaCatalogoMenu = listaCatalogoMenu;
    }

    public CatalogoMenu getCatalogoMenu() {
        return catalogoMenu;
    }

    public void setCatalogoMenu(CatalogoMenu catalogoMenu) {
        this.catalogoMenu = catalogoMenu;
    }

    public List<Permisos> getListaPermisos() {
        return listaPermisos;
    }

    public void setListaPermisos(List<Permisos> listaPermisos) {
        this.listaPermisos = listaPermisos;
    }

    public List<CatalogoMenu> getListaCatalogoMenuSecciones() {
        return listaCatalogoMenuSecciones;
    }

    public void setListaCatalogoMenuSecciones(List<CatalogoMenu> listaCatalogoMenuSecciones) {
        this.listaCatalogoMenuSecciones = listaCatalogoMenuSecciones;
    }

    public MBPermisos getmBPermisos() {
        return mBPermisos;
    }

    public void setmBPermisos(MBPermisos mBPermisos) {
        this.mBPermisos = mBPermisos;
    }

    public List getListaCatalogoMenuSeccionesPermisos() {
        return listaCatalogoMenuSeccionesPermisos;
    }

    public void setListaCatalogoMenuSeccionesPermisos(List listaCatalogoMenuSeccionesPermisos) {
        this.listaCatalogoMenuSeccionesPermisos = listaCatalogoMenuSeccionesPermisos;
    }

}
