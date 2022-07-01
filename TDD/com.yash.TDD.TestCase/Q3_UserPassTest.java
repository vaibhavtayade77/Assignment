package com.yash.TDDprograms.test;import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.TDDprograms.Q3_UserPass;


public class Q3_UserPassTest {
	
	@Test
    public void test() {
        assertEquals(true, Q3_UserPass.CheckEmailandPassword("vaibhav@gmail.com", "vaibhav123"));
    }

}
