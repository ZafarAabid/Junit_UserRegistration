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
    @Test
    public void validateLastName_AtleastOneCapitalRemainingSmallLetter_returnTrue()
    {
        boolean result= validationOfuser.validateLastName("Zafar");
        Assert.assertTrue(result);

    }
    @Test
    public void validateLastName_ifPatternMatch_onlyCapitalLetters_returnTrue()
    {
        boolean result1= validationOfuser.validateLastName("ASDFGHJKL");
        Assert.assertTrue(result1);

    }
    @Test
    public void validateLastName_combineChars_returnFalse()
    {
        boolean result= validationOfuser.validateLastName("Zafar123");
        Assert.assertFalse(result);

    }
    @Test
    public void validateLastName_allNumber_returnFalse()
    {
        boolean result1= validationOfuser.validateLastName("123456");
        Assert.assertFalse(result1);

    }
    @Test
    public void validateLastName_onlySmallLetters_returnFalse()
    {
        boolean result1= validationOfuser.validateLastName("asdbads");
        Assert.assertFalse(result1);

    }

    @Test
    public void validateLastName_lessThan3char_returnFalse()
    {
        boolean result1= validationOfuser.validateLastName("As");
        Assert.assertFalse(result1);

    }
}
