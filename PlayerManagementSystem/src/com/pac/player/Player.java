package com.pac.player;

public class Player {
    int jerseyNumber;
    String name;
    int runs;
    int matchesPlayed;
    int wickets;

    public Player(int jerseyNumber, String name, int runs, int matchesPlayed, int wickets) {
        this.jerseyNumber = jerseyNumber;
        this.name = name;
        this.runs = runs;
        this.matchesPlayed = matchesPlayed;
        this.wickets = wickets;
    }
}

