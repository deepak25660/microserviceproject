package com.user.service.exception;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiError> handlerResourceNotFound(ResourceNotFoundException ex) {
		ApiError api = new ApiError(ex.getMessage(), true, HttpStatus.NOT_FOUND);

		return new ResponseEntity<ApiError>(api, HttpStatus.NOT_FOUND);
	}
}
