package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring")
public class AppConfig{
	
	// here we are going to create bean with method
	@Bean
	public Demo1Service demo1Service() {
		return new Demo1Service();
	}
	
}