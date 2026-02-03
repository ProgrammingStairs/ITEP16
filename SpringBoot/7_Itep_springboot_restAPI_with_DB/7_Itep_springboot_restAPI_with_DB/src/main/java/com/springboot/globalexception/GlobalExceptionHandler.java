package com.springboot.globalexception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Map<String, String>> customException(UserNotFoundException ex){
		Map<String,String> error = new HashMap<>();
		error.put("message","User not Found");
		return new ResponseEntity<Map<String,String>>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>> argsException(MethodArgumentNotValidException ex){
		Map<String,String> error = new HashMap<>();  
		ex.getBindingResult()
			.getFieldErrors()
				.forEach(err-> error.put(err.getField(), err.getDefaultMessage()));
		return new ResponseEntity<Map<String,String>>(error,HttpStatus.BAD_REQUEST);
	}
}












