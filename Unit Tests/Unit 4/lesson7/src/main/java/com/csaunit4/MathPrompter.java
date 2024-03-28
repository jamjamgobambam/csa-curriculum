package com.csaunit4;

import java.util.Scanner;

public class MathPrompter {

  public static int promptForNumber() {
    Scanner input = new Scanner(System.in);

    // TO DO #1: Prompt the user to enter a number and return the number.
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    input.close();
    
    return number;
  }

  public static int getAbsoluteValue(int number) {
    // TO DO #2: Return the absolute value of the number.
    return Math.abs(number);
  }
  
}