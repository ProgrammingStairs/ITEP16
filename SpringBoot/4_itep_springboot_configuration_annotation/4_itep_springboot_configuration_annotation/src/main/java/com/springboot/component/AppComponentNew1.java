package com.springboot.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.springboot.config.AppConfig2;

import jakarta.annotation.PostConstruct;

@Component
@PropertySource("classpath:application.properties")
public class AppComponentNew1 {

		private AppComponent appComponent;
		private AppConfig2 appConfig2;
		private String name,version;
		
		@Autowired
		public AppComponentNew1(AppConfig2 appConfig2,
				AppComponent appComponent,
				@Value("${app.name}") String name,
				@Value("${app.version}") String version
		) {
			this.appConfig2 = appConfig2;
			this.appComponent = appComponent;
			this.name = name;
			this.version = version;
	        showMessage();  
	    }

		public void showMessage() {
			appComponent.appComponentMessage();
			System.out.println("Again Name : "+appConfig2.getName()+" Version : "+appConfig2.getVersion());
			System.out.println("\nName : "+name+" Version : "+version);
		}
}
