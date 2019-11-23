package com.userRegistration;

import org.junit.Assert;
import org.junit.Test;

public class UserEmailTest {
    ValidationOfUser validationOfuser=new ValidationOfUser();
    @Test
    public void validateEmail_ifContains()
    {
        boolean result= validationOfuser.validateMobileNumber("AA 87241183");
        Assert.assertFalse(result);

    }
}
