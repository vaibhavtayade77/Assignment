package com.yash.TDDprograms.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.TDDprograms.Q8_EvenOrNot;

public class Q8_EvenTestCase {
	
	@Test
	public void eventest() {
		
		assertEquals(true, Q8_EvenOrNot.EvenCheck(5));
	}

}
