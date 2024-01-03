package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Desktops text, Sortby, Display, selectProductList Locators and it's actions
 */
public class DesktopsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopText;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortBy;

    @CacheLookup
    @FindBy(id = "products-pagesize")
    WebElement displayBy;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement selectProductList;

    @CacheLookup
    @FindBy(xpath = "//div[@class='picture']")
    WebElement selectProduct;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputer;


    // * Verify "Desktops" text
    public String verifyTextDesktopTextIsDisplayed() {
        log.info("Verify Text Desktop Text Is Displayed : " + desktopText.toString());
        return getTextFromElement(desktopText);
    }

    public void clickOnSortBy() {
        clickOnElement(sortBy);
        log.info("click On Sort By : " + sortBy.toString());
    }

    public void clickOnDisplayBy() {
        clickOnElement(displayBy);
        log.info("click On Display By : " + displayBy.toString());
    }

    public void clickOnSelectProductList() {
        clickOnElement(selectProductList);
        log.info("click On Select Product List : " + selectProductList.toString());
    }

    public void clickOnSelectProductFromDesktopPage() {
        clickOnElement(buildYourOwnComputer);
        log.info("click On Select Product From Desktop Page : " + buildYourOwnComputer.toString());
    }
}
