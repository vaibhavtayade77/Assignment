package com.yash.TDDprograms.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.TDDprograms.Q15_Item;



public class Q15_ItemTestCase {
	
	@Test
    public void test() throws Exception {
		assertEquals(true, Q15_Item.checkItem(11, "milk", 20, 25.50, "30/03/21", "01/03/22"));
       
    }

}


