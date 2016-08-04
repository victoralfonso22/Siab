package Clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import Dao.DaoSectores;
import HibernateUtil.HibernateUtil;
import Pojos.Sectores;
import Pojos.VistaSectores;

@ManagedBean(name = "sectorServicio")
@ApplicationScoped
public class SectoresServicio {
	private Transaction transaction;
	private Session session;
	private List<VistaSectores> retorno;

	public TreeNode creaSectoresTree() {

		this.session = null;
		this.transaction = null;

		try {

			TreeNode root = new DefaultTreeNode(new VistaSectores(0, "Sector",
					"0", 0, 0, 0), null);

			DaoSectores daoSector = new DaoSectores();

			this.session = HibernateUtil.getSessionFactory().openSession();
			this.transaction = this.session.beginTransaction();

			List<VistaSectores> principales = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos1 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos2 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos3 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos4 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos5 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos6 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos7 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos8 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos9 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos10 = new ArrayList<VistaSectores>();

			principales = daoSector.sectoresPadreMayorVista(this.session);

			if (!principales.isEmpty()) {

				for (int i = 0; i < principales.size(); i++) {					
					TreeNode nodo1 = new DefaultTreeNode(new VistaSectores(
							principales.get(i).getId(), principales.get(i).getSectorRegion(), principales.get(i).getComision(), principales.get(i).getMeta(), principales.get(i).getNivel(), principales.get(i).getUltimo()),root);

					hijos1 = daoSector.sectoresHijosVista(this.session,	principales.get(i).getId());
					if (!hijos1.isEmpty()) {
					for (int a = 0; a < hijos1.size(); a++) {
						TreeNode nodo2 = new DefaultTreeNode(new VistaSectores(
								hijos1.get(a).getId(), hijos1.get(a).getSectorRegion(), hijos1.get(a).getComision(),hijos1.get(a).getMeta(), hijos1.get(a).getNivel(),hijos1.get(a).getUltimo()), nodo1);
						hijos2 = daoSector.sectoresHijosVista(this.session,	hijos1.get(a).getId());
						if (!hijos2.isEmpty()) {
						for (int b = 0; b < hijos2.size(); b++) {
							TreeNode nodo3 = new DefaultTreeNode(new VistaSectores(hijos2.get(b).getId(),hijos2.get(b).getSectorRegion(),hijos2.get(b).getComision(), hijos2.get(b).getMeta(), hijos2.get(b).getNivel(), hijos2.get(b).getUltimo()), nodo2);

							hijos3 = daoSector.sectoresHijosVista(this.session,	hijos2.get(b).getId());
							if (!hijos3.isEmpty()) {
							for (int c = 0; c < hijos3.size(); c++) {
								TreeNode nodo4 = new DefaultTreeNode(new VistaSectores(	hijos3.get(c).getId(), hijos3.get(c).getSectorRegion(),	hijos3.get(c).getComision(),hijos3.get(c).getMeta(), hijos3.get(c).getNivel(), hijos3.get(c).getUltimo()),	nodo3);
								hijos4 = daoSector.sectoresHijosVista(this.session, hijos3.get(c).getId());
								if (!hijos4.isEmpty()) {
								for (int d = 0; d < hijos4.size(); d++) {

									TreeNode nodo5 = new DefaultTreeNode(new VistaSectores(hijos4.get(d).getId(), hijos4.get(d).getSectorRegion(), hijos4.get(d).getComision(),	hijos4.get(d).getMeta(),hijos4.get(d).getNivel(),hijos4.get(d).getUltimo()),nodo4);
									hijos5 = daoSector.sectoresHijosVista(this.session, hijos4.get(d).getId());
									if (!hijos5.isEmpty()) {
									for (int e = 0; e < hijos5.size(); e++) {

										TreeNode nodo6 = new DefaultTreeNode(new VistaSectores(hijos5.get(e).getId(), hijos5.get(e).getSectorRegion(), hijos5.get(e).getComision(),	hijos5.get(e).getMeta(),hijos5.get(e).getNivel(),hijos5.get(e).getUltimo()),nodo5);
										hijos6 = daoSector.sectoresHijosVista(this.session, hijos5.get(e).getId());
										if (!hijos6.isEmpty()) {
										for (int f = 0; f < hijos6.size(); f++) {

											TreeNode nodo7 = new DefaultTreeNode(new VistaSectores(hijos6.get(f).getId(), hijos6.get(f).getSectorRegion(), hijos6.get(f).getComision(),	hijos6.get(f).getMeta(),hijos6.get(f).getNivel(),hijos6.get(f).getUltimo()),nodo6);
										}
									}
									}
								}
								}
							}
							}
						}
						}
					}
					}
				}
				}

			}

			return root;

		} catch (Exception e) {
			if (this.transaction != null) {
				this.transaction.rollback();
			}
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_FATAL,
							"Error fatal: ", "contacte a sistemas89"
									+ e.getMessage()));
			return null;
		} finally {
			if (this.session != null) {
				session.close();
			}

		}

	}
	
	
	
	public TreeNode creaSubSectoresTree(String id) {

		this.session = null;
		this.transaction = null;

		try {

			TreeNode root = new DefaultTreeNode(new VistaSectores(0, "Sector",
					"0", 0, 0, 0), null);
			
			if(id != ""){

			DaoSectores daoSector = new DaoSectores();

			this.session = HibernateUtil.getSessionFactory().openSession();
			this.transaction = this.session.beginTransaction();

			List<VistaSectores> principales = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos1 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos2 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos3 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos4 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos5 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos6 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos7 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos8 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos9 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos10 = new ArrayList<VistaSectores>();

			principales = daoSector.sectoresHijosVista(this.session,Integer.valueOf(id));

			if (!principales.isEmpty()) {

				for (int i = 0; i < principales.size(); i++) {					
					TreeNode nodo1 = new DefaultTreeNode(new VistaSectores(
							principales.get(i).getId(), principales.get(i).getSectorRegion(), principales.get(i).getComision(), principales.get(i).getMeta(), principales.get(i).getNivel(), principales.get(i).getUltimo()),root);

					hijos1 = daoSector.sectoresHijosVista(this.session,	principales.get(i).getId());
					if (!hijos1.isEmpty()) {
					for (int a = 0; a < hijos1.size(); a++) {
						TreeNode nodo2 = new DefaultTreeNode(new VistaSectores(
								hijos1.get(a).getId(), hijos1.get(a).getSectorRegion(), hijos1.get(a).getComision(),hijos1.get(a).getMeta(), hijos1.get(a).getNivel(),hijos1.get(a).getUltimo()), nodo1);
						hijos2 = daoSector.sectoresHijosVista(this.session,	hijos1.get(a).getId());
						if (!hijos2.isEmpty()) {
						for (int b = 0; b < hijos2.size(); b++) {
							TreeNode nodo3 = new DefaultTreeNode(new VistaSectores(hijos2.get(b).getId(),hijos2.get(b).getSectorRegion(),hijos2.get(b).getComision(), hijos2.get(b).getMeta(), hijos2.get(b).getNivel(), hijos2.get(b).getUltimo()), nodo2);

							hijos3 = daoSector.sectoresHijosVista(this.session,	hijos2.get(b).getId());
							if (!hijos3.isEmpty()) {
							for (int c = 0; c < hijos3.size(); c++) {
								TreeNode nodo4 = new DefaultTreeNode(new VistaSectores(	hijos3.get(c).getId(), hijos3.get(c).getSectorRegion(),	hijos3.get(c).getComision(),hijos3.get(c).getMeta(), hijos3.get(c).getNivel(), hijos3.get(c).getUltimo()),	nodo3);
								hijos4 = daoSector.sectoresHijosVista(this.session, hijos3.get(c).getId());
								if (!hijos4.isEmpty()) {
								for (int d = 0; d < hijos4.size(); d++) {

									TreeNode nodo5 = new DefaultTreeNode(new VistaSectores(hijos4.get(d).getId(), hijos4.get(d).getSectorRegion(), hijos4.get(d).getComision(),	hijos4.get(d).getMeta(),hijos4.get(d).getNivel(),hijos4.get(d).getUltimo()),nodo4);
									hijos5 = daoSector.sectoresHijosVista(this.session, hijos4.get(d).getId());
									if (!hijos5.isEmpty()) {
									for (int e = 0; e < hijos5.size(); e++) {

										TreeNode nodo6 = new DefaultTreeNode(new VistaSectores(hijos5.get(e).getId(), hijos5.get(e).getSectorRegion(), hijos5.get(e).getComision(),	hijos5.get(e).getMeta(),hijos5.get(e).getNivel(),hijos5.get(e).getUltimo()),nodo5);
										hijos6 = daoSector.sectoresHijosVista(this.session, hijos5.get(e).getId());
										if (!hijos6.isEmpty()) {
										for (int f = 0; f < hijos6.size(); f++) {

											TreeNode nodo7 = new DefaultTreeNode(new VistaSectores(hijos6.get(f).getId(), hijos6.get(f).getSectorRegion(), hijos6.get(f).getComision(),	hijos6.get(f).getMeta(),hijos6.get(f).getNivel(),hijos6.get(f).getUltimo()),nodo6);
										}
									}
									}
								}
								}
							}
							}
						}
						}
					}
					}
				}
				}

			}
			}

			return root;

		} catch (Exception e) {
			if (this.transaction != null) {
				this.transaction.rollback();
			}
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_FATAL,
							"Error fatal: ", "contacte a sistemas89"
									+ e.getMessage()));
			return null;
		} finally {
			if (this.session != null) {
				session.close();
			}

		}

	}
	
	
	public List<VistaSectores> creaSubSectores(String id) {

		this.session = null;
		this.transaction = null;
		System.out.println("Volví"+id);
		
		System.out.println("ValorRetorno"+retorno);
		
		if(this.retorno == null){
			
		try {
			List<VistaSectores> retorno = new ArrayList<VistaSectores>();
			
			this.session = HibernateUtil.getSessionFactory().openSession();
			this.transaction = this.session.beginTransaction();
			
			DaoSectores daoSector = new DaoSectores();
			
		

			List<VistaSectores> principales = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos1 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos2 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos3 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos4 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos5 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos6 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos7 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos8 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos9 = new ArrayList<VistaSectores>();
			List<VistaSectores> hijos10 = new ArrayList<VistaSectores>();
			

			principales = daoSector.sectoresVistaId(this.session,Integer.valueOf(id));

			if (!principales.isEmpty()) {

				for (int i = 0; i < principales.size(); i++) {					
					retorno.add(principales.get(i));

					hijos1 = daoSector.sectoresHijosVista(this.session,	principales.get(i).getId());
					if (!hijos1.isEmpty()) {
					for (int a = 0; a < hijos1.size(); a++) {
						retorno.add(hijos1.get(a));
						hijos2 = daoSector.sectoresHijosVista(this.session,	hijos1.get(a).getId());
						if (!hijos2.isEmpty()) {
						for (int b = 0; b < hijos2.size(); b++) {
							retorno.add(hijos2.get(b));
							hijos3 = daoSector.sectoresHijosVista(this.session,	hijos2.get(b).getId());
							if (!hijos3.isEmpty()) {
							for (int c = 0; c < hijos3.size(); c++) {
								retorno.add(hijos3.get(c));
								hijos4 = daoSector.sectoresHijosVista(this.session, hijos3.get(c).getId());
								if (!hijos4.isEmpty()) {
								for (int d = 0; d < hijos4.size(); d++) {
									retorno.add(hijos4.get(d));
									hijos5 = daoSector.sectoresHijosVista(this.session, hijos4.get(d).getId());
									if (!hijos5.isEmpty()) {
									for (int e = 0; e < hijos5.size(); e++) {
										retorno.add(hijos5.get(e));
										hijos6 = daoSector.sectoresHijosVista(this.session, hijos5.get(e).getId());
										if (!hijos6.isEmpty()) {
										for (int f = 0; f < hijos6.size(); f++) {
											retorno.add(hijos6.get(f));
										}
									}
									}
								}
								}
							}
							}
						}
						}
					}
					}
				}
				}

			
			}else{
				principales = daoSector.sectoresVistaId(this.session,Integer.valueOf(id));	
				
				for (int i = 0; i < principales.size(); i++) {					
					retorno.add(principales.get(i));
				}
					
			}		

			return retorno;
		} catch (Exception e) {
			if (this.transaction != null) {
				this.transaction.rollback();
			}
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_FATAL,
							"Error fatal: ", "contacte a sistemas89"
									+ e.getMessage()));
			//return null;
		} finally {
			if (this.session != null) {
				session.close();
			}

		}

		}
		return retorno;

	}
	
	
	public String nombreSector(String id) {

		this.session = null;
		this.transaction = null;

		try {

			this.session = HibernateUtil.getSessionFactory().openSession();
			this.transaction = this.session.beginTransaction();			

			DaoSectores daoSectores = new DaoSectores();
			return daoSectores.nombreSector(this.session, Integer.valueOf(id));		
			
		} catch (Exception e) {
			if (this.transaction != null) {
				this.transaction.rollback();
			}
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_FATAL,
							"Error fatal: ", "contacte a sistemas89"
									+ e.getMessage()));
			return null;
		} finally {
			if (this.session != null) {
				session.close();
			}

		}

	}
	
	
	
	public List<VistaSectores> creaSectores() {

		this.session = null;
		this.transaction = null;

		System.out.println("HOLA");

		try {

			List<VistaSectores> listSector = new ArrayList<VistaSectores>();

			DaoSectores daoSector = new DaoSectores();

			this.session = HibernateUtil.getSessionFactory().openSession();
			this.transaction = this.session.beginTransaction();

			List<VistaSectores> principales = new ArrayList<VistaSectores>();

			principales = daoSector.sectoresPadreMayorVista(this.session);

			System.out.println(principales.get(0).getSector());

			System.out.println("HOLA3");

			if (!principales.isEmpty()) {

				for (int i = 0; i < principales.size(); i++) {
					listSector.add(principales.get(i));

				}
			}

			return listSector;

		} catch (Exception e) {
			if (this.transaction != null) {
				this.transaction.rollback();
			}
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_FATAL,
							"Error fatal: ", "contacte a sistemas89"
									+ e.getMessage()));
			return null;
		} finally {
			if (this.session != null) {
				session.close();
			}

		}

	}

	public int comisionTotalSector(int id) {

		this.session = null;
		this.transaction = null;

		try {

			this.session = HibernateUtil.getSessionFactory().openSession();
			this.transaction = this.session.beginTransaction();			

			DaoSectores daoSectores = new DaoSectores();
			return daoSectores.comisionSector(this.session, id);			
			
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

	/*
	 * public int comisionTotalSector(int id, int suma) {
	 * 
	 * 
	 * this.session = null; this.transaction = null;
	 * 
	 * 
	 * try {
	 * 
	 * this.session = HibernateUtil.getSessionFactory().openSession();
	 * this.transaction = this.session.beginTransaction();
	 * 
	 * 
	 * List<VistaSectores> lista = new ArrayList<VistaSectores>();
	 * 
	 * DaoSectores daoSectores = new DaoSectores();
	 * 
	 * if(daoSectores.tieneSectoresHijosVista(this.session , id) > 0){ lista =
	 * daoSectores.sectoresHijosVista(this.session , id); for(int i = 0; i <=
	 * lista.size();i++){ suma =
	 * suma+daoSectores.comisionSector(session,lista.get(i).getId()); } for(int
	 * i = 0; i <= lista.size();i++){ suma =
	 * suma+comisionTotalSector(lista.get(i).getId(),suma); }
	 * 
	 * }else{ suma = suma+daoSectores.comisionSector(this.session , id); }
	 * 
	 * return suma; } catch (Exception e) { if (this.transaction != null) {
	 * this.transaction.rollback(); }
	 * FacesContext.getCurrentInstance().addMessage( null, new
	 * FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ",
	 * "contacte a sistemas89" + e.getMessage())); return 0; } finally { if
	 * (this.session != null) { session.close(); }
	 * 
	 * }
	 * 
	 * 
	 * }
	 * 
	 * public int metaTotalSector(Session session,int id, int suma) throws
	 * Exception {
	 * 
	 * 
	 * 
	 * System.out.println("Meta"+suma+"id"+id);
	 * 
	 * 
	 * DaoSectores daoSectores = new DaoSectores();
	 * 
	 * System.out.println("HijoNum"+daoSectores.tieneSectoresHijosVista(session,
	 * id));
	 * 
	 * if(daoSectores.tieneSectoresHijosVista(session, id) > 0){
	 * List<VistaSectores> lista = new ArrayList<VistaSectores>();
	 * System.out.println("TieneHijos"); lista =
	 * daoSectores.sectoresHijosVista(session, id); for(int i = 0; i <
	 * lista.size();i++){
	 * 
	 * suma = suma+daoSectores.metaSector(session,lista.get(i).getId());
	 * System.out.println("sumaHijos"+suma);
	 * 
	 * } for(int i = 0; i < lista.size();i++){ suma =
	 * suma+metaTotalSector(session,lista.get(i).getId(),suma);
	 * System.out.println("sumaMasHijos"+suma);
	 * 
	 * }
	 * 
	 * }else{ suma = suma+daoSectores.metaSector(session, id);
	 * System.out.println("NotieneHijos"+suma);
	 * 
	 * } System.out.println("return"+suma); return suma;
	 * 
	 * 
	 * }
	 */

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



	public List<VistaSectores> getRetorno() {		
		return retorno;
	}



	public void setRetorno(List<VistaSectores> retorno) {
		this.retorno = retorno;
	}

}
