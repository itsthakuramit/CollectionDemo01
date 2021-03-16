package com.stackroute.mar16demos.newpkg;


public class DemoExcept {
	
	
	public void displaymsg(int accountno) throws AccountNotFoundException {
		
		if(accountno < 1000) {
			throw new AccountNotFoundException("Account number less than 1000");
		}else {
			System.out.println("Valid account --- Welcome !!!");
		}
		
	}
	
	
}
