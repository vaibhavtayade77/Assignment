package com.yash.TDDprograms.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.TDDprograms.Q11_SingletonOrNot;

public class Q11_SingletonTestCase {
	
	@Test
	public void singleton() {
		
		Q11_SingletonOrNot instance1 = Q11_SingletonOrNot.getInstance();
		Q11_SingletonOrNot instance2 = Q11_SingletonOrNot.getInstance();
	        System.out.println("checking singleton class objects equality");
	        assertEquals(true, instance1==instance2);
		
	}

}
