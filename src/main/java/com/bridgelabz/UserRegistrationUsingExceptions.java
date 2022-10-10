package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUsingExceptions extends Exception {

   public UserRegistrationUsingExceptions(String message) {
     super(message);

   }

    public static boolean isValidUserFirstname(String firstName) {
        String nameRegex = "^[A-Z]\\w{2,29}$";
        Pattern patternObject = Pattern.compile(nameRegex);
        Matcher matcherObject = patternObject.matcher(firstName);
        return matcherObject.matches();
    }
    public static boolean isValidUserLastname(String lastName) {
        String lastNameRegex = "^[A-Z]\\w{2,29}$";
        Pattern patternObject = Pattern.compile(lastNameRegex);
        Matcher matcherObject = patternObject.matcher(lastName);
        return matcherObject.matches();
    }
    public static boolean isValidUserEmail(String email) {
        String emailRegex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        //abc.xyz@bl.co.in
        Pattern patternObject = Pattern.compile(emailRegex);
        Matcher matcherObject = patternObject.matcher(email);
        return matcherObject.matches();
    }
    public static boolean isValidUserMobileNo(String mobileNo) {
        String mobileNoRegex = "([0-9]{2})[-.●\s]?([0-9]{10})$";
        Pattern patternObject = Pattern.compile(mobileNoRegex);
        Matcher matcherObject = patternObject.matcher(mobileNo);
        return matcherObject.matches();
    }
    public static boolean isValidUserPassword(String password) {
        String passwordRegex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()])([a-zA-z0-9@#$%^&-+=()]{8,20})$";
        Pattern patternObject = Pattern.compile(passwordRegex);
        Matcher matcherObject = patternObject.matcher(password);
        return matcherObject.matches();
    }

}

