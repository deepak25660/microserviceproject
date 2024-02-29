package com.rating.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	
	public ResponseEntity<Map<String, Object>> ResourceNotFoundHandler(ResourceNotFoundException ex)
	{
		
		Map<String, Object> map= new HashMap<>();
		
		map.put("message", ex.getMessage());
		map.put("status",HttpStatus.NOT_FOUND);
		map.put("timestamp", LocalDateTime.now());
		return new  ResponseEntity<Map<String,Object>>(map,HttpStatus.NOT_FOUND);
	}
}
