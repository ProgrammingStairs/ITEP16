package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication{
	public static void main(String args[]) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Demo1Service demo1= context.getBean(Demo1Service.class);
		demo1.setMessage("This is an example of annotation based");
		System.out.println("Demo1Service : "+demo1.getMessage());
		demo1.printMessage();
		
		Demo2Service demo2Service = context.getBean(Demo2Service.class);
		demo2Service.printMessage();
	
	}
}