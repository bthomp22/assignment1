package com.meritamerica.assignment1;

public class AccountHolder {
	
	//variables
private String firstName;
private String middleName;
private String lastName;
private String ssn;
private CheckingAccount checkingAccount;
private SavingsAccount savingsAccount;

//default constructor
	public AccountHolder(){
	firstName = "";
	middleName = "";
	lastName = "";
	ssn = "";

	}
	
	//constructor 
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName= lastName;
		this.ssn = ssn;
		checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);
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
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}
	
	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}
	
	public String toString() {
		String str = "1. Name: " + firstName + " " + middleName + " " + lastName + 
					"\n2. SSN: " + ssn + 
					"\n3. Checking Account Balance: $" + checkingAccount.getBalance() + 
					"\n4. Checking Account Interest Rate: " + String.format("%,.4f", checkingAccount.getInterestRate()) + 
					"\n5. Checking Account Balance in 3 Years: " + String.format("$%,.2f", checkingAccount.futureValue(3)) +
					"\n6. Savings Account Balance: $" + savingsAccount.getBalance() +
					"\n7. Savings Account Interest Rate: " + savingsAccount.getInterestRate() +
					"\n8. Savings Account Balance in 3 Years: $" + String.format("$%,.2f", savingsAccount.futureValue(3));
		return str;
		
		
		
	}
	
}