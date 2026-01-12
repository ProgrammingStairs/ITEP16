package com.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	public Class<?>[] getRootConfigClasses(){
		return null;
	}
	
	@Override
	public Class<?>[] getServletConfigClasses(){
		return new Class<?>[] {AppConfig.class};
	}
	
	@Override
	public String[] getServletMappings() {
		return new String[] {"/"};
	}
}

