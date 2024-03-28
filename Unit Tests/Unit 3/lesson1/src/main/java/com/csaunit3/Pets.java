package com.csaunit3;

/*
 * Manages pets for a pet adoption center
 */
public class Pets {

    private String[] petBreeds;
  
    /*
     * Creates a PetsManager by initializing the petBreeds array
     */
    public Pets() {
      this.petBreeds = createPetBreeds();
    }

    public String[] getPetBreeds() {
      return petBreeds;
    }
  
    /*
     * Creates and returns an array containing the names of pet breeds
     */
    public String[] createPetBreeds() {
      // TO DO #1: Declare, initialize, and return a String array containing the values.
      String[] values = {"Alaskan Husky", "Beagle", "Dalmatian", "German Shepherd", "Great Dane", "Lhasa Apso", "Pug", "Whippet"};
      return values;    
    }
  
    /*
     * Returns the number of pet breeds in the petBreeds array
     */
    public int getNumBreeds() {
      // TO DO #2: Return the length of the petBreeds array.
      return petBreeds.length;
    }
    
  }