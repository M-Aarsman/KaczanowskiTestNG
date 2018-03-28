package com.magda.kaczanowski.chapter4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FootballTeamTest {

    @DataProvider
    private Object[][] numberOfGamesWon() {
        return new Object[][] {
                {0},
                {1},
                {2}
        };
    }

    @DataProvider
    private Object[][] illegalNumberOfGamesWon() {
        return new Object[][]{
                {-1},
                {-10}
        };
    }

    @Test(dataProvider = "numberOfGamesWon")
    public void constructorShouldSetGamesWon(int numberOfGamesWon) {
        FootballTeam team = new FootballTeam(numberOfGamesWon);
        assertEquals(team.getGamesWon(), numberOfGamesWon, numberOfGamesWon + " were passed to constructor, but "
        + team.getGamesWon() + " were returned");
    }

    @Test(dataProvider = "illegalNumberOfGamesWon", expectedExceptions = IllegalArgumentException.class)
    public void shouldThrowExceptionForIllegalGamesNumber(int illegalNumberOfGames) {
        new FootballTeam(illegalNumberOfGames);
    }
}
