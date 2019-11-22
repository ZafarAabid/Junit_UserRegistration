package com.userRegistration;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.ValidationEvent;

public class UserRegistrationTest {
    ValidationOfUser validationOfuser=new ValidationOfUser();
    @Test
        public void validateName_ifPatternMatch_returnBoolean()
    {
        boolean result= validationOfuser.validate_FirstName("Zafar123");
        boolean result1= validationOfuser.validate_FirstName("123456");
        boolean result2=validationOfuser.validate_FirstName("Zafar");
        Assert.assertFalse(result);
        Assert.assertFalse(result1);
        Assert.assertTrue(result2);

    }
}
