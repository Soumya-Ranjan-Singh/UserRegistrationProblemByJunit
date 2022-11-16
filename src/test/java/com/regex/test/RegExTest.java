package com.regex.test;
import com.regex.assignments.RegExMain;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class RegExTest {

    RegExMain obj = new RegExMain();

    @BeforeClass
    public static void welcomeText() {
        System.out.println("Welcome to User Registration Problem");
    }

    @Test
    public void validateFirstNameTest() {
        System.out.println("Valid first name of user");
        String firstName = "Soumya";
        Assert.assertTrue(obj.validateName(firstName));
    }

    @Test
    public void validateFirstNameLowerCaseShouldFail() {
        System.out.println("Invalid first name of user which contains only lowercase");
        String firstName = "soumya";
        Assert.assertFalse(obj.validateName(firstName));
    }

    @Test
    public void validateFirstNameLessThanThree() {
        System.out.println("Invalid first name of user which having only three characters");
        String firstName = "Sou";
        Assert.assertFalse(obj.validateName(firstName));
    }

    @Test
    public void validateLastNameTest() {
        System.out.println("Valid last name of user");
        String lastName = "Ranjan";
        Assert.assertTrue(obj.validateName(lastName));
    }

    @Test
    public void validateLastNameLowerCaseShouldFail() {
        System.out.println("Invalid last name of user which contains only lowercase");
        String lastName = "ranjan";
        Assert.assertFalse(obj.validateName(lastName));
    }

    @Test
    public void validateLastNameLessThanThree() {
        System.out.println("Invalid last name of user which having only three characters");
        String lastName = "Ran";
        Assert.assertFalse(obj.validateName(lastName));
    }

    @Test
    public void validateEmailTest() {
        System.out.println("Valid email id of user");
        String emailId = "soumyars675@gmail.com";
        Assert.assertTrue(obj.validEmail(emailId));
    }

    @Test
    public void validateEmailWithoutDomainShouldFail() {
        System.out.println("Invalid email id of user without domain");
        String emailId = "soumyars675";
        Assert.assertFalse(obj.validEmail(emailId));
    }

    @Test
    public void validateEmailWithStartingFirstLetterCapital() {
        System.out.println("Invalid email id of user having starting letter is capital");
        String emailId = "Soumyars675";
        Assert.assertFalse(obj.validEmail(emailId));
    }
}
