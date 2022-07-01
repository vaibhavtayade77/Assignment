package com.yash.TDDprograms.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.TDDprograms.Q6_Vowel;

public class Q6_Vowel_Test_Case {
	
	 @Test
	    public void test() {
	        assertEquals(true,Q6_Vowel.VowelCount("vaibhav"));
	    }
	    @Test
	    public void test1() {
	        assertEquals(true,Q6_Vowel.VowelCount("sujit"));
	    }

	}



