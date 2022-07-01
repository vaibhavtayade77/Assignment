package com.yash.TDDprograms;

public class Q9_RemoveWS {
	
	public static String remove(String str) {
		
		//public static void main(String[] args) {
			
		
		//String str="This@#Red&car";
		str=str. replaceAll("[^a-zA-Z+d]", " ");
		System.out.println(str);
		
		
		return str;
		
		
	}

}
