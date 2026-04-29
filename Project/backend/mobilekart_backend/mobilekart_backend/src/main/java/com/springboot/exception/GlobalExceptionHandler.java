package com.springboot.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<Map<String,Object>> handleException(RuntimeException ex){
		Map<String,Object> map = new HashMap<>();
//		map.put("message", ex.getMessage());
		System.out.println("Exception : "+ex.getMessage());
		map.put("message", "Something Went Wrong");
		map.put("status", HttpStatus.UNAUTHORIZED.value());
		
		return new ResponseEntity<Map<String,Object>>(map,HttpStatus.UNAUTHORIZED);
	}
	
	@ExceptionHandler(JwtCustomException.class)
	public ResponseEntity<Map<String,Object>> handleJwtException(JwtCustomException ex){
		Map<String,Object> map = new HashMap<>();
		map.put("message", ex.getMessage());
		map.put("status", 498);
		
		return new ResponseEntity<Map<String,Object>>(map,HttpStatus.BAD_REQUEST);
	}
	
}
