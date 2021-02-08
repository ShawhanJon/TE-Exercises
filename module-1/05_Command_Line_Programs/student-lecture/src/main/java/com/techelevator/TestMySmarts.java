package com.techelevator;

import java.util.Scanner;

public class TestMySmarts {

	public static void main(String[] args) {
		
		
		//creat new scanner
		
		Scanner scanner = new Scanner(System.in);
		
		boolean notSmart = true;
		
		while (notSmart) {
			//just not smart yet
			
		
		
			System.out.print("Are you smart yet? Enter (Y)es or (N)o\n");
			String answer = scanner.nextLine();
		
			// if they answer yes, set notSmart to false
			
			if (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Y")) {
				notSmart = false;
				System.out.println("Nerd!");
			}
			else {
				System.out.println("Dummy!");
				
			}
			
		}
		
		System.out.println("Exit");

	}

}
