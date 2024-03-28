public class AgencyRunner {
  public static void main(String[] args) {

    // Creates a 1D array of Rollercoaster objects
    Rollercoaster[] coasters = { new Rollercoaster("Shamu Express", 23), new Rollercoaster("Quicksilver Express", 51),
                               new Rollercoaster("Tig'rr Coaster", 50), new Rollercoaster("Pony Express", 62),
                               new Rollercoaster("Coastersaurus", 32), new Rollercoaster("Cobra", 35)};

    // Instantiates a TravelAgency with the array of rollercoasters
    TravelAgency agency = new TravelAgency(coasters);

    // Calls the getChildFriendly() method and prints the result
    System.out.println(agency.getChildFriendly());    
    
  }
}