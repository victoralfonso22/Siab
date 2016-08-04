/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanVista;

import Dao.DaoRangosCarterasBoletos;
import HibernateUtil.HibernateUtil;
import Pojos.RangosCarterasBoletos;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Víctor
 */
@Named(value = "mBeanRangosCarterasBoletos")
@ViewScoped
public class MBeanRangosCarterasBoletos implements Serializable{

    private Session session;
    private Transaction transaction;

    private int valorSeleccionado;

    private RangosCarterasBoletos rangosCarterasBoletos;
    private RangosCarterasBoletos rangosCarterasBoletosE;
    private List<RangosCarterasBoletos> listaRangosCarterasBoletos;
    private List<RangosCarterasBoletos> rangos;
    private HashMap hm;

    private List<SelectItem> items;

    private int numeroBoletos;

    /**
     * Creates a new instance of MBeanRangosCarterasBoletos
     */
    public MBeanRangosCarterasBoletos() {
        this.rangosCarterasBoletos = new RangosCarterasBoletos();
        this.rangosCarterasBoletosE = new RangosCarterasBoletos();
    }

    @PostConstruct
    public void init() {
        this.rangos = getRangoCatalogosBoletos();
        hm = new HashMap();

        for (int i = 0; i < this.rangos.size(); i++) {
            RangosCarterasBoletos rango = this.rangos.get(i);
            hm.put(rango.getId(), rango);
        }

        crearItems(this.rangos);

    }

