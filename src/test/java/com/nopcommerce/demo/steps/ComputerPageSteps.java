package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ComputerPageSteps {
    @Then("User navigate to the computer page")
    public void userNavigateToTheComputerPage() {
        System.out.println("User navigate to the computer page successfully");
    }

    @And("User Verify The Computer text {string}")
    public void userVerifyTheComputerText(String computer) {
        Assert.assertEquals(new ComputerPage().verifyComputerText(), computer, "Incorrect Text");
    }

    @And("User click on Desktops link")
    public void userClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktopLink();
    }
}
