package Interfaces;

import java.util.List;

import org.hibernate.Session;

import Pojos.Sectores;
import Pojos.VistaSectores;

public interface InterfaceSectores {
	
	public Sectores sectorId(Session session, int id)throws Exception;
	public List<Sectores> sectoresPadreMayor(Session sesion) throws Exception;
	public List<Sectores> sectoresHijos(Session sesion, int id) throws Exception;
	public List<VistaSectores> sectoresVista(Session session) throws Exception;
	public List<VistaSectores> sectoresPadreMayorVista(Session sesion) throws Exception;
	public List<VistaSectores> sectoresHijosVista(Session sesion, int id) throws Exception;
	public Long tieneSectoresHijosVista(Session sesion, int id) throws Exception;
	public int metaSector(Session sesion, int id) throws Exception;
	public int comisionSector(Session sesion, int id) throws Exception;
	public String nombreSector(Session sesion, int id) throws Exception;
	public List<VistaSectores> sectoresVistaId(Session sesion, int id) throws Exception;
	public void edit(Session sesion, Sectores s) throws Exception;
}
