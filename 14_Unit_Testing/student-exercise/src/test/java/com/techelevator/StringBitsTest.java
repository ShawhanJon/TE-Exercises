package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class StringBitsTest {

	/*
	 * Given a string, return a new string made of every other char starting with
	 * the first, so "Hello" yields "Hlo". GetBits("Hello") → "Hlo" GetBits("Hi")
	 * → "H" GetBits("Heeololeo") → "Hello"
	 */
	
	private StringBits stringBits;
	
	@Before
	public void setUp() {
		stringBits = new StringBits();
	}
	
	@Test
	public void test_return_of_new_string() {
		
		Assert.assertEquals("Testing return of new string",  "Hlo", stringBits.getBits("Hello"));
		Assert.assertEquals("Testing concatenation",  "H", stringBits.getBits("Hi"));
		Assert.assertEquals("Testing concatenation",  "Hello", stringBits.getBits("Heeololeo"));
	}
	

}