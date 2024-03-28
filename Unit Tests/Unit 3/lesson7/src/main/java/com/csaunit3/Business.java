package com.csaunit3;

/*
 * Represents a business
 */
public class Business {

    private Employee[] employees;
  
    /*
     * Creates a Business object with an array of employees
     */
    public Business(Employee[] employees) {
      this.employees = employees;
    }
  
    /*
     * Returns the array of employees
     */
    public Employee[] getEmployees() {
      return employees;
    }
  
    /*
     * Prints the information about each employee
     */
    public String getEmployeeInfo() {
      // TO DO #1: Traverse the Employee array and print the employee's name and salary.
      String result = "";

      for (Employee employee : employees) {
        result += employee.getName() + ": " + employee.getSalary() + "\n";
      }

      return result;
    }
    
  }