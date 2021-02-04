package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

    private String name;
    private String address;
    private String phoneNumber;
    private List<BankAccount> accounts = new ArrayList<BankAccount>();
    
    
    
    
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
    
    
	public BankAccount[] getAccounts() {
    	BankAccount[] accountArray = new BankAccount[accounts.size()];
    	for (int i = 0; i < accounts.size(); i++) {
    		accountArray[i] = accounts.get(i);
    	}
        return accountArray;
    }

    public boolean isVip() {
        int totalBalance = (0);
        for (BankAccount account : accounts) {
            totalBalance = totalBalance + (account.getBalance());
        }
        return totalBalance >= 25000;
    }

    public void addAccount(BankAccount newAccount) {
        accounts.add(newAccount);
    }

}
