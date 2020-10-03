package com.meritamerica.assignment1;

public class SavingsAccount {
	
	private double balance;
	private double interestRate = .01;
	
	public SavingsAccount(double openingBalance) {
		balance = openingBalance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	public boolean withdraw(double amount) {
		if (amount <= balance) {
			return true;
		} else {
			return false;
		}
	}
	public boolean deposit(double amount) {
		if(amount>0) {
			return true;
		} else {
			return false;
		}
	}
	
	public double futureValue(int years) {
		double futureV = balance * Math.pow((1 + interestRate), years);
		return futureV;
	}
	
	public String toString() {
		String str = "1. Savings Account Balance: $" + balance + 
				"\n2. Savings Account Interest Rate: " + interestRate + 
				"\n3.Savings Account Balance in 3 years: $" + futureValue(3);
		return str;
	}
}