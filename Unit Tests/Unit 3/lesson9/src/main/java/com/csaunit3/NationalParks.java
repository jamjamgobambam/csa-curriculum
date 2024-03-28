package com.csaunit3;

/*
 * Processes park names in a String array
 */
public class NationalParks {

    private String[] parkNames;   // The 1D array of park names
  
    /*
     * Constructor to create a NationalParks object with
     * a specified list of park names
     */
    public NationalParks(String[] parkNames) {
      this.parkNames = parkNames;
    }
  
    /*
     * Returns the parkNames array
     */
    public String[] getParkNames() {
      return parkNames;
    }
  
    /*
     * Prints the names of the parks in the parkNames array
     */
    public void printParkNames() {
      for (String park : parkNames) {
        System.out.println(park);
      }
    }
  
    /*
     * Reverses the parkNames array
     */
    public void reverse() {
      // TO DO #1: Reverse the elements in the parkNames array.
      int back = parkNames.length - 1;
  
      for (int front = 0; front < parkNames.length / 2; front++) {
        String temp = parkNames[front];
        parkNames[front] = parkNames[back];
        parkNames[back] = temp;
        back--;
      }
    }
    
  }