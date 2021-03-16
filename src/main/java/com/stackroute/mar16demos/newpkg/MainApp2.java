package com.stackroute.mar16demos.newpkg;

import java.io.File;
import java.io.IOException;

public class MainApp2 {
	
	public static void main(String[] args) throws IOException {
	
		String filePath = System.getProperty("user.dir")+"/data/player.csv";
		File dataFile = new File(filePath);
		
		DataExtractor.extractData(dataFile);
		
	}
	
	
}
