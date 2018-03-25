package com.magda.kaczanowski.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MoneyTest {

    @DataProvider
    private static final Object [][] getMoney() {
        return new Object[][] {
                {10, "USD"},
                {20, "PLN"}
        };
    }

//    public void constructorShouldSetAmountAndCurrency() {
//        Money money = new Money(10, "PLN");
//
//        assertEquals(money.getAmount(), 10);
//        assertEquals(money.getCurrency(), "PLN");
//    }

    @Test(dataProvider = "getMoney")
    public void constructorShouldSetAmountAndCurrency(int amount, String currency) {
        Money money = new Money(amount, currency);

        assertEquals(money.getAmount(), amount);
        assertEquals(money.getCurrency(), currency);
    }
}