package com.magda.kaczanowski.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Chapter3ExOneTest {

    @DataProvider
    private static final Object[][] StringsToReverse() {
        return new Object[][] {
                {"ala", "ala"},
                {"kot", "tok"},
                {"", ""},
                {"tata", "atat"},
                {"a", "a"},
                {"123456789", "987654321"}
        };
    }

    @Test(dataProvider = "StringsToReverse")
    public void shouldReverseStrings(String normalWord, String reverseWord) {
        String outputString = Chapter3ExOne.reverse(normalWord);
        assertEquals(outputString, reverseWord);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void shouldThrowIAE() {
        String output = Chapter3ExOne.reverse(null);
    }
}