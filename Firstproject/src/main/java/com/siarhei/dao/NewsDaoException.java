package com.siarhei.dao;


public class NewsDaoException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public  NewsDaoException(String message) {
		super(message);
	}
	
	public NewsDaoException(String message, Exception exception) {
		super(message, exception);
	}

}
