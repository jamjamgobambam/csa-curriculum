package com.csaunit4;

/*
 * Represents a dog
 */
public class Dog {

    private int age;       // The age of the dog
  
    /*
     * Constructor to create a Dog with
     * the specified age
     */
    public Dog(int age) {
      this.age = age;
    }
  
    /*
     * Returns the age of the Dog
     */
    public int getAge() {
      return age;
    }
  
    // TO DO #1: Write the equals() method.
  
    public boolean equals(Dog other) {
      if (other == null) {
        return false;
      }
      return this.age == other.getAge();
    }
    
  }