package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class MaxEnd3Test {

	/*
    Given an array of ints length 3, figure out which is larger between the first and last elements
    in the array, and set all the other elements to be that value. Return the changed array.
    MakeArray([1, 2, 3]) → [3, 3, 3]
    MakeArray([11, 5, 9]) → [11, 11, 11]
    MakeArray([2, 11, 3]) → [3, 3, 3]
    */
	
	private MaxEnd3 maxEnd3;
	
	@Before
	public void setUp() {
		maxEnd3 = new MaxEnd3();
	}
	
	@Test
	public void test_returning_array_with_larger_values() {
		
		Assert.assertEquals("Testing return of array with largest value",  new int[] { 3, 3, 3 }, maxEnd3.makeArray(new int[] { 1, 2, 3 }));
		Assert.assertEquals("Testing return of array with largest value",  new int[] { 11, 11, 11 }, maxEnd3.makeArray(new int[] { 11, 5, 9 }));
		Assert.assertEquals("Testing return of array with largest value",  new int[] { 3, 3, 3 }, maxEnd3.makeArray(new int[] { 2, 11, 3 }));
	}
	

}