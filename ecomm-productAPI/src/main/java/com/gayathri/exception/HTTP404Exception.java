package com.gayathri.exception;

public class HTTP404Exception extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public HTTP404Exception( String Message)
	{
		super(Message);
	}

	public HTTP404Exception(String string, Exception ex) {
		super(string,ex);
	}
	
	

}
