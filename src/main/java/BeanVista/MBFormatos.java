/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanVista;
  
import Dao.DaoFormatos;
import HibernateUtil.HibernateUtil;
import Pojos.Formatos;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.context.RequestContext;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.faces.bean.ManagedBean;

@Named(value = "mBFormatos")
@ViewScoped
public class MBFormatos implements Serializable {

    private Map<String, Map<String, String>> data = new HashMap<String, Map<String, String>>();
    private String accion;
    private String formato;
    private String registro;
    private Formatos folio;
    private Map<String, String> acciones;
    private Map<String, String> formatos;
    private Map<String, String> registros;
    private Session session;
    private Transaction transaction;        
    private ArrayList<Formatos> foliosformato;
    private Formatos rangosFormatos;
    
    
    private String folioI;
    private String folioF;
    
    private String  folioUnico;

    @PostConstruct
    public void init() {
        acciones = new HashMap<String, String>();
        acciones.put("Agregar", "Agregar");
        acciones.put("Cancelar", "Cancelar");

        Map<String, String> map = new HashMap<String, String>();
        map.put("FU", "FU");
        map.put("FC2", "FC2");
        data.put("Agregar", map);

        map = new HashMap<String, String>();
        map.put("FU", "FU");
        map.put("FC2", "FC2");
        data.put("Cancelar", map);

        map = new HashMap<String, String>();
        map.put("Individual", "Individual");
        map.put("Rango", "Rango");
        data.put("FU", map);

        map = new HashMap<String, String>();
        map.put("Individual", "Individual");
        map.put("Rango", "Rango");
        data.put("FC2", map);
    }

    public String getFolioUnico() {
        return folioUnico;
    }

    public void setFolioUnico(String folioUnico) {
        this.folioUnico = folioUnico;
    }

    public String getFolioI() {
        return folioI;
    }

    public void setFolioI(String folioI) {
        this.folioI = folioI;
    }

    public String getFolioF() {
        return folioF;
    }

    public void setFolioF(String folioF) {
        this.folioF = folioF;
    }
    

  
    
    

    public Map<String, Map<String, String>> getData() {
        return data;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Formatos getFolio() {
        return folio;
    }

    public void setFolio(Formatos folio) {
        this.folio = folio;
    }
    
    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    } 
    
    public Map<String, String> getAcciones() {
        return acciones;
    }

    public Map<String, String> getFormatos() {
        return formatos;
    }

    public Map<String, String> getRegistros() {
        return registros;
    }
    
    public ArrayList<Formatos> getUsuariosIniciales() {
        return foliosformato;
    }

    public void setUsuariosIniciales(ArrayList<Formatos> foliosformato) {
        this.foliosformato = foliosformato;
    }
    
    public Formatos getRangosFormatos() {
        return rangosFormatos;
    }

    public void setFormatos(Formatos rangosFormatos) {
        this.rangosFormatos = rangosFormatos;
    }    

    public void onAccionChange() {
        if (accion != null && !accion.equals("")) {
            formatos = data.get(accion);
            setFormato("");
            registros = data.get(formato);
        } else {
            setFormato("");
            formatos = new HashMap<String, String>();
            registros = new HashMap<String, String>();
        }
    }

    public void onFormatoChange() {
        if (formato != null && !formato.equals("")) {
            registros = data.get(formato);
            setRegistro("");
        } else {
            registros = new HashMap<String, String>();
            setRegistro("");
        }
    }

    public void mensaje() {
        FacesMessage msg;
        if (formato != null && accion != null) {
            msg = new FacesMessage("Elegiste", accion + " " + formato + " registro modo " + registro);
        }else{
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Formato no seleccionado."); 
             
        FacesContext.getCurrentInstance().addMessage(null, msg);  
        }
    }
    public void recogeDatos(){

        RequestContext context = RequestContext.getCurrentInstance();
        context.execute("PF('dlg').show();");

    }   
    
  

