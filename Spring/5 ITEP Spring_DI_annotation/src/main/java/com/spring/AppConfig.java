package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring")
public class AppConfig {
	
	@Bean
	public EmailService emailService() {
		return new EmailService("default@gmail.com"); 
	}
	
	@Bean
	public HelloService helloService() {
		return new HelloService();
	}
}
