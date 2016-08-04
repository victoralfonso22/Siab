/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Pojos.TiposIdentificacion;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Soporte 07
 */
public interface InterfaceDocumentacion {
    
    public List<TiposIdentificacion>listaDatos(Session session)throws Exception;
    public void eliminarDato(Session session , int id)throws Exception;
    public void editarDato(Session session,int id, String tipo)throws Exception;
    public void agregarDato(Session sesssion, String tipo)throws Exception;
    
    
   
    
    
    
    
}
