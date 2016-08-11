package BeanAplicacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;



import javax.faces.context.FacesContext;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Dao.DaoAdministracionColab;
import Dao.DaoAdministracionE;
import HibernateUtil.HibernateUtil;
import Pojos.Estados;
import Pojos.Localidades;


@ManagedBean(name = "mBAColonias", eager = true)
@ApplicationScoped

public class MBAColonias {
	
	 private Transaction transaction;    
	 private Session session;
	 private List<Localidades>listaColonias;
	 
	 List<Localidades>ColoniasIniciales;
	 
	 
	 
	    @PostConstruct
	    public void init() {
 List<Localidades> allColonias = getColonias();
	        ColoniasIniciales = new ArrayList<Localidades>();
	        
	        Iterator<Localidades> it = allColonias.iterator();
	        
	        while(it.hasNext()){
	        	ColoniasIniciales.add(it.next());
	        	
	        }
	        }
	    
	    
	    
	    public  List<Localidades>getColonias(){
	        
	        this.session = null;
	        this.transaction = null;
	        
	        try {
	            DaoAdministracionColab daoAdministracion = new DaoAdministracionColab();

	            this.session = HibernateUtil.getSessionFactory().openSession();
	            this.transaction = this.session.beginTransaction();

	           listaColonias= daoAdministracion.getcolonias(session);
	            
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



		public List<Localidades> getListaColonias() {
			return listaColonias;
		}



		public void setListaColonias(List<Localidades> listaColonias) {
			this.listaColonias = listaColonias;
		}



		public List<Localidades> getColoniasIniciales() {
			return ColoniasIniciales;
		}



		public void setColoniasIniciales(List<Localidades> coloniasIniciales) {
			ColoniasIniciales = coloniasIniciales;
		}
	    
	        
	    
	    
	    
	    
	

}
