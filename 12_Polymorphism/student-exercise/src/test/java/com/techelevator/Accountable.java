package com.techelevator;

public interface Accountable {
	
	public int getBalance();
	
	class BankAccount implements Accountable {
		public int getBalance() {
			return getBalance();
		}
	}
	
}