    public void guardaFolios() {
          int finicial=Integer.parseInt(folioI);
          int ffinal=Integer.parseInt(folioF);
                            this.session = null;
                            this.transaction = null;
        
           switch(accion){
            
             case "Agregar":
        
       
                  

                            try {
                                DaoFormatos daoFormatos=new DaoFormatos();

                                           this.session = HibernateUtil.getSessionFactory().openSession();
                                           this.transaction = this.session.beginTransaction();


                         //  System.out.print(finicial);
                         //  System.out.print(ffinal);

                           if (finicial >= ffinal) {
                                    FacesContext.getCurrentInstance().addMessage(":centra:validacion", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El folio inicial no debe ser mayor o igual al folio final."));                
                            folioF=null;
                                    return;
                           }  
                                List<Formatos>  lista = daoFormatos.verificaRango(session, finicial, ffinal, formato);

                                if(lista.size()!=0){
                                    FacesContext.getCurrentInstance().addMessage(":centra:validacion", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "Uno ó mas folios del rango se encuentran registrados."));                
                                    return;
                                }

                                       int foliotem=finicial;
                                       char estatus=0;

                                       for(int i = finicial;i<=ffinal;i++){

                                           daoFormatos.agregaFolioUnico(session, foliotem, formato, estatus);

                                           //Formatos form=new Formatos(foliotem,formato,estatus);
                                           //foliosFormatos.add(form);
                                           foliotem++;

                                                                }
                                         this.transaction.commit();   
                                             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se agregó su Rango de Folios Correctamente."));
                                              folioI=null;
                                              folioF=null;
                                             


                                         }catch (Exception e) {
                                             if (this.transaction != null) {
                                                 this.transaction.rollback();
                                             }
                                             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas" + e.getMessage()));

                                         } finally {
                                             if (this.session != null) {
                                                 session.close();
                                             }
                                         }
             
             break;
                 
                 
                     case "Cancelar":
                         
                          System.out.print("la opcion es cancelar");
                         
                         
                            try {
                                  DaoFormatos daoFormatos=new DaoFormatos();

                                           this.session = HibernateUtil.getSessionFactory().openSession();
                                           this.transaction = this.session.beginTransaction();
                                
                                 if (finicial >= ffinal) {
                                     
                               FacesContext.getCurrentInstance().addMessage(":centra:validacion", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El folio inicial no debe ser mayor o igual al folio final."));                
                            folioF=null;
                                    return;
                           }  
                                List<Formatos>  lista = daoFormatos.verificaRango(session, finicial, ffinal, formato);
                                
                                
                                if(lista.size()==0){
                                    FacesContext.getCurrentInstance().addMessage(":centra:validacion", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", " Los folios del rango No se encuentran registrados."));                
                                    return;
                                }
                                
                                int foliotem=finicial;
                                       String estatus="3";

                                       for(int i = finicial;i<=ffinal;i++){

                                           daoFormatos.cancelaFolioUnico(session, foliotem, estatus);

                                           //Formatos form=new Formatos(foliotem,formato,estatus);
                                           //foliosFormatos.add(form);
                                           foliotem++;

                                                                }
                                         this.transaction.commit();   
                                             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se Canceló su Rango de Folios Correctamente."));
                                              folioI=null;
                                              folioF=null;
                                             
                                
                                
                                
                            }catch (Exception e) {
                                             if (this.transaction != null) {
                                                 this.transaction.rollback();
                                             }
                                             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas" + e.getMessage()));

                                         } finally {
                                             if (this.session != null) {
                                                 session.close();
                                             }
                                         }
                         
                         
                        
                         
                         
                         break;
                 
                 
                 
                 
                 
                 
                 
                 
           }//final switch

    }
    
    public  void guardafolioUnico(){
        
        switch(accion){
            
             case "Agregar":
        //corrijo tipo de dato de  estatus  string por char
                 
                   char estatus=0;
                   int folioA =Integer.parseInt(folioUnico);
                 
                   this.session = null;
                   this.transaction = null;
                   
                   try{
                   
                       DaoFormatos daoFormatos=new DaoFormatos();
                       
                       this.session = HibernateUtil.getSessionFactory().openSession();
                       this.transaction = this.session.beginTransaction();
                       
                    Formatos  formatoE=daoFormatos.existeFormato(session, folioA,formato);
        
                     //System.out.print("este es el folio existente"+formatoE.getFolio());
                    if(formatoE!=null){
            
                     FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El Folio se encuentra registrado"));    
                folioUnico=null;
           // RequestContext.getCurrentInstance().reset("form:panel");
            
            return;
            
            }
                       
                       daoFormatos.agregaFolioUnico(session,folioA, formato, estatus);
                       this.transaction.commit();   
                      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se agregó su Folio Correctamente."));
                       folioUnico=null;
                   
                   
                   
                   }catch (Exception e) {
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
           
                 
                 break;
                 
                 
             case "Cancelar":
                 
                 
                   String estatusC="3";
                   int folioC =Integer.parseInt(folioUnico);
                 
                   this.session = null;
                   this.transaction = null;
                   
                   
                   try{
                       
                       DaoFormatos daoFormatos=new DaoFormatos();
                       
                       this.session = HibernateUtil.getSessionFactory().openSession();
                       this.transaction = this.session.beginTransaction();
                       
                       
                       
                           Formatos  formatoE=daoFormatos.existeFormato(session, folioC,formato);
        
                     //System.out.print("este es el folio existente"+formatoE.getFolio());
                    if(formatoE==null){
            
                 FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El Folio No se encuentra registrado"));    
                folioUnico=null;
           // RequestContext.getCurrentInstance().reset("form:panel");
            return;
            
            }
                    daoFormatos.cancelaFolioUnico(session, folioC, estatusC);
                    this.transaction.commit();   
                      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se Canceló su Folio Correctamente."));
                    folioUnico=null;
                      
                   }catch (Exception e) {
                    if (this.transaction != null) {
                        this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas" + e.getMessage()));
            return;
            }finally {
            if (this.session != null) {
                session.close();
            }
        }
            break;
            
        
            
        }//fin de switch
        
       
      //fin metodo
        
    }
         
    
    

}
