/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Pojos.CodigoPostal;
import Pojos.Estados;
import Pojos.Localidades;
import Pojos.Municipios;
import Pojos.Promotores;
import Pojos.Regiones;
import Pojos.Promotores;
import Pojos.Sectores;
import Pojos.ViewLocalidadCp;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Soporte 07
 */
public class DaoAdministracionE {

    
    
     public List<Estados> getEstados (Session session) throws Exception{
        String hql = "select  e from Estados e order by nombre ";
        Query query = session.createQuery(hql);
        return (List<Estados>) query.list();
        
    }
     
     
    public List<Municipios>getMunicipios(Session session, int idEstado) throws Exception{
    String hql = " select m from Municipios m where idEstado =:idEstado order by nombre";
    Query query = session.createQuery(hql);
    query.setParameter("idEstado", idEstado);
    return (List<Municipios>) query.list();
    }
    
    public List<Municipios>getMuni(Session session)throws Exception{
    	String hql = "  from Municipios  order by nombre";
        Query query = session.createQuery(hql);
        return (List<Municipios>) query.list();
    	
    }
    
    
    
    
      public List<Localidades> getLocalidades(Session session, int idMun) throws Exception{
      String hql = "from Localidades where  idMunicipio=:idMun order by nombre";
      Query query = session.createQuery(hql);
      query.setParameter("idMun", idMun);
     return (List<Localidades>) query.list();
        
    }
      
      public List <Localidades>getColonias(Session session)throws Exception{
    	  String hql = "from Localidades group by nombre";
          Query query = session.createQuery(hql);
          return (List<Localidades>) query.list();
      }
      
      
       public List<Regiones>getRegiones(Session session)throws Exception{
           String hql = "from Regiones  order by region";
           Query query = session.createQuery(hql);
        return (List<Regiones>) query.list();
           
       }
           public Localidades getColonia(Session session, int id) throws Exception{
        String hql = "from Localidades where id =:id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        Localidades colonia = (Localidades) query.uniqueResult();
        return colonia;    
               
           }
     public List<CodigoPostal> getCodigos(Session session, int colonia) throws Exception{
     String hql = "from  CodigoPostal where id_localidad=:colonia order by cp";
    //String hql = "select f from ViewLocalizacion f where idMunicipio =:idMun  group by f.localidad"; group by cp
      Query query = session.createQuery(hql);
      query.setParameter("colonia", colonia);
      // query.setParameter("nombre", hql);
      return (List<CodigoPostal>) query.list();
        
    }
     
       public CodigoPostal getCodigoPostal(Session session,int idcodigo)throws Exception{
      String hql = "from CodigoPostal where id =:idcodigo";
        Query query = session.createQuery(hql);
        query.setParameter("idcodigo", idcodigo);
        CodigoPostal codigo = (CodigoPostal) query.uniqueResult();
        return codigo;  
      }
       
        public Estados getEstado(Session session, int idEstado)throws Exception{
            
             String hql = "from Estados where id =:idEstado";
        Query query = session.createQuery(hql);
        query.setParameter("idEstado", idEstado);
        Estados estado= (Estados) query.uniqueResult();
        return estado;  
            
        }
        
        public Municipios getMunicipio(Session session, int idMun)throws Exception{
            
        String hql = "from Municipios where id =:idMun";
        Query query = session.createQuery(hql);
        query.setParameter("idMun", idMun);
        Municipios municipio= (Municipios) query.uniqueResult();
        return municipio;  
       }
        
       public Regiones getRegion(Session session ,int idRegion)throws Exception{
           
        String hql = "from Regiones where id =:idRegion";
        Query query = session.createQuery(hql);
        query.setParameter("idRegion", idRegion);
        Regiones region= (Regiones) query.uniqueResult();
        return region;  
      }
    
    //    session.save(rangosCarterasBoletos);
     
        public void AltaPromotor(Session session, Promotores promotor )throws Exception{
            
            session.save(promotor);
        }
        
       
        public Integer getContador(Session session,String tipo )throws Exception{
        String hql = "select count(*)  from Promotores  where tipo=:tipo";
        Query query = session.createQuery(hql);
        query.setParameter("tipo", tipo);
        Integer cont =Integer.parseInt( query.uniqueResult().toString());
        
        System.out.print("aki va el contador"+cont);
        
        //Integer cont=(Integer) query.uniqueResult();
        
        return cont;
       }
        
        
        public Regiones CortoRegion (Session session, int idRegion )throws Exception{
            String hql = "from Regiones where id =:idRegion";
        Query query = session.createQuery(hql);
        query.setParameter("idRegion", idRegion);
        Regiones region= (Regiones) query.uniqueResult();
        return region;
            
        }
        
         public boolean validaPromotor(Session session,String rfc)throws Exception{
             
            String hql = "from Promotores where rfc=:rfc ";
             Query query = session.createQuery(hql);
             query.setParameter("rfc", rfc);
             Promotores promotor= (Promotores) query.uniqueResult();
             System.out.print("llego la validacion");
             
              if (promotor != null) {
            return true;
        } else {
            return false;
        }
            
         }
              
       public List<Promotores> getPromotores(Session session)throws Exception{
       String hql = "select  p from Promotores p order by nombres ";
        Query query = session.createQuery(hql);
       System.out.print("ahy va la tabla");
        
        return (List<Promotores>) query.list();
        
        
         }
       
       
       
       //numeroInterior;
  
         public void editaPromotor(Session session,int  id, String rfc, String nombre,String paterno,String materno, Date fnaci,  String calle,String numE,String numI,int idEstado,int idmun,int idcol ,int cp,String telC,String telO, String ext) throws Exception{
          String hql="update Promotores set rfc=:rfc,nombres=:nombre ,apellidoPaterno=:paterno,apellidoMaterno=:materno,fecha_nacimiento=:fnaci,calle=:calle,numeroExterior=:numE,numeroInterior=:numI,id_estado=:idEstado,id_municipio=:idmun ,id_localidad=:idcol ,id_codigo_postal=:cp, telefonoCasa=:telC, telefonoOficina=:telO, ext=:ext  where id=:id";   
          
          Query query = session.createQuery(hql);
          query.setParameter("id", id);
          query.setParameter("rfc", rfc);
          query.setParameter("nombre", nombre);
          query.setParameter("paterno", paterno);
          query.setParameter("materno", materno);
             query.setParameter("fnaci", fnaci);
          
          
          
          
          query.setParameter("calle", calle);
          query.setParameter("numE", numE);
          query.setParameter("numI", numI);
          query.setParameter("idEstado", idEstado);
          query.setParameter("idmun", idmun);
          
           query.setParameter("idcol", idcol);
           query.setParameter("cp", cp);
          
           //, telefonoCasa=:telC, telefonoOficina=:telO,ext=:ext 
     
           query.setParameter("telC", telC);
           query.setParameter("telO", telO);
           query.setParameter("ext", ext);
     
          
          
         query.executeUpdate();
          
             
         }
         
         
         
         
         
         
         
         
       
        public void actualiza(Session sesion,int id, String nombre, int region, int estado)throws Exception{
      
        String hql="update Municipios set nombres=:nombre ,idRegion =:region,idEstado =:estado where id =:id ";
        Query query = sesion.createQuery(hql);
        query.setParameter("id", id);
        query.setParameter("nombre", nombre);
        query.setParameter("region", region);
        query.setParameter("estado", estado);
        query.executeUpdate();
       
        
    }
    
             
             
        
            
            
             
             

       
       
       
       
       
    
    
       
}
