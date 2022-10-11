package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistrationLambdaExpression {
    @Test
    public void TestUserFirstName_First_Letter_Caps_True() {

        // UserRegistration firstname = new UserRegistration();
        boolean result = UserRegistrationLambdaExpression.validateUserFirstName.validateUser("Radhika");
        Assert.assertTrue(result);
    }
    @Test
    public void TestUserFirstName_Short_False() {

        //  UserRegistration  firstname1=new UserRegistration();
        boolean result1= UserRegistrationLambdaExpression.validateUserFirstName.validateUser("sager");
        Assert.assertFalse(result1);

    }
    @Test
    public void TestUserFirstName_3_Letters_Min_False() {

        //  UserRegistration  firstname2=new UserRegistration();
        boolean result2=UserRegistrationLambdaExpression.validateUserFirstName.validateUser("Rs");
        Assert.assertFalse(result2);

    }

    @Test
    public  void TestUserLastName_First_Letter_Caps_True() {

        //  UserRegistration lastname = new UserRegistration();
        boolean result = UserRegistrationLambdaExpression.validateUserLastName.validateUser("Radhika");
        Assert.assertTrue(result);
    }
    @Test
    public void TestUserLastName_Short_False() {

        // UserRegistration  lastname1=new UserRegistration();
        boolean result1= UserRegistrationLambdaExpression.validateUserLastName.validateUser("sager");
        Assert.assertFalse(result1);

    }
    @Test
    public void TestUserLastName_3_Letters_Min_False() {

        //  UserRegistration  lastname2=new UserRegistration();
        boolean result2= UserRegistrationLambdaExpression.validateUserLastName.validateUser("Rs");
        Assert.assertFalse(result2);

    }
    @Test
    public void TestUserEmail_True() {

        //  UserRegistration  email=new UserRegistration();
        boolean result= UserRegistrationLambdaExpression.validateUserEmail.validateUser("abc.xyz@bl.co.in");
        Assert.assertTrue(result);

    }
    @Test
    public void TestUserEmail_False() {

        // UserRegistration  email=new UserRegistration();
        boolean result= UserRegistrationLambdaExpression.validateUserEmail.validateUser("abc.xyz@bl.");
        Assert.assertFalse(result);

    }
    @Test
    public void TestUser_MobileNo_With_Country_Code_True() {
        //  UserRegistration  mobileNo=new UserRegistration();
        boolean result= UserRegistrationLambdaExpression.validateUserMobileNo.validateUser("91 9919819801");
        Assert.assertTrue(result);

    }
    @Test
    public void TestUser_MobileNo_Without_Country_Code_False() {

        //   UserRegistration  mobileNo=new UserRegistration();
        boolean result= UserRegistrationLambdaExpression.validateUserMobileNo.validateUser("9919819801");
        Assert.assertFalse(result);
    }
    @Test
    public void TestUser_MobileNo_Min_10digit_Number_False() {

        // UserRegistration  mobileNo=new UserRegistration();
        boolean result= UserRegistrationLambdaExpression.validateUserMobileNo.validateUser("9919819801");
        Assert.assertFalse(result);

    }
    @Test
    public void TestUser_Password_minimum_8Characters_True() {

        //  UserRegistration  password=new UserRegistration();
        boolean result= UserRegistrationLambdaExpression.validateUserPassword.validateUser("Radhika@123");
        Assert.assertTrue(result);

    }
    @Test
    public void TestUser_Password_LessThan_8Characters_False() {

        // UserRegistration  password=new UserRegistration();
        boolean result= UserRegistrationLambdaExpression.validateUserPassword.validateUser("Radhika");
        Assert.assertFalse(result);

    }
    @Test
    public void TestUser_Password_1UpperCase_True() {

        boolean result= UserRegistrationLambdaExpression.validateUserPassword.validateUser("RadhikaS");
        Assert.assertFalse(result);

    }
    @Test
    public void TestUser_Password_No_UpperCase_False() {

        boolean result= UserRegistrationLambdaExpression.validateUserPassword.validateUser("karthika");
        Assert.assertFalse(result);

    }
}
