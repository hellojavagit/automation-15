package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CreateAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());
    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "uniform-id_gender1")
    WebElement genderM;
    @FindBy(xpath = "//label[@for='id_gender2']")
    WebElement genderF;
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement customerFNM;
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement customerLNM;
    @FindBy(xpath = "//input[@id='email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwd;
    @FindBy(xpath = "//select[@id='days']")
    WebElement days;
    @FindBy(xpath = "//select[@id='months']")
    WebElement months;
    @FindBy(xpath = "//select[@id='years']")
    WebElement years;
    @FindBy(id = "firstname")
    WebElement fName;
    @FindBy(id = "lastname")
    WebElement lName;
    @FindBy(id = "company")
    WebElement company;
    @FindBy(id = "address1")
    WebElement address1;
    @FindBy(id = "address2")
    WebElement address2;
    @FindBy(id = "city")
    WebElement city;
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement state;
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement postcode;
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement country;
    @FindBy(xpath = "//textarea[@id='other']")
    WebElement other;
    @FindBy(id = "phone")
    WebElement phone;
    @FindBy(id = "phone_mobile")
    WebElement mobileNo;
    @FindBy(id = "alias")
    WebElement alias;
    @FindBy(xpath = "//button[@id='submitAccount']")
    WebElement register;

    @FindBy(xpath = "//span[@class='navigation_page']")
    WebElement myAc;

    public void getGender(String gender) {

        if (gender.equalsIgnoreCase("Male")) {
            Reporter.log("Select option :" + gender + " from the genderM option :" + genderM.isSelected() + "<br>");
            genderM.click();
            log.info( "Select option :" + genderM.toString());
        } else {
            Reporter.log("Select option :" + gender + " from the genderF option :" + genderF.isSelected() + "<br>");
            genderF.click();
            log.info( "Select option :" +genderF .toString());
        }

    }

    public void getCustomerFNM(String custFNM) {
        sendTextToElement(customerFNM, custFNM);
        log.info("Entering Customer first name :"  +customerFNM .toString());
    }

    public void getCustomerLNM(String custLNM) {
        sendTextToElement(customerLNM, custLNM);
        log.info( "Entering customer last name :"+ customerLNM.toString());
    }

    public void getEmail(String emailID) {
        sendTextToElement(email, emailID);
        log.info("Entering Email" + email.toString());

    }

    public void getPassword(String psWord) {
        sendTextToElement(passwd, psWord);
        log.info("Entering password :"  +passwd .toString());
    }

    public void getDays(String day) {
        clickOnElement(days);
        selectByValueFromDropDown(days, day);
        log.info( "Selecting day :" + days .toString());
    }

    public void getMonths(String mons) {
        clickOnElement(months);
        selectByValueFromDropDown(months, mons);
        log.info( "Selecting month :" + months.toString());
    }

    public void getYears(String year) {
        clickOnElement(years);
        selectByValueFromDropDown(years, year);
        log.info("Selecting year :"  + years.toString());
    }

    public void getFName(String firstNM) {
        sendTextToElement(fName, firstNM);
        log.info( "Entering first name :" + fName.toString());
    }

    public void getLName(String lastNM) {
        sendTextToElement(lName, lastNM);
        log.info("Entering last name :"  +lName .toString());
    }

    public void getCompany(String comp) {
        sendTextToElement(company, comp);
        log.info( "Entering company :" +company .toString());
    }

    public void getAddress1(String add1) {
        sendTextToElement(address1, add1);
        log.info("Entering address1 :"  +address1 .toString());
    }

    public void getAddress2(String add2) {
        sendTextToElement(address2, add2);
        log.info( "Entering address2 :" +address2 .toString());
    }

    public void getCity(String cityN) {
        sendTextToElement(city, cityN);
        log.info("Entering city :"  +city .toString());
    }

    public void getState(String stateN) {
        clickOnElement(state);
        sendTextToElement(state, stateN);
        log.info("Selecting state :"  +state .toString());
    }

    public void getPostcode(String pCode) {
        sendTextToElement(postcode, pCode);
        log.info( "Entering postcode :" + postcode.toString());
    }

    public void getCountry(String countryNM) {
        clickOnElement(country);
        sendTextToElement(country, countryNM);
        log.info( "Selecting country :" +country .toString());
    }

    public void getOther(String others) {
        sendTextToElement(other, others);
        log.info("Entering other :"  + other.toString());
    }

    public void getPhone(String phNo) {
        sendTextToElement(phone, phNo);
        log.info( "Entering phone :" +phone .toString());
    }

    public void getMobileNo(String mobNo) {
        sendTextToElement(mobileNo, mobNo);
        log.info( "Entering mobile no :" +mobileNo .toString());
    }

    public void getAlias(String aliasN) {

        sendTextToElement(alias, aliasN);
        log.info( "Entering alias :" +alias .toString());
    }

    public void clickRegister() {
        clickOnElement(register);
        log.info( "Click Register" +register .toString());
    }

    public String textMyAc() {
        String myAccount = getTextFromElement(myAc);
        log.info( "Verify Sign Out" +myAc .toString());
        return myAccount;
    }


}
