package com.qa.AutomationExercise.stepDefinisions;

import com.qa.AutomationExercise.pages.SignUpPage;
import com.qa.AutomationExercise.pages.TestCase1_RegisterOfUserPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserUtils;
import utils.DriverHelper;

public class testCase1_RegisterOfUser_StepDef {
    WebDriver driver = DriverHelper.getDriver();
    TestCase1_RegisterOfUserPage testCaseOne = new TestCase1_RegisterOfUserPage(driver);
    SignUpPage signUpPage = new SignUpPage(driver);

    @Given("User verify that {string} page is visible successfully")
    public void user_verify_that_page_is_visible_successfully(String homePage) {
        Assert.assertEquals(testCaseOne.homePageExpected(), homePage);
    }

    @And("User click on signUp_Login button and verify that {string} is visible")
    public void userClickOnSignUp_LoginButtonAndVerifyThatNewUserSignupIsVisible(String signUpText) {
        testCaseOne.setSignUpLoginButton();
        Assert.assertEquals(testCaseOne.signUpTextExpected(), signUpText);
    }

    @Then("User enter {string} and {string} and click SignUp button")
    public void user_enter_and_and_click_sign_up_button(String name, String email) {
        testCaseOne.signUpData(name, email);
    }

    @Then("User validate that {string} is visible")
    public void user_validate_that_is_visible(String topHeader) {
       Assert.assertEquals(signUpPage.topHeaderExpected(), topHeader);

    }

    @And("User enter {string} ,{string},{string},{string}")
    public void userEnterPassword(String password,String day, String month, String year) {
        signUpPage.setUpSignOnInformation(driver,password,day,month,year);

    }

    @And("User enter {string},{string},{string},{string},{string},{string},{string},{string},{string},")
    public void userEnterFirstNameLastNameCompanyAddressAddressStateCityZipCodeMobileNumber( String firstName, String lastName, String company,
                                                                                             String address, String address2, String country, String state,
                                                                                             String city, String zipCode, String mobileNumber) {
        signUpPage.setUpSignOnInformationPart2(driver,firstName,lastName,company,address,address2,country,state,city,zipCode,mobileNumber);
    }


    @Then("User click to Create Account button and verify {string} is visible")
    public void user_click_to_create_account_button_and_verify_is_visible(String string) {

    }

    @Then("User click continue button and verify that {string} is visible")
    public void user_click_continue_button_and_verify_that_is_visible(String string) {

    }



}
