package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTracker {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		List<String> students = new ArrayList<String> (); //creates Array List
		
		System.out.println(students.size());
		students.add("Zainab"); //adds to list
		students.add("Vic");
		students.add("Jon");
		students.add("Kelsey");
		
		System.out.println(students); //returns locations
		System.out.println(students.size()); //returns size of list
		
		//convert an ArrayList to a normal array
		String[] names = students.toArray(new String[students.size()]);
		
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println(students.get(2)); //returns specified element in indexed() position
		
		students.remove(2); //removes an element
		System.out.println(students);
		
		students.add(2, "Jon"); //adds element to index
		System.out.println(students);
		
		students.remove(2);
		
		
		//traditional loop (able to go forward and back)
		for (int i = 0; i < students.size(); i++ ) {
			System.out.println(students.get(i));
		}
		
		//for-each loop
		for (String student : students) {
			
			if (student.equals("Vic")) {		//Searches for Vic within loop
				System.out.println("We found Vic!");
//				break;		//breaks out when Vic is found
			}
			System.out.println(student);
		}
		
		//looks for element
		if (students.contains("Vic")) {
			System.out.println("We found Vic!");
		}
		
		int indexOfZainab = students.indexOf("Zainab"); //finds the index of a element
		

	}

}
