package com.csaunit3;

/*
 * Represents an event
 */
public class Event {

    private Ticket[] eventTickets;
  
    /*
     * Constructor to create an Event object
     * with a specified array of event tickets
     */
    public Event(Ticket[] eventTickets) {
      this.eventTickets = eventTickets;
    }
  
    /*
     * Returns the array of event tickets
     */
    public Ticket[] getTickets() {
      return eventTickets;
    }
  
    /*
     * Prints each ticket's information and price
     */
    public String getTicketsInfo() {
      String result = "";

      // TO DO #1: Traverse the Ticket array and print the ticket
      // information and the ticket price.
      for (Ticket ticket : eventTickets) {
        result += ticket + ": " + ticket.getTicketPrice() + "\n";
      }

      return result;
    }
    
  }