    public List<RangosCarterasBoletos> getRangoCatalogosBoletos() {
        this.session = null;
        this.transaction = null;

        try {
            DaoRangosCarterasBoletos daoRangosCarterasBoletos = new DaoRangosCarterasBoletos();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            listaRangosCarterasBoletos = daoRangosCarterasBoletos.getRangoCarterasBoletos(this.session);

            this.transaction.commit();

            return this.listaRangosCarterasBoletos;

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

    public void crearItems(List<RangosCarterasBoletos> r) {

        items = new ArrayList<SelectItem>();

        for (int i = 0; i < r.size(); i++) {

            RangosCarterasBoletos rango = r.get(i);

            items.add(new SelectItem(rango.getId(), rango.getNumeroBoletos() + " "));

        }

    }

    public void buscarRangoCarterasBoletosSelec() {

        rangosCarterasBoletos = (RangosCarterasBoletos) hm.get(valorSeleccionado);

    }

    public void registrarRango() {
        this.session = null;
        this.transaction = null;

        try {
            DaoRangosCarterasBoletos daoRangosCarterasBoletos = new DaoRangosCarterasBoletos();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            if (daoRangosCarterasBoletos.getRangoPorNumeroBoleto(this.session, this.rangosCarterasBoletos.getNumeroBoletos())) {
                FacesContext.getCurrentInstance().addMessage("ran:numeroBoleto", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El numero de boletos ya fue definido en otro rango."));
                return;
            }

            if (Integer.parseInt(this.rangosCarterasBoletos.getFolioInicio().substring(1, 6)) >= Integer.parseInt(this.rangosCarterasBoletos.getFolioFin().substring(1, 6))) {
                FacesContext.getCurrentInstance().addMessage("ran:folioInicio", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El folio inicial de cartera no debe ser mayor o igual al folio final."));
                return;
            }

            if (daoRangosCarterasBoletos.comprobarCarteraRango(this.session, this.rangosCarterasBoletos.getFolioInicio().toUpperCase())) {
                FacesContext.getCurrentInstance().addMessage("ran:folioInicio", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El folio inicio de cartera esta dentro de un rango no valido."));
                return;
            }

            if (daoRangosCarterasBoletos.comprobarCarteraRango(this.session, this.rangosCarterasBoletos.getFolioFin().toUpperCase())) {
                FacesContext.getCurrentInstance().addMessage("ran:folioFin", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El folio fin de cartera esta dentro de un rango no valido."));
                return;
            }

            this.rangosCarterasBoletos.setNumeroBoletos(this.rangosCarterasBoletos.getNumeroBoletos());
            this.rangosCarterasBoletos.setFolioInicio(this.rangosCarterasBoletos.getFolioInicio().toUpperCase());
            this.rangosCarterasBoletos.setFolioFin(this.rangosCarterasBoletos.getFolioFin().toUpperCase());            
            daoRangosCarterasBoletos.registraRango(this.session, rangosCarterasBoletos);

            this.transaction.commit();

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se registró correctamente el rango."));

            this.rangosCarterasBoletos = new RangosCarterasBoletos();

        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas" + e.getMessage()));

        } finally {
            if (this.session != null) {
                session.close();
            }
        }

    }

    public void borrarRango(int id) {
        this.session = null;
        this.transaction = null;

        try {
            DaoRangosCarterasBoletos daoRangosCarterasBoletos = new DaoRangosCarterasBoletos();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            this.rangosCarterasBoletos.setId(id);

            daoRangosCarterasBoletos.borrarRango(this.session, rangosCarterasBoletos);

            this.transaction.commit();

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se borró correctamente el rango."));

            this.rangosCarterasBoletos = new RangosCarterasBoletos();

        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas" + e.getMessage()));

        } finally {
            if (this.session != null) {
                session.close();
            }
        }

    }

    public void editarRango() {

        this.session = null;
        this.transaction = null;

        try {

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            DaoRangosCarterasBoletos daoRangosCarterasBoletos = new DaoRangosCarterasBoletos();
           

            if (this.rangosCarterasBoletos.getNumeroBoletos() == null || this.rangosCarterasBoletos.getNumeroBoletos().compareTo(0) == 0) {
                this.rangosCarterasBoletos.setNumeroBoletos(daoRangosCarterasBoletos.getNumeroBoletoId(this.session, this.rangosCarterasBoletos.getId()));
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El campo numero de boletos no puede quedar vacio."));
                return;
            }

            if (this.rangosCarterasBoletos.getFolioInicio().toUpperCase().equals("")) {
                this.rangosCarterasBoletos.setFolioInicio(daoRangosCarterasBoletos.getFolioInicioId(this.session, this.rangosCarterasBoletos.getId()));
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El campo de folio inicio no puede quedar vacio."));
                return;
            }

            if (this.rangosCarterasBoletos.getFolioFin().toUpperCase().equals("")) {
                this.rangosCarterasBoletos.setFolioFin(daoRangosCarterasBoletos.getFolioFinId(this.session, this.rangosCarterasBoletos.getId()));
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El campo de folio final no puede quedar vacio."));
                return;
            }

            if (this.rangosCarterasBoletos.getNumeroBoletos().compareTo(daoRangosCarterasBoletos.getNumeroBoletoId(this.session, this.rangosCarterasBoletos.getId())) == 0) {
                this.rangosCarterasBoletos.setNumeroBoletos(daoRangosCarterasBoletos.getNumeroBoletoId(this.session, this.rangosCarterasBoletos.getId()));
            }

            if (this.rangosCarterasBoletos.getFolioInicio().toUpperCase().equals(daoRangosCarterasBoletos.getFolioInicioId(this.session, this.rangosCarterasBoletos.getId()))) {
                this.rangosCarterasBoletos.setFolioInicio(daoRangosCarterasBoletos.getFolioInicioId(this.session, this.rangosCarterasBoletos.getId()));
            }

            if (this.rangosCarterasBoletos.getFolioFin().toUpperCase().equals(daoRangosCarterasBoletos.getFolioFinId(this.session, this.rangosCarterasBoletos.getId()))) {
                this.rangosCarterasBoletos.setFolioFin(daoRangosCarterasBoletos.getFolioFinId(this.session, this.rangosCarterasBoletos.getId()));
            }            

            if (daoRangosCarterasBoletos.getRangoPorNumeroBoletoId(this.session, this.rangosCarterasBoletos.getNumeroBoletos(), this.rangosCarterasBoletos.getId())) {
                this.rangosCarterasBoletos.setNumeroBoletos(daoRangosCarterasBoletos.getNumeroBoletoId(this.session, this.rangosCarterasBoletos.getId()));
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El numero de boletos ya fue definido en otro rango."));

                return;
            }

            if (Integer.parseInt(this.rangosCarterasBoletos.getFolioInicio().substring(1, 6)) >= Integer.parseInt(this.rangosCarterasBoletos.getFolioFin().substring(1, 6))) {
                this.rangosCarterasBoletos.setFolioInicio(daoRangosCarterasBoletos.getFolioInicioId(this.session, this.rangosCarterasBoletos.getId()));
                this.rangosCarterasBoletos.setFolioFin(daoRangosCarterasBoletos.getFolioFinId(this.session, this.rangosCarterasBoletos.getId()));
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El folio inicial de cartera no debe ser mayor o igual al folio final."));

                return;
            }

            if (daoRangosCarterasBoletos.comprobarCarteraRangoId(this.session, this.rangosCarterasBoletos.getFolioInicio().toUpperCase(), this.rangosCarterasBoletos.getId())) {
                this.rangosCarterasBoletos.setFolioInicio(daoRangosCarterasBoletos.getFolioInicioId(this.session, this.rangosCarterasBoletos.getId()));
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El folio inicio de cartera esta dentro de un rango no valido."));

                return;
            }

            if (daoRangosCarterasBoletos.comprobarCarteraRangoId(this.session, this.rangosCarterasBoletos.getFolioFin().toUpperCase(), this.rangosCarterasBoletos.getId())) {
                this.rangosCarterasBoletos.setFolioFin(daoRangosCarterasBoletos.getFolioFinId(this.session, this.rangosCarterasBoletos.getId()));
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: ", "El folio fin de cartera esta dentro de un rango no valido."));
                return;
            }
            

            this.rangosCarterasBoletos.setNumeroBoletos(this.rangosCarterasBoletos.getNumeroBoletos());
            this.rangosCarterasBoletos.setFolioInicio(this.rangosCarterasBoletos.getFolioInicio().toUpperCase());
            this.rangosCarterasBoletos.setFolioFin(this.rangosCarterasBoletos.getFolioFin().toUpperCase());
            daoRangosCarterasBoletos.actualizaRango(this.session, rangosCarterasBoletos);

            this.transaction.commit();

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información: ", "Se actualizó correctamente el rango."));

            this.rangosCarterasBoletos = new RangosCarterasBoletos();

        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas" + e.getMessage()));

        } finally {
            if (this.session != null) {
                session.close();
            }
        }

    }

    public RangosCarterasBoletos obtenerRangoPorFolio(String folio) {
        this.session = null;
        this.transaction = null;

        try {
            DaoRangosCarterasBoletos daoRangosCarterasBoletos = new DaoRangosCarterasBoletos();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            rangosCarterasBoletos = daoRangosCarterasBoletos.getRangoCarterasPorFolio(this.session, folio);

            this.transaction.commit();

            return rangosCarterasBoletos;

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

    public int obtenerNumeroBoletosFolio(String folio) {
        this.session = null;
        this.transaction = null;

        try {
            DaoRangosCarterasBoletos daoRangosCarterasBoletos = new DaoRangosCarterasBoletos();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();

            this.numeroBoletos = daoRangosCarterasBoletos.getNumneroBoletosPorFolio(this.session, folio);

            this.transaction.commit();

            return this.numeroBoletos;

        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas" + e.getMessage()));
            return 0;

        } finally {
            if (this.session != null) {
                session.close();
            }
        }

    }
    
    public boolean verificaNumeroBoleto(String folio)
    {
        this.session = null;
        this.transaction = null;

        try {
            DaoRangosCarterasBoletos daoRangosCarterasBoletos = new DaoRangosCarterasBoletos();

            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = this.session.beginTransaction();
            
            

            if(daoRangosCarterasBoletos.VerificaNumneroBoletosPorFolio(this.session, folio)){
                System.out.println("entre8 "+folio);
                this.transaction.commit();
                return true;
            }else{
                System.out.println("entre9 "+folio);
                this.transaction.commit();
            return false;
            }

            


        } catch (Exception e) {
            if (this.transaction != null) {
                this.transaction.rollback();
            }
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error fatal: ", "contacte a sistemas" + e.getMessage()));
            return false;

        } finally {
            if (this.session != null) {
                session.close();
            }
        }
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

    public RangosCarterasBoletos getRangosCarterasBoletos() {
        return rangosCarterasBoletos;
    }

    public void setRangosCarterasBoletos(RangosCarterasBoletos rangosCarterasBoletos) {
        this.rangosCarterasBoletos = rangosCarterasBoletos;
    }

    public List<RangosCarterasBoletos> getListaRangosCarterasBoletos() {
        return listaRangosCarterasBoletos;
    }

    public void setListaRangosCarterasBoletos(List<RangosCarterasBoletos> listaRangosCarterasBoletos) {
        this.listaRangosCarterasBoletos = listaRangosCarterasBoletos;
    }

    public HashMap getHm() {
        return hm;
    }

    public void setHm(HashMap hm) {
        this.hm = hm;
    }

    public List<SelectItem> getItems() {
        return items;
    }

    public void setItems(List<SelectItem> items) {
        this.items = items;
    }

    public int getValorSeleccionado() {
        return valorSeleccionado;
    }

    public void setValorSeleccionado(int valorSeleccionado) {
        this.valorSeleccionado = valorSeleccionado;
    }

    public RangosCarterasBoletos getRangosCarterasBoletosE() {
        return rangosCarterasBoletosE;
    }

    public void setRangosCarterasBoletosE(RangosCarterasBoletos rangosCarterasBoletosE) {
        this.rangosCarterasBoletosE = rangosCarterasBoletosE;
    }

    public List<RangosCarterasBoletos> getRangos() {
        return rangos;
    }

    public void setRangos(List<RangosCarterasBoletos> rangos) {
        this.rangos = rangos;
    }

    public int getNumeroBoletos() {
        return numeroBoletos;
    }

    public void setNumeroBoletos(int numeroBoletos) {
        this.numeroBoletos = numeroBoletos;
    }

}
