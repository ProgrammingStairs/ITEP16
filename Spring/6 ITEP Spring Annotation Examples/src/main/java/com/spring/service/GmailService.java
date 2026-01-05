package com.spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Component
@Service
@Lazy
@Primary
public class GmailService implements EmailService{
	
	@Value("${app.gmailEmail}")
	String gmailEmail;

	public GmailService() {
		System.out.println("GmailService constructor called");
	}
	
	public void printEmailMessage() {
		System.out.println("Hello User, your email id is "+gmailEmail);
	}

}
