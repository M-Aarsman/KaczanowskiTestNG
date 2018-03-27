package com.magda.kaczanowski.chapter4;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class FootballTeamTest {
    public void constructorShouldSetGamesWon() {
        FootballTeam team = new FootballTeam(3);
        assertEquals(team.getGamesWon(), 3);
    }
}
