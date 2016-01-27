package com.perficient.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	
	private static final String[] IGNORE_URI = {"/index", "/login", "/resources"};
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		String currentURI = request.getRequestURI();
		System.out.println(">>>"+currentURI);
		for(String uri: IGNORE_URI){
			if(currentURI.contains(uri)){
				return true;
			}
		}
		
		HttpSession loginSession = request.getSession();
		System.out.println("sessionID:"+loginSession.getId());
		if(loginSession != null && loginSession.getAttribute("currentUser") != null){
			System.out.println("currentUser2"+loginSession.getAttribute("currentUser"));
			return true;
		} else {
			response.sendRedirect("index");
			return false;
		}
	}

}
