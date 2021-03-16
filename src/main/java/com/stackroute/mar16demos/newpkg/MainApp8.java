package com.stackroute.mar16demos.newpkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApp8 {
	
	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader(new File("C:\\abc.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}
