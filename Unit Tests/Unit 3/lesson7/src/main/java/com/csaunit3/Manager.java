package com.csaunit3;

/*
 * Represents a manager
 */
public class Manager extends Employee {

    private double bonus;  // The bonus the Manager receives
  
    /*
     * Constructor to create a Manager object
     * with a specified name, base salary, and bonus
     */
    public Manager(String name, double salary, double bonus) {
      super(name, salary);   // Calls the Employee constructor
      this.bonus = bonus;
    }
  
    /*
     * Gets the name of the manager
     */
    public String getName() {
      return "*" + super.getName();
    }
  
    /*
     * Gets the manager's salary with bonus
     */
    public double getSalary() {
      return super.getSalary() + bonus;
    }
    
  }