package com.springboot;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Demo {
	public static void main(String args[]) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String password = "12345678";
		String encPassword = encoder.encode(password);
		System.out.println("Password : "+encPassword);
		// $2a$10$GpcqfPOYuXMbAxxRiJIYV.7zBZDtiTLOJ4p5TzI88GaRQ52Nltky2
	}
}
