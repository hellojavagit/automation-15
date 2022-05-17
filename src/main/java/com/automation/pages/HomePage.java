package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='Women']")
    WebElement womenLink;
    @FindBy(xpath = "//li[@class='sfHover']//a[@title='Dresses'][normalize-space()='Dresses']")
    WebElement dressLink;
    @FindBy(xpath = "//li[@class='sfHover']//a[@title='T-shirts'][normalize-space()='T-shirts']")
    WebElement tShirtLink;

    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    WebElement signInLink;
    @FindBy(xpath = "//img[@alt='My Store']")
    WebElement logoLocator;

    public void clickOnWomenLink() {
        Reporter.log("Click on Women link" + womenLink.toString() + "<br>");
        clickOnElement(womenLink);
        log.info("Click on Women link" + womenLink.toString());
    }

    public void clickOnDressLink() {
        clickOnElement(dressLink);
        log.info("clicking on dress link" + dressLink.toString());

    }

    public void clickOnTShirtLink() {
        clickOnElement(tShirtLink);
        log.info("Click on T-Shirts link" + tShirtLink.toString());
    }

    public void clickOnSignInLink() {
        mouseHoverToElement(signInLink);
        clickOnElement(signInLink);
        log.info("Click on Login link" + signInLink.toString());
    }

    public String showSignInLink() {
        String signIn = getTextFromElement(signInLink);
        log.info("Show sign in link" + signIn.toString());
        return signIn;
    }

    public void checkLogoLocator() {
        verifyThatElementIsDisplayed(logoLocator);
        log.info("show logo locator" + logoLocator.toString());
    }
}
