package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Email, password, Login Button and "Welcome, Please Sign In!" text Locators and
 * create appropriate methods for it.
 */
public class LoginPage extends Utility {
    public static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement enterEmail;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;


    //Verify the Text "Welcome, Please Sign In!"

    public String getWelcomeMessage() {
        String message = getTextFromElement(welcomeText);
        log.info("get Welcome Message  : " + welcomeText.toString());
        return message;
    }

    //Enter Email into the email field
    public void enterEmailAddress(String email) {
        sendTextToElement(enterEmail, email);
        log.info("enter Email Address 1 : " + enterEmail.toString());
    }

    //Enter Password into the password field
    public void enterPassword(String password) {
        sendTextToElement(enterPassword, password);
        log.info("enter Password  : " + enterPassword.toString());
    }

    //Click on Login button
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("click On Login Button  : " + loginButton.toString());
    }

    public void clickOnLogOutButton() {
        clickOnElement(logOutLink);
        log.info("click On LogOut Button : " + logOutLink.toString());
    }

    public String getErrorMessage() {
        log.info("get Error Message  : " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("click On Register Link  : " + registerLink.toString());
    }
}
