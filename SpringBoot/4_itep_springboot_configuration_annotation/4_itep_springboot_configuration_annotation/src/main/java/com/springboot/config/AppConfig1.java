package com.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springboot.component.AppComponent;

@Configuration
public class AppConfig1 {
	
	@Bean
	public AppComponent appComponent() {
		return new AppComponent();
	}
	
}
