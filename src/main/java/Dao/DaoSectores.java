package Dao;

import java.util.List;

import org.hibernate.Session;

import java.util.List;

import org.hibernate.Query;

import Interfaces.InterfaceSectores;
import Pojos.Carteras;
import Pojos.Sectores;
import Pojos.VistaSectores;

public class DaoSectores implements InterfaceSectores {

	@Override
	public Sectores sectorId(Session session, int id)throws Exception {
	String hql = "from Sectores where id =:id ";	
    Query query = session.createQuery(hql);
    query.setParameter("id", id);    
    return (Sectores)query.uniqueResult();
	}
	
	@Override
	public List<Sectores> sectoresPadreMayor(Session session) throws Exception {
		String hql = "from Sectores where id_sector_padre = 0 order by id_region";
        Query query = session.createQuery(hql);
        System.out.println("1");
        return (List<Sectores>) query.list();

	}

	@Override
	public List<Sectores> sectoresHijos(Session session, int id)throws Exception {
	String hql = "from Sectores where id_sector_padre =:id ";	
    Query query = session.createQuery(hql);
    query.setParameter("id", id);
    System.out.println("2");
    return (List<Sectores>) query.list();
	}
	
	@Override
	public List<VistaSectores> sectoresVista(Session session) throws Exception {
		String hql = "from VistaSectores";
        Query query = session.createQuery(hql);
        System.out.println("3");
        return (List<VistaSectores>) query.list();

	}
	
	@Override
	public List<VistaSectores> sectoresPadreMayorVista(Session session) throws Exception {
		String hql = "from VistaSectores where id_sector_padre = 0";
        Query query = session.createQuery(hql);
        System.out.println("4");
        return (List<VistaSectores>) query.list();

	}
	
	@Override
	public List<VistaSectores> sectoresHijosVista(Session session, int id)throws Exception {
	String hql = "from VistaSectores where id_sector_padre =:id ";	
    Query query = session.createQuery(hql);    
    query.setParameter("id", id);
    System.out.println("5");
    return (List<VistaSectores>) query.list();
	}

	@Override
	public Long tieneSectoresHijosVista(Session sesion, int id)throws Exception {
		String hql = "select count(*) from VistaSectores where id_sector_padre =:id";
        Query query = sesion.createQuery(hql);
        query.setParameter("id", id);    
        System.out.println(hql);        
        Long count=(Long)query.uniqueResult();
        System.out.println(id+"count"+count);
        return count;
        }

	@Override
	public int metaSector(Session sesion, int id) throws Exception {
		String hql = "from VistaSectoresMeta where id=:id";
        Query query = sesion.createQuery(hql);
        query.setParameter("id", id);        
        List visSec = query.list();        
        Number number = (Number) visSec.get(0);
        System.out.println("7");
        return (int) number.intValue();
	}

	@Override
	public int comisionSector(Session sesion, int id) throws Exception {
		String hql = "select comisionTotalSector(:id)";
        Query query = sesion.createQuery(hql);
        query.setParameter("id", id);        
        List visSec = query.list();        
        Number number = (Number) visSec.get(0);
        System.out.println("8");
        return (int) number.intValue();
	}

	@Override
	public String nombreSector(Session sesion, int id) throws Exception {
		String hql = "select sectorRegion from VistaSectores where id=:id";
        Query query = sesion.createQuery(hql);
        query.setParameter("id", id);        
        System.out.println(hql);
        return query.uniqueResult().toString();       
        
    }

	@Override
	public List<VistaSectores> sectoresVistaId(Session sesion, int id){
	String hql = "from VistaSectores where id =:id";
    Query query = sesion.createQuery(hql);
    query.setParameter("id", id);
    //System.out.println(hql);
    return (List<VistaSectores>) query.list();
	}

	@Override
	public void edit(Session sesion, Sectores s) throws Exception {
		sesion.update(s);		
		System.out.println("UPDATE"+s.getMeta());
	}
	

}
