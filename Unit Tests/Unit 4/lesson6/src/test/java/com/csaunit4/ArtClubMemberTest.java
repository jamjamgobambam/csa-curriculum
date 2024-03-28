package com.csaunit4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("ArtClubMember.java Test")
public class ArtClubMemberTest {

    String message;
    
    @BeforeAll
    public static void setup() {
        ArtClubMember eva = new ArtClubMember("Eva");
        ArtClubMember jacob = new ArtClubMember("Jacob");
        ArtClubMember anita = new ArtClubMember("Anita");
    
        System.out.println(ArtClubMember.getNumMembers());
    }

    @Test
    @DisplayName("Return a String containing the number of art club members => ")
    public void testPrintNumMembers() {
        message = "ArtClubMember printNumMembers() does not return a String containing the number of art club members.";
        message += "\n       ";

        String expected = "The Art Club has 3 members.";
        String actual = ArtClubMember.getNumMembers();

        assertEquals(expected, actual, message);
    }
}