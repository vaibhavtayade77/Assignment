package com.yash.TDDprograms.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.TDDprograms.Q7_Palindrome;

public class Q7_PalindromeTestCase {
	
//	@Test
//	public void PalindromeTestcase() {
//		
//		System.out.println("Palindrome Test Case");
//		assertEquals(1221, Q7_Palindrome.PalindromeOrNot(0));
//	}

	
	@Test
    public void test() {
        assertEquals(true,Q7_Palindrome.palindromeCheck(1221));
    }
}
