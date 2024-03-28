package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@DisplayName("Pets.java Test")
@TestMethodOrder(OrderAnnotation.class)
public class PetsTest {
    
    Pets dogBreeds;
    String message;

    @BeforeEach
    public void setup() {
        dogBreeds = new Pets();
    }

    @Test
    @Order(1)
    @DisplayName("Declare, initialize, and return a String array => ")
    public void testCreatePetBreeds() {
        message = "Pets createPetBreeds() does not return an array containing the values [\"Alaskan Husky\", \"Beagle\", \"Dalmatian\", \"German Shepherd\", \"Great Dane\", \"Lhasa Apso\", \"Pug\", \"Whippet\"].";
        message += "\n        Declare and initialize a String array to store the values then return the array.";
        message += "\n        ";

        String[] expected = {"Alaskan Husky", "Beagle", "Dalmatian", "German Shepherd", "Great Dane", "Lhasa Apso", "Pug", "Whippet"};
        String[] result = dogBreeds.createPetBreeds();
        assertArrayEquals(expected, result, message);
    }

    @Test
    @Order(2)
    @DisplayName("Return the length of the instance variable \"petBreeds\" => ")
    public void testGetNumBreeds() {
        message = "Pets getNumBreeds() does not return the length of the array \"petBreeds\".";
        message += "\n        Get the length of the array and return the result.";
        message += "\n        ";
        
        int expected;
        int result;

        try {
            expected = dogBreeds.getPetBreeds().length;
            result = dogBreeds.getNumBreeds();
        } catch (Exception e) {
            expected = 8;
            result = 0;
        }

        assertEquals(expected, result, message);
    }

}