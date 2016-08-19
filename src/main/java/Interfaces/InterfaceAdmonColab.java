package Interfaces;

import java.util.List;

import org.hibernate.Session;

import Pojos.CodigoPostal;
import Pojos.ColaboradoresHistorial;
import Pojos.Localidades;
import Pojos.Promotores;
import Pojos.Referencias;
import Pojos.Colaboradores;


public interface InterfaceAdmonColab {
	
	
	  public List<ColaboradoresHistorial> getcolaboradores(Session session)throws Exception;
	  
	  public List<CodigoPostal>getcodigos(Session session)throws Exception;
	  public List<CodigoPostal>getCodigos(Session session, int colonia) throws Exception;
	  
	  
	  public List<Localidades>getcolonias(Session session)throws Exception;
	  public List<Localidades>getcolonias(Session session, int municipio)throws Exception;
	  
	  public List<Promotores>getPromotores(Session session)throws Exception;
	  //public List<Promotores>getPromotores(Session session, int municipio)throws Exception;
	  public List<Referencias>getReferencias(Session session)throws Exception;
	  
	  public void AltaColaborador(Session session, Colaboradores colaborador )throws Exception;
	  
	  

}
