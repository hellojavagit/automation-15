package com.automation.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class CreateAccountPageTest {
    @And("^I enter a new email$")
    public void iEnterANewEmail() {
        new SignInPage().enterEmailCreate(SignInTest.email);
    }
    @And("^I click Create an Account$")
    public void iClickCreateAnAccount() {
        new SignInPage().clickCreateButton();
    }

    @And("^I select Gender$")
    public void iSelectGender() {
        new CreateAccountPage().getGender("Female");
    }

    @And("^I enter customer first name$")
    public void iEnterCustomerFirstName() {
        new CreateAccountPage().getCustomerFNM("myfirstname");
    }

    @Given("^Iam at homepage$")
    public void iamAtHomepage() {
    }

    @And("^I enter customer last name$")
    public void iEnterCustomerLastName() {
        new CreateAccountPage().getCustomerLNM("mylastname");
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        new CreateAccountPage().getPassword("abcd1234");
    }

    @And("^I select day of birth$")
    public void iSelectDayOfBirth() {
        new CreateAccountPage().getDays("2");
    }

    @And("^I select month of birth$")
    public void iSelectMonthOfBirth() {
        new CreateAccountPage().getMonths("6");
    }

    @And("^I selct year of birth$")
    public void iSelctYearOfBirth() {
        new CreateAccountPage().getYears("1998");
    }

    @And("^I enter first name$")
    public void iEnterFirstName() {
        new CreateAccountPage().getFName("myfirstname");
    }

    @And("^I enter last name$")
    public void iEnterLastName() {
        new CreateAccountPage().getLName("mylastname");
    }

    @And("^I enter company$")
    public void iEnterCompany() {
        new CreateAccountPage().getCompany("XYZ123");
    }

    @And("^I enter Address one$")
    public void iEnterAddressOne() {
        new CreateAccountPage().getAddress1("London");
    }

    @And("^I enter address two$")
    public void iEnterAddressTwo() {
        new CreateAccountPage().getAddress1("LOndon 15");
    }

    @And("^I enter city$")
    public void iEnterCity() {
        new CreateAccountPage().getCity("London");
    }

    @And("^I enter state$")
    public void iEnterState() {
        new CreateAccountPage().getState("wales");
    }

    @And("^I enter post code$")
    public void iEnterPostCode() {
        new CreateAccountPage().getPostcode("12345");
    }

    @And("^I enter country$")
    public void iEnterCountry() {
        new CreateAccountPage().getCountry("United States");
    }

    @And("^I enter other details$")
    public void iEnterOtherDetails() {
        new CreateAccountPage().getOther("My other details and information");
    }

    @And("^I enter phone no$")
    public void iEnterPhoneNo() {
        new CreateAccountPage().getPhone("+12345678");
    }

    @And("^I enter mobile no$")
    public void iEnterMobileNo() {
        new CreateAccountPage().getMobileNo("+98765432");
    }

    @And("^I enter alias address$")
    public void iEnterAliasAddress() {
        new CreateAccountPage().getAlias("My Alias Address");
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickRegister();
    }

    @Then("^I should see my account$")
    public void iShouldSeeMyAccount() {
        String actual = new CreateAccountPage().textMyAc();
        String expectedMessage ="My account";
        Assert.assertEquals("Show My account ",expectedMessage,actual);
    }
}
