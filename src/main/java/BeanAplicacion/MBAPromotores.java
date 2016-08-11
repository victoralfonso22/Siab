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
import Pojos.CodigoPostal;
import Pojos.ColaboradoresHistorial;
import Pojos.Promotores;




@ManagedBean(name = "mBAPromotores", eager = true)
@ApplicationScoped

public class MBAPromotores {
	
	
	private Transaction transaction;    
    private Session session;
    
    
    private List<Promotores> listapromotores;
    List<Promotores>PromotoresIniciales;
    
    
    
    
    @PostConstruct
    public void init() {
    	
    	
    	 List<Promotores> allPromotores = getPromotores();
    	 PromotoresIniciales = new ArrayList<Promotores>();
	     Iterator<Promotores> it = allPromotores.iterator();
	        while(it.hasNext()){
	        	PromotoresIniciales.add(it.next());
	        	
	        }
  
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



	public List<Promotores> getPromotoresIniciales() {
		return PromotoresIniciales;
	}



	public void setPromotoresIniciales(List<Promotores> promotoresIniciales) {
		PromotoresIniciales = promotoresIniciales;
	}
    
    
    
    
    
    
    
	
	
	
	
	

}
