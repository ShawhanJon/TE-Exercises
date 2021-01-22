package com.techelevator.homes;

public class HomeApp {

	public static void main(String[] args) {
		
		
		Home home =  new Home();	//turning a home class into an object
		
		home.setAcreage(10);
		home.setGarageSize(2.5);
		home.setHasBasement(true);
		home.setNeighborhoodName("Villages at Alum Creek");
		
		System.out.println("Home 1: " + home.getAcreage());
		
		
		Home home2 = new Home();	//creating another instance
		home2.setAcreage(5);
		home2.setActiveListing(true);
		home2.setNumberOfBathrooms(11.5);
		
		System.out.println("Home 2: " + home2.getAcreage());
		
		
		BankAccount account = new BankAccount();
		
		System.out.println(account.getBalance());
		double newBalance = account.depositMoney(100);
		System.out.println(newBalance);
		

	}

}
