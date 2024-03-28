package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@DisplayName("Planets.java Test")
@TestMethodOrder(OrderAnnotation.class)
public class PlanetsTest {
    
    Planets scientist;
    String message;

    @BeforeEach
    public void setup() {
        scientist = new Planets();
    }

    @Test
    @Order(1)
    @DisplayName("Declare, initialize, and return a String array => ")
    public void testCreatePlanetNames() {
        message = "Planets createPlanetNames() does not return an array containing the values [\"Mercury\", \"Venus\", \"Earth\", \"Mars\", \"Jupiter\", \"Saturn\", \"Uranus\", \"Neptune\", \"Pluto\"].";
        message += "\n        Declare and initialize a String array to store the values then return the array.";
        message += "\n        ";

        String[] expected = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        String[] actual = scientist.createPlanetNames();
        assertArrayEquals(expected, actual, message);
    }

    @Test
    @Order(2)
    @DisplayName("Declare, initialize, and return a double array => ")
    public void testCreateDistances() {
        message = "Planets createDistances() does not return an array containing the values [57.9, 108.2, 149.6, 227.9, 778.6, 1433.5, 2872.5, 4495.1, 5906.4].";
        message += "\n        Declare and initialize a double array to store the values then return the array.";
        message += "\n        ";

        double[] expected = {57.9, 108.2, 149.6, 227.9, 778.6, 1433.5, 2872.5, 4495.1, 5906.4};
        double[] actual = scientist.createDistances();
        assertArrayEquals(expected, actual, message);
    }

    @Test
    @Order(3)
    @DisplayName("Return the length of the instance variable \"planetNames\" => ")
    public void testGetNumPlanets() {
        message = "Planets getNumPlanets() does not return the length of the array \"planetNames\".";
        message += "\n        Get the length of the array \"planetNames\" and return the result.";
        message += "\n        ";
        
        int expected;
        int result;

        try {
            expected = scientist.getPlanetNames().length;
            result = scientist.getNumPlanets();
        } catch (Exception e) {
            expected = 9;
            result = 0;
        }

        assertEquals(expected, result, message);
    }

    @Test
    @Order(4)
    @DisplayName("Return the length of the instance variable \"distances\" => ")
    public void testGetNumDistances() {
        message = "Planets getNumDistances() does not return the length of the array \"distances\".";
        message += "\n        Get the length of the array \"distances\" and return the result.";
        message += "\n        ";
        
        int expected;
        int result;

        try {
            expected = scientist.getDistances().length;
            result = scientist.getNumDistances();
        } catch (Exception e) {
            expected = 9;
            result = 0;
        }

        assertEquals(expected, result, message);
    }

}