package com.stackroute.mar16demos.newpkg;


public class AccountNotFoundException extends Exception {
	
	private String exceptionMsg;
	
	public AccountNotFoundException(String exceptionMsg) {
		super(exceptionMsg);
		this.exceptionMsg =exceptionMsg;
	}
	
	
}
