package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Event.java Test")
public class EventTest {
    
    Ticket firstTicket = new Ticket(1);
    WalkupTicket secondTicket = new WalkupTicket(2);
    AdvanceTicket thirdTicket = new AdvanceTicket(3, 11);
    StudentAdvanceTicket fourthTicket = new StudentAdvanceTicket(4, 7);
    Ticket[] tickets = {firstTicket, secondTicket, thirdTicket, fourthTicket};
    String message;

    @Test
    @Order(1)
    @DisplayName("Return a String containing each ticket's information and price => ")
    public void testGetTicketsInfo() {
        message = "Event getTicketsInfo() does not return a String containing each ticket's information and price.";
        message += "\n        Traverse the \"eventTickets\" array and concatenate each ticket and the ticket price to \"result\".";
        message += "\n       ";

        String expected = getExpectedTicketsInfo();
        Event myEvent = new Event(tickets);
        String actual = myEvent.getTicketsInfo();

        assertEquals(expected, actual, message);
    }

    private String getExpectedTicketsInfo() {
        return "Ticket No 1: 0.0\n" + 
            "Ticket No 2: 50.0\n" + 
            "Ticket No 3: 30.0\n" + 
            "Ticket No 4 (must show their student ID): 20.0\n";
    }

}