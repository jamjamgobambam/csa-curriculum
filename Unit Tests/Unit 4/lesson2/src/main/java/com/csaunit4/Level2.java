package com.csaunit4;

public class Level2 {
    public static void main(String[] args) {

        String firstTitle = "Prom";
        String secondTitle = "Prom";
        String thirdTitle = new String("Prom");
    
        Event2 firstEvent = new Event2("Prom", 500);
        Event2 secondEvent = firstEvent;
        Event2 thirdEvent = new Event2("Prom", 800);
    
        boolean result = firstTitle == secondTitle;
    
        System.out.println("Result: " + result);
        
      }
}