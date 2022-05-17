package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class SignInTest {
    public static String email = Utility.getRandomString(5)+"@gmail.com";
    @Given("^I am at homepage$")
    public void iAmAtHomepage() {
        System.out.println("I am on home page");
    }

    @When("^I click on sign in Link$")
    public void iClickOnSignInLink() {
        new HomePage().clickOnSignInLink();
    }

    @Then("^I should see the message AUTHENTICATION$")
    public void iShouldSeeTheMessageAUTHENTICATION() {
        String expectedMessage = "AUTHENTICATION";
        String actualMessage = new SignInPage().getAuthTexCls();
        Assert.assertEquals("Error message not displayed",expectedMessage,actualMessage);

    }


    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new SignInPage().enterEmailField(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new SignInPage().enterPasswordField(password);
    }

    @And("^I click on sign in button$")
    public void iClickOnSignInButton() {
        new SignInPage().clickOnLoginButton();
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String message)  {
        String expectedMessage = message;
        String actualMessage = new SignInPage().getAuthFailed();
        Assert.assertEquals("Invalid Credentials ", expectedMessage, actualMessage);
    }

    @When("^I enter valid email$")
    public void iEnterValidEmail() {
        new SignInPage().enterEmailField("prime123@gmail.com");
    }

    @And("^I enter valid password$")
    public void iEnterValidPassword() {
        new SignInPage().enterPasswordField("abcd123");
    }


    @Then("^I verify signout link is displayed$")
    public void iVerifySignoutLinkIsDisplayed() {
        String signOut = new SignInPage().getSignOut();
        String expectedMessage ="Sign out";
        Assert.assertEquals("no signOut is displayed",expectedMessage,signOut);
    }

    @And("^I click On signout link$")
    public void iClickOnSignoutLink() {
        new SignInPage().setSignOut();
    }

    @Then("^I should see Sign In link$")
    public void iShouldSeeSignInLink() {
        String signIn = new SignInPage().getSignOut();
        String expectedMessage ="Sign in";
        Assert.assertEquals("No Sign In link shown ",expectedMessage,signIn);

    }
}
