package BeanVista;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.context.RequestContext;




import org.primefaces.event.NodeSelectEvent;

import Dao.DaoSectores;
import HibernateUtil.HibernateUtil;
import Pojos.Permisos;
import Pojos.Sectores;
import Pojos.VistaSectores;
import Clases.SectoresServicio;

import org.primefaces.model.TreeNode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.servlet.http.HttpSession;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;

/**
 * 
 * @author Víctor
 */
@ManagedBean(name = "mBSectores")
@ViewScoped
public class MBSectores implements Serializable {

	private Transaction transaction;
	private Session session;

	private List<VistaSectores> listaSector;
	private List<VistaSectores> listaSectorFiltrados;
	private TreeNode listaNodos;
	private VistaSectores seleccionadoVistaSector;
	private VistaSectores seleccionVista;
	
	
	
	@ManagedProperty("#{sectorServicio}")
	private SectoresServicio servicio;

	@PostConstruct
	public void init() {	
		
		this.listaNodos = servicio.creaSectoresTree();
		//this.listaSector = servicio.creaSectores();
	}
	
	public long tieneHijos(int id){
		
		this.session = null;
        this.transaction = null;

        try {
            DaoSectores daoSectores = new DaoSectores();
            System.out.println("HOLA"+id);
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            return daoSectores.tieneSectoresHijosVista(this.session, id);
           

        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();

            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas1" + e.getMessage()));
            return 0;
        }
	}
	
	public List<VistaSectores> creaSectoresHijo(int id) {

		this.session = null;
		this.transaction = null;

		

		try {

			List<VistaSectores> listaSectorHijos = new ArrayList<VistaSectores>();

			DaoSectores daoSector = new DaoSectores();

			this.session = HibernateUtil.getSessionFactory().openSession();
			this.transaction = this.session.beginTransaction();

			
			List<VistaSectores> hijos = new ArrayList<VistaSectores>();

			hijos = daoSector.sectoresHijosVista(this.session, id);

			if (!hijos.isEmpty()) {

				for (int i = 0; i < hijos.size(); i++) {
					listaSectorHijos.add(hijos.get(i));

				}
			}

			return listaSectorHijos;

		} catch (Exception e) {
			if (this.transaction != null) {
				this.transaction.rollback();
			}
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_FATAL,
							"Error fatal: ", "contacte a sistemas2"
									+ e.getMessage()));
			return null;
		} finally {
			if (this.session != null) {
				session.close();
			}

		}

	}
	
	public int metaTotalSector(int id) {

		this.session = null;
		this.transaction = null;
		int valor;
		
		try {

			this.session = HibernateUtil.getSessionFactory().openSession();
			this.transaction = this.session.beginTransaction();			

			DaoSectores daoSectores = new DaoSectores();
			valor = daoSectores.metaSector(this.session, id);
			System.out.println("valor"+valor);
			return valor;
			
			
		} catch (Exception e) {
			if (this.transaction != null) {
				this.transaction.rollback();
			}
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_FATAL,
							"Error fatal: ", "contacte a sistemas89"
									+ e.getMessage()));
			return 0;
		} finally {
			if (this.session != null) {
				session.close();
			}

		}

	}
	
	public void nodoSeleccionado(NodeSelectEvent evento){
		
		//System.out.println("Eventooo"+seleccionadoVistaSector.getData().toString());
		
		//this.seleccionVista = (VistaSectores)seleccionadoVistaSector.getData();
		
		//this.seleccionVista = (VistaSectores)evento.getTreeNode().getData();
		
		
	
		//RequestContext context = RequestContext.getCurrentInstance();
		//context.update("formSectores:vistaSectorPanel");
        //context.execute("PF('vistaSectorDialog').show();");
		
	}
	
	public void onRowEdit(VistaSectores v) {
		System.out.println("Edit"+v.getRegion());
		this.session = null;
		this.transaction = null;		
		
		try {

			this.session = HibernateUtil.getSessionFactory().openSession();
			this.transaction = this.session.beginTransaction();			

			DaoSectores daoSectores = new DaoSectores();
			Sectores s = daoSectores.sectorId(this.session, v.getId());
			
			s.setMeta(v.getMeta());
			
			daoSectores.edit(this.session,s);
			
		} catch (Exception e) {
			if (this.transaction != null) {
				this.transaction.rollback();
			}
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_FATAL,
							"Error fatal: ", "contacte a sistemas89"
									+ e.getMessage()));

		} finally {
			if (this.session != null) {
				session.close();
			}

		}
		
		
	        //VistaSectores v = ((VistaSectores) event.getObject()).getId();
	        System.out.println("Edit"+v.getMeta());
	}
	     
	public void onRowCancel(VistaSectores v) {	    	
	    	System.out.println("Cancel"+v.getId());
	}
	
	public void onCellEdit(CellEditEvent event) {
		
		DataTable s = (DataTable) event.getSource();
        VistaSectores v = (VistaSectores) s.getRowData();
		
		//RequestContext.getCurrentInstance().update( s.getClientId(FacesContext.getCurrentInstance()) +  ":" + event.getRowIndex() +  ":isAutomatic"	);
		System.out.println("Edit"+v.getMeta());
		Object newValue = event.getNewValue();
		System.out.println("EditNEW"+newValue);
		this.session = null;
		this.transaction = null;		
		
		try {

			this.session = HibernateUtil.getSessionFactory().openSession();
			this.transaction = this.session.beginTransaction();			

			DaoSectores daoSectores = new DaoSectores();
			Sectores e = daoSectores.sectorId(this.session, v.getId());
			
			e.setMeta(v.getMeta());
			
			daoSectores.edit(this.session,e);
			
			this.transaction.commit();
			
		} catch (Exception e) {
			if (this.transaction != null) {
				this.transaction.rollback();
			}
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_FATAL,
							"Error fatal: ", "contacte a sistemas89"
									+ e.getMessage()));

		} finally {
			if (this.session != null) {
				session.close();
			}

		}
	}
	

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public SectoresServicio getServicio() {
		return servicio;
	}

	public void setServicio(SectoresServicio servicio) {
		this.servicio = servicio;
	}

	public List<VistaSectores> getListaSector() {
		return listaSector;
	}

	public void setListaSector(List<VistaSectores> listaSector) {
		this.listaSector = listaSector;
	}

	public List<VistaSectores> getListaSectorFiltrados() {
		return listaSectorFiltrados;
	}

	public void setListaSectorFiltrados(List<VistaSectores> listaSectorFiltrados) {
		this.listaSectorFiltrados = listaSectorFiltrados;
	}

	public TreeNode getListaNodos() {
		return listaNodos;
	}

	public void setListaNodos(TreeNode listaNodos) {
		this.listaNodos = listaNodos;
	}

	public VistaSectores getSeleccionadoVistaSector() {
		return seleccionadoVistaSector;
	}

	public void setSeleccionadoVistaSector(VistaSectores seleccionadoVistaSector) {
		this.seleccionadoVistaSector = seleccionadoVistaSector;
	}

	public VistaSectores getSeleccionVista() {
		return seleccionVista;
	}

	public void setSeleccionVista(VistaSectores seleccionVista) {
		this.seleccionVista = seleccionVista;
	}

}
