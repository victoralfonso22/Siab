
package BeanVista;

import Dao.DaoIncidencias;
import HibernateUtil.HibernateUtil;
import Pojos.TiposIncidencias;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.application.ViewHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Soporte 07
 */

@ManagedBean
@Named(value = "mBIncidencias")
//@ManagedBean
@ViewScoped
public class MBIncidencias   implements Serializable{
    
    private Session session;
    private Transaction transaction;
    
    private List<TiposIncidencias>ListaIncidencias;
    
    private TiposIncidencias incidencia;
    
    private String tipo;
    
    
    
    
      public MBIncidencias() {
          ListaIncidencias=getIncidencias();
        
   }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
      
      
      
      

    public TiposIncidencias getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(TiposIncidencias incidencia) {
        this.incidencia = incidencia;
    }
      
      
 
    public List<TiposIncidencias> getListaIncidencias() {
        return ListaIncidencias;
    }

    public void setListaIncidencias(List<TiposIncidencias> ListaIncidencias) {
        this.ListaIncidencias = ListaIncidencias;
    }
    
    
    public void generaLista(){
        
        ListaIncidencias=getIncidencias();
    }
    
    
    
     public List<TiposIncidencias> getIncidencias() {
        this.session = null;
        this.transaction = null;

        try {
            DaoIncidencias daoIncidencias = new DaoIncidencias();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            ListaIncidencias= daoIncidencias.generaLista(this.session);
            this.transaction.commit();
            return this.ListaIncidencias;

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
    
    
    public void elimina(int id ){
        
        System.out.print(id);
    
    
    }
    public void borrarIncidencia(int id){
    
     System.out.print("esta invocando metodo");
            System.out.print(id);
            
             this.session = null;
    this.transaction = null;

        try {
            DaoIncidencias daoIncidencias = new DaoIncidencias();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            
           daoIncidencias.eliminarIncidencia(session, id);

        
           this.transaction.commit();
          FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se eliminaron datos  Correctamente."));

        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas" + e.getMessage()));
            return;
        } finally {
            if (this.session != null) {
                session.close();
            }
        }
            
   
    }
   
    
    
    public void editarIncidencia(){
        
        System.out.print("esta invocando metodo");
        
    int id=this.incidencia.getId();
    String tipo =this.incidencia.getTipo();
     tipo.toUpperCase();
    System.out.print(id);
    System.out.print(tipo);
    
    this.session = null;
    this.transaction = null;

        try {
            DaoIncidencias daoIncidencias = new DaoIncidencias();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            
            if(tipo==""){
                
                FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El campo no puede quedar vacio"));    
           return;
            }
            

           daoIncidencias.editar(this.session,id,tipo.toUpperCase());
           this.transaction.commit();
          FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se Guardaron cambios Correctamente."));

        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas" + e.getMessage()));
            return;
        } finally {
            if (this.session != null) {
                session.close();
            }
        }
    
        
        
        
        
        
    }
    
    
    public void  agregarIncidencia(){
        
        
        this.session = null;
        this.transaction = null;
        
        System.out.print(tipo);
        
        String dato=tipo;
        
        
        try {
            DaoIncidencias daoIncidencias = new DaoIncidencias();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            
            
            System.out.print("el dato llego aki "+dato);
            if(tipo==null){
                
                FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El campo no puede quedar vacio"));    
           return;
            }
            

           daoIncidencias.guardarIncidencias(this.session,tipo);
               
           this.transaction.commit();
          tipo="";
          FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se Agrego Dato  Correctamente."));

          
          

        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas" + e.getMessage()));
            return;
        } finally {
            if (this.session != null) {
                session.close();
            }
        }
    
        
        
        
        
    }
    
    
    
    public void cancelar(){
    tipo="";  
  FacesContext context = FacesContext.getCurrentInstance();
  Application application = context.getApplication();
  ViewHandler viewHandler = application.getViewHandler();
  UIViewRoot viewRoot = viewHandler.createView(context, context.getViewRoot().getViewId());
  context.setViewRoot(viewRoot);
  context.renderResponse(); //Optional
  
  
  
}
    
    
    

  
    
}
