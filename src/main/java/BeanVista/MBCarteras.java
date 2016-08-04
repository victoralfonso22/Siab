/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanVista;

import Dao.DaoCarteras;
import Dao.DaoRangosCarterasBoletos;
import Dao.DaoBoletos;
import Dao.DaoCarterasBoletos;
import Dao.DaoKardexCartera;
import HibernateUtil.HibernateUtil;
import Pojos.Carteras;
import Pojos.CarteraBoleto;
import Pojos.Boletos;
import Pojos.KardexCartera;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.primefaces.context.RequestContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.validator.ValidatorException;

/**
 *
 * @author Víctor
 */
@ManagedBean(name = "mBCarteras")
@ViewScoped
public class MBCarteras implements Serializable {

    private Session session;
    private Transaction transaction;

    private Carteras carteras;    

    private int numBoletos;

    private int contador;
    
    private int count;
    
    private int cambiaFoco;
    
    private boolean bandera;

    public MBCarteras() {
        this.carteras = new Carteras();        
        this.numBoletos = 0;
        this.carteras.setFolio("");
        this.contador = 0;  
        this.count = 0;
        this.cambiaFoco = 0;
        this.bandera = false;
    }

    public void verificaFolio() {

        this.session = null;
        this.transaction = null;

        if (this.carteras.getFolio().length() == 6) {
        	System.out.println(this.carteras.getFolio().length());            

            try {

                Pattern pattern = Pattern.compile("([Tt])([0-9]{5})");
                Matcher matcher = pattern.matcher((CharSequence) this.carteras.getFolio());

                if (!matcher.matches()) {
                	this.carteras.setFolio(null);                    
                    RequestContext.getCurrentInstance().update("carteras:folCarteras");                    
                    RequestContext.getCurrentInstance().reset("carteras:folCarteras");                    
                    RequestContext.getCurrentInstance().execute("$('folioCartera').focus();"); 
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error:", "El folio de cartera es incorrecto."));                  
                    return;
                }

                DaoRangosCarterasBoletos daoRango = new DaoRangosCarterasBoletos();
                DaoCarteras daoCarteras = new DaoCarteras();
                DaoCarterasBoletos daoCarteraBoeltos = new DaoCarterasBoletos();

                this.session = HibernateUtil.getSessionFactory().openSession();
                this.transaction = this.session.beginTransaction();

                if (daoRango.VerificaNumneroBoletosPorFolio(this.session, this.carteras.getFolio())) {
                    this.numBoletos = daoRango.getNumneroBoletosPorFolio(this.session, this.carteras.getFolio());
                } else {
                	this.carteras.setFolio(null);                    
                    RequestContext.getCurrentInstance().update("carteras:folCarteras");                    
                    RequestContext.getCurrentInstance().reset("carteras:folCarteras");                    
                    RequestContext.getCurrentInstance().execute("$('folioCartera').focus();"); 
                     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "No existe numero de boletos para ese folio de cartera."));                     
                    return;
                }

                this.contador = 0;
                this.count = 0;
                this.cambiaFoco = 0;

                if (daoCarteras.comprobarExisteCartera(this.session, this.carteras.getFolio())) {
                	this.carteras.setFolio(null);                    
                    RequestContext.getCurrentInstance().update("carteras:folCarteras");                    
                    RequestContext.getCurrentInstance().reset("carteras:folCarteras");                    
                    RequestContext.getCurrentInstance().execute("$('folioCartera').focus();"); 
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "La cartera ya fue dada de alta."));                    
                    return;
                }
                
                if(daoCarteraBoeltos.existeCartera(this.session, this.carteras.getFolio())){
                	daoCarteraBoeltos.borrarCartera(this.session, this.carteras.getFolio());
                }

                this.transaction.commit();

                this.bandera = true;
                               
                                
                                             
                RequestContext.getCurrentInstance().update("carteras:etiquetaBoletos");
                
                
                HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
                
                httpSession.setAttribute("numBoletos", this.numBoletos);
                httpSession.setAttribute("folioCartera", this.carteras.getFolio());                
                

            } catch (Exception e) {
                if (this.transaction != null) {
                    this.transaction.rollback();
                }
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas." + e.getMessage()));
            } finally {
                if (this.session != null) {

                    session.close();
                }
            }
        } else {
        	RequestContext.getCurrentInstance().update("carteras:etiquetaBoletos");
        	RequestContext.getCurrentInstance().update("carteras:capturaBoletos");
            
        }

    }
    
    public void guardaCartera(){
    	this.session = null;
        this.transaction = null;
    	try{
    		this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
    	
            HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
                       
    	DaoCarterasBoletos daoCarteraBoletos = new DaoCarterasBoletos();
    	DaoCarteras daoCarteras = new DaoCarteras();
    	DaoBoletos daoBoletos = new DaoBoletos();
    	DaoKardexCartera daoKardexCartera = new DaoKardexCartera();
    	
    	if(daoCarteraBoletos.contarBoletos(this.session, httpSession.getAttribute("folioCartera").toString()) != (int)httpSession.getAttribute("numBoletos")){
    		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "Faltan boletos por capturar."));
    		return;
    	}
    	
    	this.carteras.setFolio(httpSession.getAttribute("folioCartera").toString());
    	this.carteras.setCantidad((int)httpSession.getAttribute("numBoletos"));
    	this.carteras.setEstado(false);
    	this.carteras.setAsignado(0);
    	this.carteras.setIncidencia(0);
    	
    	daoCarteras.guardarCartera(this.session, this.carteras);
    	
    	int idCartera = daoCarteras.obtenerID(this.session, httpSession.getAttribute("folioCartera").toString());
    	Date fecha = new Date();
    	
    	KardexCartera kardex = new KardexCartera();
    	
    	kardex.setIdAlmacen(1);
    	kardex.setEntrada(1);
    	kardex.setSalida(0);
    	kardex.setFecha(fecha);
    	kardex.setIdMovimiento(1);    	
    	kardex.setIdCartera(idCartera);
    	
    	daoKardexCartera.guardarCarteraBoveda(this.session, kardex);    	
    	
    	List<CarteraBoleto> carteraBol = daoCarteraBoletos.listarBoletos(this.session, httpSession.getAttribute("folioCartera").toString());
    	
    	for(CarteraBoleto c : carteraBol){
    		Boletos b = new Boletos();
    		b.setFolio(c.getBoleto());
    		b.setIdCartera(idCartera);
    		b.setEstado(false);
    		b.setIdTipoIncidencia(0);
    		b.setAsignado(0);
    		daoBoletos.guardarBoletos(this.session, b);
    		b = null;
    	}    	
    	    	
    	daoCarteraBoletos.borrarCartera(this.session, httpSession.getAttribute("folioCartera").toString());
    	
    	this.transaction.commit();
    	
    	
    	this.carteras = null;
    	
    	RequestContext.getCurrentInstance().reset("carteras");
    	RequestContext.getCurrentInstance().update("carteras");
    	
    	FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Cartera guardada con exito."));
    	
    	
    	
    	 } catch (Exception e) {
             if (this.transaction != null) {
                 this.transaction.rollback();
             }
             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas." + e.getMessage()));
         } finally {
             if (this.session != null) {

                 session.close();
             }
         }
    }

    public Carteras getCarteras() {
        return carteras;
    }

    public void setCarteras(Carteras carteras) {
        this.carteras = carteras;
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

    public int getNumBoletos() {
        return numBoletos;
    }

    public void setNumBoletos(int numBoletos) {
        this.numBoletos = numBoletos;
    }

    public int getContador() {
        if (this.contador <= this.numBoletos) {
            setContador(this.contador + 1);
            setCambiaFoco(this.cambiaFoco+1);
        } else {
            this.contador = 0;
        }
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

	public int getCount() {
		setCount(this.count + 1);
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCambiaFoco() {		
		return cambiaFoco;
	}

	public void setCambiaFoco(int cambiaFoco) {
		this.cambiaFoco = cambiaFoco;
	}

    
}
