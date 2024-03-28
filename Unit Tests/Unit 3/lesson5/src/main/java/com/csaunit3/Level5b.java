package com.csaunit3;

public class Level5b {
    public static void main(String[] args) {
        
        double[] albany = {26.09, 31.62, 42.31, 39.07, 39.98};
        double[] sacramento = {57.12, 55.35, 58.83, 59.92, 62.21};

        Weather albanyTemps = new Weather(albany);
        Weather sacramentoTemps = new Weather(sacramento);

        // TO DO #5: Print the result of a call to calculateAverage() on the albanyTemps object.
        System.out.println("Albany Average Temperature: " + albanyTemps.calculateAverage());

        // TO DO #6: Print the result of a call to calculateAverage() on the sacramentoTemps object.
        System.out.println("Sacramento Average Temperature: " + sacramentoTemps.calculateAverage());
        
    }
}