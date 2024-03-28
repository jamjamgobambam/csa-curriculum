package com.csaunit4;

public class AgeChecker {

    public String checkAge(int age) {
      String status = "";

      if (age <= 18) {
        if (age <= 13) {
          status = "Child";
        }
        else {
          status = "Teenager";
        }
      }
      else {
        status = "Adult";
      }

      return status;
    }
  }