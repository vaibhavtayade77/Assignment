package com.yash.TDDprograms.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.TDDprograms.Q4_ArmstrongOrNot;

public class Q4_ArmstrongTestCase {
	
	
	
	
	 @Test
     public void Armstrong_test() {

         assertEquals(true,Q4_ArmstrongOrNot.armstrongnumber(153));
     }

 }
//	public void ArmstrongTestCase() {
//		System.out.println("Armstrong number test case ");
//		assertEquals(true, Q4_ArmstrongOrNot.Armstrong(370));
//	}


