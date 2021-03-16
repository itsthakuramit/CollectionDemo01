package com.stackroute.mar16demos.newpkg;

import java.io.File;
import java.io.IOException;

public class MainApp3 {
	
	public static void main(String[] args) {
		int[] number = new int[] {100,200,300};
		int number2 = 0;
		try {
			System.out.println(number[3]/number2);
		}catch(ArithmeticException e) {
			if(number2 == 0)
				System.out.println(number[2]);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Issue with the Array index");
		}
		
		System.out.println("End of program");
	}
	
	
}
