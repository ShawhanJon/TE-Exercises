package com.techelevator;

public class SavingsAccount extends BankAccount {
	
	

	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
		// TODO Auto-generated constructor stub
	}

	public void withdraw() {
		super.withdraw(getBalance());
		if (getBalance() < 150.00) {
			System.out.println(getBalance() + withdraw(0) + 2.00);
		}
		
	}
	
	
}
