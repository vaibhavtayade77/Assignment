package com.yash.TDDprograms.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.TDDprograms.Q1_HCF;

public class Q1_HCFTestcase {

	@Test
	public void getHCF_Test_case() {

		System.out.println("HCF test case");
		assertEquals(12, Q1_HCF.getHCF(36, 60));
	}

}
