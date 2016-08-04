/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Pojos.ViewLocalizacion;
import java.util.List;
import org.hibernate.Session;
/**
/**
 *
 * @author Soporte 07
 */
public interface InterfaceMun {
    
     public List<ViewLocalizacion>getVista(Session sesion, Integer idEstado)throws  Exception;
    // public List<ViewLocalizacion>getVista(Session sesion)throws  Exception;
     public List<ViewLocalizacion>vistaCompleta(Session sesion)throws  Exception;
    
    
    
}
