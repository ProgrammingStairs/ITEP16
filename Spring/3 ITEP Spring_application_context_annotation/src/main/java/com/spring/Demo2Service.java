package com.spring;

import org.springframework.stereotype.Component;

// here we are going to create bean by class
@Component
public class Demo2Service{
	
	public void printMessage() {
		System.out.println("Demo2Service message is going to be print");
	}
	
}