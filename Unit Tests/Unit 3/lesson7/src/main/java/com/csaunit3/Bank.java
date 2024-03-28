package com.csaunit3;

/*
 * Represents a bank
 */
public class Bank {

    private BankAccount[] accounts;
  
    /*
     * Creates a Bank with an array of bank accounts
     */
    public Bank(BankAccount[] accounts) {
      this.accounts = accounts;
    }
  
    /*
     * Returns the array of bank accounts
     */
    public BankAccount[] getAccounts() {
      return accounts;
    }
  
    /*
     * Prints the information about each bank account
     */
    public String getAccountsInfo() {
      String result = "";

      // TO DO #1: Traverse the BankAccount array and withdraw 300
      // from each account then print the balance for each account.
      for (BankAccount account : accounts) {
        account.withdraw(300);
        result += account.getName() + " New Balance: " + account.getBalance() + "\n";
      }

      return result;
    }
    
  }