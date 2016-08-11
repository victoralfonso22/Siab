package BeanVista;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.hibernate.Session;
import org.hibernate.Transaction;

// ahora voy yo
import Dao.DaoAdministracionColab;
import Dao.DaoAdministracionE;
import HibernateUtil.HibernateUtil;
import Pojos.CodigoPostal;
import Pojos.ColaboradoresHistorial;
import Pojos.Estados;
import Pojos.Localidades;
import Pojos.Municipios;
import Pojos.Referencias;
import Pojos.Promotores;



@ManagedBean
@Named(value = "mBAdministracionColab")
@ViewScoped

public class MBAdministracionColab implements Serializable{

	  private Session session;
	  private Transaction transaction;
	  private ColaboradoresHistorial colaborador;
	  private List<ColaboradoresHistorial>listaColab;
	  private List<ColaboradoresHistorial>colabprep = new  ArrayList();
	
	  
	  private String rfc;
	  private String nombre;
	  private String paterno;
	  private String materno;
	  private Date nacimiento;
	  private String correo;
	  
	  private String calle;
	  private String nexterior;
	  private  String ninterior;
	   
	  
	  private int estado;
	  private Estados lugar;
	  
	  private int municipio;
	  private Municipios muni;
	  private Localidades colonia;
	  private Localidades colonias;
	  
	
	  private int cp;
	  
	  private CodigoPostal codigo;
	 
	  
	  
	  private String tel;
	  private  String telO;
	  private String  ext;
	  private String cel;
	  
	  
	  private int tipocol;
	   
	  private Referencias ref;
	  
	  private ColaboradoresHistorial colab;
	  private List<ColaboradoresHistorial>listacolab;
	  
	  private List<Estados>listaestados;
	  private List<Municipios>listamunicipios;
	  private List<Localidades>listaColonias;
	  
	  private List<CodigoPostal>listacodigos;
	  private List<Promotores>listapromotores;
	  private List<Referencias>listareferencias;
	  
	  private Promotores ejecutivo;
	  private Referencias referencia;
	  
	  
	  
/////QUITANDO ESPACIOS GET Y SET    
	 ///////nueva linea
 
	  
	  
  
	  
	public Localidades getColonias() {
		return colonias;
	}
	public List<Referencias> getListareferencias() {
		return listareferencias;
	}
	public void setListareferencias(List<Referencias> listareferencias) {
		this.listareferencias = listareferencias;
	}
	public List<Promotores> getListapromotores() {
		return listapromotores;
	}
	public void setListapromotores(List<Promotores> listapromotores) {
		this.listapromotores = listapromotores;
	}
	public Promotores getEjecutivo() {
		return ejecutivo;
	}
	public void setEjecutivo(Promotores ejecutivo) {
		this.ejecutivo = ejecutivo;
	}
	public Referencias getReferencia() {
		return referencia;
	}
	public void setReferencia(Referencias referencia) {
		this.referencia = referencia;
	}
	public void setColonias(Localidades colonias) {
		this.colonias = colonias;
	}
	public Localidades getColonia() {
		return colonia;
	}
	public void setColonia(Localidades colonia) {
		this.colonia = colonia;
	}
	public CodigoPostal getCodigo() {
		return codigo;
	}
	public void setCodigo(CodigoPostal codigo) {
		this.codigo = codigo;
	}
	public List<CodigoPostal> getListacodigos() {
		return listacodigos;
	}
	public void setListacodigos(List<CodigoPostal> listacodigos) {
		this.listacodigos = listacodigos;
	}
	
