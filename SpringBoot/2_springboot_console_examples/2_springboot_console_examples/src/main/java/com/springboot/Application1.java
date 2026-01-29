package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application1 {

	public static void main(String[] args) {
		SpringApplication.run(Application1.class, args);
		System.out.println("This is my first spring boot example");
	}

}
