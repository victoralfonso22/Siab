/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Pojos.Formatos;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Víctor
 */
public interface InterfaceFormatos {    
    public List<Formatos> ver(Session session)throws Exception;
    
    public Formatos existeFormato (Session session,int folio,String tipo)throws Exception;
    public void agregaFolioUnico(Session session, int folio , String tipo, char estatus)throws Exception;
    public void cancelaFolioUnico(Session session, int folio, String estatus)throws Exception;
    public List<Formatos>verificaRango(Session session,int folioI, int folioF, String tipo)throws Exception;
    
  
    
    
    
    
    
    
    
}
