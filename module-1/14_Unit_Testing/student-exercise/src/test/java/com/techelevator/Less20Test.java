package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class Less20Test {

	 /*
    Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38
    and 39 return true, but 40 returns false.
    (Hint: Think "mod".)
    less20(18) → true
    less20(19) → true
    less20(20) → false
*/
	
	private Less20 less20;
	
	@Before
	public void setUp() {
		less20 = new Less20();
	}
	
	@Test
	public void test_less_than_multiple() {
		
		Assert.assertEquals("Testing less than multiple",  true, less20.isLessThanMultipleOf20(18));
		Assert.assertEquals("Testing less than multiple",  true, less20.isLessThanMultipleOf20(19));
		Assert.assertEquals("Testing less than multiple",  false, less20.isLessThanMultipleOf20(20));
	}
	

}