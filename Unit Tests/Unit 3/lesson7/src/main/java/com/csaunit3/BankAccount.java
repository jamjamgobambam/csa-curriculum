package com.csaunit3;

/*
 * Represents a bank account
 */
public class BankAccount {

    private String customerName;  // The name of the account holder
    private double balance;       // The starting balance of the account
  
    /*
     * Constructor to create a BankAccount object
     * with a specified name and starting balance
     */
    public BankAccount(String customerName, double balance) {
      this.customerName = customerName;
      this.balance = balance;
    }
  
    /*
     * Adds a given amount to the balance
     */
    public void deposit(double amount) {
      balance += amount;
    }
  
    /*
     * Subtracts a given amount from the balance
     */
    public void withdraw(double amount) {
      balance -= amount;
    }
  
    /*
     * Gets the customer's name
     */
    public String getName() {
      return customerName;
    }
  
    /*
     * Gets the current balance
     */
    public double getBalance() {
      return balance;
    }
    
  }