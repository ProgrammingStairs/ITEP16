package com.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application4 {

	private final static Logger logger = LoggerFactory.getLogger(Application4.class);
	
	public static void main(String[] args) {
		System.out.println("executes before");
		SpringApplication.run(Application4.class, args);
		logger.info(">>>>>>>> This is an example of logger info");
		logger.error(">>>>>>>> This is an example of logger error");
		logger.debug(">>>>>>>> This is an example of logger debug");
	}
	
}
// slf4j = simple logging facade for java
