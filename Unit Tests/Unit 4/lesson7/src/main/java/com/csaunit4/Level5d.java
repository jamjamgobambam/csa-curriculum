package com.csaunit4;

public class Level5d {
    public static void main(String[] args) {

        String[] cities = {"New York", "Tokyo", "Chicago", "Atlanta", "Philadelphia", "Boston",
                           "Los Angeles", "Dallas/Fort Worth", "Houston", "Detroit"};
        double[] cityAreas = {8683, 6993, 5498, 5083, 4661, 4497, 4320, 3644, 3355, 3267};
        CityData myCities = new CityData(cityAreas);
    
        // TO DO #2: Call the calculateSizes() method.
        double[] cityWidths = myCities.calculateSizes();
    
        // TO DO #3: Print the values stored in the new array.
        for (int index = 0; index < cityWidths.length; index++) {
          System.out.print(cities[index] + " width: ");
          System.out.println(cityWidths[index]);
        }
        
      }
}