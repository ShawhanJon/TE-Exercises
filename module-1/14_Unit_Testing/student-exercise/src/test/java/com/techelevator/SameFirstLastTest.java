package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class SameFirstLastTest {

	/*
    Given an array of ints, return true if the array is length 1 or more, and the first element and
    the last element are equal.
    IsItTheSame([1, 2, 3]) → false
    IsItTheSame([1, 2, 3, 1]) → true
    IsItTheSame([1, 2, 1]) → true
    */
	
	private SameFirstLast sameFirstLast;
	
	@Before
	public void setUp() {
		sameFirstLast = new SameFirstLast();
	}
	
	@Test
	public void test_returning_true_with_array_of_ints() {
		
		Assert.assertEquals("Testing true on array of ints",  false, sameFirstLast.isItTheSame(new int[] { 1, 2, 3 }));
		Assert.assertEquals("Testing concatenation",  true, sameFirstLast.isItTheSame(new int[] { 1, 2, 3, 1 }));
		Assert.assertEquals("Testing concatenation",  true, sameFirstLast.isItTheSame(new int[] { 1, 2, 1 }));
	}
	

}