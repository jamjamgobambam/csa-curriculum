package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Bank.java Test")
public class BankTest {

    BankAccount first = new BankAccount("Shakila", 500);
    BasicAccount second = new BasicAccount("Ali", 200);
    BankAccount third = new BankAccount("Valentina", 100);
    BasicAccount fourth = new BasicAccount("Maria", 800);
    BankAccount[] accountsList = {first, second, third, fourth};
    String message;
    
    @Test
    @Order(1)
    @DisplayName("Return a String containing each customer's name and balance => ")
    public void testGetAccountsInfo() {
        message = "Bank getAccountInfo() does not return a String containing each customer's name and balance.";
        message += "\n        Traverse the \"accounts\" array and concatenate each name and balance to the \"result\".";
        message += "\n       ";

        Bank myBank = new Bank(accountsList);
        String expected = getExpectedAccountsInfo();
        String actual = myBank.getAccountsInfo();

        assertEquals(expected, actual, message);
    }

    private String getExpectedAccountsInfo() {
        return "Shakila New Balance: 200.0\n" + 
            "Ali New Balance: -130.0\n" + 
            "Valentina New Balance: -200.0\n" + 
            "Maria New Balance: 500.0\n";
    }

}