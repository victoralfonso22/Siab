
package BeanVista;


import Dao.DaoAdministracionE;
import HibernateUtil.HibernateUtil;
import Pojos.CodigoPostal;
import Pojos.Estados;
import Pojos.Localidades;
import Pojos.Municipios;
import Pojos.Promotores;
import Pojos.PromotoresHistorial;
import Pojos.Regiones;
import Pojos.Sectores;
import Pojos.Usuarios;
import Pojos.ViewLocalidadCp;
import static com.sun.faces.facelets.util.Path.context;

import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.application.NavigationHandler;
import javax.faces.application.ViewHandler;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.apache.taglibs.standard.tag.common.fmt.FormatDateSupport;
import org.hibernate.Session;
import org.hibernate.Transaction;

import sun.misc.resources.Messages_it;

/**
 *
 * @author Soporte 07
 */
@ManagedBean
@Named(value = "mBAdminstracionE")
@ViewScoped
public class MBAdminstracionE implements Serializable {
    
    private Session session;
   private Transaction transaction;
    
   // @Min(10) @Max(13)
   
    //@Pattern(regexp="[A-Z]{3,4}[ \\-]?[0-9]{2}((0{1}[1-9]{1})|(1{1}[0-2]{1}))((0{1}[1-9]{1})|([1-2]{1}[0-9]{1})|(3{1}[0-1]{1}))[ \\-]?[A-Z0-9]{3}", message="El RFC no cumple el formato") 
    private String rfc;
    

    
    private String nombre;
    private String paterno;
    private String materno;
    
    @Past(message = "La Fecha no es correcta ")
    private Date  fechanaci;
    
  private String correo;
    
    private String calle;
    private String numE;
    private String numI;
    private int idestado;
    
    
    private int eidestado;
    
    
    private int idMun;
    
    private int idmunE;
  
    private int localidad;
    private int localidadE;
    
    
    private int cp;
    private int cpE;
    
    
    private String telC;
    private String telO;
    private String ext;
    
    private String cel;
    
    
    private int idregion;
    private String tipo;
    private int meta;
    private Double comision;
    
    private Estados estado;
    private Municipios municipio;

    private Localidades colonia; 
    
    

    private List<Estados>listaestados;
    private List<Municipios>listamunicipios;
    private List<Municipios>listamunicipiosE;
    private List<Localidades>listaColonias;
    private List<Localidades>listaColoniasE;
    private List<CodigoPostal>listacodigos;
    private List<CodigoPostal>listacodigosE;
    
    private List<Promotores> tablapromotores;
    private Promotores promotor;
        
      
        
        
        
        
        

    public Municipios getMunicipio() {
			return municipio;
		}




		public void setMunicipio(Municipios municipio) {
			this.municipio = municipio;
		}




	public Estados getEstado() {
			return estado;
		}




		public void setEstado(Estados estado) {
			this.estado = estado;
		}




	public int getCpE() {
        return cpE;
    }

    
    
    
    public void setCpE(int cpE) {
        this.cpE = cpE;
    }
        
        
        

    public int getLocalidadE() {
        return localidadE;
    }

    public void setLocalidadE(int localidadE) {
        this.localidadE = localidadE;
    }

    public List<CodigoPostal> getListacodigosE() {
        return listacodigosE;
    }

    public void setListacodigosE(List<CodigoPostal> listacodigosE) {
        this.listacodigosE = listacodigosE;
    }

        
        
        
    public int getIdmunE() {
        return idmunE;
    }

    public void setIdmunE(int idmunE) {
        this.idmunE = idmunE;
    }

    public List<Localidades> getListaColoniasE() {
        return listaColoniasE;
    }

    public void setListaColoniasE(List<Localidades> listaColoniasE) {
        this.listaColoniasE = listaColoniasE;
    }

   
    public List<Municipios> getListamunicipiosE() {
        return listamunicipiosE;
    }

    public void setListamunicipiosE(List<Municipios> listamunicipiosE) {
        this.listamunicipiosE = listamunicipiosE;
    }

    
        
        
        public int getEidestado() {
        return eidestado;
    }

    public void setEidestado(int eidestado) {
        this.eidestado = eidestado;
    }
    
        
        
    
    
