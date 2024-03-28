package com.csaunit3;

/*
 * Represents an employee
 */
public class Employee {

    private String name;         // The name of the employee
    private double baseSalary;   // The employee's base salary
  
    /*
     * Constructor to create an Employee object
     * with a specified name and base salary
     */
    public Employee(String name, double baseSalary) {
      this.name = name;
      this.baseSalary = baseSalary;
    }
  
    /*
     * Gets the name of the employee
     */
    public String getName() {
      return name;
    }
  
    /*
     * Gets the employee's base salary
     */
    public double getSalary() {
      return baseSalary;
    }
    
  }