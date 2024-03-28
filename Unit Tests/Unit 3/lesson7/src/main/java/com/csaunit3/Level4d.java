package com.csaunit3;

public class Level4d {
    public static void main(String[] args) {
        
        Ticket firstTicket = new Ticket(1);
        WalkupTicket secondTicket = new WalkupTicket(2);
        AdvanceTicket thirdTicket = new AdvanceTicket(3, 11);
        StudentAdvanceTicket fourthTicket = new StudentAdvanceTicket(4, 7);

        // TO DO #2: Create a Ticket array containing the Ticket objects.
        Ticket[] tickets = {firstTicket, secondTicket, thirdTicket, fourthTicket};

        // TO DO #3: Instantiate an Event object with the Ticket array
        // and call the printTickets() method.
        Event myEvent = new Event(tickets);
        System.out.println(myEvent.getTicketsInfo());
        
    }
}