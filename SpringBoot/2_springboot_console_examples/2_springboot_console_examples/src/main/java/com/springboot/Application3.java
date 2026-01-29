package com.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class Application3 {

	public static void main(String[] args) {
		SpringApplication.run(Application3.class, args);
	}
	
	@Bean
	@Order(2)
	public CommandLineRunner printMessage1() {
		return args->{
			System.out.println("This is an example of command_line_runner_1");
		};
	}
	@Bean
	@Order(1)
	public CommandLineRunner printMessage2() {
		return args->{
			System.out.println("This is an example of command_line_runner_2");
		};
	}

}
