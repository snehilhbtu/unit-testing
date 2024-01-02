package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EmailValidatorTest {

    @Test
    public void testIsValidGeneralEmail() {
        assertTrue(EmailValidator.isValidGeneralEmail("user@example.com"));
        assertTrue(EmailValidator.isValidGeneralEmail("john.doe123@gmail.com"));
        assertFalse(EmailValidator.isValidGeneralEmail("invalid-email"));
        assertFalse(EmailValidator.isValidGeneralEmail("user@.com"));
        assertFalse(EmailValidator.isValidGeneralEmail(null));
    }

    @Test
    public void testIsValidCorporateEmail() {
        assertTrue(EmailValidator.isValidCorporateEmail("employee@company.com"));
        assertTrue(EmailValidator.isValidCorporateEmail("john.doe@company.com"));
        assertFalse(EmailValidator.isValidCorporateEmail("user@gmail.com"));
        assertFalse(EmailValidator.isValidCorporateEmail("invalid-email"));
        assertFalse(EmailValidator.isValidCorporateEmail(null));
    }
}
