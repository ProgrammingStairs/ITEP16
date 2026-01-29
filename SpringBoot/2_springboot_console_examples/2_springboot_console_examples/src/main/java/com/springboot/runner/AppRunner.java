package com.springboot.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner{
	
	private final static Logger logger = LoggerFactory.getLogger(AppRunner.class);

	@Override 
	public void run(ApplicationArguments args) {
		logger.info(">>>>>>>>>>>> Application Runner executes...");
		for(String arg : args.getSourceArgs()) {
			System.out.println("--> arg : "+arg);
		}
	}
}
