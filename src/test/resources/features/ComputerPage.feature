#1. verifyUserShouldNavigateToComputerPageSuccessfully
#Click on Computer tab
#Verify "Computer" text
Feature: Computer Page Test
  As a User I should able to buy computer successfully

  @Asha @Sanity @Smoke @Regression
  Scenario: Verify User Should Navigate To Computer Page Successfully
    Given   User is on Homepage
    When    User click on computers link
    Then    User navigate to the computer page
    And     User Verify The Computer text "Computers"
#2. verifyUserShouldNavigateToDesktopsPageSuccessfully
#Click on Computer tab
#Click on Desktops link
#Verify "Desktops" text
  @Asha @Smoke @Regression
  Scenario: Verify User Should Navigate To Desktops Page Successfully
    Given   User is on Homepage
    When    User click on computers link
    And     User click on Desktops link
    Then    User navigate to the Desktops page
    And     User Verify The Desktops text "Desktops"
#3. verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
#Click on Computer tab
#Click on Desktops link
#Click on product name "Build your own computer"
#Select processor "processor"
#Select RAM "ram"
#Select HDD "hdd"
#Select OS "os"
#Select Software "software"
#Click on "ADD TO CART" Button
#Verify message "The product has been added to your shopping cart"
  @Asha @Regression
  Scenario Outline: Verify That User Should Build YouOwn Computer And Add Them To Cart Successfully
    Given   User is on Homepage
    When    User click on computers link
    And     User click on Desktops link
    And     User click on product name "Build your own computer"
    And     User select processor "<processor>"
    And     User select RAM "<ram>"
    And     User select HDD "<hdd>"
    And     User select Os "<os>"
    And     User select software "<software>"
    And     User click on Add to cart button
    Then    User verify message the "The product has been added to your shopping cart"
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | VistaHome [+$50.00]     | Total Commander [+$5.00]   |

