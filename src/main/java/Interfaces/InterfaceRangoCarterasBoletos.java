/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Pojos.RangosCarterasBoletos;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Víctor
 */
public interface InterfaceRangoCarterasBoletos {
    public List<RangosCarterasBoletos> getRangoCarterasBoletos(Session session)throws Exception;
    public RangosCarterasBoletos getRangoCarterasBoletosPorId(Session session, int idRango)throws Exception;
    public void registraRango(Session session, RangosCarterasBoletos rangosCarterasBoletos)throws Exception;
    public void borrarRango(Session session, RangosCarterasBoletos rangosCarterasBoletos)throws Exception;
    public boolean comprobarCarteraRango(Session session, String folioCartera)throws Exception;
    public boolean getRangoPorNumeroBoleto(Session session, int numBoletos)throws Exception;
    public boolean getRangoPorNumeroBoletoId(Session session, int numBoletos,int idRango) throws Exception;
    public void actualizaRango(Session session, RangosCarterasBoletos rangosCarterasBoletos) throws Exception;
    public boolean comprobarCarteraRangoId(Session session, String folioCartera,int idRango)throws Exception;
    public int getNumeroBoletoId(Session session, int idRango)throws Exception;
    public String getFolioInicioId(Session session, int idRango)throws Exception;
    public String getFolioFinId(Session session, int idRango)throws Exception;
    public RangosCarterasBoletos getRangoCarterasPorFolio(Session session, String folioCartera)throws Exception;
    public int getNumneroBoletosPorFolio(Session session, String folioCartera)throws Exception;
    public boolean VerificaNumneroBoletosPorFolio(Session session, String folioCartera) throws Exception;
    
}
