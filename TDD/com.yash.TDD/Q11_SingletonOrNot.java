package com.yash.TDDprograms;

public class Q11_SingletonOrNot {
	
	private static volatile Q11_SingletonOrNot singletonInstance = new Q11_SingletonOrNot();
	
	private Q11_SingletonOrNot() {
		
	}
	
	public static Q11_SingletonOrNot getInstance() {
		return singletonInstance;
	}

}
