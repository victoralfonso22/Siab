/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Pojos.Usuarios;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Víctor
 */
public interface InterfaceUsuarios {
    public boolean registar(Session session,Usuarios usuarios) throws Exception;
    public List<Usuarios> ver(Session session)throws Exception;
    public Usuarios obtenerPorUsername(Session session, String username, String pass)throws Exception;
    public Usuarios obtenerPorID(Session session, int id) throws Exception;
    public Usuarios detalles(Session session,String usuario)throws Exception;
    public void actualizar(Session session,String pass,String usuario)throws Exception;
}
