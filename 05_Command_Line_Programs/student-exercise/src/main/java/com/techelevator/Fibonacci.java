package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
	       System.out.print("Please enter the fibonacci number: ");
	       int n = myScanner.nextInt();
	       fibonacci(n);
	   }

	   public static void fibonacci (int n) {
	       if (n == 0) {
	           System.out.println("0");
	       } else if (n == 1) {
	           System.out.println("0 1");
	       } else {
	           System.out.print("0 1 ");
	           int a = 0;
	           int b = 1;
	           for (int i = 1; i < n; i++) {
	        	   
	               int nextNumber = a + b;
	               System.out.print(nextNumber + " ");
	               a = b;
	               b = nextNumber;
	               if (n == i) {
	        		   break;
	        	   }
	           }
	           }
	       }
	   
		

	}
