/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojos;

/**
 *
 * @author Víctor
 */
public class PermisosCatalogoMenu implements java.io.Serializable {
    
    private Integer id;
     private Integer idUsuario;
     private Integer idCatalogoMenu;
     private Integer permiso;
     private Integer idPermiso;
     private String modulo;
     private String etiqueta;
     private Integer idCatalogoSecciones;
     private String url;
     private Integer prioridad;
     
     public PermisosCatalogoMenu() {
     }
    
    public PermisosCatalogoMenu(String modulo,String etiqueta, Integer idCatalogoSecciones,String url, Integer prioridad, Integer idPermiso,Integer idUsuario,Integer idCatalogoMenu,Integer permiso){
        this.idUsuario = idUsuario;
        this.idCatalogoMenu = idCatalogoMenu;
        this.permiso = permiso;
        this.idPermiso = idPermiso;
        this.modulo = modulo;
        this.etiqueta = etiqueta;
        this.idCatalogoSecciones = idCatalogoSecciones;
        this.url = url;
        this.prioridad = prioridad;  
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdCatalogoMenu() {
        return idCatalogoMenu;
    }

    public void setIdCatalogoMenu(Integer idCatalogoMenu) {
        this.idCatalogoMenu = idCatalogoMenu;
    }

    public Integer getPermiso() {
        return permiso;
    }

    public void setPermiso(Integer permiso) {
        this.permiso = permiso;
    }

    public Integer getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(Integer idPermiso) {
        this.idPermiso = idPermiso;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Integer getIdCatalogoSecciones() {
        return idCatalogoSecciones;
    }

    public void setIdCatalogoSecciones(Integer idCatalogoSecciones) {
        this.idCatalogoSecciones = idCatalogoSecciones;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }   
    
    
}
