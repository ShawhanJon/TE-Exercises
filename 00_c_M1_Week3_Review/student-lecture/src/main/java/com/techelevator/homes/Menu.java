package com.techelevator.homes;

import java.util.List;
import java.util.Scanner;

/**
 * The Menu class is responsible for printing a simple menu for our application
 * and capturing user input. This acts as the User Interface for our app.
 * 
 * @author Java Green Rock Stars
 *
 */

public class Menu {

	private Scanner scanner;

	public Menu() {
		scanner = new Scanner(System.in);
	}

	/**
	 * This method prints the main menu to the console
	 * 
	 * @return - User selected input (1, 2 or 3)
	 */

	public String printMainMenu() {

		System.out.println("***************************");
		System.out.println("Java Green Realtor App 3000");
		System.out.println("***************************\n");

		System.out.println("1. List all homes");
		System.out.println("2. Search for a home by MLS Number");
		System.out.println("3. Add a new listing");
		System.out.println("4. Exit\n");

		System.out.println("Please select your choice (number only)");

		return scanner.nextLine();

	}

	/**
	 * This method prompts the user to enter a valid MLS Numbe and returns the
	 * user's input
	 * 
	 * @return String
	 */
	public String getMLSNumberFromUser() {

		System.out.println("\nPlease Enter A Valid MLS Number");
		return scanner.nextLine();

	}
	



    /**
     * This method prints out a list of homes 
     * @param List<Home> homesToPrint - An ArrayList containing our list of homes 
    */
	public void printListOfHomes(List<Home> homesToPrint) {

		
		System.out.println("\n*********** Listing Results ************\n");
		
		
		if (homesToPrint.isEmpty()) {
			System.out.println("No Results Found!");
			return;
		}

		for (Home home : homesToPrint) {
			
            printHome(home);

		}

	}
	
	
	/**
	 * This method prints out a single home.  We 'could' have put this up in the for each loop above, but breaking
	 * it out on it's own keeps the code above cleaner AND we can also reuse when printing out the home from menu option 2
	 *  
	 * @param home
	 */
	public void printHome(Home home) {
		
		System.out.println("MLS Number: " + home.getMlsNumber());

		if (home.getAddress() != null) {
			System.out.println("Street Address: " + home.getAddress().getStreetNumber() + " "
					+ home.getAddress().getStreetName() + " " + home.getAddress().getCity() + " "
					+ home.getAddress().getState() + " " + home.getAddress().getZipCode() + "\n");
		}
		
		System.out.println(String.format("%-25s %s", "Bedrooms: ", home.getNumberOfBedrooms()));
		System.out.println(String.format("%-25s %s", "Bathrooms: ", home.getNumberOfBathrooms()));
		System.out.println(String.format("%-25s %s", "Description: ", home.getShortDescription()));
		System.out.println(String.format("%-25s $%s", "Price: ", String.format("%.2f", home.getPrice())));
		
		System.out.println("\n*********** *** *** ***  ************\n");		
		
	}
	
	
	
	private Address getAddressInfo() {
		Address address = new Address();
		
		System.out.println("\nEnter the street number of the residence: ");
		int streetNumber = Integer.parseInt(scanner.nextLine());
		address.setStreetNumber(streetNumber);
		
		System.out.println("\nEnter the street name of the residence: ");
		address.setStreetName(scanner.nextLine());
		
		System.out.println("\nEnter the city name: ");
		address.setCity(scanner.nextLine());
		
		System.out.println("\nEnter the state: ");
		address.setState(scanner.nextLine());
		
		System.out.println("\nEnter the zip code: ");
		String zip = scanner.nextLine();
		address.setZipCode(Integer.parseInt(zip));
		
		return address;
	}	

}
