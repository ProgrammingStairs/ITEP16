package com.spring.config;

import java.io.File;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import jakarta.servlet.MultipartConfigElement;
import jakarta.servlet.ServletRegistration;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	private final static long MAX_FILE_SIZE = 20*1024*1024;
	// 20 * 1024 kilobytes (1mb) * 1024 bytes(1kb) = 20 mb
	private final static long MAX_REQUEST_SIZE = 40*1024*1024;
	private final static int FILE_THRESHOLD = 0;
	
	@Override
	public Class<?>[] getRootConfigClasses(){
		return new Class<?>[] {HibernateConfig.class};
	}
	
	@Override
	public Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {AppConfig.class};
	}
	
	@Override
	public String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	@Override 
	public void customizeRegistration(ServletRegistration.Dynamic registration) {
		
		File uploadFile = new File("uploadDemo");
		if(!uploadFile.exists())
			uploadFile.mkdir();
		
		MultipartConfigElement multipartConfig = new MultipartConfigElement(
				uploadFile.getAbsolutePath(),
				MAX_FILE_SIZE,
				MAX_REQUEST_SIZE,
				FILE_THRESHOLD
		);
		
	    registration.setMultipartConfig(multipartConfig);
	}
}
