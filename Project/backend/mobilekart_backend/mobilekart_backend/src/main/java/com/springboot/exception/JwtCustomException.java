package com.springboot.exception;

public class JwtCustomException extends Exception {
	public JwtCustomException(String message) {
		super(message);
	}
}
