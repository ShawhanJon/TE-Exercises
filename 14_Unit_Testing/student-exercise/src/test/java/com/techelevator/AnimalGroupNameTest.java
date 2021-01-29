package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class AnimalGroupNameTest {

	/*
     * Given the name of an animal, return the name of a group of that animal
     * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
     *
     * The animal name should be case insensitive so "elephant", "Elephant", and
     * "ELEPHANT" should all return "herd".
     *
     * If the name of the animal is not found, null, or empty, return "unknown".
     *
     * Rhino -> Crash
     * Giraffe -> Tower
     * Elephant -> Herd
     * Lion -> Pride
     * Crow -> Murder
     * Pigeon -> Kit
     * Flamingo -> Pat
     * Deer -> Herd
     * Dog -> Pack
     * Crocodile -> Float
     *
     * GetHerd("giraffe") → "Tower"
     * GetHerd("") -> "unknown"
     * GetHerd("walrus") -> "unknown"
     * GetHerd("Rhino") -> "Crash"
     * GetHerd("rhino") -> "Crash"
     * GetHerd("elephants") -> "unknown"
     *
     */
	
	AnimalGroupName animalGroupName
	
	@Before
	public void setUp() {
		animalGroupName = new AnimalGroupName();
	}
	
	@Test
	public void test_group_name_matshes_animal_name_and_found() {
		
		//Arrange
		
		//Act
		Assert.assertEquals("Testing value is in map", "Crash", animalGroupName.getHerd("Rhino"));
		
		//Assert
		
	}
	

}
