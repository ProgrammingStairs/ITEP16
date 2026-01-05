package com.spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//@Component
@Service
public class YahooService implements EmailService{
	
	@Value("${app.yahooEmail}")
	String yahooEmail;

	public YahooService() {
		System.out.println("YahooService constructor called");
	}
	
	public void printEmailMessage() {
		System.out.println("Hello User, your email id is "+yahooEmail);
	}

}
