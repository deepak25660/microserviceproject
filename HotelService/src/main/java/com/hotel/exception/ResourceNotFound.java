package com.hotel.exception;

public class ResourceNotFound extends RuntimeException {

	public ResourceNotFound() {
		super("id doesn't exist");
		// TODO Auto-generated constructor stub
	}

	public ResourceNotFound(String ex) {
		
		super(ex);
		// TODO Auto-generated constructor stub
	}


}
