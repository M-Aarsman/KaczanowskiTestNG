package com.magda.kaczanowski.chapter4;

public class PasswordValidationImp implements PasswordValidator {

    private String password;

    PasswordRequirementValidator input(String password){
        this.password = password;
    }

    @Override
    public boolean validate() {
        return false;
    }
}
