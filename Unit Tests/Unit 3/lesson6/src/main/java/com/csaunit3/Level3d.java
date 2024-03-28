package com.csaunit3;

public class Level3d {
    public static void main(String[] args) {
        
        Customer firstCustomer = new Customer("Julienne", 7);
        Customer secondCustomer = new Customer("Maria", 3);

        firstCustomer.getName();
        secondCustomer.getName();

        // TO DO #3: Print the value of newCustomers.
        System.out.println("Total Customers: " + Customer.newCustomers);

        // TO DO #4: Create more Customer objects, then print
        // the new value of newCustomers.
        Customer thirdCustomer = new Customer("Matilda", 4);
        Customer fourthCustomer = new Customer("Monika", 8);

        thirdCustomer.getName();
        fourthCustomer.getName();

        System.out.println("Total Customers: " + Customer.newCustomers);
        
    }
}