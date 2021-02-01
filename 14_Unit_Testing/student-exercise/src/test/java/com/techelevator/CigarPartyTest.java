package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class CigarPartyTest {

	/*
    When squirrels get together for a party, they like to have cigars. A squirrel party is successful
    when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case
    there is no upper bound on the number of cigars. Return true if the party with the given values is
    successful, or false otherwise.
    haveParty(30, false) → false
    haveParty(50, false) → true
    haveParty(70, true) → true
    */
	
	private CigarParty cigarParty;
	
	@Before
	public void setUp() {
		cigarParty = new CigarParty();
	}
	
	@Test
	public void test_party_successful_cigars_in_range() {
		
		Assert.assertEquals("Testing not weekend, cigars in range", false, cigarParty.haveParty(30, false));
		Assert.assertEquals("Testing not weekend, cigars in range", true, cigarParty.haveParty(50, false));
		Assert.assertEquals("Testing not weekend, cigars in range", true, cigarParty.haveParty(70, true));
		
		
	}
	

}
