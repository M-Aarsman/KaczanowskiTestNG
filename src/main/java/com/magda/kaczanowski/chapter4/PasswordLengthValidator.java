package com.magda.kaczanowski.chapter4;

public class PasswordLengthValidator implements PasswordRequirementValidator {

    PasswordRequirementValidator previous;
    private

    @Override
    public PasswordRequirementValidator input(String password) {
        return null;
    }

    @Override
    public boolean validate() {

    }

    @Override
    public PasswordRequirementValidator shouldHaveProperLength(int i) {
        return null;
    }
}
