package com.springboot.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(JwtCustomException.class)
	public ResponseEntity<Map<String,String>> handleException(JwtCustomException ex){
		Map<String,String> map = new HashMap<>();
		map.put("status", "403");
		map.put("message", "forbidden");
		map.put("exceptionMessage",ex.getMessage());
		
		return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
	}	
}
