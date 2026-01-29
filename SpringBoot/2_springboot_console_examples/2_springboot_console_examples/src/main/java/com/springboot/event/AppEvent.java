package com.springboot.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AppEvent {
	
	private final static Logger logger = LoggerFactory.getLogger(AppEvent.class);
	@EventListener(ApplicationReadyEvent.class)
	public void onReadyEvent() {
		logger.info(">>>>>>>>>>>> Application Ready event executes...");
	}
}
