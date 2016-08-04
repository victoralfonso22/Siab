/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanVista;

import Dao.DaoPermisos;
import HibernateUtil.HibernateUtil;
import Pojos.Permisos;
import java.io.Serializable;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.faces.application.FacesMessage;

/**
 *
 * @author Víctor
 */
@Named(value = "mBPermisos")
@ViewScoped
public class MBPermisos implements Serializable {

    private Session session;
    private Transaction transaccion;

    private Permisos permisos;
    private List<Permisos> listaPermisos;

    public MBPermisos() {
    }

    public List<Permisos> getPermisosUsuario() {
        this.session = null;
        this.transaccion = null;

        try {
            DaoPermisos daoPermisos = new DaoPermisos();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaccion = this.session.beginTransaction();

            HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);

            this.listaPermisos = daoPermisos.getPermisosUsuario(session, (int) httpSession.getAttribute("idUsuario"));

            this.transaccion.commit();

            return this.listaPermisos;

        } catch (Exception e) {
            if (this.transaccion != null) {
                this.transaccion.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas PErmisos" + e.getMessage()));
            return null;
        } finally {
            if (this.session != null) {
                session.close();
            }
        }

    }

    public void actualizarPermisoUsuario(Permisos permiso) {
        this.session = null;
        this.transaccion = null;

        try {
            DaoPermisos daoPermisos = new DaoPermisos();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaccion = this.session.beginTransaction();

            daoPermisos.actualizarPermisosUsuario(session, permiso);

            this.transaccion.commit();

        } catch (Exception e) {
            if (this.transaccion != null) {
                this.transaccion.rollback();
                return;
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas PErmisos" + e.getMessage()));
        } finally {
            if (this.session != null) {
                session.close();
            }
        }
    }

    public void guardaPermisoUsuario(Permisos permiso) {
        this.session = null;
        this.transaccion = null;

        try {
            DaoPermisos daoPermisos = new DaoPermisos();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaccion = this.session.beginTransaction();            
            daoPermisos.guardarPermisosActualizacion(this.session, permiso);

            this.transaccion.commit();

        } catch (Exception e) {
            if (this.transaccion != null) {
                this.transaccion.rollback();
                return;
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas PErmisos" + e.getMessage()));
        } finally {
            if (this.session != null) {
                session.close();
            }
        }
    }

    public boolean concederQuitarPermisos(int idUsuario, int idCatalogoMenu) {
        this.session = null;
        this.transaccion = null;

        try {
            DaoPermisos daoPermisos = new DaoPermisos();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaccion = this.session.beginTransaction();

            permisos = daoPermisos.getPermisosActualizacion(this.session, idUsuario, idCatalogoMenu);

            if (permisos != null) {
                if (permisos.getPermiso() == 1) {
                    permisos.setPermiso(0);
                    actualizarPermisoUsuario(permisos);
                    return false;
                } else {
                    permisos.setPermiso(1);
                    actualizarPermisoUsuario(permisos);

                    return true;
                }
            } else {
                Permisos permi = new Permisos();
                permi.setIdUsuario(idUsuario);
                permi.setIdCatalogoMenu(idCatalogoMenu);
                permi.setPermiso(1);
                
                guardaPermisoUsuario(permi);
                
                
                return true;
            }

        } catch (Exception e) {
            if (this.transaccion != null) {
                this.transaccion.rollback();

            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas" + e.getMessage()));
            return false;
        }

    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Transaction getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaction transaccion) {
        this.transaccion = transaccion;
    }

    public List<Permisos> getListaPermisos() {
        return listaPermisos;
    }

    public void setListaPermisos(List<Permisos> listaPermisos) {
        this.listaPermisos = listaPermisos;
    }

    public Permisos getPermisos() {
        return permisos;
    }

    public void setPermisos(Permisos permisos) {
        this.permisos = permisos;
    }

}
