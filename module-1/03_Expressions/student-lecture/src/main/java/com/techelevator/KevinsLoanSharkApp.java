package com.techelevator;

public class KevinsLoanSharkApp {

	public static void main(String[] args) {
		
		
		// to get a loan applicant must be > 18
		// must have $50 in bank account
		
		// if approved, tell user is approved AND print out their total loan plus $200 in interest
		
		// if not approved, tell user to go away
		
		
		
		int jonsAge = 29;
		double jonsBalance = 100.00;
		
		KevinsLoanSharkApp app = new KevinsLoanSharkApp();
		
		String status = app.getLoanApprovalStatus(jonsAge, jonsBalance);
		
		System.out.println("Jon: " + status);
		

	}
	
	public String getLoanApprovalStatus (int age, double balance) {
		
		if (age > 18) {
			return "Approved";
		}
		
		return "Go Away";
		
	}

}
