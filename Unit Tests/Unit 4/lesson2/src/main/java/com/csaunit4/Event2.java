package com.csaunit4;

/*
 * Represents an event
 */
public class Event2 {

    private String eventName;  // The name of the event
    private int capacity;      // The number of people attending the event
  
    /*
     * Constructor to create an Event
     * with specified event name and capacity
     */
    public Event2(String eventName, int capacity) {
      this.eventName = eventName;
      this.capacity = capacity;
    }
  
    /*
     * Returns the name of the event
     */
    public String getEventName() {
      return eventName;
    }
  
    /*
     * Returns the capacity of the event
     */
    public int getCapacity() {
      return capacity;
    }
  
    /*
     * Checks if this Event is equivalent to otherEvent
     */
    public boolean equals(Event2 otherEvent) {
      boolean status = false;
  
      if (eventName == otherEvent.getEventName()) {
        status = true;
      }
  
      return status;
    }
    
  }