/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanVista;

import Dao.DaoCatalogoSecciones;
import HibernateUtil.HibernateUtil;
import Pojos.CatalogoMenu;
import Pojos.CatalogoSecciones;
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
@Named(value = "mBCatalogoSecciones")
@ViewScoped
public class MBCatalogoSecciones implements Serializable{

    private Session session;
    private Transaction transaction;

    private List<CatalogoMenu> listaCatalogoMenu;

    private CatalogoSecciones catalogoSecciones;

    private List<CatalogoSecciones> listaCatalogoSecciones;

    private List<CatalogoSecciones> listaCatalogoSeccionesUsuario;

    private MBCatalogoMenu mBCatalogoMenu;

    public MBCatalogoSecciones() {
    }

    public List<CatalogoSecciones> getCatalogoSeccionesUsuario() {
        this.session = null;
        this.transaction = null;

        try {
            DaoCatalogoSecciones daoCatalogoSecciones = new DaoCatalogoSecciones();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);

            listaCatalogoSeccionesUsuario = daoCatalogoSecciones.getCatalogoSeccionesUsuario(this.session, (int) httpSession.getAttribute("idUsuario"));

            this.transaction.commit();

            return this.listaCatalogoSeccionesUsuario;

        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas 4" + e.getMessage()));
            return null;
        } finally {
            if (this.session != null) {
                session.close();
            }
        }
    }

    public List<CatalogoSecciones> getCatalogoSecciones() {
        this.session = null;
        this.transaction = null;

        try {
            DaoCatalogoSecciones daoCatalogoSecciones = new DaoCatalogoSecciones();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            listaCatalogoSecciones = daoCatalogoSecciones.getCatalogoSecciones(this.session);

            this.transaction.commit();

            return this.listaCatalogoSecciones;

        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas 4" + e.getMessage()));
            return null;
        } finally {
            if (this.session != null) {
                session.close();
            }
        }
    }

    public List<CatalogoSecciones> getCatalogoSeccionesId(int id) {
        this.session = null;
        this.transaction = null;

        try {
            DaoCatalogoSecciones daoCatalogoSecciones = new DaoCatalogoSecciones();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            listaCatalogoSecciones = daoCatalogoSecciones.getCatalogoSeccionesId(this.session, id);

            this.transaction.commit();

            return this.listaCatalogoSecciones;

        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas 4" + e.getMessage()));
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

    public List<CatalogoSecciones> getListaCatalogoSecciones() {
        return listaCatalogoSecciones;
    }

    public void setListaCatalogoSecciones(List<CatalogoSecciones> listaCatalogoSecciones) {
        this.listaCatalogoSecciones = listaCatalogoSecciones;
    }

    public List<CatalogoSecciones> getListaCatalogoSeccionesUsuario() {
        return listaCatalogoSeccionesUsuario;
    }

    public void setListaCatalogoSeccionesUsuario(List<CatalogoSecciones> listaCatalogoSeccionesUsuario) {
        this.listaCatalogoSeccionesUsuario = listaCatalogoSeccionesUsuario;
    }

    public MBCatalogoMenu getmBCatalogoMenu() {
        return mBCatalogoMenu;
    }

    public void setmBCatalogoMenu(MBCatalogoMenu mBCatalogoMenu) {
        this.mBCatalogoMenu = mBCatalogoMenu;
    }

}
