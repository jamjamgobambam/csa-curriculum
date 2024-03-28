package com.csaunit3;

public class Level4b {
    public static void main(String[] args) {
        
        BankAccount first = new BankAccount("Shakila", 500);
        BasicAccount second = new BasicAccount("Ali", 200);
        BankAccount third = new BankAccount("Valentina", 100);
        BasicAccount fourth = new BasicAccount("Maria", 800);

        // TO DO #2: Create a BankAccount array containing the BankAccount objects.
        BankAccount[] accountsList = {first, second, third, fourth};

        // TO DO #3: Instantiate a Bank account with the BankAccount array
        // and call the printAccounts() method.
        Bank myBank = new Bank(accountsList);
        System.out.println(myBank.getAccountsInfo());
        
    }
}