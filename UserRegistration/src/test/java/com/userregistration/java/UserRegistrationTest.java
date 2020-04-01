package com.userregistration.java;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateFirstName("Naveen");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateFirstName("Na");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateFirstName("N@veen");
        Assert.assertEquals(false, result);
    }

    @Test
    public void checkForInvalidEmail0(){
        UserRegistration validator = new UserRegistration();
        Assert.assertEquals(false, validator.validateEmailAddress("@gmail.com.in."));
    }
    @Test
    public void checkForInvalidEmail1(){
        UserRegistration validator = new UserRegistration();
        Assert.assertEquals(false, validator.validateEmailAddress("na@gmail.com"));
    }
    @Test
    public void checkForInvalidEmail2(){
        UserRegistration validator = new UserRegistration();
        Assert.assertEquals(false, validator.validateEmailAddress("naveen@.com"));
    }
    @Test
    public void checkForInvalidEmail3(){
        UserRegistration validator = new UserRegistration();
        Assert.assertEquals(true, validator.validateEmailAddress("nave..@gmail.com"));
    }
    @Test
    public void checkForInvalidEmail4(){
        UserRegistration validator = new UserRegistration();
        Assert.assertEquals(false, validator.validateEmailAddress("ka@vi@gmail.com"));
    }
    @Test
    public void checkForInvalidEmail5(){
        UserRegistration validator = new UserRegistration();
        Assert.assertEquals(true, validator.validateEmailAddress("navi.@gmail.com"));
    }
    @Test
    public void checkForInvalidEmail6(){
        UserRegistration validator = new UserRegistration();
        Assert.assertEquals(false, validator.validateEmailAddress("naveen07@gmail.c"));
    }
    @Test
    public void checkForInvalidEmail7(){
        UserRegistration validator = new UserRegistration();
        Assert.assertEquals(false, validator.validateEmailAddress("naveen07@gmail.com.i"));
    }
    @Test
    public void checkForInvalidEmail8(){
        UserRegistration validator = new UserRegistration();
        Assert.assertEquals(false, validator.validateEmailAddress("naveen07@gmail.com.in."));
    }
    @Test
    public void checkForInvalidEmail9(){
        UserRegistration validator = new UserRegistration();
        Assert.assertEquals(false, validator.validateEmailAddress("naveen07@.gmail.com"));
    }
    @Test
    public void checkForInvalidEmail(){
        UserRegistration validator = new UserRegistration();
        Assert.assertEquals(false, validator.validateEmailAddress("naveen07@gmail..in"));
    }
    @Test
    public void checkForValidEmail10(){
        UserRegistration validator = new UserRegistration();
        Assert.assertEquals(true, validator.validateEmailAddress("naveen07@gmail.com"));
    }
    @Test
    public void checkForValidEmail11(){
        UserRegistration validator = new UserRegistration();
        Assert.assertEquals(true, validator.validateEmailAddress("xyz.abc@gmail.com"));
    }
    @Test
    public void checkForValidEmail12(){
        UserRegistration validator = new UserRegistration();
        Assert.assertEquals(true, validator.validateEmailAddress("xyz-123@gmail.com"));
    }
    @Test
    public void checkForValidEmail13(){
        UserRegistration validator = new UserRegistration();
        Assert.assertEquals(false, validator.validateEmailAddress("xyz.123@gmail.com.in"));
    }
    @Test
    public void checkForValidEmail14(){
        UserRegistration validator = new UserRegistration();
        Assert.assertEquals(false, validator.validateEmailAddress("naveen07@gmail.co.in"));
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateEmailAddress("abc@gmail.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenNumber_WhenValid_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateMobileNumber("91-9502884323");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenNumber_WhenValid_ShouldReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateMobileNumber("9502884323");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validatePassword("Naveen@07");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validatePassword("naveen@15");
        Assert.assertEquals(false, result);
    }
}
