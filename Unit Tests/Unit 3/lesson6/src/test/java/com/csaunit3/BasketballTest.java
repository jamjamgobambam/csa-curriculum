package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Basketball.java Test")
public class BasketballTest {
    
    int[] championshipList = {17, 0, 2, 3, 1, 6, 1, 3, 0, 1};
    Basketball teamWins = new Basketball(championshipList);
    String message;

    @Test
    @Order(1)
    @DisplayName("Declare and initialize a constant named \"MIN_WINS\" to 2 => ")
    public void testMinWins() {
        message = "Basketball \"MAX_PRICE\" is not static or is not initialized to 2.";
        message += "\n        \"MIN_WINS\" should be a public final static variable that is initialized to 2.";
        message += "\n       ";

        double expected = 2;
        double actual = Basketball.MIN_WINS;

        assertEquals(expected, actual, message);
    }

    @Test
    @Order(2)
    @DisplayName("Return the number of basketball teams with championship wins greater than or equal to \"MIN_WINS\" => ")
    public void testCountOverMin() {
        message = "Basketball countOverMin() does not return the number of basketball teams with championship wins greater than or equal to \"MIN_WINS\".";
        message += "\n        Traverse the array \"championshipWins\", count each value that is greater than or equal to \"MIN_WINS\" and return the result.";
        message += "\n       ";

        int expected = 5;
        int actual = teamWins.countOverMin();

        assertEquals(expected, actual, message);
    }

}