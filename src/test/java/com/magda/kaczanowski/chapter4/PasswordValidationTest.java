package com.magda.kaczanowski.chapter4;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Test
public class PasswordValidationTest {
    public void passwordShouldHaveNCharacters() {
        String password = "alaMaKota";
        boolean valid = new PasswordValidationImp().input(password)
                .shouldHaveProperLength(8)
                .validate();
        assertTrue(valid);
    }
}
