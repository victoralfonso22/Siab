package Clases;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import BeanSesion.MBSesion;

import org.primefaces.context.RequestContext;

@ManagedBean
public class IdleMonitorView {
     
    public void onIdle() {
    	RequestContext context = RequestContext.getCurrentInstance();
    	context.execute("PF('sesionT').show();");
       
    }
    
   /* public String closeSession(){
    
    	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
    	httpSession.invalidate();
    	return "/login.xhtml";
    	
    }
 */
 
}