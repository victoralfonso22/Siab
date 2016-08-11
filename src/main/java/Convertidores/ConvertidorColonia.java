package Convertidores;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import BeanAplicacion.MBAColonias;
import Pojos.Localidades;



@FacesConverter("coloniasConverter")
public class ConvertidorColonia implements Converter{
	
	
	 @Override
	    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
	        if(value != null && value.trim().length() > 0) {
		          try {
		                MBAColonias mbAColonias = (MBAColonias) fc.getExternalContext().getApplicationMap().get("mBAColonias");
		                //System.out.println("valor Colonia"+value);
		                for(Localidades u : mbAColonias.getColoniasIniciales()){
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
		            return String.valueOf(((Localidades) object).getId());
		        }
		        else {
		            return null;
		        }
		    }  
		     
	  
	  
	  

}
