/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convertidores;
import BeanAplicacion.MBAUsuarios;
import BeanVista.MBUsuarios;
import Pojos.Usuarios;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
 
	 

/**
 *
 * @author Víctor
 */
@FacesConverter("usuariosConverter")
public class ConvertidorUsuario implements Converter{

    
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if(value != null && value.trim().length() > 0) {
            try {
                MBAUsuarios mbAUsuarios = (MBAUsuarios) fc.getExternalContext().getApplicationMap().get("mBAUsuarios");
                System.out.println(value);
                for(Usuarios u : mbAUsuarios.getUsuariosIniciales()){
                    if(u.getId().equals(Integer.parseInt(value))){
                        return u;
                    }
                }
                return null;
                //return mbUsuarios.getUsuariosIniciales().get(Integer.parseInt(value));
            } catch(NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "No valido."+e.getMessage()));
            }
        }
        else {
            return null;
        }
    }
 
    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object object) {
        if(object != null) {
            return String.valueOf(((Usuarios) object).getId());
        }
        else {
            return null;
        }
    }   
}  
    
    
	 

    
    

