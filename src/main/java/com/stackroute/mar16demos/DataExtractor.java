package com.stackroute.mar16demos;

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
	static Gson gson;

	static HashMap<String,String> innerData = null;
	static HashMap<Integer,HashMap<String,String>> newData = new HashMap<>();
	
	public static void extractData(File fileObj) throws IOException {
		
		System.out.println(System.getProperty("user.dir"));
		FileReader fileReader = new FileReader(fileObj);
		BufferedReader br = new BufferedReader(fileReader);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(newfilepath)));
		
		gson = new GsonBuilder().setPrettyPrinting().create();
		
		String newline = "";
		String[] header = br.readLine().split(",");
		int count=0;
		
		while((newline = br.readLine()) !=null) {
			String[] playerdata = newline.split(",");
			innerData = new HashMap<String,String>();
			for(int i=0;i < playerdata.length;i=i+2)
				innerData.put(header[i], playerdata[i]);
			
			newData.put(++count,innerData);
		}
		
		String playerjsondata = gson.toJson(newData);
		bw.write(playerjsondata);
		bw.close();
		br.close();
		
	
	}
	
}
