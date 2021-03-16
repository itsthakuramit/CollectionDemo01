package com.stackroute.mar16demos.newpkg;

import java.io.File;
import java.io.IOException;

public class MainApp7 {
	
	public static void main(String[] args) {
		int[] number = new int[] {100,200,300};
		int number2 = 0;
		try {
			System.out.println(number[3]/number2);
		}finally {
			System.out.println("End of Execution");
		}
		System.out.println("Last one");
		
	}
	
	
}
