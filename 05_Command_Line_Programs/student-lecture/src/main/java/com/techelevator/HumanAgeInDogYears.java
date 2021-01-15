package com.techelevator;

import java.util.Scanner;

public class HumanAgeInDogYears {

	public static void main(String[] args) {
		
		
		
		// Create a scanner
		Scanner myScanner = new Scanner(System.in);
		
//		System.out.println("How old are you human?\n");
//		String answer = myScanner.nextLine();
		
		
//		int humanAge = Integer.parseInt(answer); //changes string to integer
//		double ageAsDouble = Double.parseDouble(answer);
//		float ageAsFloat = Float.parseFloat(answer);
		
//		System.out.println("You are " + (humanAge * 7) + " in dog years!");
//		System.out.println("You are " + (ageAsDouble * 7) + " in dog years!");
//		System.out.println("You are " + (ageAsFloat * 7) + " in dog years!");
		
//		System.out.println("What is the dog's age?");
//		int age = myScanner.nextInt();
		
//		System.out.println(age);

//		System.out.println("Pick a random int");
//		int randomInt = myScanner.nextInt();
		
//		System.out.println(randomInt);
		
//		System.out.println("Exit");
		
		
	System.out.println("Enter 4 values separated by spaces");
	String values = myScanner.nextLine();
	
	String[] inputValue = values.split("\\|");
	
	for (int i = 0; i<inputValue.length; i++) {
		//System.out.print("(Index " + i + "= " + inputValue[i] + ")\n");
		
		int valueAsInt = Integer.parseInt(inputValue[i]);
		System.out.print("(Index " + i + "= " + (valueAsInt * 7) + ")\n");
	}
		
		
	}

}
