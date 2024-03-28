package com.csaunit3;

public class Level5a {
    public static void main(String[] args) {
        
        int[] totalCSExams = {29047, 11969, 12811, 12394, 7658};
        int[] femaleCSExams = {8993, 4202, 3689, 3403, 2282};

        APExams totalStats = new APExams(totalCSExams);
        APExams femaleStats = new APExams(femaleCSExams);

        // TO DO #5: Print the result of a call to calculateSum() on the totalStats object.
        System.out.println("Total AP CS Exams: " + totalStats.calculateSum());

        // TO DO #6: Print the result of a call to calculateSum() on the femaleStats object.
        System.out.println("Total AP CS Exams taken by female students: " + femaleStats.calculateSum());
        
    }
}