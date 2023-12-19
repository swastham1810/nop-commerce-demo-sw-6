#1. verifyUserShouldNavigateToRegisterPageSuccessfully
#Click on Register Link
#Verify "Register" text
Feature: Register Page Test
  As a User I would Like to Register to the Application successfully

  @Asha @Sanity @Smoke @Regression
  Scenario: Verify User Should Navigate To Register Page Successfully
    Given   User is on Homepage
    When    User click on register link
    Then    User navigate to the register page
    And     User Verify The text "Register"
#2.
#verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory
#Click on Register Link
#Click on "REGISTER" button
#Verify the error message "First name is required."
#Verify the error message "Last name is required."
#Verify the error message "Email is required."
#Verify the error message "Password is required."
#Verify the error message "Password is required."
  @Asha @Smoke @Regression
  Scenario: Verify That FirstName LastName Email Password And ConfirmPassword Fields Are Mandatory
    Given    User is on Homepage
    When     User click on register link
    And      User navigate to the register page
    And      User click on Register Button
    Then     User check the First name error message "First name is required."
    Then     User check the Last name error message "Last name is required."
    Then     User check the  Email error message "Email is required."
    Then     User check the  Password error message "Password is required."
    Then     User check the  confirm Password error message "Password is required."
#2. verifyThatUserShouldCreateAccountSuccessfully
#Click on Register Link
#Select gender "Female"
#Enter firstname
#Enter lastname
#Select day
#Select month
#Select year
#Enter email
#Enter password
#Enter Confirm Password
#Click on "REGISTER" button
#Verify message "Your registration completed"
  @Asha @Regression
  Scenario: Verify That User Should Create Account Successfully
    Given   User is on Homepage
    When    User click on register link
    And     User navigate to the register page
    And     User click on radio button "female"
    And     User enter firstname as "Robert"
    And     User enter lastname as "Jackson"
    And     User select date for Birthday "18"
    And     User select month for Birthday "October"
    And     User select year for Birthday "1990"
    And     User enter email "roberjackson@gmail.com"
    And     User enter the password "ash123"
    And     User enter the confirm password "ash123"
    And     User click on Register Button
    Then    User should see successful registration message "Your registration completed"

