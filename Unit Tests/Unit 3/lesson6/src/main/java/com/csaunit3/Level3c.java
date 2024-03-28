package com.csaunit3;

public class Level3c {
    public static void main(String[] args) {
        
        Dessert cupcake = new Dessert("chocolate", 2.50);
        Dessert donut = new Dessert("strawberry", 3.99);

        cupcake.getFlavor();
        donut.getFlavor();

        // TO DO #4: Print the value of totalDesserts.
        System.out.println("Total Desserts: " + Dessert.totalDesserts);

        // TO DO #5: Create more Dessert objects, then print
        // the new value of totalDesserts.
        Dessert plain = new Dessert();
        Dessert pie = new Dessert("sweet potato", 6.50);

        plain.getFlavor();
        pie.getFlavor();

        System.out.println("Total Desserts: " + Dessert.totalDesserts);
        
    }
}