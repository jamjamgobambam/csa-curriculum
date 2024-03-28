package com.csaunit3;

/*
 * Represents a ticket for an event
 * that is purchased on the day of the event
 */
public class WalkupTicket extends Ticket {

    /*
     * Constructor to create a Ticket object
     * with a specified ticket number
     */
    public WalkupTicket(int ticketNumber) {
      super(ticketNumber);  // Calls the Ticket constructor
    }
  
    /*
     * Gets the price of the ticket
     */
    public double getTicketPrice() {
      return 50;
    }
    
  }