package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);

		System.out.println("Please enter the temperature:\n");
		String temperature = myScanner.nextLine();
		
		int tempEntered = Integer.parseInt(temperature);

		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?(Enter Letter)\n");
		String tempDegree = myScanner.nextLine();

		if (tempDegree == "C") {
			System.out.println(tempEntered + "C is " +(int)((tempEntered * 1.8) + 32) + "F");
		}
		else {	
			System.out.println(tempEntered + "F is " +(int)((tempEntered - 32) / 1.8) + "C");
		}

	}

}
