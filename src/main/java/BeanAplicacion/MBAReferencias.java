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
import HibernateUtil.HibernateUtil;
import Pojos.Referencias;


@ManagedBean(name = "mBAReferencias", eager = true)
@ApplicationScoped

public class MBAReferencias {
	
	private Transaction transaction;    
    private Session session;
	
	
    private List<Referencias> listareferencias;
    List<Referencias>ReferenciasIniciales;
    
    
    
    
    @PostConstruct
    public void init() {
    	
    	
    	 List<Referencias> allReferencias = getReferencias();
    	 ReferenciasIniciales = new ArrayList<Referencias>();
	     Iterator<Referencias> it = allReferencias.iterator();
	        while(it.hasNext()){
	        	ReferenciasIniciales.add(it.next());
	        	
	        }
  
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


	public List<Referencias> getReferenciasIniciales() {
		return ReferenciasIniciales;
	}


	public void setReferenciasIniciales(List<Referencias> referenciasIniciales) {
		ReferenciasIniciales = referenciasIniciales;
	}

    
    
	
    
    
    
	

}
