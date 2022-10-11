package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//UC13 User Registration Using Lambda Expression
public class UserRegistrationLambdaExpression {



    static UserValidatorIF validateUserFirstName= firstName->  {
        String nameRegex = "^[A-Z]\\w{2,29}$";
        Pattern patternObject = Pattern.compile(nameRegex);
        Matcher matcherObject = patternObject.matcher(firstName);
        return matcherObject.matches();
    };
    static UserValidatorIF validateUserLastName= lastName-> {
        String lastNameRegex = "^[A-Z]\\w{2,29}$";
        Pattern patternObject = Pattern.compile(lastNameRegex);
        Matcher matcherObject = patternObject.matcher(lastName);
        return matcherObject.matches();
    };
    static UserValidatorIF validateUserEmail= email-> {
        String emailRegex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        //abc.xyz@bl.co.in
        Pattern patternObject = Pattern.compile(emailRegex);
        Matcher matcherObject = patternObject.matcher(email);
        return matcherObject.matches();
    };
    static UserValidatorIF validateUserMobileNo = mobileNo-> {
        String mobileNoRegex = "([0-9]{2})[-.●\s]?([0-9]{10})$";
        Pattern patternObject = Pattern.compile(mobileNoRegex);
        Matcher matcherObject = patternObject.matcher(mobileNo);
        return matcherObject.matches();
    };
    static UserValidatorIF validateUserPassword = password-> {
        String passwordRegex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()])([a-zA-z0-9@#$%^&-+=()]{8,20})$";
        Pattern patternObject = Pattern.compile(passwordRegex);
        Matcher matcherObject = patternObject.matcher(password);
        return matcherObject.matches();
    };
}
