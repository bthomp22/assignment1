package com.meritamerica.assignment1;

public class AccountHolder {
	
	//variables
private String firstName;
private String middleName;
private String lastName;
private String ssn;
private double checkingAccount;
private double savingsAccount;

//default constructor
	public AccountHolder(){
	firstName = "";
	middleName = "";
	lastName = "";
	ssn = "";
	checkingAccount = 0.0;
	savingsAccount = 0.0;
		
	}
	
	//constructor 
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName= lastName;
		this.ssn = ssn;
		this.checkingAccount = checkingAccountOpeningBalance;
		this.savingsAccount = savingsAccountOpeningBalance;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void middleName(String middleName) {
		this.middleName = middleName;
		
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	public checkingAccount getCheckingAccount() {
		return checkingAccount;
	}
	
	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}
	
	public String toString() {
		String str = "1. Name: " + firstName + " " + middleName + " " + lastName + 
					"\n2. SSN: " + ssn + 
					"\n3. Checking Account Balance:" + checkingAccount + 
					"\n4. Checking Account Interest Rate: " + Sa;
		
		
		
	}
	
}