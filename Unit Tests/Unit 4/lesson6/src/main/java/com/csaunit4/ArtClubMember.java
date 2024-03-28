package com.csaunit4;

/*
 * Represents a member of an art club
 */
public class ArtClubMember {

    private String name;                 // The name of the club member
    private static int numMembers = 0;   // The number of club members
  
    /*
     * Constructor to create an ArtClubMember
     * with the specified name
     */
    public ArtClubMember(String name) {
      this.name = name;
      numMembers++;
    }
  
    /*
     * Returns the name of the club member
     */
    public String getName() {
      return name;
    }
  
    /*
     * Returns the number of club members
     */
    public static String getNumMembers() {
      return "The Art Club has " + numMembers + " members.";
    }
    
  }