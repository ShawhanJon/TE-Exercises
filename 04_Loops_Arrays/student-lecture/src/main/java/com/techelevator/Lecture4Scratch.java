package com.techelevator;

public class Lecture4Scratch {

	public static void main(String[] args) {
		
		int numberOfStudents = 100;
		
		//Know how to declare and array
		//Know how to instantiate and array
		
		String[] names = new String[10];
		int[] scores = new int[10];
		long[] averages = new long[20];
		byte[] bytes = new byte[50];
		String[] courses = new String[100];
		String[] studentNames = new String[numberOfStudents];
		
		
		
		
		//Know how to put things into and array
		
		names[0] = "Steve";
		names[1] = "Traci";
		names[2] = "Kanye";
		names[3] = "Kevin";
		names[4] = "The other Kevin";
		names[7] = "Hambone";
		names[8] = "Ham Radio";
		names[9] = "You Right!";
		
		
		
		//Know how to get access to things inside the array
		
		String kanye = names[2];
		
		String hambone = names[7];
		
		String firstElement = names[0];
		
		
		
		//Know how to get the length of an array
		System.out.println(names[2]);
		System.out.println(names.length); 
		
		String lastElement = names[9]; //If you know size equals 10 (zero based indexing)
		
		String lastElementTwo = studentNames[numberOfStudents - 1]; //option 1
		
		String lastElementThree = studentNames[studentNames.length - 1];
		System.out.println(lastElementThree);
		
		names[7] = "Hamburgers";
		names[names.length - 1] = names[7];
		
		//increment operators
		
		int i = 5;
		System.out.println(i);
		
		System.out.println(++i);
		
		System.out.println(i++);
		
		System.out.println(i++);
		
		int five = 5;
		System.out.println(++five);
		
		
		if (i < 5) {
			int x = 1;
			if (x == 1) {
				int y = 6;
			}
		}
		System.out.println(i);
		
		for (int j = 0; j < 100; j++) {
			System.out.println(j);
		}
		
		for (int j = 0; j < names.length; j++) {
			
			if (names[j] != null) {
			System.out.println(names[j]);}
		
		}
		
		
		
		
		}}
