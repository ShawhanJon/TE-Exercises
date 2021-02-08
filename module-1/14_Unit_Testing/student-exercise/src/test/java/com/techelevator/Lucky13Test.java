package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class Lucky13Test {

	/*
	 * Given an array of ints, return true if the array contains no 1's and no 3's.
	 * GetLucky([0, 2, 4]) → true GetLucky([1, 2, 3]) → false GetLucky([1, 2,
	 * 4]) → false
	 */
	
	private Lucky13 lucky13;
	
	@Before
	public void setUp() {
		lucky13 = new Lucky13();
	}
	
	@Test
	public void test_returning_true() {
		
		Assert.assertEquals("Testing return of true with no 1s or 3s",  true, lucky13.getLucky(new int[] { 0, 2, 4 }));
		Assert.assertEquals("Testing return of true with no 1s or 3s",  false, lucky13.getLucky(new int[] { 1, 2, 3 }));
		Assert.assertEquals("Testing return of true with no 1s or 3s",  false, lucky13.getLucky(new int[] { 1, 2, 4 }));
	}
	

}