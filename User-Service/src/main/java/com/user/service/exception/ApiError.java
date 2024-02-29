package com.user.service.exception;

import org.springframework.http.HttpStatus;

public class ApiError {
	
	

	public ApiError(String message, boolean success, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.success = success;
		this.httpStatus = httpStatus;
	}

	public ApiError() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String message;
	
	private boolean success;
	
	private HttpStatus httpStatus;

	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	@Override
	public String toString() {
		return "ApiError [message=" + message + ", success=" + success + ", httpStatus=" + httpStatus + "]";
	}
	
	
}
