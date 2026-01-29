package com.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application2 {

	public static void main(String[] args) {
		SpringApplication.run(Application2.class, args);
		System.out.println("This is my first spring boot example");
	}
	
	@Bean
	public CommandLineRunner printMessage() {
		return args->{
			System.out.println("This is an example of command_line_runner");
		};
	}
}
