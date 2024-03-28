package com.csaunit4;

import java.util.Scanner;

public class Course {
    
    private String teacher;

    public Course(String teacher) {
        this.teacher = teacher;
    }

    public String getTeacher() {
        return teacher;
    }

    public void promptForGrade() {
        Scanner input = new Scanner(System.in);
        int score = 0;
    
        while (score != -1) {
          System.out.print("Enter the student's score (or -1 to quit): ");
          score = input.nextInt();
          printResult(score);
        }

        input.close();
    }

    public boolean isValidScore(int score) {
        boolean result = false;

        if (score >= 50 && score <= 100) {
            result = true;
        }
        
        return result;
    }

    public void printResult(int enteredScore) {
        if (isValidScore(enteredScore)) {
            System.out.println("Score is: " + enteredScore);
        }
        else {
            if (enteredScore == -1) {
                System.out.println("Goodbye!");
            }
            else {
                System.out.println("The score is invalid. Please try again.");
            }
        }
    }
}