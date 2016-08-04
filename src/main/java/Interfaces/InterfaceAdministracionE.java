/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Pojos.CodigoPostal;
import Pojos.Estados;
import Pojos.Localidades;
import Pojos.Municipios;
import Pojos.Promotores;
import Pojos.Regiones;
import Pojos.Sectores;
import Pojos.ViewLocalidadCp;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Soporte 07
 */
public interface InterfaceAdministracionE {
    
    public List<Estados>getEstados(Session session)throws Exception;
    public List<Municipios>getMunicipios(Session session, int idEstado)throws Exception;
    public List<Municipios>getMuni(Session session)throws Exception;
    
    public List<Localidades>getLocalidades(Session session, int idMun) throws Exception;
    public List <Localidades>getColonias(Session session)throws Exception;
    
    public List<CodigoPostal>getCodigos(Session session, int colonia)throws Exception;
    
    public List<CodigoPostal>getCodigos(Session session)throws Exception;
    
    public CodigoPostal getCodigoPostal(Session session,int idcodigo)throws Exception;
    public Localidades getColonia(Session session, int id) throws Exception;
    public Estados getEstado(Session session, int idEstado)throws Exception;
    public Municipios getMunicipio(Session session, int idMun)throws Exception;
    public Regiones getRegion(Session session ,int idRegion)throws Exception;
    public List<Regiones>getRegiones(Session session)throws Exception;
    
    public void AltaPromotor(Session session, Promotores promotor )throws Exception;
    
    /*
    public void Registra(Session session,CodigoPostal codigo, Estados estado, Municipios municipio,Localidades idlocal, Regiones region,
               Sectores sectores, String clave, String nombre, String paterno,String materno, 
               Date fechanaci, String calle, String numI,String numE,Integer idSector, 
               String tipo, String rfc, Date fechasis, int idus, int estatus,
               String telC, String telO, int ext,String celular, String correo,
               String observaciones, Integer meta, Double comision, Integer tipoEnlace, String carrera,
               String matricula, Integer numeroPersonal, Integer idPromotorpadre, Integer replica, Integer publicoGeneral)throws   Exception;
    
    */
    
    public Regiones CortoRegion (Session session, int idRegion )throws Exception;
    
    public String getContador(Session session,String tipo )throws Exception;
    
    public boolean validaPromotor(Session session,String rfc)throws Exception;
    
    public List<Promotores> getPromotores(Session session)throws Exception;
    
    public void editaPromotor(Session session,int  id ,  String rfc,String nombre,String paterno,String materno,String calle, String numE,String numI,int idEstado,int idmun,int idcol,int cp,String telC,String telO, String ext) throws Exception;
    
    //String telC,String telO, String ext
            
    
   
    
    
    
    
}
