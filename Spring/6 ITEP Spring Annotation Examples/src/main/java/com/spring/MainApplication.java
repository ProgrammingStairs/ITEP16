package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

import com.spring.service.EmailService;
import com.spring.service.HelloService;
import com.spring.service.SmsService;
@Component
public class MainApplication {
	private EmailService emailService;
	private SmsService smsService;
	
	// field injection
	@Autowired
	private HelloService helloService;

	// when @Primary annotation is not set, then we need to set bean explicitly by @Qualifier annotation
//	public MainApplication(@Qualifier("gmailService") EmailService emailService) {
//		this.emailService = emailService;
//	}

	// when @Primary annotation is already set, then that bean comes here and set in emailService
	// constructor injection
	public MainApplication(EmailService emailService) {
		this.emailService = emailService;
	}
	
	// setter injection
	@Autowired
	public void setSmsService(SmsService smsService) {
		this.smsService = smsService;
	}
	
	public void actionPerformed() {
		helloService.printHelloServiceMessage();
		emailService.printEmailMessage();
		
	}
	public static void main(String args[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MainApplication mainApp =  context.getBean(MainApplication.class);
		mainApp.actionPerformed();
		
		SmsService sms1 =  context.getBean(SmsService.class);
		System.out.println("sms1 : "+sms1);
		sms1.printNumber();
		SmsService sms2 =  context.getBean(SmsService.class);
		System.out.println("sms2 : "+sms2);
		sms2.printNumber();
		
		((AbstractApplicationContext)context).close();
		// here close runs @PreDestroy method when @Scope is Singleton
	}
}
