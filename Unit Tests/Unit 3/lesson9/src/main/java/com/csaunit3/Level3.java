package com.csaunit3;

public class Level3 {
    public static void main(String[] args) {
        
        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        NumbersProcessor myNumbers = new NumbersProcessor(numbers);
        myNumbers.printValues();

        // TO DO #2: Call the reverse() method to reverse the array.
        myNumbers.reverse();

        // TO DO #3: Call the printValues() method to print the array.
        myNumbers.printValues();
        
    }
}