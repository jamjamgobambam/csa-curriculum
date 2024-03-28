package com.csaunit4;

import java.util.Scanner;

public class Level4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // TO DO #1: Prompt the user to enter a number.
        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        // TO DO #2: Print the square root of the number.
        double sqrt = Math.sqrt(number);
        System.out.println("Square root of your number: " + sqrt);
        
      }
}