package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import net.bytebuddy.utility.RandomString;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

/**
 * Register Text, male female radio, Firstname, lastname, Date of Birth drop
 * down, email, Password, Confirm Password, Register Button, "First name is required.","Last name
 * is required.", "Email is required.","Password is required.", "Password is required." error message,
 * "Your registration completed" message, "CONTINUE" button
 * Locators and it's actions
 */

public class RegisterPage extends Utility {
    public static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public static String generatedEmail;

    public void enterEmailAddress() {
        Random randomPartOfEmailGenerator = new Random(5000);
        int randomNumberInEmail = randomPartOfEmailGenerator.nextInt();
        //random string generator - to use in email
        RandomString randomString = new RandomString(5);
        String randomStringInEmailGenerator = randomString.nextString();
        generatedEmail = "robert" + randomNumberInEmail + randomStringInEmailGenerator + "mouse@gmail.com";
        log.info("Enter email " + enterEmail.toString());
        sendTextToElement(enterEmail, generatedEmail);
    }


    //Verify "Register" text
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    // Verify the error message "First name is required."
    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameErrorText;


    // Verify the error message "Last name is required."
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameErrorText;

    // Verify the error message "Email is required."
    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailFieldErrorText;

    // Verify the error message "Password is required."
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordErrorText;

    // Verify the error message "Password is required."
    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordErrorText;

    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement genderMale;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement genderFemale;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "(//select[@name='DateOfBirthDay'])[1]")
    WebElement dateOfBirthDay;
    @CacheLookup
    @FindBy(xpath = "(//select[@name='DateOfBirthMonth'])[1]")
    WebElement dateOfBirthMonth;
    @CacheLookup
    @FindBy(xpath = "(//select[@name='DateOfBirthYear'])[1]")
    WebElement dateOfBirthYear;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement enterEmail;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement enterConfirmPassword;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompleted;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;
    //*********************************************  Methods  ***************************************************

    //Verify "Register" text
    public String verifyTheTextRegisterOnRegisterPage() {
        log.info("verify The Text Register On Register Page : " + registerText.toString());
        return getTextFromElement(registerText);
    }

    // Verify the error message "First name is required."
    public String verifyFirstNameRequiredErrorText() {
        log.info("verify FirstName Required ErrorText : " + firstNameErrorText.toString());
        return getTextFromElement(firstNameErrorText);
    }

    // Verify the error message "Last name is required."
    public String verifyLastNameRequiredErrorText() {
        log.info("verify Last Name Required ErrorText  : " + lastNameErrorText.toString());
        return getTextFromElement(lastNameErrorText);
    }

    // Verify the error message "Email is required."
    public String verifyEmailRequiredErrorText() {
        log.info("verify Email Required Error Text : " + emailFieldErrorText.toString());
        return getTextFromElement(emailFieldErrorText);
    }

    // Verify the error message "Password is required."
    public String verifyPasswordRequiredErrorText() {
        log.info("verify Password Required Error Text : " + passwordErrorText.toString());
        return getTextFromElement(passwordErrorText);
    }

    // Verify the error message "Password is required."
    public String verifyConfirmPasswordRequiredErrorText() {
        log.info("verify Confirm Password Required Error Text : " + confirmPasswordErrorText.toString());
        return getTextFromElement(confirmPasswordErrorText);
    }

    // Select gender "Female"
    public void selectGender(String maleOrFemale) {
        switch (maleOrFemale) {
            case "Male":
                clickOnElement(genderMale);
                break;
            case "Female":
                clickOnElement(genderFemale);
                break;
            default:
                break;
        }
    }

    // *      * Enter firstname
    public void inputFirstName(String name) {
        sendTextToElement(firstName, name);
        log.info("input FirstName : " + firstName.toString());
    }

    // *      * Enter lastname
    public void inputLastName(String lastname) {
        sendTextToElement(lastName, lastname);
        log.info("input LastName  : " + lastName.toString());
    }

    // Select day,
    public void selectDateOfDay(String day) {
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);
        log.info("select Date Of Day : " + dateOfBirthDay.toString());
    }

    //Select month,
    public void selectDateOfMonth(String month) {
        selectByVisibleTextFromDropDown(dateOfBirthMonth, month);
        log.info("select Date Of Month : " + dateOfBirthMonth.toString());
    }

    //Select year
    public void selectDateOfYear(String year) {
        selectByVisibleTextFromDropDown(dateOfBirthYear, year);
        log.info("select Date Of Year : " + dateOfBirthYear.toString());
    }

    // Enter password
    public void inputPassword(String password) {
        sendTextToElement(enterPassword, password);
        log.info("input Password  : " + enterPassword.toString());
    }

    // Enter Confirm Password
    public void inputConfirmPassword(String confirmPsw) {
        sendTextToElement(enterConfirmPassword, confirmPsw);
        log.info("input Confirm Password : " + enterConfirmPassword.toString());
    }

    // Click on "REGISTER" button
    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("click On Register Button : " + registerButton.toString());
    }

    // Verify message "Your registration completed"
    public String verifyRegistrationCompleted() {
        log.info("verify Registration Completed  : " + registrationCompleted.toString());
        return getTextFromElement(registrationCompleted);
    }
}
