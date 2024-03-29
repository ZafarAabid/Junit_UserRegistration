package com.userRegistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserEmailTest {
    private String emailPattern;
    private boolean expectedOutput;
    private ValidationOfUser validationOfUser;


    public UserEmailTest(String emailPattern,boolean expectedOutput)
    {
        this.emailPattern = emailPattern;
        this.expectedOutput = expectedOutput;
    }
    @Before
    public void initialize() {
        validationOfUser=new ValidationOfUser();
    }
    @Parameterized.Parameters
    public static Collection CollectionInput()
    {
        return Arrays.asList(new Object[][] { {"abc@yahoo.com",true}, {"abc-100@yahoo.com",true}
                , {"abc.100@yahoo.com",true}, {"abc111@abc.com",true}
               , {"abc-100@abc.net",true}, {"abc.100@abc.com.au",true}
                , {"abc@1.com",true}, {"abc@gmail.com.com",true}
                , {"abc+100@gmail.com",true}, {"abc@.com.my",false}
                , {"abc123@gmail.a",false}, {"abc123@.com",false}
                , {"abc123@.com.com",false}, {".abc@abc.com",false}
                , {"abc()*@gmail.com",false}, {"abc@%*.com",false}
                , {"abc..2002@gmail.com",false}, {"abc.@gmail.com",false}
                , {"abc@abc@gmail.com",false}, {"abc@gmail.com.1a",false}
                , {"abc@gmail.com.aa.au",false} });
    }


    @Test
    public void CollectionInput_toValidateEmail_ifRequirementMetReturnTrue()
    {
        boolean result= validationOfUser.validateEmail(this.emailPattern);
        Assert.assertSame(result,expectedOutput);

    }
}
