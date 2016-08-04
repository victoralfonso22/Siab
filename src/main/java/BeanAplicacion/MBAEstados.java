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

import Dao.DaoAdministracionE;
import HibernateUtil.HibernateUtil;
import Pojos.Estados;





@ManagedBean(name = "mBAEstados", eager = true)
@ApplicationScoped

public class MBAEstados {
	 private Transaction transaction;    
	    private Session session;
	    private List<Estados> listaEstados;
	    
	    List<Estados> EstadosIniciales;
	    
	    
	    @PostConstruct
	    public void init() {
 List<Estados> allEstados = getEstados();
	        EstadosIniciales = new ArrayList<Estados>();
	        
	        Iterator<Estados> it = allEstados.iterator();
	        
	        while(it.hasNext()){
	        	EstadosIniciales.add(it.next());
	        	
	        }
	        }
	        
	        
	        
	        public List<Estados> getEstados() {
	            this.session = null;
	            this.transaction = null;

	            try {
	                DaoAdministracionE daoadministracionE = new DaoAdministracionE();

	                this.session = HibernateUtil.getSessionFactory().openSession();
	                this.transaction = this.session.beginTransaction();

	                listaEstados= daoadministracionE.getEstados(this.session);
	                
	                
	              this.transaction.commit();

	                return this.listaEstados;

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



			public List<Estados> getEstadosIniciales() {
				return EstadosIniciales;
			}



			public void setEstadosIniciales(List<Estados> estadosIniciales) {
				EstadosIniciales = estadosIniciales;
			}



	        
	        
	        
	        
	        
}
