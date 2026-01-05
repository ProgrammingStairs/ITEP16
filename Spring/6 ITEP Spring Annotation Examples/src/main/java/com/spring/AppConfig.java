package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.service.HelloService;

@Configuration
@ComponentScan("com.spring")
@PropertySource("classpath:application.properties")
public class AppConfig {
	
	@Bean
	public HelloService helloService() {
		return new HelloService();
	}
}
