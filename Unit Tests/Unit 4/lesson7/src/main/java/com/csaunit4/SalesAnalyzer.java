package com.csaunit4;

/*
 * Analyzes sales data for a business
 */
public class SalesAnalyzer {

    private double[] sales;  // The list of sales
  
    /*
     * Constructor to create a SalesAnalyzer
     * with the specified array of sales
     */
    public SalesAnalyzer(double[] sales) {
      this.sales = sales;
    }
  
    /*
     * Returns a new array containing corrected sales values
     */
    public double[] cleanData() {
      // TO DO #1: Return a new array containing the corrected sales values.
  
      double[] newSales = new double[sales.length];
      
      for (int index = 0; index < sales.length; index++) {
        newSales[index] = Math.abs(sales[index]);
      }
  
      return newSales;
    }
    
  }