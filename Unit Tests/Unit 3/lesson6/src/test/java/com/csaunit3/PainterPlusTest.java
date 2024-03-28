package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("PainterPlus.java Test")
public class PainterPlusTest {
    
    String message;
    
    @Test
    @Order(1)
    @DisplayName("Declare and initialize a static variable called \"totalPainters\" => ")
    public void testTotalPainters() {
        message = "PainterPlus \"totalPainters\" is not static or is not initialized to 0.";
        message += "\n        \"totalPainters\" should be a public static variable that is initialized to 0.";
        message += "\n       ";

        int expected = 0;
        int actual = PainterPlus.totalPainters;

        assertEquals(expected, actual, message);
    }

    @Test
    @Order(2)
    @DisplayName("\"totalPainters\" increases by 1 when a PainterPlus object is instantiated with the no-argument constructor => ")
    public void testTotalPaintersIncrementsNoArgConstructor() {
        message = "\"totalPainters\" does not increase by 1 when a PainterPlus object is instantiated with the no-argument constructor.";
        message += "\n        In the no-argument constructor, increment the static variable \"totalPainters\" by 1.";
        message += "\n       ";

        int expected = 1;
        PainterPlus firstPainter = new PainterPlus();
        firstPainter.move();
        int actual = PainterPlus.totalPainters;

        assertEquals(expected, actual, message);
    }

    @Test
    @Order(2)
    @DisplayName("\"totalPainters\" increases by 1 when a PainterPlus object is instantiated with the parameterized constructor => ")
    public void testTotalPaintersIncrementsParameterizedConstructor() {
        message = "\"totalPainters\" does not increase by 1 when a PainterPlus object is instantiated with the parameterized constructor.";
        message += "\n        In the parameterized constructor, increment the static variable \"totalPainters\" by 1.";
        message += "\n       ";

        int expected = 1;
        PainterPlus.totalPainters = 0;
        PainterPlus secondPainter = new PainterPlus(2, 2, "south", 10);
        secondPainter.move();
        int actual = PainterPlus.totalPainters;

        assertEquals(expected, actual, message);
    }

}