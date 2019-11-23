package com.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOfUser {
    private String firstName="^[A-Z][a-zA-Z]{3,}";
    private String lastName="^[A-Z][a-zA-Z]{3,}";
    private String mobileNumber="^[0-9]{2}[ ][0-9]{10}";
    private String EmailId="^[0-9a-zA-Z]+[._+-]{0,1}[0-9a-zA-Z]+[@][a-zA-Z]+[.][a-zA-Z]{2,3}([.][a-z]{2}){0,1}";

    public boolean validateFirstName(String firstName) {
        Pattern firstName_pattern = Pattern.compile("^[A-Z][a-zA-Z]{3,}$");
        Matcher matcher = firstName_pattern.matcher(firstName);
        System.out.println(matcher.matches());
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validateLastName(String lastName) {
        Pattern lastnamePattern = Pattern.compile("^[A-Z][a-zA-Z]{3,}$");
        Matcher matcher = lastnamePattern.matcher(lastName);
        System.out.println(matcher.matches());
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validateMobileNumber(String mobileNumber) {

        Pattern mobileNumberPattern = Pattern.compile("^[0-9]{2}[ ][0-9]{10}$");
        Matcher matcher = mobileNumberPattern.matcher(mobileNumber);
        System.out.println(matcher.matches());
        if (matcher.matches())
            return true;
        else
            return false;
    }
    public boolean validateEmail(String Email) {

        Pattern EmailPattern = Pattern.compile("^[0-9a-zA-Z]+[._+-]{0,1}[0-9a-zA-Z]+[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.][a-z]{2,3}){0,1}$");
        Matcher matcher = EmailPattern.matcher(Email);
        System.out.println(matcher.matches());
        if (matcher.matches())
            return true;
        else
            return false;
    }
    public boolean validatePassword(String password) {

        Pattern EmailPattern = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]){1}.{8,})$");
        Matcher matcher = EmailPattern.matcher(password);
        System.out.println(matcher.matches());
        if (matcher.matches())
            return true;
        else
            return false;
    }
}
