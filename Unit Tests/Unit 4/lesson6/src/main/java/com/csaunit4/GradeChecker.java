package com.csaunit4;

/*
 * A class that analyzes grades
 */
public class GradeChecker {
    // TO DO #1: Write the static method getLetterGrade() to
    // return the letter grade matching the score.
    public static String getLetterGrade(int score) {
      if (score >= 90 && score <= 100) {
        return "A";
      } else if (score >= 80 && score < 90) {
        return "B";
      } else if (score >= 70 && score < 80) {
        return "C";
      } else if (score >= 60 && score < 70) {
        return "D";
      } else {
        return "";
      }
    }
  }