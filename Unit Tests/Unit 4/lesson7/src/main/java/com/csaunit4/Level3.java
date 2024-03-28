package com.csaunit4;

import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        // TO DO #1: Prompt the user to enter two numbers.
        System.out.print("Enter a number: ");
        double firstNumber = input.nextDouble();
        System.out.print("Enter another number: ");
        double secondNumber = input.nextDouble();
          
        // TO DO #2: Print the result of the first number raised to the second number.
        double result = Math.pow(firstNumber, secondNumber);
        System.out.println("First number raised to second number: " + result);
        
      }
}