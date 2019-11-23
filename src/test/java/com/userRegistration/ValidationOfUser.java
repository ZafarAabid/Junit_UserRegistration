//----------UserRegistrationCode--------------
//---------------Greetings---------------- 

public class ValidationOfUser {
    private String firstName="^[A-Z][a-zA-Z]{3,}";
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
}
