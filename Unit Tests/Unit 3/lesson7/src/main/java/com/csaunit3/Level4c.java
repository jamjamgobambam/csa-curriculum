package com.csaunit3;

public class Level4c {
    public static void main(String[] args) {
        
        Dessert first = new Dessert("vanilla", 2.99, 4);
        Cookie second = new Cookie("oatmeal", 1.50, 12, 6, true);
        Pie third = new Pie("cherry", 4.75, 4, "cherry", true);

        // TO DO #2: Create a Dessert array containing the Dessert objects.
        Dessert[] dessertsList = {first, second, third};

        // TO DO #3: Call the printDesserts() method on one of the Dessert objects.
        System.out.println(first.getDessertsInfo(dessertsList));
        
    }
}