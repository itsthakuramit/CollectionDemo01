package com.stackroute.mar16demos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataExtractor2 {
	
	static String newfilepath = System.getProperty("user.dir")+"/data/newplayerdata.txt";

	public static void extractData(File fileObj) throws IOException {
		
		FileReader fileReader = new FileReader(fileObj);
		BufferedReader br = new BufferedReader(fileReader);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(newfilepath)));
		
		
		String newline = "";
		
		while((newline = br.readLine()) !=null) {
			System.out.println(newline);
			bw.write(newline+"\n");
			
			
		}
		
		bw.close();
		br.close();
		
	
	}
	
}
