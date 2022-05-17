package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    WebElement emailField;
    @FindBy(id = "passwd")
    WebElement passwordField;
    @FindBy(id = "SubmitLogin")
    WebElement submitLogin;
    @FindBy(id = "email_create")
    WebElement emailCreate;
    @FindBy(id="SubmitCreate")
    WebElement submitCreate;
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authText;
    @FindBy(className = "page-heading")
    WebElement authClassText;
    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    WebElement createText;
    @FindBy(xpath = "//div[@class='alert alert-danger']//li")
    WebElement authFailed;
    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement signOut;



    public void enterEmailField(String email){
        sendTextToElement(emailField,email);
        log.info( "Entering email :" +emailField .toString());
    }
    public void enterPasswordField(String password){
        sendTextToElement(passwordField,password);
        log.info( "Entering password :" +passwordField .toString());
    }

    public void clickOnLoginButton(){
        clickOnElement(submitLogin);
        log.info("click on Sign in button"  + submitLogin.toString());
    }
    public void enterEmailCreate(String crEmail){
        sendTextToElement(emailCreate,crEmail);
        //randomEmail(emailCreate);
        log.info( "Entering Email in the emailCreate :" +emailCreate .toString());
    }
    public void clickCreateButton(){
        clickOnElement(submitCreate);
        log.info( "click on Create An Account Button" + submitCreate.toString());
    }
    public String getAuthText(){
        String authTextMsg = getTextFromElement(authText);
        log.info( "Get text Authentication" +authText .toString());
        return authTextMsg;
    }
    public String getAuthTexCls(){

        String authTexClMsg= getTextFromElement(authClassText);
        log.info( "verify text" +authClassText .toString());
        return authTexClMsg;
    }
    public String getCreateText(){
        String createTextMsg = getTextFromElement(createText);
        return createTextMsg;
    }
    public String getAuthFailed(){
        String authFailedMsg= getTextFromElement(authFailed);
        log.info( "verify text Authentication Error" +authFailed .toString());
        return authFailedMsg;
    }
    public String getSignOut(){
        String signOutTxt = getTextFromElement(signOut);
        log.info("verify text Sign Out Link"  + signOut.toString());
        return signOutTxt;
    }
    public void setSignOut(){
        clickOnElement(signOut);
        log.info( "Click Sign Out" + signOut.toString());

    }

}
