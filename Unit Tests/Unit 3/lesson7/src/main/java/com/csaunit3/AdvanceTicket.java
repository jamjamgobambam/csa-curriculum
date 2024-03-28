package com.csaunit3;

/*
 * Represents a ticket for an event that
 * is purchased in advance
 */
public class AdvanceTicket extends Ticket {

    private int numDays;  // The number of days in advance the ticket is being purchased
  
    /*
     * Constructor to create a AdvanceTicket object with a
     * specified ticket number and number of days in advance
     */
    public AdvanceTicket(int ticketNumber, int numDays) {
      super(ticketNumber);
      this.numDays = numDays;
    }
  
    /*
     * Gets the price of the ticket based on the
     * number of days in advance it is being purchased
     */
    public double getTicketPrice() {
      if (numDays >= 10) {
        return 30;
      }
      else {
        return 40;
      }
    }
    
  }