package com.csaunit3;

public class ArrayManager {
    
    private int[] numbers;

    public ArrayManager(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public String numbersToStringEnhanced() {
        String result = "";

        for (int value : numbers) {
            value *= 2;
            result += value + "\n";
        }

        return result;
    }

    public String numbersToStringRegular() {
        String result = "";

        for (int index = 0; index < numbers.length; index++) {
            result += numbers[index] + "\n";
        }

        return result;
    }

}