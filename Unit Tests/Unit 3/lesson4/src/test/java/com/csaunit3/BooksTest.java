package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@DisplayName("Books.java Test")
@TestMethodOrder(OrderAnnotation.class)
public class BooksTest {
    
    String[] booksList = {"Twilight", "The Hobbit", "The Catcher in the Rye", "The Fellowship of the Ring", "Animal Farm",
                         "Lord of the Flies", "Of Mice and Men", "The Alchemist", "The Giver", "The Book Thief"};
    int[] yearsList = {2006, 2002, 2001, 2003, 2003, 1999, 2002, 1993, 2006, 2006};
    Books myBooks = new Books(booksList, yearsList);
    String message;

    @Test
    @Order(1)
    @DisplayName("Return true if at least one value in \"years\" is equal to the parameter \"yearToFind\" => ")
    public void testHasYearReturnsTrue() {
        message = "Books hasYear() does not return true if at least one value in \"years\" is equal to the parameter \"yearToFind\".";
        message += "\n        Find the first value that is equal to the parameter \"yearToFind\" and return the result.";
        message += "\n       ";

        assertTrue(myBooks.hasYear(2003), message);
    }

    @Test
    @Order(2)
    @DisplayName("Return false if no values in \"years\" is equal to the parameter \"yearsToFind\" => ")
    public void testHasYearReturnsFalse() {
        message = "Books hasYear() does not return false if no values in \"years\" are equal to the parameter \"yearToFind\".";
        message += "\n        Check if any values in \"years\" are equal to the parameter \"yearToFind\" and return false if none are found.";
        message += "\n       ";

        assertFalse(myBooks.hasYear(2010), message);
    }

}