package com.yash.TDDprograms.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.yash.TDDprograms.Q2_PalindromeString;


public class Q2_StringPalindromeTestCase {
	
	@Test
	public void StringPalindromeTest() {
		
		assertEquals(true,Q2_PalindromeString.StringPalindrome("nitin"));
		
	}

}
