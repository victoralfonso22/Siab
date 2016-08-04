/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Pojos.Carteras;
import org.hibernate.Session;

/**
 *
 * @author Víctor
 */
public interface InterfaceCarteras {
    
    public Carteras getCarteras(Session session, int idCartera)throws Exception;
    public void guardarCartera(Session session, Carteras carteras)throws Exception;
    public boolean comprobarExisteCartera(Session session, String folio) throws Exception;
    public int obtenerID(Session session, String folio)throws Exception;
    
}
