
package Interfaces;

import Pojos.Estados;
import Pojos.Localidades;
import Pojos.Municipios;
import Pojos.ViewLocalidadCp;

import java.util.List;
import org.hibernate.Session;


public interface InterfaceLocalidades {
    
    
     public List<Estados>getEstados(Session sesion)throws  Exception;
     public List<Municipios>getMunicipios(Session sesion,int idEstado)throws Exception;
     public List<ViewLocalidadCp>getLocalidades(Session sesion,int idMun)throws Exception;
     public void RegistraLocalidad(Session sesion,String nombre ,int idMunicipio)throws  Exception;
     public Localidades validaNombre(Session sesion, String nombre)throws Exception;
     public void borrarlocalidad(Session sesion ,int id ) throws Exception;
     public void actualiza(Session sesion,int id, String nombre, int idMuncipio )throws Exception;
     
    
    
    
    
}
