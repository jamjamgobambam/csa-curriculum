package com.csaunit4;

/*
 * Generates random ticket numbers
 */
public final class TicketGenerator {

    /*
     * Returns a random number between 100 and 200, inclusive
     */
    public static int randomTicket() {
      // TO DO #1: Return a random ticket number between 100 and 200, inclusive.
      
      return (int)(Math.random() * (200 - 100) + 1);
    }
  }