package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomepageSteps {

    @Given("User is on Homepage")
    public void userIsOnHomepage() {
        System.out.println("User is on Homepage");
    }

    @When("User click on computers link")
    public void userClickOnComputersLink() {
        new HomePage().clickOnComputersLink();
    }

    @When("User click on login link")
    public void userClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }
    @Then("User Check that LogOut Link is display")
    public void userCheckThatLogOutLinkIsDisplay() {
        String actualErrorMessage = new HomePage().verifyLogOutLinkIsDisplayed();
        String expectedErrorMessage = "Log out";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Logout link is not displayed");
    }

    @Then("User navigate to the Home page")
    public void userNavigateToTheHomePage() {
        System.out.println("User is navigate to the Login homepage");
    }

    @And("User click on LogOut Link")
    public void userClickOnLogOutLink() throws InterruptedException {
        Thread.sleep(2000);
        new LoginPage().clickOnLogOutButton();
    }

    @Then("User verify The LogIn Link is display")
    public void userVerifyTheLogInLinkIsDisplay() {
        String actualLinkText = new HomePage().verifyLogInLinkIsDisplayed();
        String expectedLinkText = "Log in";
        Assert.assertEquals(actualLinkText,  expectedLinkText, "LoginLink not displayed correctly");
    }

    @When("User click on register link")
    public void userClickOnRegisterLink() {
        new HomePage().clickOnRegisterLinkIsDisplayed();
    }

}
