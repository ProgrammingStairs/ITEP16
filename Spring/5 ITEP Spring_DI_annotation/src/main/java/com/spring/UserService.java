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
	
	/* Note : Spring is NOT calling the no-arg constructor because it chooses the constructor that can perform dependency injection.

In your class, Spring finds a parameterized constructor, so it uses that one instead of the default constructor.

 Note : When DOES the default constructor run?
Answer : If Only default constructor exists
 */
	
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