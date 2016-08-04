/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import Pojos.Estados;
import Pojos.Municipios;
import java.util.List;
import org.hibernate.Session;
/**
 *
 * @author Soporte 07
 */
public interface InterfaceMunicipios {
    
    public List<Municipios>getMunicipios(Session sesion)throws  Exception;
    //public void registraRango(Session session, RangosCarterasBoletos rangosCarterasBoletos)throws Exception;
    public void registraMunicipio(Session session,String nombre, int idEstado, int idRegion)throws Exception;
    
    public Municipios getValida(Session session, String nombre) throws Exception;
    
    public void eliminaMunicipio(Session session, Municipios municipio) throws Exception;
    
    public void borrarMunicipio(Session session, int id)throws Exception;
    
    public List<Estados>getEstados(Session sesion)throws  Exception;
    
    public void actualiza(Session sesion,int id, String nombre, int region, int estado )throws Exception;
            
    
    
    
    
    
}
