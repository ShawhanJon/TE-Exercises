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
	
	AnimalGroupName animalGroupName;
	
	@Before
	public void setUp() {
		animalGroupName = new AnimalGroupName();
	}
	
	@Test
	public void test_group_name_matches_animal_name_and_found() {
		
		//Arrange
		
		//Act
		Assert.assertEquals("Testing value is in map", "Crash", animalGroupName.getHerd("Rhino"));
		Assert.assertEquals("Testing value is in map", "Tower", animalGroupName.getHerd("Giraffe"));
		Assert.assertEquals("Testing value is in map", "Herd", animalGroupName.getHerd("Elephant"));
		Assert.assertEquals("Testing value is in map", "Pride", animalGroupName.getHerd("Lion"));
		Assert.assertEquals("Testing value is in map", "Murder", animalGroupName.getHerd("Crow"));
		Assert.assertEquals("Testing value is in map", "Kit", animalGroupName.getHerd("Pigeon"));
		Assert.assertEquals("Testing value is in map", "Pat", animalGroupName.getHerd("Flamingo"));
		Assert.assertEquals("Testing value is in map", "Herd", animalGroupName.getHerd("Deer"));
		Assert.assertEquals("Testing value is in map", "Pack", animalGroupName.getHerd("Dog"));
		Assert.assertEquals("Testing value is in map", "Float", animalGroupName.getHerd("Crocodile"));
		
		
	}
	
	@Test
	public void test_group_name_matches_animal_name_case_insensitive() {
		
		//Arrange
		
		//Act
		Assert.assertEquals("Testing value is in map", "Crash", animalGroupName.getHerd("rhino"));
		Assert.assertEquals("Testing value is in map", "Tower", animalGroupName.getHerd("giraffe"));
		Assert.assertEquals("Testing value is in map", "Herd", animalGroupName.getHerd("elephant"));
		Assert.assertEquals("Testing value is in map", "Pride", animalGroupName.getHerd("lion"));
		Assert.assertEquals("Testing value is in map", "Murder", animalGroupName.getHerd("crow"));
		Assert.assertEquals("Testing value is in map", "Kit", animalGroupName.getHerd("pigeon"));
		Assert.assertEquals("Testing value is in map", "Pat", animalGroupName.getHerd("flamingo"));
		Assert.assertEquals("Testing value is in map", "Herd", animalGroupName.getHerd("deer"));
		Assert.assertEquals("Testing value is in map", "Pack", animalGroupName.getHerd("dog"));
		Assert.assertEquals("Testing value is in map", "Float", animalGroupName.getHerd("crocodile"));
		
		
	}
	
	@Test
	public void test_for_unknown_value() {
		
		//Arrange
		
		//Act
		Assert.assertEquals("Testing value is returning unknown", "unknown", animalGroupName.getHerd(null));
		Assert.assertEquals("Testing value is returning unknown", "unknown", animalGroupName.getHerd(""));
		Assert.assertEquals("Testing value is returning unknown", "unknown", animalGroupName.getHerd("cat"));
		
	}
	

}
