package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class BuildYourOwnComputerSteps {
    @And("User select processor {string}")
    public void userSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("User select RAM {string}")
    public void userSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRAM(ram);
    }

    @And("User select HDD {string}")
    public void userSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("User select Os {string}")
    public void userSelectOs(String os) {
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("User select software {string}")
    public void userSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("User click on Add to cart button")
    public void userClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartLink();
    }

    @Then("User verify message the {string}")
    public void userVerifyMessageThe(String message) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getMessageText(), message, "Incorrect message displayed" );
    }
}
