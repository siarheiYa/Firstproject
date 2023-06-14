package com.siarhei.service;

public class ServiceException extends Exception {

	private static final long serialVersionUID = 623483130992143208L;
	
	public ServiceException() {
		super();
		
	}
	public ServiceException(String message) {
		super(message);
		
	}
	
	public ServiceException(Exception e) {
		super(e);
	
	}
	
	public ServiceException(String message, Exception e) {
		super(message, e);
	
	}
}
