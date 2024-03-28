package com.csaunit3;

public class Level3b {
    public static void main(String[] args) {

        String[] booksList = {"Twilight", "The Hobbit", "The Catcher in the Rye", "The Fellowship of the Ring", "Animal Farm",
                         "Lord of the Flies", "Of Mice and Men", "The Alchemist", "The Giver", "The Book Thief"};
    
        int[] yearsList = {2006, 2002, 2001, 2003, 2003, 1999, 2002, 1993, 2006, 2006};

        Books myBooks = new Books(booksList, yearsList);

        System.out.println("My books has a book published in 2003: " + myBooks.hasYear(2003));
        
    }
}