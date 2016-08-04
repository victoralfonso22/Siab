/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Interfaces.InterfaceBoletos;
import Pojos.Boletos;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Víctor
 */
public class DaoBoletos implements InterfaceBoletos{

    @Override
    public Boletos getBoletos(Session session, int idCartera) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardarBoletos(Session session, Boletos boletos) throws Exception {
        session.save(boletos);
    }

    @Override
    public Boletos getBoletoFolio(Session session, String folio) throws Exception {
        String hql = "from Boletos where folio =:folio";
        Query query = session.createQuery(hql);
        query.setParameter("folio", folio);
        return (Boletos) query.uniqueResult();
    }
    
    @Override
    public boolean comprobarExisteBoleto(Session session, String folio) throws Exception {
        String hql = "from Boletos where folio =:folio";
        Query query = session.createQuery(hql);
        query.setParameter("folio", folio);
        Boletos boletos = (Boletos) query.uniqueResult();        
        if (boletos != null) {
            return true;
        } else {
            return false;
        }
    }
    
}
