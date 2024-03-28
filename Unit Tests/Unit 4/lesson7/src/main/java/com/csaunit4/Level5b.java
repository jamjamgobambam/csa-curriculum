package com.csaunit4;

public class Level5b {
    public static void main(String[] args) {

        double[] sales = {-4.05, 5.06, 3.99, -3.99, -1.99, 2.05, 10.50, -7.85, 6.73, -8.45};
        SalesAnalyzer mySales = new SalesAnalyzer(sales);
    
        // TO DO #2: Call the cleanData() method.
        double[] correctedSales = mySales.cleanData();
    
        // TO DO #3: Print the values stored in the new array.
        for (int index = 0; index < correctedSales.length; index++) {
          System.out.print(correctedSales[index] + " ");
        }
        
      }
}