package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class WordCountTest {

	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for
	 * each different string, with the value the number of times that string appears
	 * in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * getCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * getCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
	 * getCount([]) → {}
	 * getCount(["c", "b", "a"]) → {"c": 1, "b": 1, "a": 1}
	 *
	 */
	
	private WordCount wordCount;
	
	@Before
	public void setUp() {
		wordCount = new WordCount();
	}
	
	
}