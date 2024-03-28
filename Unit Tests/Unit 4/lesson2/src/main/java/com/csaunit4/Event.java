package com.csaunit4;

/*
 * Represents an event
 */
public class Event {

    private String eventName;  // The name of the event
    private int capacity;      // The number of people attending the event
  
    /*
     * Constructor to create an Event
     * with specified event name and capacity
     */
    public Event(String eventName, int capacity) {
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
    
  }