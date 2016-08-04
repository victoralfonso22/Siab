package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import Pojos.CarteraBoleto;
import Pojos.RangosCarterasBoletos;
import Interfaces.InterfaceCarterasBoletos;

public class DaoCarterasBoletos implements InterfaceCarterasBoletos {

	@Override
	public void agregar(Session session, String cartera, String boleto)
			throws Exception {
		
		CarteraBoleto cb = new CarteraBoleto();
		cb.setBoleto(boleto);
		cb.setCartera(cartera);
		session.save(cb);	
		
	}

	@Override
	public List<CarteraBoleto> listarBoletos(Session session, String cartera) throws Exception {
		String hql = " from CarteraBoleto where cartera=:cartera";
	    Query query = session.createQuery(hql);
	    query.setParameter("cartera", cartera);
	    return (List<CarteraBoleto>) query.list();
		
	}

	@Override
	public boolean existe(Session session, String cartera, String boleto)throws Exception {
		String hql = " from CarteraBoleto where cartera=:cartera and boleto=:boleto";
	    Query query = session.createQuery(hql);
	    query.setParameter("cartera", cartera);
	    query.setParameter("boleto", boleto);
	    System.out.println("Cartera111 "+cartera+"  boleto "+boleto);
	    CarteraBoleto carteraBoleto = (CarteraBoleto) query.uniqueResult();
        if (carteraBoleto != null) {
            return true;
        } else {
            return false;
        }
	    

	}
	
	@Override
	public boolean existeCartera(Session session, String cartera)throws Exception {
		String hql = " from CarteraBoleto c where c.cartera=:cartera group by c.cartera";
	    Query query = session.createQuery(hql);
	    query.setParameter("cartera", cartera);	    
	    CarteraBoleto carteraBoleto = (CarteraBoleto) query.uniqueResult();
        if (carteraBoleto != null) {
            return true;
        } else {
            return false;
        }
	    

	}
	
	@Override
	public void borrarCartera(Session session, String cartera)throws Exception {
		String hql = " delete CarteraBoleto where cartera=:cartera";
	    Query query = session.createQuery(hql);
	    query.setParameter("cartera", cartera);
	    query.executeUpdate();
	}

	@Override
	public int contarBoletos(Session session, String cartera) throws Exception {
		String hql = " select count(cartera) from CarteraBoleto where cartera=:cartera";
	    Query query = session.createQuery(hql);
	    query.setParameter("cartera", cartera);
	    List listResult = query.list();
	    Number number = (Number) listResult.get(0);
	    return (int) number.intValue();
	}

}
