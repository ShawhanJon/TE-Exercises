package com.techelevator.homes;

public class BankAccount {

	
	private String accountType;
	private String accountNumber;
	private double balance;
	
	private String ownerFirstName;
	private String lastName;
	
	
	
	
	//methods
	
	public double depositMoney(double depositAmount) {
		
		this.balance = this.balance + depositAmount;		
		
		return this.balance;
	}
	
	public double withdrawMoney(double withdrawAmount) {
		
		this.balance = this.balance + withdrawAmount;		
		
		return this.balance;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//getters & setters
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getOwnerFirstName() {
		return ownerFirstName;
	}
	public void setOwnerFirstName(String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	
	
}