	public Municipios getMuni() {
		return muni;
	}
	public void setMuni(Municipios muni) {
		this.muni = muni;
	}
	public List<Municipios> getListamunicipios() {
		return listamunicipios;
	}
	public void setListamunicipios(List<Municipios> listamunicipios) {
		this.listamunicipios = listamunicipios;
	}
	public Estados getLugar() {
		return lugar;
	}
	public void setLugar(Estados lugar) {
		this.lugar = lugar;
	}
	public List<Estados> getListaestados() {
		return listaestados;
	}
	public void setListaestados(List<Estados> listaestados) {
		this.listaestados = listaestados;
	}
	public List<ColaboradoresHistorial> getColabprep() {
		return colabprep;
	}
	public void setColabprep(List<ColaboradoresHistorial> colabprep) {
		this.colabprep = colabprep;
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
	public List<ColaboradoresHistorial> getListaColab() {
		return listaColab;
	}
	public void setListaColab(List<ColaboradoresHistorial> listaColab) {
		this.listaColab = listaColab;
	}
	public Date getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNexterior() {
		return nexterior;
	}
	public void setNexterior(String nexterior) {
		this.nexterior = nexterior;
	}
	public String getNinterior() {
		return ninterior;
	}
	public void setNinterior(String ninterior) {
		this.ninterior = ninterior;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getMunicipio() {
		return municipio;
	}
	public void setMunicipio(int municipio) {
		this.municipio = municipio;
	}
	
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getTelO() {
		return telO;
	}
	public void setTelO(String telO) {
		this.telO = telO;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getCel() {
		return cel;
	}
	public void setCel(String cel) {
		this.cel = cel;
	}
	public int getTipocol() {
		return tipocol;
	}
	public void setTipocol(int tipocol) {
		this.tipocol = tipocol;
	}
	public Referencias getRef() {
		return ref;
	}
	public void setRef(Referencias ref) {
		this.ref = ref;
	}
	public ColaboradoresHistorial getColaborador() {
		return colaborador;
	}
	public void setColaborador(ColaboradoresHistorial colaborador) {
		this.colaborador = colaborador;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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

    
    public List<ColaboradoresHistorial> completeColab(String query) {
        List<ColaboradoresHistorial> allColab = getColaboradores();
        List<ColaboradoresHistorial> filteredColab = new ArrayList<ColaboradoresHistorial>();
                 
        for (int i = 0; i < allColab.size(); i++) {
            ColaboradoresHistorial us = allColab.get(i);
            if (us.getNombres().toLowerCase().startsWith(query)) {
                filteredColab.add(us);
            }
        }
        return filteredColab;
    }
    

    public List<ColaboradoresHistorial> getColaboradores() {
        this.session = null;
        this.transaction = null;

        try {
        	DaoAdministracionColab daoColab=new DaoAdministracionColab();
            
        	

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            listacolab = daoColab.getcolaboradores(this.session);

            this.transaction.commit();

            return listacolab;

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
    
    
    
    
    
    public  void  agregacolab(){
    	
    	this.colabprep.add(this.colaborador);
   }
    
    public List<Estados> completeLugar(String query) {
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
    
    
    
public  void generaMunicipios(){   

System.out.print("aki esta el estado "+lugar.getNombre()+"jejeje");
this.listamunicipios=getMunicipios(this.lugar.getId());
System.out.print(listamunicipios);
} 


public List<Municipios> completeMuni(String query) {
	List<Municipios> allMunicipios = getMunicipios(this.lugar.getId());
    List<Municipios> filteredMunicipios = new ArrayList<Municipios>();
    for (int i = 0; i < allMunicipios.size(); i++) {
        Municipios us = allMunicipios.get(i);
        if (us.getNombre().toLowerCase().startsWith(query)) {
            filteredMunicipios.add(us);
        }
    }
    return filteredMunicipios;
}



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


public  void generaColonias(){   
System.out.print("aki esta el id de municipio jajaja"+ " "+muni.getNombre()+muni.getId());
//listaColonias=getLocalidades(muni.getId());

}
/*
public List<Localidades> completeColonia(String query) {
    List<Localidades> allColonias = getLocalidades(this.muni.getId());
    List<Localidades> filteredColonias = new ArrayList<Localidades>();
    for (int i = 0; i < allColonias.size(); i++) {
        Localidades us = allColonias.get(i);
        if (us.getNombre().toLowerCase().startsWith(query)) {
            filteredColonias.add(us);
        }
    }
    return filteredColonias;
}*/






public List<Localidades> completaColonias(String query) {
    List<Localidades> allColonias = getColonias(this.muni.getId());
    List<Localidades> filteredColonias = new ArrayList<Localidades>();
    for (int i = 0; i < allColonias.size(); i++) {
        Localidades us = allColonias.get(i);
        if (us.getNombre().toLowerCase().startsWith(query)) {
            filteredColonias.add(us);
        }
    }
    return filteredColonias;
}


public List<Localidades>getColonias(int idmun){
	   this.session = null;
	   this.transaction = null;
	   
	   
	   
	   try {
	        DaoAdministracionColab daoAdministracion = new DaoAdministracionColab();

	        this.session = HibernateUtil.getSessionFactory().openSession();
	        this.transaction = this.session.beginTransaction();

	       listaColonias= daoAdministracion.getcolonias(session, idmun);
	        
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
public void EscribeColonia(){
	
	System.out.print("la colonia tomala "+this.colonias.getNombre());
		
}




////genera   codigos postales


/*
public  void generaColonias(){   
System.out.print("aki esta el id de municipio jajaja"+ " "+muni.getNombre()+muni.getId());
listaColonias=getLocalidades(muni.getId());




public  void generaCodigosPostal(){   
System.out.print("aki esta el id decolonia jajaja"+ " "+coloni.getNombre()+coloni.getId());
listacodigos=getCodigos(coloni.getIdMunicipio() );

}

public  void generaCodigos(){
System.out.print("aki esta la colonia jajaja"+coloni.getNombre());
listacodigos=getCodigos(coloni.getIdMunicipio());
}
*/




public List<CodigoPostal> completeCodigo(String query) {
    List<CodigoPostal> allCodigos = getCodigos(this.colonias.getId());
    List<CodigoPostal> filteredCodigos = new ArrayList<CodigoPostal>();
             
    for (int i = 0; i < allCodigos.size(); i++) {
        CodigoPostal us = allCodigos.get(i);
        if (us.getCp().toLowerCase().startsWith(query)) {
            filteredCodigos.add(us);
        }
    }
    return filteredCodigos;
}

public  List<CodigoPostal>getCodigos(){
    
  this.session = null;
  this.transaction = null;
  
  try {
      DaoAdministracionColab daoAdministracionColab = new DaoAdministracionColab();

      this.session = HibernateUtil.getSessionFactory().openSession();
      this.transaction = this.session.beginTransaction();
      
      
   
      listacodigos=daoAdministracionColab.getcodigos(this.session);
    
      
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

public  List<CodigoPostal>getCodigos(int id){
    
	  this.session = null;
	  this.transaction = null;
	  
	  try {
	      DaoAdministracionColab daoAdministracionColab = new DaoAdministracionColab();

	      this.session = HibernateUtil.getSessionFactory().openSession();
	      this.transaction = this.session.beginTransaction();
	      
	      
	   
	      listacodigos=daoAdministracionColab.getCodigos(this.session, id);
	    
	      
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



public List<Promotores> completePromotor(String query) {
    List<Promotores> allPromotores = getPromotores();
    List<Promotores> filteredPromotores = new ArrayList<Promotores>();
             
    for (int i = 0; i < allPromotores.size(); i++) {
        Promotores us = allPromotores.get(i);
        if (us.getNombres().toLowerCase().startsWith(query)) {
            filteredPromotores.add(us);
        }
    }
    return filteredPromotores;
}

public List<Promotores> getPromotores() {
    this.session = null;
    this.transaction = null;

    try {
    	DaoAdministracionColab daocolab=new DaoAdministracionColab();
        
    	

        this.session = HibernateUtil.getSessionFactory().openSession();
        this.transaction = this.session.beginTransaction();

        listapromotores = daocolab.getPromotores(session);

        this.transaction.commit();

        return listapromotores;

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

public List<Referencias> completeReferencia(String query) {
    List<Referencias> allReferencias = getReferencias();
    List<Referencias> filteredReferencias = new ArrayList<Referencias>();
             
    for (int i = 0; i < allReferencias.size(); i++) {
        Referencias us = allReferencias.get(i);
        if (us.getReferencia().toLowerCase().startsWith(query)) {
            filteredReferencias.add(us);
        }
    }
    return filteredReferencias;
}



public List<Referencias> getReferencias() {
    this.session = null;
    this.transaction = null;

    try {
    	DaoAdministracionColab daocolab=new DaoAdministracionColab();
        
    	

        this.session = HibernateUtil.getSessionFactory().openSession();
        this.transaction = this.session.beginTransaction();

        listareferencias = daocolab.getReferencias(session);

        this.transaction.commit();

        return listareferencias;

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























public  void escribeCodigo(){   
System.out.print("aki esta el codigo postal"+codigo.getCp());
}





    
    
    public void AltaColaborador(){
    	
 	
    	
    }
    
	  
	  
	  
	  
	
}
