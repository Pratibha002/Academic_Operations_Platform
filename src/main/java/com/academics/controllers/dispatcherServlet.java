package com.academics.controllers;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import com.academics.AppConfig;

public class dispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer  {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class A[]= {AppConfig.class};
		return A;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String B []  = {"/abc/*"}; 
		return B;
	}

}
