package com.jawelsandstons.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MyStons {

	public static void main(String[] args) {
		
	
	HashMap<String, String> myHashMap = new HashMap<String,String>();
	
	myHashMap.put("AaBbCcDdEeFfGgHhIiJjKkLlMmNn—nOoPpQqRrSsTtVvWwXxYyZz","AAAbbbZZZzRrrHHHnnJJJkkk—PPPP");
	
	for(Map.Entry<String,String> entry : myHashMap.entrySet()) {
		int count=0;
	    String vals [] = entry.getValue().split(""); 
	    for(String val:vals){
	    	
	    	  if(entry.getKey().contains(val)) count++;
	    	  
	     }
	    System.out.println("De las Joyas" + " "+  entry.getKey() + " " + ":tenemos"+ " " + count + " " + "Piedras");
	   
	}
	
	    

	}
		 
		 
		 
	    
		

	
}
