package com.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOfUser {
    private String firstName="^[A-Z][a-zA-Z]{3,}";
    public boolean validate_FirstName(String firstName) {
        Pattern firstName_pattern = Pattern.compile("^[A-Z][a-zA-Z]{3,}$");
        Matcher matcher = firstName_pattern.matcher(firstName);
        System.out.println(matcher.matches());
        if (matcher.matches())
            return true;
        else
            return false;
    }
}
