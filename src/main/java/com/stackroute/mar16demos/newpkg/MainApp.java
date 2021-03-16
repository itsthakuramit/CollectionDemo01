package com.stackroute.mar16demos.newpkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApp {
	
	public static void main(String[] args){

		DemoExcept demo = new DemoExcept();
		try {
			demo.displaymsg(100);
		} catch (AccountNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	
}
