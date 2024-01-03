package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Computers text, DesktopsLink, NotebooksLink, SoftwareLink Locators and
 * create appropriate methods for it.
 */
public class ComputerPage extends Utility {
    public static final Logger log = LogManager.getLogger(ComputerPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "(//h1[normalize-space()='Computers'])[1]")
    WebElement computerText;

    @CacheLookup
    @FindBy(xpath = "//img[@title='Show products in category Desktops']")
    WebElement desktopLink;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopText;

    @CacheLookup
    @FindBy(xpath = "//img[@title='Show products in category Notebooks']")
    WebElement notebooksLink;

    @CacheLookup
    @FindBy(xpath = "//img[@title='Show products in category Software']")
    WebElement softwareLink;


    // * Verify "Computer" text
    public String verifyComputerText() {
        log.info("verify Computer Text : " + computerText.toString());
        return getTextFromElement(computerText);
    }

    // * Click on Desktops link
    public void clickOnDesktopLink() {
        clickOnElement(desktopLink);
        log.info("click On Desktop Link : " + desktopLink.toString());
    }

    // * Verify "Desktops" text
    public String verifyTextDesktopTextIsDisplayed() {
        log.info("verify Text Desktop Text Is Displayed : " + desktopText.toString());
        return getTextFromElement(desktopText);
    }
}
