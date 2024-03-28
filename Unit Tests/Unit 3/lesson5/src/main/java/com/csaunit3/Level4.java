package com.csaunit3;

public class Level4 {
    public static void main(String[] args) {
        
        String[] favStates = {"California", "Texas", "New York", "Florida", "Illinois"};

        States myStates = new States(favStates);

        System.out.println(myStates.getStates());
        
    }
}