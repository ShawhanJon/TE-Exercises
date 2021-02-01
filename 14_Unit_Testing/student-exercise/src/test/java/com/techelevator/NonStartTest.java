package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class NonStartTest {

	/*
    Given 2 strings, return their concatenation, except omit the first char of each. The strings will
    be at least length 1.
    GetPartialString("Hello", "There") → "ellohere"
    GetPartialString("java", "code") → "avaode"
    GetPartialString("shotl", "java") → "hotlava"
    */
	
	private NonStart nonStart;
	
	@Before
	public void setUp() {
		nonStart = new NonStart();
	}
	
	@Test
	public void test_concatenation_of_string() {
		
		Assert.assertEquals("Testing concatenation",  "ellohere", nonStart.getPartialString("Hello", "There"));
		Assert.assertEquals("Testing concatenation",  "avaode", nonStart.getPartialString("java", "code"));
		Assert.assertEquals("Testing concatenation",  "hotlava", nonStart.getPartialString("shotl", "java"));
	}
	

}