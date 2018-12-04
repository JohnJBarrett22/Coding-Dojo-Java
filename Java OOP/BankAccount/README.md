# BankAccount

We are going to create a BankAccount class. This class will recreate some of the common account transactions that normally occur for a bank account such as displaying your account number, checking and savings amount, total amount. Of course, there are also methods to invoke, such as depositing a check, checking your balance, withdrawing money.

## Objectives:
* Practice member variables
* Practice instance methods and getter and setters
* Implement static variables and methods.

## Tasks:
* Create a BankAccount class.
* The class should have the following attributes: (string) account number, (double) checking balance, (double) savings balance.
* Create a class member (static) that has the number of accounts created thus far.
* Create a class member (static) that tracks the total amount of money stored in every account created.
* Create a private method that returns a random ten digit account number.
* In the constructor, call the private method from above so that each user has a random ten digit account.
* In the constructor, be sure to increment the account count.
* Create a getter method for the user's checking account balance.
* Create a getter method for the user's saving account balance.
* Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
* Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
* Create a method to see the total money from the checking and saving.
* Users should not be able to set any of the attributes from the class.
