package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);

		System.out.println("Please enter the length:\n");
		String length = myScanner.nextLine();
		
		int lengthEntered = Integer.parseInt(length);

		System.out.println("Is the measurement in (m)eter, or (f)eet?(Enter Letter)\n");
		String measurement = myScanner.nextLine();

		if (measurement == "m") {
			System.out.println(lengthEntered + "m is " +(int)(lengthEntered * 3.2808399) + "f");
		}
		else {	
			System.out.println(lengthEntered + "f is " +(int)(lengthEntered * 0.3048) + "c");
		}

	}

}
