package com.stackroute.mar16demos.newpkg;

import java.io.File;
import java.io.IOException;

public class MainApp4 {
	
	public static void main(String[] args) {
		int[] number = new int[] {100,200,300};
		int number2 = 0;
		try {
			System.out.println(number[3]/number2);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
			System.out.println(ae.getMessage());
		}
		
		
	}
	
	
}
