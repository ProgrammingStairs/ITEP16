
package com.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@SpringBootApplication
public class Application5 {

	private final static Logger logger = LoggerFactory.getLogger(Application5.class);
	
	public static void main(String[] args) {
		logger.info(">>>>>>>> Before run method execution");
		SpringApplication.run(Application5.class, args);
		logger.info(">>>>>>>> After run method execution");
	}
	
	@Bean
	public CommandLineRunner printMessageNew(){
		return args->{
			logger.info(">>>>>>>>>>>> CommandLineRunner executes");
		};
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info(">>>>>>>>>>>> post construct method executes");
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info(">>>>>>>>>>>> pre destroy method executes");
	}

}
