package com.csaunit3;

public class Level4a {
    public static void main(String[] args) {

        // TO DO #3: Declare and initialize a 1D array.
        int[] grades = {85, 97, 82, 79, 95};

        // TO DO #4: Instantiate a QuizGrades object with the array.
        QuizGrades teacher = new QuizGrades(grades);

        // TO DO #5: Call the getGrade() to get the grade at index 1 and print the result.
        int tuesdayGrade = teacher.getGrade(1);
        System.out.println("Tuesday's Grade: " + tuesdayGrade);

        // TO DO #6: Call the setGrade() to change the grade at index 3 to 91.
        // Print the updated value at index 3.
        teacher.setGrade(3, 91);
        System.out.println("Thursday's Grade: " + teacher.getGrade(3));

    }
}