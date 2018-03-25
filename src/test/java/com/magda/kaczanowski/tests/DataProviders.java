package com.magda.kaczanowski.tests;

import org.testng.annotations.DataProvider;

class DataProviders {
    @DataProvider
    public static Object [][] getMoney() {
        return new Object[][] {
                {10, "USD"},
                {25, "PLN"}
        };
    }
}
