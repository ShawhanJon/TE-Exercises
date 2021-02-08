package com.techelevator;

import java.util.Scanner;

public class FlowerShopOrder {
	private Scanner scanner;
	
	private String bouquetType;
	private double numberOfRoses;
	private double subtotal;

	public FlowerShopOrder(String bouquetType, double numberOfRoses) {
		this.bouquetType = bouquetType;
		this.numberOfRoses = numberOfRoses;
		scanner = new Scanner(System.in);
	}

	public String getBouquetType() {
		return bouquetType;
	}

	public double getNumberOfRoses() {
		return numberOfRoses;
	}

	public double getSubtotal() {
		return subtotal = (19.99 + (numberOfRoses * 2.99));
	}
	
	
	
	

}
