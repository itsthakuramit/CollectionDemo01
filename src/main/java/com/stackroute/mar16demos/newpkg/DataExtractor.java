package com.stackroute.mar16demos.newpkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DataExtractor {
	
	static String newfilepath = System.getProperty("user.dir")+"/data/newplayerdata.txt";
	
	public static void extractData(File fileObj){
		
		System.out.println(System.getProperty("user.dir"));
		FileReader fileReader;
		try {
			int result = 20/0;
			String[] test = new String[] {"",""};
			test[2] = "100";
			
			fileReader = new FileReader(fileObj);
			BufferedReader br = new BufferedReader(fileReader);
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(newfilepath)));
			
			String newline="";
			while((newline = br.readLine()) !=null) {
				bw.write(newline);
				
			}
			
			bw.close();
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		

	
	}
	
}
