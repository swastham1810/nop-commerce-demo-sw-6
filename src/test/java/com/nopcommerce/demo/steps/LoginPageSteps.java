package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginPageSteps {
    @Then("User navigate to the login page")
    public void userNavigateToTheLoginPage() {
        System.out.println("User is now in login page");
    }

    @And("User Verify The Welcome, Please Sign In! text")
    public void userVerifyTheWelcomePleaseSignInText() {
        String actualMessage = new LoginPage().getWelcomeMessage();
        String expectedMessage = "Welcome, Please Sign In!";
        Assert.assertEquals(actualMessage, expectedMessage, "Incorrect Message displayed!");
    }

    @And("User enter emailAddress {string}")
    public void userEnterEmailAddress(String email) {
        new LoginPage().enterEmailAddress(email);
    }

    @And("User enter Password {string}")
    public void userEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("User click on Login Button")
    public void userClickOnLoginButton() throws InterruptedException {
        Thread.sleep(2000);
        new LoginPage().clickOnLoginButton();

    }

    @Then("User unable to login with invalid credentials")
    public void userUnableToLoginWithInvalidCredentials() {
        String actualErrorMessage = new LoginPage().getErrorMessage();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message not displayed");
    }

}
