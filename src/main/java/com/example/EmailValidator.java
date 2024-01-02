package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    private static final String GENERAL_EMAIL_PATTERN = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final String CORPORATE_EMAIL_PATTERN = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@company\\.com$";

    public static boolean isValidGeneralEmail(String email) {
        if (email == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(GENERAL_EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidCorporateEmail(String email) {
        if (email == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(CORPORATE_EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
