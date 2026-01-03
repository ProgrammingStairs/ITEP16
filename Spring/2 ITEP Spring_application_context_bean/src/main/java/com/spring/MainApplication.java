package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication{
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Demo1Service demo1= (Demo1Service)context.getBean("demo1Service");
		System.out.println("Demo1Service : "+demo1.getMessage());
		demo1.printMessage();
		
		Demo2Service demo2Service = context.getBean(Demo2Service.class);
		demo2Service.printMessage();
	
	}
}