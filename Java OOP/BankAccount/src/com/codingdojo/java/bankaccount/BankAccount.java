package com.codingdojo.java.bankaccount;
import java.util.Random;

public class BankAccount {
	
	//Attributes
	private String accountNumber = "";
	private Double checkingBalance = 0.0;
	private Double savingsBalance = 0.0;
	private static int accountsCreated = 0;
	private static Double totalMoney = 0.0;
	
	//Constructors
	public BankAccount() {
		String accountNumber = newAccountNumber();
		Double checkingBalance = 0.0;
		Double savingsBalance = 0.0;
		accountsCreated +=1;
		System.out.println("New user created with account number: " + accountNumber + ".");
		System.out.println("Total accounts created: " + accountsCreated + ".");		
	}
	
	//Getters
	public Double getCheckingBalance() {
		return checkingBalance;
	}
	public Double getSavingsBalance() {
		return savingsBalance;
	}

	//Setters
	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	//Methods
	private String newAccountNumber() {
		String numberTable = "0123456789";
		String randomNumber = "";
		
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			char num = numberTable.charAt(rand.nextInt(10));
			randomNumber += num;
		}
		accountNumber = randomNumber;
		return randomNumber;	
	}
	
	public void accountDeposit(String type, Double depositAmount) {
		if(type == "checking" || type == "Checking") {
			setCheckingBalance(getCheckingBalance() + depositAmount);
			totalMoney += depositAmount;
		}
		if(type == "savings" || type == "Savings") {
			setSavingsBalance(getSavingsBalance() + depositAmount);
			totalMoney += depositAmount;
		}
		else {
			System.out.println("Please choose apporpiate account type.");
		}	
	}
	
	public void accountWithdrawal(String type, Double withdrawalAmount) {
		if(type == "checking" || type == "Checking") {
			if(getCheckingBalance() < withdrawalAmount) {
				System.out.println("Insufficient Funds!");
			}
			else {
			setCheckingBalance(getCheckingBalance() - withdrawalAmount);
			totalMoney -= withdrawalAmount;
			}
		}
		if(type == "savings" || type == "Savings") {
			if(getSavingsBalance() < withdrawalAmount) {
				System.out.println("Insufficient Funds!");
			}
			else {
			setSavingsBalance(getSavingsBalance() - withdrawalAmount);
			totalMoney -= withdrawalAmount;
			}
		}
	}
	public Double myBalance() {
		Double totalBalance = checkingBalance + savingsBalance;
		System.out.println(totalBalance);
		return totalBalance;
	}
}
