package com.spring;


public class HelloService{
	
	private String helloMessage;
	
	public void setHelloMessage(String helloMessage) {
		this.helloMessage = helloMessage;
	}
	
	public void getHelloMessage() {
		System.out.println("This is Hello Service : "+helloMessage);
	}
}