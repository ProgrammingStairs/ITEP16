package com.spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
@Scope("singleton")
//@Scope("prototype")
public class SmsService {
	
	@Value("${app.number}")
	long number;
	
	public SmsService() {
		System.out.println("SmsService Constructor Invoked");
	}
	
	public void printNumber() {
		System.out.println("You Received SMS from : "+number);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("post construct annotation called");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("invoked by spring before termination of bean");
	}
}
