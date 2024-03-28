package com.csaunit4;

public class Level4a {
    public static void main(String[] args) {

        Dog firstDog = new Dog(4);
        Dog secondDog = new Dog(4);
    
        System.out.println("firstDog == secondDog: " + (firstDog == secondDog));
    
        // TO DO #2: Test your equals method and print the result.
    
        System.out.println("firstDog == secondDog: " + (firstDog.equals(secondDog)));
      }
}