package com.magda.kaczanowski.chapter4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Test
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

    private static final int ANY_NUMBER = 123;

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

    public void shouldBePossibleToCompareTeams() {
        FootballTeam team = new FootballTeam(ANY_NUMBER);

        assertTrue(team instanceof Comparable, "FootballTeam should implement Comparable");
    }

    public void teamsWithMoreMatchesWonShouldBeGrater() {
        FootballTeam team_2 = new FootballTeam(2);
        FootballTeam team_3 = new FootballTeam(3);

        assertTrue(team_3.compareTo(team_2) > 0,
                "team with " + team_3.getGamesWon() + " games won should be ranked before the team with "
                        + team_2.getGamesWon() + " games won");
    }

    public void teamsWithLessMatchesWonShouldBeLesser() {
        FootballTeam team_2 = new FootballTeam(2);
        FootballTeam team_3 = new FootballTeam(3);

        assertTrue(team_2.compareTo(team_3) < 0,
                "team with " + team_2.getGamesWon() + " games won should be ranked after the team with "
                        + team_3.getGamesWon() + " games won");
    }

    public void teamsWithSameNumberOfNatchesWonShouldBeEqual() {
        FootballTeam teamA = new FootballTeam(ANY_NUMBER);
        FootballTeam teamB = new FootballTeam(ANY_NUMBER);

        assertTrue(teamA.compareTo(teamB) == 0,
                "both teams have won the same number of games: " +
                        teamA.getGamesWon() +" vs " + teamB.getGamesWon() +
                        " and should be ranked equal");
    }
}
