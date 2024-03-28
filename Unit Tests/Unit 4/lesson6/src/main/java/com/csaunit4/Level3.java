package com.csaunit4;

public class Level3 {
    public static void main(String[] args) {
        // TO DO #2: Call the getLetterGrade() method.
        System.out.println("Grade for 100 should be A: " + GradeChecker.getLetterGrade(100));
        System.out.println("Grade for 90 should be A: " + GradeChecker.getLetterGrade(90));
        System.out.println("Grade for 89 should be B: " + GradeChecker.getLetterGrade(89));
        System.out.println("Grade for 80 should be B: " + GradeChecker.getLetterGrade(80));
        System.out.println("Grade for 79 should be C: " + GradeChecker.getLetterGrade(79));
        System.out.println("Grade for 70 should be C: " + GradeChecker.getLetterGrade(70));
        System.out.println("Grade for 69 should be D: " + GradeChecker.getLetterGrade(69));
        System.out.println("Grade for 60 should be D: " + GradeChecker.getLetterGrade(60));
        System.out.println("Grade for 59 should be blank: " + GradeChecker.getLetterGrade(59));
        System.out.println("Grade for 101 should be blank: " + GradeChecker.getLetterGrade(101));
        System.out.println("Grade for -1 should be blank: " + GradeChecker.getLetterGrade(-1));
      }
}