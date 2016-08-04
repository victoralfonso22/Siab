package BeanAplicacion;

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
import Pojos.CodigoPostal;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;







@ManagedBean(name = "mBACodigos", eager = true)
@ApplicationScoped
public class MBACodigos {
	
	private Transaction transaction;    
    private Session session;
    

    private List<CodigoPostal> listacodigos;
    
    List<CodigoPostal>CodigosIniciales;
    
    
    @PostConstruct
    public void init() {
    	
    	
    	 List<CodigoPostal> allCodigos = getCodigos();
    	 CodigosIniciales = new ArrayList<CodigoPostal>();
	        
	        Iterator<CodigoPostal> it = allCodigos.iterator();
	        
	        while(it.hasNext()){
	        	CodigosIniciales.add(it.next());
	        	
	        }
  
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
	public List<CodigoPostal> getCodigosIniciales() {
		return CodigosIniciales;
	}


	public void setCodigosIniciales(List<CodigoPostal> codigosIniciales) {
		CodigosIniciales = codigosIniciales;
	}


    
    
    
    
    
    
    
    
    
    
	
	
	
	
    
    
    
    
    
	

}