    public Promotores getPromotor() {
        return promotor;
    }

    public void setPromotor(Promotores promotor) {
        this.promotor = promotor;
    }

   
    
    
    
    
    public List<Promotores> getTablapromotores() {
        return tablapromotores;
    }

    public void setTablapromotores(List<Promotores> tablapromotores) {
        this.tablapromotores = tablapromotores;
    }
    
   public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

  
    
    
    
    
    
  

    private List<Regiones>regiones;

    public Localidades getColonia() {
        return colonia;
    }

    public void setColonia(Localidades colonia) {
        this.colonia = colonia;
    }

    public List<CodigoPostal> getListacodigos() {
        return listacodigos;
    }

    public void setListacodigos(List<CodigoPostal> listacodigos) {
        this.listacodigos = listacodigos;
    }

    
    public int getIdMun() {
        return idMun;
    }

    public void setIdMun(int idMun) {
        this.idMun = idMun;
    }
   

    public List<Regiones> getRegiones() {
        return regiones;
    }

    public void setRegiones(List<Regiones> regiones) {
        this.regiones = regiones;
    }
    
    

    public List<Localidades> getListaColonias() {
        return listaColonias;
    }

    public void setListaColonias(List<Localidades> listaColonias) {
        this.listaColonias = listaColonias;
    }

    
    public List<Municipios> getListamunicipios() {
        return listamunicipios;
    }

    public void setListamunicipios(List<Municipios> listamunicipios) {
        this.listamunicipios = listamunicipios;
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

    public List<Estados> getListaestados() {
        return listaestados;
    }

    public void setListaestados(List<Estados> listaestados) {
        this.listaestados = listaestados;
    }
    
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumE() {
        return numE;
    }

    public void setNumE(String numE) {
        this.numE = numE;
    }

    public String getNumI() {
        return numI;
    }

    public void setNumI(String numI) {
        this.numI = numI;
    }

    public int getIdestado() {
        return idestado;
    }

    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }



    public int getLocalidad() {
        return localidad;
    }

