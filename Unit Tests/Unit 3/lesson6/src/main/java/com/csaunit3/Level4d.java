package com.csaunit3;

public class Level4d {
    public static void main(String[] args) {
        
        /*
        * Number of championship wins for the Boston Celtics, Brooklyn Nets, New York Knicks, 
        * Philadelphia 76ers, Toronto Raptors, Chicago Bulls, Cleveland Cavaliers, Detroit Pistons,
        * Indiana Pacers, Milwaukee Bucks (in order).
        */
        int[] championshipList = {17, 0, 2, 3, 1, 6, 1, 3, 0, 1};

        Basketball teamWins = new Basketball(championshipList);

        // TO DO #3: Print the result of a call to countOverMin().
        System.out.print("Number of teams with at least " + Basketball.MIN_WINS + " wins: ");
        System.out.println(teamWins.countOverMin());
        
    }
}