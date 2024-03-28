package com.csaunit4;

import java.util.Scanner;

public class Level5a {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculator myCalculator = new Calculator();
    
        // TO DO #2: Use a sentinel value to repeatedly prompt the user for
        // two values. Call the calculateExponent() method and print each result.
        
        int firstNumber = 0;
        int secondNumber = 0;
    
        while (firstNumber != -1) {
          System.out.print("Enter the first number: ");
          firstNumber = input.nextInt();
    
          if (firstNumber != -1) {
            System.out.print("Enter the second number: ");
            secondNumber = input.nextInt();
    
            System.out.print(firstNumber + " raised to the power of " + secondNumber);
            System.out.println(" is " + myCalculator.calculateExponent(firstNumber, secondNumber));
          }
        }
      }
}