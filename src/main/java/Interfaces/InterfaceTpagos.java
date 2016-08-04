/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Pojos.TiposPagos;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Soporte 07
 */
public interface InterfaceTpagos {
    
    
    public List<TiposPagos> generaLista(Session session)throws Exception;
    public  void eliminar(Session session, int id)throws Exception;
    public void agregar(Session session, String  tipo, char movimiento, char estatus)throws Exception;
    public void editar(Session session,String tipo,String movimiento, int id)throws Exception;
    
    
}
