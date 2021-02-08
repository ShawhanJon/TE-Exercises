package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class DateFashionTest {

	/*
    You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness
    of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result
    getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very
    stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of
    2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
    dateFashion(5, 10) → 2
    dateFashion(5, 2) → 0
    dateFashion(5, 5) → 1
    */
	
	private DateFashion dateFashion;
	
	@Before
	public void setUp() {
		dateFashion = new DateFashion();
	}
	
	@Test
	public void test_style_range() {
		
		Assert.assertEquals("Testing table result value", 2, dateFashion.getATable(5, 10));
		Assert.assertEquals("Testing table result value", 0, dateFashion.getATable(5, 2));
		Assert.assertEquals("Testing table result value", 1, dateFashion.getATable(5, 5));
	}
	

}