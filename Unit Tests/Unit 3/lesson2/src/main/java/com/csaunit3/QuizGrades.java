package com.csaunit3;

/*
 * Manages grades on daily quizzes
 */
public class QuizGrades {

    private int[] grades;
  
    /*
     * Creates a QuizGrades with an array of grades
     */
    public QuizGrades(int[] grades) {
      this.grades = grades;
    }
  
    /*
     * Returns the array containing the grades
     */
    public int[] getAllGrades() {
      return grades;
    }
  
    /*
     * Returns the value in grades at the specified index
     */
    public int getGrade(int index) {
      // TO DO #1: Return the value in grades at the specified index.
      return grades[index];
    }
  
    /*
     * Changes the value in grades at the specified index to the new value
     */
    public void setGrade(int index, int newValue) {
      // TO DO #2: Change the value in grades at the specified index to newValue;
      grades[index] = newValue;
    }
    
  }