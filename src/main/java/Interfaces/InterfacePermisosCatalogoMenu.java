/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Pojos.PermisosCatalogoMenu;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Víctor
 */
public interface InterfacePermisosCatalogoMenu {
    public PermisosCatalogoMenu getCatalogoMenuSeccionPermisos(Session session, int idCatalogoSecciones, int idUsuario)throws Exception;
    public List<PermisosCatalogoMenu> getCatalogoMenuSeccion(Session session, int idCatalogoSecciones)throws Exception;
    public List<PermisosCatalogoMenu> getPermisosCatalogoMenu(Session session, int idUsuario) throws Exception;
    public List<PermisosCatalogoMenu> getCatalogoMenuSeccionUsuario(Session session, int idCatalogoSecciones, int idUsuario) throws Exception;
}
