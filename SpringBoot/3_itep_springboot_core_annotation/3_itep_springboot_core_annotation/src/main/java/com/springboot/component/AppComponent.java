package com.springboot.component;

import org.springframework.stereotype.Component;

@Component
public class AppComponent {
	
	public void componentMessage() {
		System.out.println("This is component method..!!");
	}

	public String componentMessageNew() {
		return "This is New component method..!!";
	}

}
