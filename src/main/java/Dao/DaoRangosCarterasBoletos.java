/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Interfaces.InterfaceRangoCarterasBoletos;
import Pojos.RangosCarterasBoletos;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Víctor
 */
public class DaoRangosCarterasBoletos implements InterfaceRangoCarterasBoletos {

    @Override
    public List<RangosCarterasBoletos> getRangoCarterasBoletos(Session session) throws Exception {
        String hql = "from RangosCarterasBoletos order by numeroBoletos";
        Query query = session.createQuery(hql);
        return (List<RangosCarterasBoletos>) query.list();

    }

    @Override
    public RangosCarterasBoletos getRangoCarterasBoletosPorId(Session session, int idRango) throws Exception {
        String hql = "from RangosCarterasBoletos where id =:idRango";
        Query query = session.createQuery(hql);
        query.setParameter("idRango", idRango);
        RangosCarterasBoletos rangosCarterasBoletos = (RangosCarterasBoletos) query.uniqueResult();
        return rangosCarterasBoletos;
    }

    @Override
    public void registraRango(Session session, RangosCarterasBoletos rangosCarterasBoletos) throws Exception {
        session.save(rangosCarterasBoletos);
    }

    @Override
    public void borrarRango(Session session, RangosCarterasBoletos rangosCarterasBoletos) throws Exception {
        session.delete(rangosCarterasBoletos);
    }

    @Override
    public boolean comprobarCarteraRango(Session session, String folioCartera) throws Exception {
        String hql = "from RangosCarterasBoletos where :folioCartera between folioInicio and folioFin";
        Query query = session.createQuery(hql);
        query.setParameter("folioCartera", folioCartera);
        RangosCarterasBoletos rangosCarterasBoletos = (RangosCarterasBoletos) query.uniqueResult();
        if (rangosCarterasBoletos != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean getRangoPorNumeroBoleto(Session session, int numBoletos) throws Exception {
        String hql = "from RangosCarterasBoletos where numeroBoletos =:numBoletos";
        Query query = session.createQuery(hql);
        query.setParameter("numBoletos", numBoletos);
        RangosCarterasBoletos rangosCarterasBoletos = (RangosCarterasBoletos) query.uniqueResult();
        if (rangosCarterasBoletos != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean getRangoPorNumeroBoletoId(Session session, int numBoletos, int idRango) throws Exception {
        String hql = "from RangosCarterasBoletos where numeroBoletos =:numBoletos and id !=:idRango";
        Query query = session.createQuery(hql);
        query.setParameter("numBoletos", numBoletos);
        query.setParameter("idRango", idRango);
        RangosCarterasBoletos rangosCarterasBoletos = (RangosCarterasBoletos) query.uniqueResult();
        if (rangosCarterasBoletos != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void actualizaRango(Session session, RangosCarterasBoletos rangosCarterasBoletos) throws Exception {
        session.update(rangosCarterasBoletos);
    }

    @Override
    public boolean comprobarCarteraRangoId(Session session, String folioCartera, int idRango) throws Exception {
        String hql = "from RangosCarterasBoletos where :folioCartera between folioInicio and folioFin  and id !=:idRango";
        Query query = session.createQuery(hql);
        query.setParameter("folioCartera", folioCartera);
        query.setParameter("idRango", idRango);
        RangosCarterasBoletos rangosCarterasBoletos = (RangosCarterasBoletos) query.uniqueResult();
        if (rangosCarterasBoletos != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getNumeroBoletoId(Session session, int idRango) throws Exception {
        String hql = "select numeroBoletos from RangosCarterasBoletos where id =:idRango";
        Query query = session.createQuery(hql);
        query.setParameter("idRango", idRango);
        return (Integer) query.uniqueResult();

    }

    @Override
    public String getFolioInicioId(Session session, int idRango) throws Exception {
        String hql = "select folioInicio from RangosCarterasBoletos where id =:idRango";
        Query query = session.createQuery(hql);
        query.setParameter("idRango", idRango);
        return query.uniqueResult().toString();
    }

    @Override
    public String getFolioFinId(Session session, int idRango) throws Exception {
        String hql = "select folioFin from RangosCarterasBoletos where id =:idRango";
        Query query = session.createQuery(hql);
        query.setParameter("idRango", idRango);
        return query.uniqueResult().toString();
    }

    @Override
    public RangosCarterasBoletos getRangoCarterasPorFolio(Session session, String folioCartera) throws Exception {
        String hql = "from RangosCarterasBoletos where :folioCartera between folioInicio and folioFin";
        Query query = session.createQuery(hql);
        query.setParameter("folioCartera", folioCartera);
        return (RangosCarterasBoletos) query.uniqueResult();
    }

    @Override
    public int getNumneroBoletosPorFolio(Session session, String folioCartera) throws Exception {
        String hql = "select numeroBoletos from RangosCarterasBoletos where :folioCartera between folioInicio and folioFin";
        Query query = session.createQuery(hql);
        query.setParameter("folioCartera", folioCartera);
        return (int) query.uniqueResult();
    }

    @Override
    public boolean VerificaNumneroBoletosPorFolio(Session session, String folioCartera) throws Exception {
        String hql = "from RangosCarterasBoletos where :folioCartera between folioInicio and folioFin";
        Query query = session.createQuery(hql);
        query.setParameter("folioCartera", folioCartera);
        RangosCarterasBoletos rangosCarterasBoletos = (RangosCarterasBoletos) query.uniqueResult();
        if (rangosCarterasBoletos != null) {
            return true;
        } else {
            return false;
        }
    }

}
