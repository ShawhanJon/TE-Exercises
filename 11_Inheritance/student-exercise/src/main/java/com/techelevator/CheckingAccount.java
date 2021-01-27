package com.techelevator;

public class CheckingAccount extends BankAccount {
	

	public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	public CheckingAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
		// TODO Auto-generated constructor stub
	}
	
	public void withdraw() {
		super.withdraw(getBalance());
		if ((getBalance() <= 0.00) && (getBalance()>= -100.00)) {
			System.out.println(getBalance() + withdraw(0) + 10.00);
		}
		
	}
	
}
