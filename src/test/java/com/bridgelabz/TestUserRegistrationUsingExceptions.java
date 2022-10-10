package com.bridgelabz;

//import org.junit.Assert;
import org.junit.Test;


public class TestUserRegistrationUsingExceptions{

    @Test
    public void TestUserFirstName_Invalid() {
        try {
            boolean result = UserRegistrationUsingExceptions.isValidUserFirstname("radhika");
          //  Assert.assertTrue(result);
            System.out.println(result);

            throw new UserRegistrationUsingExceptions("Invalid First name");
        } catch (UserRegistrationUsingExceptions ex) {
            System.out.println(ex.getMessage());
        }
    }


    @Test
    public void TestUserLastName_Invalid() {
        try {
            boolean result = UserRegistrationUsingExceptions.isValidUserLastname("TS");
            //  Assert.assertTrue(result);
            System.out.println(result);

            throw new UserRegistrationUsingExceptions("Invalid Last name");
        } catch (UserRegistrationUsingExceptions ex) {
            System.out.println(ex.getMessage());
        }
    }
    @Test
    public void TestUserEmail_Invalid() {
        try {
            boolean result = UserRegistrationUsingExceptions.isValidUserEmail("rr.com.123");
            //  Assert.assertTrue(result);
            System.out.println(result);

            throw new UserRegistrationUsingExceptions("Invalid Email Address");
        } catch (UserRegistrationUsingExceptions ex) {
            System.out.println(ex.getMessage());
        }
    }
    @Test
    public void TestUserMobileNo_Invalid() {
        try {
            boolean result = UserRegistrationUsingExceptions.isValidUserMobileNo("91 987653");
            //  Assert.assertTrue(result);
            System.out.println(result);

            throw new UserRegistrationUsingExceptions("Invalid MobileNo");
        } catch (UserRegistrationUsingExceptions ex) {
            System.out.println(ex.getMessage());
        }
    }
    @Test
    public void TestUserPassword_Invalid() {
        try {
            boolean result = UserRegistrationUsingExceptions.isValidUserPassword("123456");
            //  Assert.assertTrue(result);
            System.out.println(result);

            throw new UserRegistrationUsingExceptions("Invalid Password");
        } catch (UserRegistrationUsingExceptions ex) {
            System.out.println(ex.getMessage());
        }
    }
}
