#1.userShouldNavigateToLoginPageSuccessFully.
#Click on login link
#verify that "Welcome, Please Sign In!" message display
Feature: Login Page Test
  As a User I would Like to Login to the Application successfully

  @Asha @Sanity @Smoke @Regression
  Scenario: User Should Navigate To LoginPage SuccessFully
    Given   User is on Homepage
    When    User click on login link
    Then    User navigate to the login page
    And     User Verify The Welcome, Please Sign In! text
#2. verifyTheErrorMessageWithInValidCredentials.
#Click on login link
#Enter EmailId
#Enter Password
#Click on Login Button
#Verify that the Error message
  @Asha @Smoke @Regression
  Scenario: Verify The ErrorMessage With InValid Credentials
    Given   User is on Homepage
    When    User click on login link
    Then    User navigate to the login page
    And     User enter emailAddress "test123@gmail.com"
    And     User enter Password "ash123"
    And     User click on Login Button
    Then    User unable to login with invalid credentials
#3. verifyThatUserShouldLogInSuccessFullyWithValidCredentials.
#Click on login link
#Enter EmailId
#Enter Password
#Click on Login Button
#Verify that LogOut link is display
  @Asha @Regression
  Scenario: Verify That User Should Log In SuccessFully With Valid Credentials
    Given   User is on Homepage
    When    User click on login link
    Then    User navigate to the login page
    #And     User enter email "harry_potter@gmail.com"
    And     User enter emailAddress "akakadiya@gmail.com"
    #And     User enter Email "random email"
    And     User enter password  "ash123"
    And     User click on Login Button
    Then    User Check that LogOut Link is display
#4. VerifyThatUserShouldLogOutSuccessFully
#Click on login link
#Enter EmailId
#Enter Password
#Click on Login Button
#Click on LogOut Link
#Verify that LogIn Link Display
  @Asha @Regression
  Scenario: Verify That User Should LogOut SuccessFully
    Given   User is on Homepage
    When    User click on login link
    Then    User navigate to the login page
    And     User enter emailAddress "akakadiya@gmail.com"
    #And     User enter email "harry_potter@gmail.com"
    #And     User enter Email "random email"
    And     User enter password  "ash123"
    And     User click on Login Button
    Then    User navigate to the Home page
    And     User click on LogOut Link
    Then    User verify The LogIn Link is display