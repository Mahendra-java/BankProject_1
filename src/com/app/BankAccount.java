package com.app;

public class BankAccount {
	private double balance;
	
	public void setBalance(double balance) {
		if(balance<=0) {
			System.out.println("Do not enter -ve value");
		}else
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
}
