package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * All Menu (Seven menu), LoginLink, registerLink, nopcommerce logo, My account
 * link and LogOut link locators and create appropriate methods for it.
 */
public class HomePage extends Utility {
    public static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='Computers'])[1]")
    WebElement computerLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Electronics')]")
    WebElement electronicsTabLink;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Apparel')]")
    WebElement apparelTabLink;
    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='Digital downloads'])[1]")
    WebElement digitalDownloadsLink;
    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='Books'])[1]")
    WebElement booksLink;
    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='Jewelry'])[1]")
    WebElement jewelryLink;
    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='Gift Cards'])[1]")
    WebElement giftCardsLink;

    @CacheLookup
    //@FindBy(xpath = "(//a[normalize-space()='Log in'])[1]")
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    //@FindBy(xpath = "//a[normalize-space()='Log out']")
    @FindBy(xpath = "(//a[normalize-space()='Log out'])[1]")
    WebElement logOutLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'My account')]")
    WebElement getmyAccountLink;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement getNopCommerceLogo;
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']")
    WebElement selectMenu;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("click On Login Link  : " + loginLink.toString());
    }

    public String verifyLogInLinkIsDisplayed() {
        log.info("verify Log In Link Is Displayed : " + loginLink.toString());
        return getTextFromElement(loginLink);
    }

    public String verifyLogOutLinkIsDisplayed() {
        log.info("verify LogOut Link Is Displayed : " + logOutLink.toString());
        return getTextFromElement(logOutLink);
    }

    public void clickOnRegisterLinkIsDisplayed() {
        clickOnElement(registerLink);
        log.info("click On Register Link Is Displayed : " + registerLink.toString());
    }

    @Override
    public void verifyLogoVisible(WebElement element) {
        super.verifyLogoVisible(element);
        log.info("verify Logo Visible : " + element.toString());
    }

    public void clickOnComputersLink() {
        mouseHoverToElementAndClick(computerLink);
        log.info("click On Computers Link : " + computerLink.toString());
    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuNames = findElementsList(selectMenu);
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }
    }
}
