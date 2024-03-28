package com.csaunit3;

public class Level2 {
    public static void main(String[] args) {

        String[] citiesList = {"Seoul", "Tel Aviv", "Istanbul", "Los Angeles", "Boston"};

        int[] hoursWorkedList = {1967, 1898, 1832, 1779, 1779};

        Cities lifestyleAnalysis = new Cities(citiesList, hoursWorkedList);

        System.out.println("Are the average annual hours worked in all cities at least 1800 hours? " + lifestyleAnalysis.hasAtLeast(1800));

        System.out.println(lifestyleAnalysis.cityWithValue(1779));
        
    }
}