package com.csaunit3;

public class Netflix {
    
    private double[] data;

    public Netflix(double[] data) {
        this.data = data;
    }

    public double[] getData() {
        return data;
    }

    public int getDataLength() {
        return data.length;
    }

}