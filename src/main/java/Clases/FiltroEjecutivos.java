/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 
 * @author Víctor
 */
@WebFilter("/ejecutivos/*")
public class FiltroEjecutivos implements Filter {

	FilterConfig filterConfig;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession(true);
		String requestUrl = req.getRequestURL().toString();
		

		if (session.getAttribute("username") == null && requestUrl.contains("administracion")) {
			res.sendRedirect(req.getContextPath() + "/login");
			
		} else if (session.getAttribute("username") == null && requestUrl.contains("cambios")) {
			res.sendRedirect(req.getContextPath() + "/login");
			
		}else{
			
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {
		this.filterConfig = null;
	}

}