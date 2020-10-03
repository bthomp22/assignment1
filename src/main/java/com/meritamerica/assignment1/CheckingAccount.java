package com.meritamerica.assignment1;



public class CheckingAccount {

	

	private double Balance;

	

	private double InterestRate=0.0001;

	

	public CheckingAccount(double openingBalance) {

		Balance=openingBalance;

	}

	

	public double getBalance() {

		return Balance;

	}

	

	public double getInterestRate() {

		return InterestRate;

	}

	

	public boolean withdraw(double amount) {

		if(amount <= Balance) {

			return true;

		} else {

			return false;

		}

	}

	

	public boolean deposit(double amount) {

		if (amount >0) {

			return true;

		} else {

			return false;

		}

	}

		

	public double futureValue(int years) {

		double FV= Balance*Math.pow((1+InterestRate), years);

		return FV;

	}

		

	public String toString() {

		String str= "1.Checking Account Balance: $" + Balance +

				"\n 2.Checking Account Interest Rate: $" + InterestRate +

				"\n 3. Checking Account Balance in 3 years: $" + futureValue(3);

		return str;

		

	}

				

	}