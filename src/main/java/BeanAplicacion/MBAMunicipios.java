package BeanAplicacion;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Dao.DaoAdministracionE;
import HibernateUtil.HibernateUtil;
import Pojos.Estados;
import Pojos.Municipios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import BeanVista.MBAdminstracionE;


@ManagedBean(name = "mBAMunicipios", eager = true)
@ApplicationScoped

public class MBAMunicipios {
	
	
	 // @ManagedProperty("#{MBAdminstracionE}")
	  //  private MBAdminstracionE bean1;
	
	private Transaction transaction;    
    private Session session;
    
    private List <Municipios> listaMunicipios;
    
    List<Municipios>MunicipiosIniciales;
    
    
    
    
    
    @PostConstruct
    public void init() {
    	
    	// MBAColonias mbAColonias = (MBAColonias) fc.getExternalContext().getApplicationMap().get("mBAColonias");
    
    	List<Municipios> allMunicipios = getMuni();
        MunicipiosIniciales= new ArrayList<Municipios>();
        
        Iterator<Municipios> it = allMunicipios.iterator();
        
        while(it.hasNext()){
        	MunicipiosIniciales.add(it.next());
        	
        }
        }
    
    
    
 
    public  List<Municipios>getMuni(){
  	  this.session = null;
        this.transaction = null;
        
        try {
            DaoAdministracionE daoAdministracion = new DaoAdministracionE();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            listaMunicipios= daoAdministracion.getMuni(this.session);
           this.transaction.commit();

            return this.listaMunicipios;

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

	public List<Municipios> getListaMunicipios() {
		return listaMunicipios;
	}

	public void setListaMunicipios(List<Municipios> listaMunicipios) {
		this.listaMunicipios = listaMunicipios;
	}

	public List<Municipios> getMunicipiosIniciales() {
		return MunicipiosIniciales;
	}

	public void setMunicipiosIniciales(List<Municipios> municipiosIniciales) {
		MunicipiosIniciales = municipiosIniciales;
	}
    
    
    
    

}
