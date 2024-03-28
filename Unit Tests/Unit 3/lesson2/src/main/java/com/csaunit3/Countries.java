package com.csaunit3;

public class Countries {
    
    private String[] names;
    private double[] data;

    public Countries(String[] names, double[] data) {
        this.names = names;
        this.data = data;
    }

    public String[] getNames() {
        return names;
    }

    public double[] getData() {
        return data;
    }

    public String printData(String message) {
        String result = "";
        int index = 0;

        while (index <= names.length) {
            result += names[index] + ": " + data[index] + message + "\n";

            index += 1;
        }

        return result;
    }
}