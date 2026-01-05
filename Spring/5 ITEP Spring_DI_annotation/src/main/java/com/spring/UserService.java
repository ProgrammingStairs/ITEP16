package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{
	private EmailService emailService;
	private HelloService helloService;
	
	// field injection
	@Autowired
	private SMSService smsService;
	
	public UserService() {
		System.out.println("This is an example of UserService");
	}
	
	// constructor injection 
	@Autowired // if you have more than one constructor, then you needs to write @AutoWired annotation here
	public UserService(EmailService emailService) {
		this.emailService = emailService;
	}
	
	// setter injection
	@Autowired
	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}
	
	public void actionPerformed() {
		emailService.printEmailMessage();
		helloService.setHelloMessage("This is hello message");
		helloService.getHelloMessage();
		smsService.printSmsService();
	}
}