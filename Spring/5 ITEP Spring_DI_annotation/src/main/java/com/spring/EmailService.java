package com.spring;

public class EmailService{
	private String emailMessage;
	
	public EmailService(String emailMessage) {
		this.emailMessage = emailMessage;
	}
	
	public void printEmailMessage() {
		System.out.println("This is Email service Message : "+emailMessage);
	}
}