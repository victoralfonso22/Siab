/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Pojos.Boletos;
import org.hibernate.Session;

/**
 *
 * @author Víctor
 */
public interface InterfaceBoletos {

    public Boletos getBoletos(Session session, int idCartera) throws Exception;

    public void guardarBoletos(Session session, Boletos boletos) throws Exception;
    
    public Boletos getBoletoFolio(Session session, String folio) throws Exception;
    
    public boolean comprobarExisteBoleto(Session session, String folio) throws Exception;
}
