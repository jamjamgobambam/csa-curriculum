package com.csaunit3;

/*
 * Represents a student ticket for an event that
 * is purchased in advance
 */
public class StudentAdvanceTicket extends AdvanceTicket {

    /*
     * Constructor to create a StudentAdvanceTicket object with
     * a specified ticket number and number of days in advance
     */
    public StudentAdvanceTicket(int ticketNumber, int numDays) {
      super(ticketNumber, numDays);
    }
  
    /*
     * Gets the price of the ticket based on the number of days
     * in advance it is being purchased and discounts it in half
     */
    public double getTicketPrice() {
      return super.getTicketPrice() / 2;
    }
  
    /*
     * Returns a String with the ticket number and reminder
     * to show their student ID
     */
    public String toString() {
      return super.toString() + " (must show their student ID)";
    }
    
  }