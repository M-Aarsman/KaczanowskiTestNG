package com.magda.kaczanowski.chapter4;

public interface PasswordRequirementValidator extends PasswordValidator {
    PasswordRequirementValidator shouldHaveProperLength(int i);
}
