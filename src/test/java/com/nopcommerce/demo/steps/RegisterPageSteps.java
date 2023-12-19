package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class RegisterPageSteps {
    @Then("User navigate to the register page")
    public void userNavigateToTheRegisterPage() {
        System.out.println("User is navigate to the register page successfully");
    }

    @And("User Verify The text {string}")
    public void userVerifyTheText(String register) {
        Assert.assertEquals(new RegisterPage().verifyTheTextRegisterOnRegisterPage(), register, "Incorrect Message displayed");
    }

    @And("User click on Register Button")
    public void userClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("User check the First name error message {string}")
    public void userCheckTheFirstNameErrorMessage(String firstname) {
        Assert.assertEquals(new RegisterPage().verifyFirstNameRequiredErrorText(), firstname, " displayed");

    }

    @And("User check the Last name error message {string}")
    public void userCheckTheLastNameErrorMessage(String lastname) {
        Assert.assertEquals(new RegisterPage().verifyLastNameRequiredErrorText(), lastname, " displayed");
    }

    @And("User check the  Email error message {string}")
    public void userCheckTheEmailErrorMessage(String email) {
        Assert.assertEquals(new RegisterPage().verifyEmailRequiredErrorText(), email, " displayed");
    }

    @And("User check the  Password error message {string}")
    public void userCheckThePasswordErrorMessage(String password) {
        Assert.assertEquals(new RegisterPage().verifyPasswordRequiredErrorText(), password, " displayed");

    }

    @And("User check the  confirm Password error message {string}")
    public void userCheckTheConfirmPasswordErrorMessage(String confirmPassword) {
        Assert.assertEquals(new RegisterPage().verifyConfirmPasswordRequiredErrorText(), confirmPassword, " displayed");
    }

    @And("User click on radio button {string}")
    public void userClickOnRadioButton(String maleOrFemale) {
        new RegisterPage().selectGender(maleOrFemale);
    }

    @And("User enter firstname as {string}")
    public void userEnterFirstnameAs(String name) {
        new RegisterPage().inputFirstName(name);
    }

    @And("User enter lastname as {string}")
    public void userEnterLastnameAs(String lastname) {
        new RegisterPage().inputLastName(lastname);
    }

    @And("User select date for Birthday {string}")
    public void userSelectDateForBirthday(String day) {
        new RegisterPage().selectDateOfDay(day);

    }
    @And("User enter email {string}")
    public void userEnterEmail(String email) {
        new RegisterPage().enterEmailAddress();
    }


    @And("User enter password  {string}")
    public void userEnterPassword1(String password) {
        new LoginPage().enterPassword(password);
    }


    @And("User select month for Birthday {string}")
    public void userSelectMonthForBirthday(String month) {
        new RegisterPage().selectDateOfMonth(month);
    }

    @And("User select year for Birthday {string}")
    public void userSelectYearForBirthday(String year) {
        new RegisterPage().selectDateOfYear(year);
    }

    @And("User enter the password {string}")
    public void userEnterThePassword(String password) {
        new RegisterPage().inputPassword(password);
    }


    @And("User enter the confirm password {string}")
    public void userEnterTheConfirmPassword(String confirmPassword) {
        new RegisterPage().inputConfirmPassword(confirmPassword);
    }

    @Then("User should see successful registration message {string}")
    public void userShouldSeeSuccessfulRegistrationMessage(String registerCompletion) {
        Assert.assertEquals(new RegisterPage().verifyRegistrationCompleted(), registerCompletion, "Registration not successful");
    }

}
