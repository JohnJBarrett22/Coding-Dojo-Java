package com.codingdojo.java.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		
	BankAccount user1 = new BankAccount();
	BankAccount user2 = new BankAccount();
	BankAccount user3 = new BankAccount();
	user1.accountDeposit("Savings", 60.00);
	user2.accountDeposit("checking", 500.00);
	user3.accountDeposit("savings", 2000.50);
	user1.accountWithdrawal("Checking", 70.00);
	user2.accountWithdrawal("checking", 200.00);
	user3.accountWithdrawal("savings", 1000.00);
	user2.myBalance();
	user1.myBalance();
	user3.myBalance();
	}
}
