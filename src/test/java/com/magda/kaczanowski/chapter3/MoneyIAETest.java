package com.magda.kaczanowski.chapter3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MoneyIAETest {
    private final static int VALID_AMOUNT = 5;
    private final static String VALID_CURRENCY = "USD";

    @DataProvider
    private static final Object[][] getInvalidAmount() {
        return new Integer[][] {
                {-12345},
                {-5},
                {-1}
        };
    }

    @DataProvider
    private static final Object[][] getInvalidCurrency() {
        return new String[][] {
                {null},
                {""}
        };
    }

    @Test(dataProvider = "getInvalidAmount", expectedExceptions = IllegalArgumentException.class)
    public void shouldThrowIAEWithInvalidAmount(int invalidAmount) {
        Money money = new Money(invalidAmount, VALID_CURRENCY);
    }

    @Test(dataProvider = "getInvalidCurrency", expectedExceptions = IllegalArgumentException.class)
    public void shouldThrowIAEWithInvalidCurrency(String invalidCurrency) {
        Money money = new Money(VALID_AMOUNT, invalidCurrency);
    }

}
