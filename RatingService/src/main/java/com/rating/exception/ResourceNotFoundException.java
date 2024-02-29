package com.rating.exception;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException() {
		super("Rating id not found");
		// TODO Auto-generated constructor stub
	}

	public ResourceNotFoundException(String mesage) {
		super(mesage);
		// TODO Auto-generated constructor stub
	}
}
