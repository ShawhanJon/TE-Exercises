package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class FrontTimesTest {

	/*
	 * Given a string and a non-negative int n, we'll say that the front of the
	 * string is the first 3 chars, or whatever is there if the string is less than
	 * length 3. Return n copies of the front; frontTimes("Chocolate", 2) →
	 * "ChoCho" frontTimes("Chocolate", 3) → "ChoChoCho" frontTimes("Abc", 3) →
	 * "AbcAbcAbc"
	 */
	
	private FrontTimes frontTimes;
	
	@Before
	public void setUp() {
		frontTimes = new FrontTimes();
	}
	
	@Test
	public void test_number_of_returned_copies() {
		
		Assert.assertEquals("Testing number of returned copies",  "ChoCho", frontTimes.generateString("Chocolate", 2));
		Assert.assertEquals("Testing concatenation",  "ChoChoCho", frontTimes.generateString("Chocolate", 3));
		Assert.assertEquals("Testing concatenation",  "AbcAbcAbc", frontTimes.generateString("Abc", 3));
	}
	

}