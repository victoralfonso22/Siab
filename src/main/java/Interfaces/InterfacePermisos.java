/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Pojos.Permisos;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Víctor
 */
public interface InterfacePermisos {
    
    public List<Permisos> getPermisosUsuario(Session session, int idUsuario)throws Exception;
    public void actualizarPermisosUsuario(Session session, Permisos permisos)throws Exception;
    public Permisos getPermisosActualizacion(Session session, int idUsuario, int idCatalogoMenu)throws Exception;
    public void guardarPermisosActualizacion(Session session, Permisos permisos)throws Exception;
    
}
