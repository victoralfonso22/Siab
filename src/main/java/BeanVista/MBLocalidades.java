/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanVista;

import Pojos.Estados;

import Dao.DaoLocalidades;
import HibernateUtil.HibernateUtil;
import Pojos.Localidades;
import Pojos.Municipios;
import Pojos.ViewLocalidadCp;




import java.io.Serializable;

import java.util.List;

import javax.inject.Named;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.hibernate.Session;
import org.hibernate.Transaction;

@ManagedBean
@ViewScoped
//@SessionScoped

//@Named(value = "mBLocalidades")







public class MBLocalidades implements Serializable{
    
    
     private Session session;
     private Transaction transaction;
     
     private List<Estados>ListaEstados;
     private List<Municipios>ListaMunicipios;
     private List<ViewLocalidadCp>DatosTabla;

     private ViewLocalidadCp local;
     
     
     private int idEstado;
      private int idMunicipio;

   private String nombre;
     private int idMunA;
     private int idEstA;
     
     
     private int estadoEdit;
     private int munEdit;

    public int getEstadoEdit() {
        return estadoEdit;
    }

    public void setEstadoEdit(int estadoEdit) {
        this.estadoEdit = estadoEdit;
    }

    public int getMunEdit() {
        return munEdit;
    }

    public void setMunEdit(int munEdit) {
        this.munEdit = munEdit;
    }

     
     
     
    public List<ViewLocalidadCp> getDatosTabla() {
        return DatosTabla;
    }

    public void setDatosTabla(List<ViewLocalidadCp> DatosTabla) {
        this.DatosTabla = DatosTabla;
    }
     
     

    public int getIdEstA() {
        return idEstA;
    }

    public void setIdEstA(int idEstA) {
        this.idEstA = idEstA;
    }

     
     
     
    public ViewLocalidadCp getLocal() {
        return local;
    }

    public void setLocal(ViewLocalidadCp local) {
        this.local = local;
    }

 
     

    /*********constructor***********/
    
    
    //constructor
    public MBLocalidades() {
        
     ListaEstados=getEstados();
    // ListaMunicipios=getMunicipios(idEstado);
     
    // ListaEstados.
     
        
    }

    public int getIdMunA() {
        return idMunA;
    }

    public void setIdMunA(int idMunA) {
        this.idMunA = idMunA;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    
    

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public List<Municipios> getListaMunicipios() {
        return ListaMunicipios;
    }

    public void setListaMunicipios(List<Municipios> ListaMunicipios) {
        this.ListaMunicipios = ListaMunicipios;
    }
    
    
    public Session getSession() {
        return session;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
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

    public List<Estados> getListaEstados() {
        return ListaEstados;
    }

    public void setListaEstados(List<Estados> ListaEstados) {
        this.ListaEstados = ListaEstados;
    }
    
    
    
    public List<Estados> getEstados() {
        this.session = null;
        this.transaction = null;

        try {
            DaoLocalidades daoLocalidades = new DaoLocalidades();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            ListaEstados= daoLocalidades.getEstados(this.session);
            
           

            this.transaction.commit();

            return this.ListaEstados;

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
    
    
    public  List<Municipios>getMunicipios(int idEstadoM){
        
        this.session = null;
        this.transaction = null;
        
        try {
            DaoLocalidades daoLocalidades = new DaoLocalidades();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            ListaMunicipios= daoLocalidades.getMunicipios(this.session,idEstadoM);
            
           

            this.transaction.commit();

            return this.ListaMunicipios;

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
    
     public  List<ViewLocalidadCp>getLocalidades(int idMunR){
        
        this.session = null;
        this.transaction = null;
        
        try {
            DaoLocalidades daoLocalidades = new DaoLocalidades();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            DatosTabla= daoLocalidades.getLocalidades(this.session,idMunR);
            
           

            this.transaction.commit();

            return  DatosTabla;

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
  

   
 
   
 public  void generaMunicipios(){   
    
    //System.out.print(idEstado);
    ListaMunicipios=getMunicipios(idEstado);
    
    
 }  
 
 public void generaMunicipiosADD(){
     ListaMunicipios=getMunicipios(idEstA);
 }
 
  
 public void generaMunicipiosE(){
     ListaMunicipios=getMunicipios(estadoEdit);
 }
 
 
 
 
 public void generaLocalidades(){
  
      //System.out.print(idMunicipio);
     this.DatosTabla=getLocalidades(idMunicipio);
     
 }
 
 public void AgregaLocalidad(){
     
     
     System.out.println(nombre);
     
 
 }
 
 public void agrega(){
     
      this.session = null;
      this.transaction = null;
     
      System.out.println(nombre);
        System.out.println(idMunA);
        
           try {
            DaoLocalidades daoLocalidades = new DaoLocalidades();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            
            //falta validar datos   de entrada
            
             if (nombre.equals("")){
             FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El campo Nombre no puede quedar vacio"));       
             return;   
            }
             if (idMunA==0){
             FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El campo Municipio no puede quedar vacio"));       
             return;   
            }
            
             Localidades local=daoLocalidades.validaNombre(session, nombre);
          
            //System.out.print(municipio);
            if(local!=null){
            
            FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "La localidad se encuentra registrada"));    
               this.nombre=null; 
               this.idEstA=0;
               this.idMunA=0;
               
            return;
            
            }
           
            
           daoLocalidades.RegistraLocalidad(this.session,nombre,idMunA);
           this.transaction.commit();
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se agregó Localidad Correctamente."));
          
             this.nombre=null;
             this.idMunA=0;
             this.idEstA=0;
             
      
             
             //this.tabla=getLocalidades(this.idMunicipio);
     
            
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
   
    nombre=null;
    idMunA=0;
    idEstA=0;
   // idEstado=0;
     
   
   } 
   
 
   
   public void borrar(int id) {
       
       System.out.print("dato a borarrar"+" "+id);
     
       
      this.session = null;
      this.transaction = null;
       
   
 try {
            DaoLocalidades daoLocalidades = new DaoLocalidades();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
           
            
            daoLocalidades.borrarLocalidad(this.session,id);
           this.transaction.commit();
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se borro correctamente el registro."));
           
            
     
            
      } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas +5" + e.getMessage()));
            return ;
        } finally {
            if (this.session != null) {
                session.close();
            }
        }
    
       
   }
   
    public  void editarLocalidad(){
        this.session = null;
        this.transaction = null;
        
        
        
        //int id=this.local.getId();
        int id=this.local.getId();
        
        String nom = this.local.getLocalidad();
        int idMun=this.local.getIdMunicipio();
        System.out.print("el ide es "+id+" el nombre es "+nom);
        
        
        
         try {
          DaoLocalidades daoLocalidades = new DaoLocalidades();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            
            
          if (nom.equals("")) {
                  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El campo Localidad no puede quedar vacio."));
         return;
    
        }
          if (munEdit==0){
               FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El campo municipio no puede quedar vacio."));
              return;
          
          }
        
         
            daoLocalidades.actualiza(this.session,id,nom,munEdit);
           
            this.transaction.commit();
           
             this.estadoEdit=0;
             this.munEdit=0;
          
       
          FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se actualizó Correctamente su Localidad."));
            
      } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas +" + e.getMessage()));
            return ;
        } finally {
            if (this.session != null) {
                session.close();
            }
        }
        
   
    }
   public void eliminar(int id){
       
       System.out.print(id);
   }
   
   
   
   
   
    
}




