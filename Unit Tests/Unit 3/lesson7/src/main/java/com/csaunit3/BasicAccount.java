package com.csaunit3;

/*
 * Represents a basic bank account
 */
public class BasicAccount extends BankAccount {

    /*
     * Constructor to create a BasicAccount object
     * with a specified name and starting balance
     */
    public BasicAccount(String customerName, double balance) {
      super(customerName, balance);  // Calls the BankAccount constructor
    }
  
    /*
     * Subtracts a given amount from the balance and
     * charges a fee if the withdrawal overdraws the account
     */
    public void withdraw(double amount) {
      super.withdraw(amount);
  
      if (getBalance() < 0) {
        super.withdraw(30);
      }
    }
    
  }