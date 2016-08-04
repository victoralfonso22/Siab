package Convertidores;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import BeanAplicacion.MBAEstados;
import BeanAplicacion.MBAUsuarios;
import Pojos.Estados;
import Pojos.Usuarios;


@FacesConverter("estadosConverter")
public class ConvertidorEstado implements Converter{
	

	  @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if(value != null && value.trim().length() > 0) {
	          try {
	                MBAEstados mbAEstados = (MBAEstados) fc.getExternalContext().getApplicationMap().get("mBAEstados");
	                System.out.println(value);
	                for(Estados u : mbAEstados.getEstadosIniciales()){
	                    if(u.getId().equals(Integer.parseInt(value))){
	                        return u;
	                    }
	                }
	                return null;
	            
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
	            return String.valueOf(((Estados) object).getId());
	        }
	        else {
	            return null;
	        }
	    }  
	   
	

}




    

    
    


