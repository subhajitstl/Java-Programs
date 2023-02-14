package oops_concepts;

public class Bank_Account_Main {

	public static void main(String[] args) {
		Bank_Account b1 = new Bank_Account(123001,"Subhajit Manna", 52000);
		b1.displayCurrentbalance();
		b1.deposit(2000);
		b1.withdraw(4989);
	}

}
