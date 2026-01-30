package com.springboot.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.springboot.config.AppConfig2;

import jakarta.annotation.PostConstruct;

@Component
@PropertySource("classpath:application.properties")
public class AppComponentNew {

		private AppComponent appComponent;
		private AppConfig2 appConfig2;
		
		@Value("${app.name}")
		String name;
		
		@Value("${app.version}")
		String version;
		
		@Autowired
		public AppComponentNew(AppConfig2 appConfig2,AppComponent appComponent) {
			this.appConfig2 = appConfig2;
			this.appComponent = appComponent;
		}
		

	    @PostConstruct
	    public void init() {
	        showMessage();   // ✅ SAFE
	    }

		
		public void showMessage() {
			appComponent.appComponentMessage();
			System.out.println("Name : "+appConfig2.getName()+" Version : "+appConfig2.getVersion());
			System.out.println("\nName : "+name+" Version : "+version);
		}
}
