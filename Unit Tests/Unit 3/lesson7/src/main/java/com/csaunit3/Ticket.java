package com.csaunit3;

/*
 * Represents a ticket for an event
 */
public class Ticket {

    private int ticketNumber;   // The ticket number
  
    /*
     * Constructor to create a Ticket object
     * with a specified ticket number
     */
    public Ticket(int ticketNumber) {
      this.ticketNumber = ticketNumber;
    }
  
    /*
     * Gets the price of the ticket
     */
    public double getTicketPrice() {
      return 0;
    }
  
    /*
     * Returns a String with the ticket number
     */
    public String toString() {
      return "Ticket No " + ticketNumber;
    }
    
  }