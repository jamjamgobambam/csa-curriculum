package com.csaunit3;

public class Level2 {
    public static void main(String[] args) {
        
        Sandwich turkeySandwich = new Sandwich("turkey");
        System.out.println(turkeySandwich.getType() + " " + Sandwich.PRICE);

        Sandwich veggieSandwich = new Sandwich("veggie");
        System.out.println(veggieSandwich.getType() + " " + Sandwich.PRICE);
        
    }
}