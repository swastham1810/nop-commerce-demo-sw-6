package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.DesktopsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class DesktopsPageTest {
    @Then("User navigate to the Desktops page")
    public void userNavigateToTheDesktopsPage() {
        System.out.println("User is navigate to the the Desktops page");
    }

    @And("User Verify The Desktops text {string}")
    public void userVerifyTheDesktopsText(String desktops) {
        Assert.assertEquals(new DesktopsPage().verifyTextDesktopTextIsDisplayed(), desktops, "Incorrect Text is displayed");
    }

    @And("User click on product name {string}")
    public void userClickOnProductName(String buildYourOwnComputer) {
        new DesktopsPage().clickOnSelectProductFromDesktopPage();
    }
}
