package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());
    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Blouse']")
    WebElement blouse;
    @FindBy(xpath = "//a[@id='color_8']")
    WebElement colorWht;
    @FindBy(xpath = "(//a[@title='Printed Dress'][normalize-space()='Printed Dress'])[1]")
    WebElement printedDress;
    @FindBy(xpath = "//a[@id='color_13']")
    WebElement colorOrg;
    @FindBy(xpath = "//a[normalize-space()='Printed Chiffon Dress']")
    WebElement priChiDress;
    @FindBy(xpath = "//a[@id='color_15']")
    WebElement colorGrn;
    @FindBy(xpath = "(//a[@title='Printed Summer Dress'][normalize-space()='Printed Summer Dress'])[2]")
    WebElement summerDress;
    @FindBy(xpath = "//a[@id='color_14']")
    WebElement colorBlu;

    @FindBy(xpath = "//select[@id='group_1']")
    WebElement sizeSel;
    @FindBy(xpath = "//input[@id='quantity_wanted']")
   WebElement addQty;
    @FindBy(xpath = "//span[normalize-space()='Add to cart']")
    WebElement addCart;
    @FindBy(xpath = "//div[@id='layer_cart']//h2[contains(normalize-space(),'Product successfully added to your shopping cart')]")
    WebElement verifyAddText;
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement closeBtn;
    public void selProduct(String proName){
        if (proName.equalsIgnoreCase("Blouse")) {
            clickOnElement(blouse);
            log.info( "Select " + blouse.toString());
        } else if (proName.equalsIgnoreCase("Printed Dress")) {
            clickOnElement(printedDress);
            log.info( "Select " +printedDress .toString());
        } else if (proName.equalsIgnoreCase("Printed Chiffon Dress")) {
            clickOnElement(priChiDress);
            log.info("Select"+ priChiDress.toString());
        } else if (proName.equalsIgnoreCase("Printed Summer Dress with Price $28.98")) {
            clickOnElement(summerDress);
            log.info("Select " +summerDress .toString());
        }

    }
    public void selColour(String color){
        if (color.equalsIgnoreCase("White")) {
            clickOnElement(colorWht);
            log.info("Select "  + colorWht.toString());
        } else if (color.equalsIgnoreCase("Orange")) {
            clickOnElement(colorOrg);
            log.info( "Select " +colorOrg .toString());
        } else if (color.equalsIgnoreCase("Green")) {
            clickOnElement(colorGrn);
            log.info( "Select " +colorGrn .toString());
        } else if (color.equalsIgnoreCase("Blue")) {
            clickOnElement(colorBlu);
            log.info( "Select " +colorBlu .toString());
        }
    }
    public void enterQtyAdd(String qty){
        //clearTextFromField(addQty);
        sendTextToElement(addQty,qty);
        log.info( "Entering qty :" + addQty.toString());
    }
    public void selectSize(String size){
        selectByVisibleTextFromDropDown(sizeSel,size);
        log.info( "Select " +size .toString());
    }
    public void clickAddCart(){
        clickOnElement(addCart);
        log.info( "Click on" + addCart.toString());
    }
    public void getAddMes(String message){
        verifyThatTextIsDisplayed(verifyAddText,message);
        log.info( "Verify" + verifyAddText.toString());
    }
    public void setCloseBtn(){
        clickOnElement(closeBtn);
        log.info( "Click on" +closeBtn .toString());
    }

}
