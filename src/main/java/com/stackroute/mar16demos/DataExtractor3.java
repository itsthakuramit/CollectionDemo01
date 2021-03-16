package com.stackroute.mar16demos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DataExtractor3 {
	
	static String newfilepath = System.getProperty("user.dir")+"/data/newplayerdata.txt";
	
	static List<Player> playerlist = new ArrayList<>();
	static Gson gson;
	
	public static void extractData(File fileObj) throws IOException {
		
		System.out.println(System.getProperty("user.dir"));
		FileReader fileReader = new FileReader(fileObj);
		BufferedReader br = new BufferedReader(fileReader);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(newfilepath)));
		
		gson = new GsonBuilder().setPrettyPrinting().create();
		
		String newline = "";
		String header = br.readLine();
		
		while((newline = br.readLine()) !=null) {
			//System.out.println(newline);
			String[] playerdata = newline.split(",");
			Player player = new Player(playerdata[0],playerdata[1],playerdata[2],playerdata[3]);
			playerlist.add(player);
			
		}
		
		String playerjsondata = gson.toJson(playerlist);
		System.out.println(playerjsondata);
		bw.write(playerjsondata);
		bw.close();
		br.close();
		
	
	}
	
}
