package Convertidores;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import BeanAplicacion.MBACodigos;
import Pojos.CodigoPostal;




@FacesConverter("CodigosConverter")
public class ConvertidorCodigos  implements Converter{
	
	

	  @Override
  public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
      if(value != null && value.trim().length() > 0) {
	          try {
	                MBACodigos mbACodigos = (MBACodigos) fc.getExternalContext().getApplicationMap().get("mBACodigos");
	                //System.out.println(value);
	                for(CodigoPostal u : mbACodigos.getCodigosIniciales()){
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
	            return String.valueOf(((CodigoPostal) object).getId());
	        }
	        else {
	            return null;
	        }
	    }  
	   
	
	
	

}
