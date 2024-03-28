package com.csaunit4;

public class Level1 {
    public static void main(String[] args) {

        Event firstEvent = new Event("Prom", 500);
        Event secondEvent = firstEvent;
        Event thirdEvent = new Event("Prom", 500);
    
        boolean result = firstEvent == secondEvent;
    
        System.out.println("Result: " + result);
        
      }
}