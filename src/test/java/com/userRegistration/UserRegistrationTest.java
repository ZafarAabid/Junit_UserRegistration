package com.userRegistration;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.ValidationEvent;

public class UserRegistrationTest {
    ValidationOfUser validationOfuser=new ValidationOfUser();
    @Test
    public void validateFirstName_AtleastOneCapitalRemainingSmallLetter_returnTrue()
    {
        boolean result= validationOfuser.validateFirstName("Zafar");
        Assert.assertTrue(result);

    }
    @Test
    public void validateFirstName_ifPatternMatch_onlyCapitalLetters_returnTrue()
    {
        boolean result1= validationOfuser.validateFirstName("ASDFGHJKL");
        Assert.assertTrue(result1);

    }
    @Test
        public void validateFirstName_combineChars_returnFalse()
    {
        boolean result= validationOfuser.validateFirstName("Zafar123");
        Assert.assertFalse(result);

    }
    @Test
    public void validateFirstName_allNumber_returnFalse()
    {
        boolean result1= validationOfuser.validateFirstName("123456");
        Assert.assertFalse(result1);

    }
    @Test
    public void validateFirstName_onlySmallLetters_returnFalse()
    {
        boolean result1= validationOfuser.validateFirstName("asdbads");
        Assert.assertFalse(result1);

    }

    @Test
    public void validateFirstName_lessThan3char_returnFalse()
    {
        boolean result1= validationOfuser.validateFirstName("As");
        Assert.assertFalse(result1);

    }

    /////////////////////////////////////////////////
}
