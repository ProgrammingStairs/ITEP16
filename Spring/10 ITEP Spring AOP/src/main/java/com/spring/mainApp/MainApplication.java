package com.spring.mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;
import com.spring.service.UserService;

public class MainApplication {
	public static void main(String args[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService service = context.getBean(UserService.class);
		
		service.displayUserService();
		service.drawUserService();
		try {
			service.showUserService();			
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		System.out.println("name : "+service.printName());
	}
}
