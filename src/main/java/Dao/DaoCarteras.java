/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;

import Interfaces.InterfaceCarteras;
import Pojos.Carteras;

import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Víctor
 */
public class DaoCarteras implements InterfaceCarteras{

    @Override
    public Carteras getCarteras(Session session, int idCartera) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardarCartera(Session session, Carteras carteras) throws Exception {
        session.save(carteras);
    }

    @Override
    public boolean comprobarExisteCartera(Session session, String folio) throws Exception {
        String hql = "from Carteras where folio =:folio";
        Query query = session.createQuery(hql);
        query.setParameter("folio", folio);
        Carteras cartera = (Carteras) query.uniqueResult();    
        System.out.println("Carteraaaaaaaaaaa");
        if (cartera != null) {
            return true;
        } else {
            return false;
        }
    }

	@Override
	public int obtenerID(Session session, String folio) throws Exception {
		String hql = "select id from Carteras where folio =:folio";
        Query query = session.createQuery(hql);
        query.setParameter("folio", folio);
        List listResult = query.list();
	    Number number = (Number) listResult.get(0);
	    return (int) number.intValue();
	}
    
}