    public void setLocalidad(int localidad) {
        this.localidad = localidad;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getTelC() {
        return telC;
    }

    public void setTelC(String telC) {
        this.telC = telC;
    }

    public String getTelO() {
        return telO;
    }

    public void setTelO(String telO) {
        this.telO = telO;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public int getIdregion() {
        return idregion;
    }

    public void setIdregion(int idregion) {
        this.idregion = idregion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMeta() {
        return meta;
    }

    public void setMeta(int meta) {
        this.meta = meta;
    }

    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }
    
    
    public Date getFechanaci() {
        return fechanaci;
    }

    public void setFechanaci(Date fechanaci) {
        this.fechanaci = fechanaci;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
 public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    
    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
   //contructor

    public MBAdminstracionE() {
        
        listaestados=getEstados();
        regiones=getListaregiones();
        tablapromotores=gettablaPromotorres();
      
   
    }
    
    public String ircambios() {
    	
    	System.out.print("invoco al metodo");
    	 return "/eventas/CambiosEventas.xhtml?faces-redirect=true";
    	
    	
    	//HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
    	//response.sendRedirect("/eventas/CambiosEventas.xhtml");
    	//FacesContext.getCurrentInstance().getExternalContext().redirect("/eventas/CambiosEventas.xhtml");
    }
    
    
    public void listener() {
        // ...
        FacesContext fc = FacesContext.getCurrentInstance();
        NavigationHandler nh = fc.getApplication().getNavigationHandler();
        nh.handleNavigation(fc, null, "/eventas/CambiosEventas.xhtml?faces-redirect=true");
    }
    
    public String direccion(){
    	System.out.print("llego");
    	  return "menuPrincipal/menuPrincipal.xhtml";
    }
    
    
    
        public List<Estados> getEstados() {
        this.session = null;
        this.transaction = null;

        try {
            DaoAdministracionE daoadministracionE = new DaoAdministracionE();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            listaestados= daoadministracionE.getEstados(this.session);
            
          this.transaction.commit();

            return this.listaestados;

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
        
      /*  public List<Estados> completaEstados(String query) {
            List<Estados> allEstados = getEstados();
            List<Estados> filteredEstados = new ArrayList<Estados>();
                     
            for (int i = 0; i < allEstados.size(); i++) {
                Estados us = allEstados.get(i);
                if (us.getNombre().toLowerCase().startsWith(query)) {
                    filteredEstados.add(us);
                }
            }
            return filteredEstados;
        }*/
        
        public List<Estados> completeEsta(String query) {
            List<Estados> allEstados = getEstados();
            List<Estados> filteredEstados = new ArrayList<Estados>();
                     
            for (int i = 0; i < allEstados.size(); i++) {
                Estados us = allEstados.get(i);
                if (us.getNombre().toLowerCase().startsWith(query)) {
                    filteredEstados.add(us);
                }
            }
            return filteredEstados;
        }
        
        
        
        
        
        
        
        
 public  void generaMunicipios(){   
    
    System.out.print("aki esta el id de estado"+idestado);
    this.listamunicipios=getMunicipios(idestado);
    
    
 } 
 
  public  void generaMunicipiosE(){   
    
    System.out.print("aki esta el id de estado"+eidestado);
    this.listamunicipiosE=getMunicipios(eidestado);
    
    
 }  
 
  
  
  /*public void stateChangeListener(ValueChangeEvent event) {
        if (event.getNewValue() != idestado) {
            selectedCity = null;
        }
    }*/
 
 
 
  public  List<Municipios>getMunicipios(int idEstadoM){
        
        this.session = null;
        this.transaction = null;
        
        try {
            DaoAdministracionE daoAdministracion = new DaoAdministracionE();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            listamunicipios= daoAdministracion.getMunicipios(this.session,idEstadoM);
           this.transaction.commit();

            return this.listamunicipios;

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
  
  //auto completar municipios
  
  public  List<Municipios>getMuni(){
	  this.session = null;
      this.transaction = null;
      
      try {
          DaoAdministracionE daoAdministracion = new DaoAdministracionE();

          this.session = HibernateUtil.getSessionFactory().openSession();
          this.transaction = this.session.beginTransaction();

          listamunicipios= daoAdministracion.getMuni(this.session);
         this.transaction.commit();

          return this.listamunicipios;

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
  
  ///experimento
  public List<Municipios> completeMuni(String query) {
	  
	
      List<Municipios> allMunicipios = getMuni();
      List<Municipios> filteredMunicipios = new ArrayList<Municipios>();
               
      for (int i = 0; i < allMunicipios.size(); i++) {
          Municipios us = allMunicipios.get(i);
          if (us.getNombre().toLowerCase().startsWith(query)) {
              filteredMunicipios.add(us);
          }
      }
      return filteredMunicipios;
  }
  
  
  
  
  
  
  
  
  public List<Regiones>getListaregiones(){
        this.session = null;
        this.transaction = null;

        try {
            DaoAdministracionE daoadministracionE = new DaoAdministracionE();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            regiones= daoadministracionE.getRegiones(session);
            
          this.transaction.commit();

            return this.regiones;

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
  
    public  void generaColonias(){   
    
    System.out.print("aki esta el id de municipio 2"+ " "+idMun);
    
   
    listaColonias=getLocalidades(idMun);
    
 }
    
      public  void generaColoniasE(){   
    
    System.out.print("aki esta el id de municipio 2"+ " "+idmunE);
   listaColoniasE=getLocalidades(idmunE);
    
 }
    
    
    
    
    
   public void generaCp(){
       System.out.print("genera codigos del ide "+ " "+localidad);
       
       this.listacodigos=getCodigos(localidad);
       
       
   } 
   
   
   
      public void generaCpE(){
       System.out.print("genera codigos del ide "+ " "+localidadE);
       
       this.listacodigosE=getCodigos(localidadE);
       
       
   } 
   
   
   
    
   public  List<Localidades>getLocalidades(int idMunR ){
        
        this.session = null;
        this.transaction = null;
        
        try {
            DaoAdministracionE daoAdministracion = new DaoAdministracionE();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

           listaColonias= daoAdministracion.getLocalidades(session, idMunR);
            
           this.transaction.commit();

            return listaColonias;

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
   
   //completa   colonias
   
   
   public List<Localidades> completeColonia(String query) {
	      List<Localidades> allColonias = getColonias();
	      List<Localidades> filteredColonias = new ArrayList<Localidades>();
	               
	      for (int i = 0; i < allColonias.size(); i++) {
	          Localidades us = allColonias.get(i);
	          if (us.getNombre().toLowerCase().startsWith(query)) {
	              filteredColonias.add(us);
	          }
	      }
	      return filteredColonias;
	  }
	  
	  
   public  List<Localidades>getColonias(){
       
       this.session = null;
       this.transaction = null;
       
       try {
           DaoAdministracionE daoAdministracion = new DaoAdministracionE();

           this.session = HibernateUtil.getSessionFactory().openSession();
           this.transaction = this.session.beginTransaction();

          listaColonias= daoAdministracion.getColonias(session);
           
          this.transaction.commit();

           return listaColonias;

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
   
 
   ///termina acompleta  de colonias
   
   
   
   
   
   
   
      public  List<CodigoPostal>getCodigos(int idcolonia ){
          
          System.out.print("llego el id de colonia "+idcolonia);
        
        this.session = null;
        this.transaction = null;
        
        try {
            DaoAdministracionE daoAdministracion = new DaoAdministracionE();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            
            
            
            this.colonia=daoAdministracion.getColonia(session, idcolonia);
            System.out.print("aki va el obejto colonia"+colonia.getId());
            

           listacodigos= daoAdministracion.getCodigos(session, idcolonia);
            
           this.transaction.commit();

            return listacodigos;

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
      
      //complete  codigos  postales
      
      public List<Localidades> completeCodigo(String query) {
	      List<Localidades> allColonias = getColonias();
	      List<Localidades> filteredColonias = new ArrayList<Localidades>();
	               
	      for (int i = 0; i < allColonias.size(); i++) {
	          Localidades us = allColonias.get(i);
	          if (us.getNombre().toLowerCase().startsWith(query)) {
	              filteredColonias.add(us);
	          }
	      }
	      return filteredColonias;
	  }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
 
     
     
     public void GeneraPromotor(){
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    String fnacido= sdf.format(fechanaci); 
    
    
   SimpleDateFormat sdh = new SimpleDateFormat("dd/MM/yyyy");
   String fechaSistema = sdh.format(new Date()); 
   
   System.out.print(rfc+""+nombre+" "+paterno+" "+materno+""+fechanaci+" "+correo+" "+calle+" "+numE+" "+numI+" "+idestado+" "+idMun+" "+localidad+" "+cp+" "+telC+" "+telO+" "+ext+" "+cel+" "+idregion+" "+tipo+" "+meta+" "+comision);
  
     }
     

    
    public void agregarUS(){
        
        
        
        
    this.session = null;
    this.transaction = null;
    
    
    
    
    
    
      try {
          
          
          
            DaoAdministracionE daoAdministracion = new DaoAdministracionE();
             
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            
             boolean valor =daoAdministracion.validaPromotor(session, rfc);
           //String res=promotorE.getRfc();
            
           System.out.print(valor);
           
          
            if (valor==true) {
            
             FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El RFC de Promotor ya Existe ."));
              return;
            
            
            }
           

            CodigoPostal codigo2 =new CodigoPostal();
            codigo2.setId(cp);
            
            Estados estado2 =new Estados();
            estado2.setId(idestado);
           
            Localidades idlocal2=new Localidades();
            idlocal2.setId(localidad);
           
            Municipios municipio2 =new Municipios();
            municipio2.setId(idMun);
           
            Regiones  region2=new Regiones();
            region2.setId(idregion);
           
            Sectores sectores= new Sectores();
            sectores=null;
           
           Regiones CortoRegion=daoAdministracion.getRegion(session, idregion);
           String siglas=CortoRegion.getNombreCorto();
           
           String clave="";
           
           if("1".equals(tipo)){
               
           
                    Integer cont = daoAdministracion.getContador(session, tipo);
                    cont=cont+1;
                    
                    String contador =Integer.toString(cont);
            
            switch (contador.length() ) {
           
           case 1:
        	   clave=siglas+"00"+contador;
               
               break;
          case 2:
        	  clave=siglas+"0"+contador;
              
               break;
          case 3:
        	  clave=siglas+contador;
               break;
              
         
          }
                    
 
           }else{
               
               
                        Integer cont = daoAdministracion.getContador(session, tipo);
                        cont=cont+1;
                        
                        
                        String contador =Integer.toString(cont);
                        
                        switch (contador.length() ) {
                       
                       case 1:
                    	   clave="E"+siglas+"00"+contador; 
                           
                           break;
                      case 2:
                    	  clave="E"+siglas+"0"+contador; 
                          
                           break;
                      case 3:
                    	  clave="E"+siglas+contador; 
                           break;
                          
                     
                      }
                            
           }
           
           //se  crea  el objeto   con datos  correspondientes 
           
         HttpSession sesion = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
         Integer idusuario= Integer.parseInt(sesion.getAttribute("idUsuario").toString());
         Date fechasis=new Date();
            
         System.out.print(ext);
         
         
         Promotores p2 = new Promotores();
         p2.setRfc(rfc.toUpperCase());
         p2.setNombres(nombre.toUpperCase());
         p2.setApellidoPaterno(paterno.toUpperCase());
         p2.setApellidoMaterno(materno.toUpperCase());
         p2.setFechaNacimiento( fechanaci);
         
         
         p2.setCalle(calle.toUpperCase());
         p2.setNumeroExterior(numE);
         p2.setNumeroInterior(numI);
         p2.setIdEstado(idestado);
         p2.setIdMunicipio(idMun);
         
         p2.setIdLocalidad(localidad);
         p2.setIdCodigoPostal(cp);
         p2.setCorreo(correo);
         p2.setTelefonoCasa(telC);
         p2.setTelefonoOficina(telO);
       //  p2.set extension 
         
         p2.setCelular(cel);
         p2.setIdRegion(idregion);
         p2.setTipo(tipo);
         p2.setMeta(meta);
         p2.setComision(comision);
         
         p2.setClave(clave);
         p2.setFechaAlta(fechasis);
         p2.setExt(ext);
        /* 
       Promotores p =new Promotores(codigo2,estado2,municipio2 ,idlocal2 , region2,
                sectores, clave, nombre.toUpperCase(), paterno.toUpperCase(), materno.toUpperCase(),
                fechanaci, calle.toUpperCase(), numI, numE, null, 
                tipo, telC, telO, ext, cel,
                correo, rfc.toUpperCase(), fechasis,idusuario, 1,
                null, meta, comision, null, null, 
                null, null, null,null, null,
                null, null, null, null, null, null, null);
       
       */
       
       
       
       
        /*
        
           Promotores p =new Promotores(codigo2,estado2,municipio2 ,idlocal2 , region2,
                sectores, clave, nombre.toUpperCase(), paterno.toUpperCase(), materno.toUpperCase(),
                fechanaci, calle.toUpperCase(), numI, numE, idSector, 
                tipo, telC, telO, extension, cel,
                correo, rfc.toUpperCase(), fechasis, idus, estatus,
                observaciones, meta, comision, tipoEnlace, carrera, 
                matricula, numeroPersonal, idPromotorpadre, replica, publicoGeneral,
                null, null, null, null, null, null, null);
        
         */
      daoAdministracion.AltaPromotor(session, p2);
            
           this.transaction.commit();
    
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información :", "Promotor Registrado Correctamente"));
           
           
          //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se Registro Promotor" +p.getNombres()+ "Correctamente."));

         rfc=null;
         nombre=null;
         paterno=null;
         materno=null;
         fechanaci=null;
         correo=null;
         calle=null;
         numE=null;
         numI=null;
         idestado=0;
         idMun=0;
         localidad=0;
         cp=0;
         telC=null;
         telO=null;
         ext=null;
         cel=null;
         idregion=0;
         tipo=null;
        meta=0;
        comision=null;
        /*  
        FacesContext fc = FacesContext.getCurrentInstance();
        String refreshpage = fc.getViewRoot().getViewId();
        ViewHandler ViewH = fc.getApplication().getViewHandler();
        UIViewRoot UIV = ViewH.createView(fc, refreshpage);
        UIV.setViewId(refreshpage);
        fc.setViewRoot(UIV);
        
         */
                    FacesContext context = FacesContext.getCurrentInstance();
            String viewId = context.getViewRoot().getViewId();
            ViewHandler handler = context.getApplication().getViewHandler();
            UIViewRoot root = handler.createView(context, viewId);
            root.setViewId(viewId);
            context.setViewRoot(root);
 

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
    
    
    
    
    
    public void limpiar(){
         rfc=null;
         nombre=null;
         paterno=null;
         materno=null;
         fechanaci=null;
         correo=null;
         calle=null;
         numE=null;
         numI=null;
         idestado=0;
         idMun=0;
         localidad=0;
         cp=0;
         telC=null;
         telO=null;
         ext=null;
         cel=null;
         idregion=0;
         tipo=null;
        meta=0;
        comision=null;
    
        
    }
    
    public List <Promotores>gettablaPromotorres(){
        
        
        
       this.session = null;
        this.transaction = null;

        try {
            DaoAdministracionE daoadministracion = new DaoAdministracionE();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            tablapromotores= daoadministracion.getPromotores(this.session);
            
          this.transaction.commit();

            return this.tablapromotores;

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
    
    
    
    public void guardaCambios(){
        
        System.out.print("invoco al metodo de guardar");
        
        
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información :", "LLegaron los cambios"));
        
        
        
        
        
    }
    
    
    public void cambiosPromotor(){
    this.session = null;
    this.transaction = null;
        
     String rfc=promotor.getRfc();
     String nom=promotor.getNombres();
   
     String aPaterno=this.promotor.getApellidoPaterno();
     String aMaterno=this.promotor .getApellidoMaterno();
     
      Date fnaci=this.promotor.getFechaNacimiento();
     
     String calle=this.promotor. getCalle();
     String numE=this.promotor.getNumeroExterior();
     String numI=this.promotor.getNumeroInterior();
     
     int estado=eidestado;
     int mun =idmunE;
     int colonia=localidadE;
     int cp =cpE;
     
     
     //codigo postal
     String telC=this.promotor.getTelefonoCasa();
     String telO=this.promotor.getTelefonoOficina();
     String ext=this.promotor.getExt();
     //String ext=this.promotor.getExt(); considerar extension
     
       /*
     String cel=this.promotor.getCelular();
     //region
     //tipopromotor
     int met=this.promotor.getMeta();
     double comi=promotor.getComision();
     
     
     */

     try {
            DaoAdministracionE daoadministracion = new DaoAdministracionE();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            session.flush();
            
            
           if (estado==0){
        	   
        	   estado= this.promotor.getIdEstado();
               //estado=this.promotor.getEstados().getId();
               
               
              // estado=this.promotor.getEstados();
               
           }if(mun==0){
               mun=this.promotor.getIdMunicipio();
                //mun=this.promotor.getMunicipios().getId();
               
               
               
           } if (colonia==0){
        	   colonia=this.promotor.getIdLocalidad();
            
               //colonia=this.promotor.getLocalidades().getId();
               
           } if (cp==0){
        	   cp=this.promotor.getIdCodigoPostal();
               //cp=this.promotor.getCodigoPostal().getId();
               
           }
            
            
            
            
            daoadministracion.editaPromotor(session, this.promotor.getId(),rfc.toUpperCase(), nom.toUpperCase(),aPaterno.toUpperCase(),aMaterno.toUpperCase(),fnaci,calle.toUpperCase(),numE,numI,
                   estado,mun,colonia,cp,
                    telC,telO,ext);
            //,telC,telO,ext
            this.transaction.commit();
          
          FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información :", "Se realizaron cambios Correctamente"));
      

           // return this.tablapromotores;

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
        
        
    
     
     
     
     
     
     /*
     
     
     
 
     String exten=this.promotor.getExt();
     
     System.out.print("invoco al metodo de guardar"+nombre+exten+idmunE+localidadE+cpE);  
     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información :", "LLegaron los cambios"));
      
     */
     
     
     
     
        
        
    }
    
}
