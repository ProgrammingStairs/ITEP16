package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.component.AppComponent;
import com.springboot.repository.AppRepository;

@Service
public class AppService {
	
	public AppRepository appRepository; 
	public AppComponent appComponent;
	
	@Autowired
	public AppService(AppRepository appRepository,AppComponent appComponent) {
		this.appRepository = appRepository;
		this.appComponent = appComponent;
		showMessage();
	}
		
	public void serviceMethod() {
		System.out.println("This is Service method");	
	}
	
	public String serviceRepoMessage() {
		return appRepository.repositoryMessage();
	}
	
	public void showMessage() {
		serviceMethod();
		System.out.println("Message 1 : "+serviceRepoMessage());
		appComponent.componentMessage();
		System.out.println("Message 2 : "+appComponent.componentMessageNew());
	}
}
