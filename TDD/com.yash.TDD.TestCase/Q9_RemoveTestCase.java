package com.yash.TDDprograms.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.TDDprograms.Q9_RemoveWS;

public class Q9_RemoveTestCase {
	
	
	@Test
	public void Remove() {
		
		assertEquals(" vaibhav tayade pune buldhana karvenagar  ", Q9_RemoveWS.remove("9vaibhav%tayade$pune@buldhana@karvenagar12"));
	}

}
