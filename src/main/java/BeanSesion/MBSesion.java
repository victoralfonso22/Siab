/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanSesion;

import Dao.DaoUsuarios;
import HibernateUtil.HibernateUtil;
import Pojos.Usuarios;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.inject.Named;
import java.io.Serializable;
import javax.faces.application.Application;

import javax.faces.application.FacesMessage;
import javax.faces.application.ViewHandler;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIViewRoot;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Víctor
 */
@ManagedBean
@SessionScoped
public class MBSesion implements Serializable {

    private String username;
    private String password;

    private String actual;
    private String nueva;
    private String rnueva;
    private Usuarios usuarios;

    private Session session;

    private Transaction transaccion;

    public MBSesion() {
        HttpSession miSesion = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        miSesion.setMaxInactiveInterval(600000);

    }

    public String getNueva() {
        return nueva;
    }

    public void setNueva(String nueva) {
        this.nueva = nueva;
    }

    public String getRnueva() {
        return rnueva;
    }

    public void setRnueva(String rnueva) {
        this.rnueva = rnueva;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public String login() {
        this.session = null;
        this.transaccion = null;

        try {
            DaoUsuarios daoUsuarios = new DaoUsuarios();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaccion = this.session.beginTransaction();

            Usuarios usuarios = daoUsuarios.obtenerPorUsername(this.session, this.username, this.password);

            if (usuarios != null) {
                HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
                httpSession.setAttribute("username", this.username);
                httpSession.setAttribute("idSector", usuarios.getIdSector());
                httpSession.setAttribute("nombre", usuarios.getNombre());
                httpSession.setAttribute("idUsuario", usuarios.getId());
                httpSession.setAttribute("pass", usuarios.getPass());
                return "menuPrincipal/menuPrincipal.xhtml";
            }
            this.transaccion.commit();

            this.username = null;
            this.password = null;

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error de acceso: ", "usuario o contraseña incorrecta"));
            return "/login";

        } catch (Exception e) {
            if (this.transaccion != null) {
                this.transaccion.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas" + e.getMessage()));
            return null;
        } finally {
            if (this.session != null) {
                session.close();
            }
        }
    }

    public Usuarios datosUsuario() {
        this.session = null;
        this.transaccion = null;

        try {
            DaoUsuarios daoUsuarios = new DaoUsuarios();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaccion = this.session.beginTransaction();

            Usuarios usuarios = daoUsuarios.obtenerPorUsername(this.session, this.username, this.password);

            if (usuarios != null) {

                return usuarios;
            }
            this.transaccion.commit();

            return null;

        } catch (Exception e) {
            if (this.transaccion != null) {
                this.transaccion.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas" + e.getMessage()));
            return null;
        } finally {
            if (this.session != null) {
                session.close();
            }
        }
    }

    public String cerrarSesion() {
        this.username = null;
        this.password = null;
                
        HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        httpSession.removeAttribute(username);
        httpSession.removeAttribute(password);
        httpSession.invalidate();
        

        return "/login?faces-redirect=true";
    }
    
    
 
    public void cerrar() throws IOException {
        
   // FacesContext.getCurrentInstance().addMessage("mensaje", new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso: ", "contraseña actualizada correctamente"));
                
       //FacesContext.getCurrentInstance().getExternalContext().invalidateSession(); return  "/login.xhtml"
        
    ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
    ec.invalidateSession();
   
    ec.redirect(ec.getRequestContextPath());
    
   //return "/login.xhtml";
        
    }
    
   public void close() {
  ExternalContext ctx = 
      FacesContext.getCurrentInstance().getExternalContext();
  String ctxPath = 
      ((ServletContext) ctx.getContext()).getContextPath();

  try {
    // Usar el contexto de JSF para invalidar la sesión,
    // NO EL DE SERVLETS (nada de HttpServletRequest)
    ((HttpSession) ctx.getSession(false)).invalidate();

    // Redirección de nuevo con el contexto de JSF,
    // si se usa una HttpServletResponse fallará.
    // Sin embargo, como ya está fuera del ciclo de vida 
    // de JSF se debe usar la ruta completa -_-U
    ctx.redirect(ctxPath + "/faces/login.xhtml");
  } catch (IOException ex) {
    ex.printStackTrace();
  }
}
   
   
   private  void Segundo() throws IOException
    {
        try
        {
            //System.out.print("llego  al dormilon");
            //FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso: ", "contraseña actualizada correctamente"));
            
            Thread.sleep(8000);
             //FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso: ", "contraseña actualizada correctamente"));
            cerrar();
        }catch(InterruptedException e){}
    }
   
   
   
   
   
   
   
   

public void envia() throws IOException{
   FacesContext.getCurrentInstance().getExternalContext().redirect("http://localhost:8080/Siab/faces/login.xhtml");
//return ;
   
   cerrar();
}
    
    
    
    
    
    
 
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MBSesion(String actual) {
        this.actual = actual;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
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
    
    public void refresh() {
  FacesContext context = FacesContext.getCurrentInstance();
  Application application = context.getApplication();
  ViewHandler viewHandler = application.getViewHandler();
  UIViewRoot viewRoot = viewHandler.createView(context, context
   .getViewRoot().getViewId());
  context.setViewRoot(viewRoot);
  context.renderResponse(); //Optional
  
  
  
}
    

    public String cambia() {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;
        boolean loggedIn = false;

        //this.session = null;
        this.transaccion = null;

        if (password != null && password.equals(actual) && nueva.equals(rnueva)) {
            //Session session = HibernateUtil.getSessionFactory().openSession();
            //session.beginTransaction();

            HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);

            String user = (String) httpSession.getAttribute("username");

            try {
               // System.out.println("El user es: " + user);
               // System.out.println("El password es nueva : " + nueva);
                DaoUsuarios daoUsuarios = new DaoUsuarios();

                this.session = HibernateUtil.getSessionFactory().openSession();
                this.transaccion = this.session.beginTransaction();

                daoUsuarios.actualizar(this.session, nueva, user);

                this.transaccion.commit();
                FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso: ", "contraseña actualizada correctamente"));
              cerrar();
                //FacesContext.getCurrentInstance().

// Thread.sleep(9000);
               //Segundo();
                
              
            } catch (Exception e) {
                if (this.transaccion != null) {
                    this.transaccion.rollback();
                }
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte al sistemas" + e.getMessage()));
                //return null;
            } finally {
                if (this.session != null) {
                    session.close();
                }
            }

        } else {
            loggedIn = false;
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error Validacion ", "Contraseña Actual no coincide ó Contraseña  nueva no coincide con la confirmacion"));

        }

        context.addCallbackParam("loggedIn", loggedIn);
        return null;
    }

    

}
