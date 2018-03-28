package com.magda.kaczanowski.chapter4;

class FootballTeam implements Comparable<FootballTeam> {
    private final int gamesWon;

    FootballTeam(int gamesWon) {
        if(gamesWon < 0) {
            throw new IllegalArgumentException("number of games won can not be negative");
        }
        this.gamesWon = gamesWon;
    }

    int getGamesWon() {
        return gamesWon;
    }

    @Override
    public int compareTo(FootballTeam otherTeam) {
        return gamesWon - otherTeam.getGamesWon();
    }
}
