package com.yash.TDDprograms.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.TDDprograms.Q5_PythagorousTemplate;

public class Q5_PythagorousTestCase {
	
	@Test
    public void Pytha_test() {
        assertEquals(true,Q5_PythagorousTemplate.pythagoras(6,8,10));
    }
//    @Test
//    public void test1() {
//        assertEquals(true,Q5_PythagorousTemplate.pythagoras(2,8,10));
//    }

}


