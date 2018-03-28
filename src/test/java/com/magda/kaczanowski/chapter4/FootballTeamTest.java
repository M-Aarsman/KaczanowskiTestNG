package com.magda.kaczanowski.chapter4;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class FootballTeamTest {
    public void constructorShouldSetGamesWon() {
        int gamesWon = 3;
        FootballTeam team = new FootballTeam(gamesWon);
        assertEquals(team.getGamesWon(), gamesWon, gamesWon + " were passed to constructor, but "
        + team.getGamesWon() + " were returned");
    }
}
