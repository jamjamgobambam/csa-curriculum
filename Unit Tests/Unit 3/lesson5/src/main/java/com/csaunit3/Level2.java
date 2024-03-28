package com.csaunit3;

public class Level2 {
    public static void main(String[] args) {
        
        int[] values = {25, 82, 94, 13, 38};
        ArrayManager manager = new ArrayManager(values);

        System.out.println("With Enhanced for Loop");
        System.out.println(manager.numbersToStringEnhanced());

        System.out.println("\nWith Regular for Loop");
        System.out.println(manager.numbersToStringRegular());
        
    }
}