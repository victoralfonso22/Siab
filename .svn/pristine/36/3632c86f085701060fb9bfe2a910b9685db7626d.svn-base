/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanVista;

import Dao.DaoDocumentacion;
import HibernateUtil.HibernateUtil;
import Pojos.TiposIdentificacion;
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


@Named(value = "mBDocumentacion")
//@Dependent

@ViewScoped

public class MBDocumentacion implements Serializable{
    
    private Session session;
    private Transaction transaction;
    
    private List<TiposIdentificacion> listatabla;
    
    private TiposIdentificacion identificacion;
    
    private String documento;

    
    
    
    
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    
    public TiposIdentificacion getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(TiposIdentificacion identificacion) {
        this.identificacion = identificacion;
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

    public List<TiposIdentificacion> getListatabla() {
        return listatabla;
    }

    public void setListatabla(List<TiposIdentificacion> listatabla) {
        this.listatabla = listatabla;
    }
    

    
    /**
     * Creates a new instance of MBDocumentacion
     */
    public MBDocumentacion() {
        
        listatabla=getTabla();
        
    }
    
    
    public List<TiposIdentificacion>getTabla(){
       this.session = null;
       this.transaction = null;

        try {
           // DaoMnunicipios daoMunicipios = new DaoMnunicipios();
            DaoDocumentacion daodocumentacion=new DaoDocumentacion();
            

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            

            listatabla= daodocumentacion.listaDatos(this.session);
            this.transaction.commit();

            return this.listatabla;

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
    
    public void generaLista(){
     listatabla=getTabla();
   }
    
    
    
    public void eliminarDato(int id){
        
      System.out.print(id);
      this.session = null;
      this.transaction = null;
try {
         DaoDocumentacion daodocumentacion=new DaoDocumentacion();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            System.out.print("sigue el dato aki .... "+id);
            //this.municipio.setId(id);
            
            daodocumentacion.eliminarDato(session, id);
         
           this.transaction.commit();
           
          
           //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se borro correctamente el Dato."));
          
        FacesContext context = FacesContext.getCurrentInstance();
        String message="  de la Tabla";
        context.addMessage(null, new FacesMessage("Exito",  "Se borro correctamente el Dato. " + message) );
        //context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));
     
            
      } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas +6" + e.getMessage()));
            return ;
        } finally {
            if (this.session != null) {
                session.close();
            }
        }
   
    }
    
    
    public void editarDato(){
  /*      
 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se agregó su Municipio Correctamente."));
        
        String message="ha invocado metodo";
        
         FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Successful",  "Your message: " + message) );
        context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));
    */
        
         int id=this.identificacion.getId();
        String tipo = this.identificacion.getTipo();
        
         this.session = null;
         this.transaction = null;
try {
         DaoDocumentacion daodocumentacion=new DaoDocumentacion();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
         
            //this.municipio.setId(id);
            daodocumentacion.editarDato(session, id, tipo.toUpperCase());
            this.transaction.commit();
           
          
           //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se borro correctamente el Dato."));
          
        FacesContext context = FacesContext.getCurrentInstance();
        String message=tipo;
        context.addMessage(null, new FacesMessage("Exito",  "Se modifico el Dato  " + message) );
        //context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));
     
            
      } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas +6" + e.getMessage()));
            return ;
        } finally {
            if (this.session != null) {
                session.close();
            }
        }
   
       
    
    }
    
    
    
    public void agregarDato(){
        
        
          this.session = null;
         this.transaction = null;
try {
         DaoDocumentacion daodocumentacion=new DaoDocumentacion();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
         
            //this.municipio.setId(id);
            daodocumentacion.agregarDato(session, documento);
            this.transaction.commit();
           
          
           //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se borro correctamente el Dato."));
          
        FacesContext context = FacesContext.getCurrentInstance();
        String message=documento.toUpperCase();
        context.addMessage(null, new FacesMessage("Exito",  "Se agregó el dato " + message+" Correctamente.") );
        //context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));
        
        documento=null;
     
            
      } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas +6" + e.getMessage()));
            return ;
        } finally {
            if (this.session != null) {
                session.close();
            }
        }
   
        
       
        
    }

  public void cancelar(){

  FacesContext context = FacesContext.getCurrentInstance();
  Application application = context.getApplication();
  ViewHandler viewHandler = application.getViewHandler();
  UIViewRoot viewRoot = viewHandler.createView(context, context.getViewRoot().getViewId());
  context.setViewRoot(viewRoot);
  context.renderResponse(); //Optional
  
  
  
}
    
    
    
}
