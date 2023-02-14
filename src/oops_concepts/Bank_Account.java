package oops_concepts;

public class Bank_Account {
	private long AccountNumber;
	private String AccountName;
	private double AccountBalance;
	
	public void deposit(double amt) 
	{
		if(amt > 0) 
		{
			AccountBalance = AccountBalance + amt;
			System.out.println("Succesfully deposited" +amt);
			System.out.println("Account balance remainning" +AccountBalance);
		}
		else 
		{
			System.out.println("Amount not depositted");
		}
	
	}
	
	public void withdraw(double amt) 
	{
		if(amt > 0) 
		{
			AccountBalance = AccountBalance - amt;
			System.out.println("Succesfully deposited" +amt);
			System.out.println("Account balance remainning" +AccountBalance);
		}
		else 
		{
			System.out.println("Amount not depositted");
		}
	
	}
	
	public void displayCurrentbalance() {
		System.out.println("Your Current balance" +AccountBalance);
	}
	
	public Bank_Account(long AccountNumber,String AccountName, double AccountBalance) {
	this.AccountNumber = AccountNumber;
	this.AccountBalance = AccountBalance;
	this.AccountName = AccountName;
	
	}
	
	
}