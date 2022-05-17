package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WomenCategoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenCategoryPage.class.getName());

    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='navigation_page']")
    WebElement womenTitle;
    @FindBy(xpath = "//a[@title='Tops']")
    WebElement titleTop;
    @FindBy(xpath = "//li[@class='sfHover']//a[@title='Dresses'][normalize-space()='Dresses']")
    WebElement dressLink;
    @FindBy(xpath = "//div[@class='block_content']//a[normalize-space()='Tops']")
    WebElement topCatLink;
    @FindBy(xpath = "//div[@class='block_content']//a[normalize-space()='Dresses']")
    WebElement dressCatLink;
    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortBy;
    @FindBy(xpath = "//i[@class='icon-th-list']")
    WebElement listBy;
    @FindBy(xpath = "//label[@for='layered_category_4']//a[contains(text(),'Tops')]")
    WebElement topCheck;
    @FindBy(xpath = "//label[@for='layered_category_8']//a[contains(text(),'Dresses')]")
    WebElement dressCheck;

    public String getWomenTitle() {
        log.info("Page Tile Women " + womenTitle.toString());
        return getTextFromElement(womenTitle);
    }

    public void getWomenTitle(String title) {
        verifyThatTextIsDisplayed(womenTitle, title);
    }

    public void clickTitleTop() {
        clickOnElement(titleTop);
        log.info("click On top link" + titleTop.toString());
    }

    public void clickDressLink() {
        Reporter.log("Click on Dresses link" + dressLink.toString() + "<br>");
        clickOnElement(dressLink);
        log.info("click On Dresses link" + dressLink.toString());
    }

    public void clickTopCatLink() {
        clickOnElement(topCatLink);
        log.info("click On Top Category link" + topCatLink.toString());
    }

    public void clickDressCatLink() {
        clickOnElement(dressCatLink);
        log.info("click On dress cat link" + dressCatLink.toString());
    }

    public void clickSortBy() {
        clickOnElement(sortBy);
        log.info("click OnSort By" + sortBy.toString());
    }

    public void clickListBy() {
        clickOnElement(listBy);
        log.info("click On List By" + listBy.toString());
    }

    public void clickTopCheck() {
        clickOnElement(topCheck);
        log.info("click On Top Category check" + topCheck.toString());
    }

    public void clickDressCheck() {
        clickOnElement(dressLink);
        log.info("click On dress link" + dressCheck.toString());
    }

}
