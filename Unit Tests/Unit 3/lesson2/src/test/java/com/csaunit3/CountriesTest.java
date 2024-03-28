package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@DisplayName("Countries.java Test")
@TestMethodOrder(OrderAnnotation.class)
public class CountriesTest {
    
    String[] expectedNames = {"Australia", "Canada", "China", "France", "Haiti", "India", "Jamaica", "Mexico", "United Kingdom", "United States"};
    double[] expectedInternetUsage = {86.55, 91, 54.3, 82.04, 32.47, 34.45, 55.07, 65.77, 94.9, 87.27};
    Countries countriesData;
    String message;

    @BeforeEach
    public void setup() {
        countriesData = new Countries(expectedNames, expectedInternetUsage);
    }

    @Test
    @Order(1)
    @DisplayName("Return the instance variable \"names\" => ")
    public void testGetNames() {
        message = "Countries getNames() does not return the instance variable \"names\".";
        message += "\n       ";

        String[] actual = countriesData.getNames();
        assertArrayEquals(expectedNames, actual, message);
    }

    @Test
    @Order(2)
    @DisplayName("Return the instance variable \"data\" => ")
    public void testGetData() {
        message = "Countries getData() does not return the instance variable \"data\".";
        message += "\n       ";

        double[] actual = countriesData.getData();
        assertArrayEquals(expectedInternetUsage, actual, message);
    }

    @Test
    @Order(3)
    @DisplayName("Return a String containing each country name and data value => ")
    public void testPrintData() {
        message = "Countries printData() does not return a String containing each country name and data value.";
        message += "\n        Make sure the current values are being added to the \"result\" String and that the loop is correct.";
        message += "\n       ";

        String expected = getExpectedString();
        String actual;
        
        try {
            actual = countriesData.printData("% using the Internet");
        } catch (Exception e) {
            actual = "";
        }
        
        assertEquals(expected, actual, message);
    }

    private String getExpectedString() {
        return "Australia: 86.55% using the Internet\n" +
            "Canada: 91.0% using the Internet\n" + 
            "China: 54.3% using the Internet\n" + 
            "France: 82.04% using the Internet\n" + 
            "Haiti: 32.47% using the Internet\n" + 
            "India: 34.45% using the Internet\n" + 
            "Jamaica: 55.07% using the Internet\n" + 
            "Mexico: 65.77% using the Internet\n" + 
            "United Kingdom: 94.9% using the Internet\n" + 
            "United States: 87.27% using the Internet\n";
    }
}