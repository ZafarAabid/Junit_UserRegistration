package com.userRegistration;

import org.junit.Assert;
import org.junit.Test;

public class UserPasswordTest {
    ValidationOfUser validationOfuser=new ValidationOfUser();
    @Test
    public void validatePassword_ifContainsAtleastOneUpperOneLowerOneDigitOneSpChar_returnTrue()
    {
        System.out.println("\nvalidatePassword_ifContainsAtleastOneUpperOneLowerOneDigitOneSpChar_returnTrue");
        boolean result= validationOfuser.validatePassword("Xfr122@a1");
        Assert.assertTrue(result);

    }

    @Test
    public void validatePassword_iflengthIsLessThan8_returnFalse()
    {
        System.out.println("\nvalidatePassword_iflengthIsLessThan8_returnFalse ");
        boolean result= validationOfuser.validatePassword("XFR09@m");
        Assert.assertFalse(result);

    }
    @Test
    public void validatePassword_ifContainsNoUppercaseLetter_returnFalse()
    {
        System.out.println("\nvalidatePassword_ifContainsNoUppercaseLetter_returnFalse");
        boolean result= validationOfuser.validatePassword("xfr.z@909");
        Assert.assertFalse(result);

    }
    @Test
    public void validatePassword_ifContainsNoLowercaseLetter_returnFalse()
    {
        System.out.println("\nvalidatePassword_ifContainsNoLowercaseLetter_returnFalse");
        boolean result= validationOfuser.validatePassword("XFR.Z@909");
        Assert.assertFalse(result);

    }
    @Test
    public void validatePassword_ifContainsNoNumeric_returnFalse()
    {
        System.out.println("\nvalidatePassword_ifContainsNoNumeric_returnFalse");
        boolean result= validationOfuser.validatePassword("XFR@zafar");
        Assert.assertFalse(result);

    }
    @Test
    public void validatePassword_ifContainsNoSpecialChar_returnFalse()
    {
        System.out.println("\nvalidatePassword_ifContainsNoSpecialChar_returnFalse");
        boolean result= validationOfuser.validatePassword("XFR123zafar");
        Assert.assertFalse(result);

    }


}
