package com.techelevator;

public class CreditCardAccount implements Accountable {
	
	private String accountHolder;
    private String accountNumber;
    private int balance;

    public CreditCardAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

	public String getAccountHolder() {
		return accountHolder;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

    
    
	public int pay(int amountToPay) {
        balance = balance - amountToPay;
        return balance;
    }
    
	public int charge(int amountToCharge) {
        balance = balance + amountToCharge;
        return balance;
    }
    
    
    
    
    
    
    
    
}
