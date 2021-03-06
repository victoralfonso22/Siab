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
import Pojos.ColaboradoresHistorial;
import Pojos.Estados;


@ManagedBean(name = "mBAColaborador", eager = true)
@ApplicationScoped


public class MBAColaborador {
//cv	
	 private Transaction transaction;    
	 private Session session;
	 private List<ColaboradoresHistorial>listaColab;
	 
	 private List<ColaboradoresHistorial>Colabiniciales;
	 
	 
	 
	    /*
	  @PostConstruct
	    public void init() {
List<Estados> allEstados = getEstados();
	        EstadosIniciales = new ArrayList<Estados>();
	        
	        Iterator<Estados> it = allEstados.iterator();
	        
	        while(it.hasNext()){
	        	EstadosIniciales.add(it.next());
	        	
	        }
	        }
	        
	        */
	 
	 
	
	 
	    @PostConstruct
	    public void init() {

	    	List<ColaboradoresHistorial> allcolab = Colaboradores();
	      
	    	Colabiniciales = new ArrayList<ColaboradoresHistorial>();
	    	
	        Iterator<ColaboradoresHistorial> it = allcolab.iterator();
	       
	        while(it.hasNext()){
	        	Colabiniciales.add(it.next());
	        	
	        }
	        
	        }
	 /*
	  * 
	 */

	    public List<ColaboradoresHistorial> Colaboradores() {
	        this.session = null;
	        this.transaction = null;

	  try {
	        	DaoAdministracionColab daoColab=new DaoAdministracionColab();
	            
	        	

	            this.session = HibernateUtil.getSessionFactory().openSession();
	            this.transaction = this.session.beginTransaction();

	            listaColab = daoColab.getcolaboradores(this.session);

	            this.transaction.commit();

	            return this. listaColab;

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


		public List<ColaboradoresHistorial> getListaColab() {
			return listaColab;
		}


		public void setListaColab(List<ColaboradoresHistorial> listaColab) {
			this.listaColab = listaColab;
		}

		public List<ColaboradoresHistorial> getColabiniciales() {
			return Colabiniciales;
		}

		public void setColabiniciales(List<ColaboradoresHistorial> colabiniciales) {
			Colabiniciales = colabiniciales;
		}


	    
	    

	
	    
	    
	    
	    
	
	
}	 
