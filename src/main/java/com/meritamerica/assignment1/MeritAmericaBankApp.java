package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		// make new account holder
		AccountHolder account1 = new AccountHolder("Harry", "James", "Potter", "123-44-5678", 100.0, 1000.0);
		
		//print out to string
		System.out.println(account1.toString());
		
		account1.getCheckingAccount().deposit(500);
		
		account1.getSavingsAccount().withdraw(800);
		
		System.out.println(account1.getCheckingAccount().toString());
		System.out.println(account1.getSavingsAccount().toString());
		
		AccountHolder account2 = new AccountHolder("Marcus","Randy", "Jackson", "987-65-432", 200.0 , 500.0);
		account2.getCheckingAccount().deposit(-500);
		account2.getSavingsAccount().withdraw(600);
		System.out.println(account2.toString());
		
		
	}
	
	
}