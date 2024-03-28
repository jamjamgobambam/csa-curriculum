package com.csaunit3;

public class Level3c {
    public static void main(String[] args) {
        
        FileReader myFileReader = new FileReader("statenames.txt");
        String[] states = myFileReader.getStringData(50);

        myFileReader.setFile("admissionyears.txt");
        int[] years = myFileReader.getIntData(50);

        StateStats myStates = new StateStats(states, years);

        // TO DO #2: Print the result of a call to hasDuplicates().
        System.out.println("Duplicate years that states were admitted: " + myStates.hasDuplicates());
        
    }
}