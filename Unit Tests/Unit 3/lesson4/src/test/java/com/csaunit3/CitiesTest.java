package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@DisplayName("Cities.java Test")
@TestMethodOrder(OrderAnnotation.class)
public class CitiesTest {

    String[] citiesList = {"Seoul", "Tel Aviv", "Istanbul", "Los Angeles", "Boston"};
    int[] hoursWorkedList = {1967, 1898, 1832, 1779, 1779};
    Cities lifestyles = new Cities(citiesList, hoursWorkedList);
    String message;

    @Test
    @Order(1)
    @DisplayName("Return true if all annual hours worked are greater than the parameter \"hours\" => ")
    public void testHasAtLeastGreaterThanHours() {
        message = "Cities hasAtLeast() does not return true if all annual hours worked are greater than the parameter \"hours\".";
        message += "\n        Check all values to make sure each are greater than the parameter \"hours\" before returning the result.";
        message += "\n       ";

        assertTrue(lifestyles.hasAtLeast(1500), message);
    }

    @Test
    @Order(2)
    @DisplayName("Return true if all annual hours worked are equal to the parameter \"hours\" => ")
    public void testHasAtLeastEqualToHours() {
        message = "Cities hasAtLeast() does not return true if all annual hours worked are equal to the parameter \"hours\".";
        message += "\n        Check all values to make sure each are equal to the parameter \"hours\" before returning the result.";
        message += "\n       ";

        assertTrue(lifestyles.hasAtLeast(1832), message);
    }

    @Test
    @Order(3)
    @DisplayName("Return false if all annual hours worked are less than the parameter \"hours\" => ")
    public void testHasAtLeastLessThanHours() {
        message = "Cities hasAtLeast() does not return false if none of the annual hours worked are greater than or equal to the parameter \"hours\".";
        message += "\n        Check all values to make sure each are greater than or equal to the parameter \"hours\" before returning the result.";
        message += "\n       ";

        assertFalse(lifestyles.hasAtLeast(1800), message);
    }

    @Test
    @Order(4)
    @DisplayName("Return a String containing the city name and hours worked that matches the parameter \"hours\" => ")
    public void testCityWithValueReturnCityNameAndHours() {
        message = "Cities cityWithValue() does not return a String containing the city name and hours worked that matches the parameter \"hours\".";
        message += "\n        Find the first value in \"annualHoursWorked\" that matches the parameter \"hours\" and return the result.";
        message += "\n       ";

        String expected = citiesList[1] + " - Average Annual Hours Worked: " + hoursWorkedList[1];
        String actual = lifestyles.cityWithValue(1898);
        assertEquals(expected, actual, message);
    }

    @Test
    @Order(5)
    @DisplayName("Return \"None found\" if no value in \"annualHoursWorked\" matches the parameter \"hours\" => ")
    public void testCityWithValueNoneFound() {
        message = "Cities cityWithValue() does not return the String \"None found\" if no value in \"annualHoursWorked\" matches the parameter \"hours\".";
        message += "\n        Check each value in \"annualHoursWorked\" and return the String \"None found\" if no matches are found.";
        message += "\n       ";

        String expected = "None found.";
        String actual = lifestyles.cityWithValue(1500);
        assertEquals(expected, actual, message);
    }
}