/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanVista;

import Dao.DaoTpagos;
import HibernateUtil.HibernateUtil;
import Pojos.TiposPagos;
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

@Named(value = "mBTpagos")

@ViewScoped

public class MBTpagos implements Serializable {
    
    private Session session;
    private Transaction transaction;
    
    private List<TiposPagos>listaPagos;
    
    private TiposPagos pago;
    
    private String tipo;
    
    private String mov;
    
    //se corrije  string por char
    private char movimiento;

   
    
    
    

    public char getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(char movimiento) {
		this.movimiento = movimiento;
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

    public String getMov() {
        return mov;
    }

    public void setMov(String mov) {
        this.mov = mov;
    }
 
    
    
    
    
   
    public MBTpagos() {
        listaPagos=generaLista();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

    public TiposPagos getPago() {
        return pago;
    }

    public void setPago(TiposPagos pago) {
        this.pago = pago;
    }
    
    

    public List<TiposPagos> getListaPagos() {
        return listaPagos;
    }

    public void setListaPagos(List<TiposPagos> listaPagos) {
        this.listaPagos = listaPagos;
    }
    
    
    
    public List<TiposPagos> generaLista(){
        
        
        
        this.session = null;
        this.transaction = null;

        try {
           // DaoMnunicipios daoMunicipios = new DaoMnunicipios();
            DaoTpagos daoTpagos=new DaoTpagos();
            

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            

            listaPagos= daoTpagos.generaLista(this.session);
           
           

            this.transaction.commit();

            return this.listaPagos;

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
    
    
    public void generaPagos(){
        listaPagos=generaLista();
        
   }
    
    
    public void editarPago(){
        
     String tipo=this.pago.getTipo();
     int id=this.pago.getId();
     
     System.out.print(tipo);
     System.out.print("ahy va el dato de  "+mov);
     
     
     this.session = null;
           this.transaction = null;

        try {
            DaoTpagos daoIncidencias = new DaoTpagos();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            
            if(tipo==""){
                 FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El campo Pago no puede quedar vacio"));   
                return;
            }
            
            
            if(mov==""){
                 FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El campo movimiento no puede quedar vacio"));   
                return;
            }
            
            
            
           daoIncidencias.editar(session, tipo, mov, id);
           this.transaction.commit();
           
       FacesContext context1 = FacesContext.getCurrentInstance();
       String message=tipo;
      context1.addMessage(null, new FacesMessage("Exito",  "Se Modifico  dato " + message+"correctamente." ) );
           
         //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se modificaron Datos  Correctamente."));

         mov="";
         
         
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
    
    
    public void eliminarPago(int id ){
        
       System.out.print(id);
       
       
   
           this.session = null;
           this.transaction = null;

        try {
            DaoTpagos daoIncidencias = new DaoTpagos();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            
           daoIncidencias.eliminar(session, id);
           this.transaction.commit();
           
       // FacesContext context = FacesContext.getCurrentInstance();
       // String message="Tabla";
        //context.addMessage(null, new FacesMessage("Exito",  "Se eliminó dato de la   " + message) );
           
          FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se eliminaron Datos  Correctamente."));

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
    
    public void agregaPago(){
        
        System.out.print(tipo);
        System.out.print(movimiento);
        
        

        this.session = null;
        this.transaction = null;

        try {
           // DaoMnunicipios daoMunicipios = new DaoMnunicipios();
            DaoTpagos daoTpagos=new DaoTpagos();
            

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            
            if(tipo==null){
                 FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El campo Pago no puede quedar vacio"));    
            
            return;
            }
            
            
            
            char estatus=1;
            daoTpagos.agregar(session, tipo, movimiento, estatus);
             this.transaction.commit();   
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se agregó un Tipo de Pago Correctamente."));
             // tipo=null;
            //  movimiento=null;
            


        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas" + e.getMessage()));
            return ;
        } finally {
            if (this.session != null) {
                session.close();
            }
        }
        
        
     
        
    }
    
       public void cancelar(){
    tipo=null; 
    movimiento=0;
    
  FacesContext context = FacesContext.getCurrentInstance();
  Application application = context.getApplication();
  ViewHandler viewHandler = application.getViewHandler();
  UIViewRoot viewRoot = viewHandler.createView(context, context.getViewRoot().getViewId());
  context.setViewRoot(viewRoot);
  context.renderResponse(); //Optional
  
 
  
} 
    
    
    
    
    
}
