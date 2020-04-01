package com.userregistration.java;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String MOBILE_NUMBER_PATTERN = "^[1-9]{2}-[1-9]{1}[0-9]{9}$";
    private static final String EMAIL_ADDRESS_PATTERN = "^[a-z]{3,12}[-.\\d\\w]{2,8}?@[\\w]{3,8}.[\\w]{2,3}$";
    private static final String PASSWORD_VALIDATE_PATTERN = "((?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]).{8,15})";

    public boolean validateFirstName(String fname) {
        return Pattern.matches(FIRST_NAME_PATTERN, fname);
    }

    public boolean validateEmailAddress(String email) {
        return Pattern.matches(EMAIL_ADDRESS_PATTERN, email);
    }

    public boolean validateMobileNumber(String mobileNum) {
        return Pattern.matches(MOBILE_NUMBER_PATTERN, mobileNum);
    }

    public boolean validatePassword(String password) {
        return Pattern.matches(PASSWORD_VALIDATE_PATTERN, password);
    }
}
