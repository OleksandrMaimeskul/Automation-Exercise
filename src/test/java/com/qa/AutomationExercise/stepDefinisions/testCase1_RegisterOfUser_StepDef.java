package com.qa.AutomationExercise.stepDefinisions;

import com.qa.AutomationExercise.pages.SignUpPage;
import com.qa.AutomationExercise.pages.TestCase1_RegisterOfUserPage;
import com.qa.AutomationExercise.pages.homePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class testCase1_RegisterOfUser_StepDef {
    WebDriver driver = DriverHelper.getDriver();
    TestCase1_RegisterOfUserPage testCaseOne = new TestCase1_RegisterOfUserPage(driver);
    SignUpPage signUpPage = new SignUpPage(driver);

    homePage homePage = new homePage(driver);

//    @Given("User verify that home page is visible successfully with color {string}")
//    public void userVerifyThatHomePageIsVisibleSuccessfullyWithColorRgba(String homePageActualColor) {
//        Assert.assertEquals(homePage.homePageExpectedColor(), homePageActualColor);
//    }

    @And("User click on signUp_Login button and verify that {string} is visible")
    public void userClickOnSignUp_LoginButtonAndVerifyThatNewUserSignupIsVisible(String signUpText) {
        testCaseOne.setSignUpLoginButton();
        Assert.assertEquals(testCaseOne.signUpTextExpected(), signUpText);
    }

    @Then("User enter {string} and {string} and click SignUp button")
    public void user_enter_and_and_click_sign_up_button(String name, String email) throws InterruptedException {
        testCaseOne.signUpData(name, email);
    }

    @Then("User validate that {string} is visible")
    public void user_validate_that_is_visible(String topHeader) {
        Assert.assertEquals(signUpPage.topHeaderExpected(), topHeader);

    }

    @And("User enter {string} ,{string},{string},{string}")
    public void userEnterPassword(String password, String day, String month, String year) {
        signUpPage.setUpSignOnInformation(driver, password, day, month, year);

    }

    @And("User enter {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},")
    public void userEnterFirstNameLastNameCompanyAddressAddressCountryStateCityZipCodeMobileNumber(String firstName, String lastName, String company,
                                                                                                   String address, String address2, String country, String state,
                                                                                                   String city, String zipCode, String mobileNumber) throws InterruptedException {
        signUpPage.setUpSignOnInformationPart2(driver, firstName, lastName, company, address, address2, country, state, city, zipCode, mobileNumber);

    }


    @Then("User click to Create Account button and verify {string} is visible")
    public void user_click_to_create_account_button_and_verify_is_visible(String titleAccountCre) {
        Assert.assertEquals(signUpPage.expectedAccountCreated(), titleAccountCre);
        signUpPage.continueButton();
    }

    @And("User logout by clicking button for next test")
    public void userLogoutByClickingButtonForNextTest() {
        homePage.setLogoutButton();
    }



//    @And("the user clicks the Delete Account button")
//    public void theUserClicksTheDeleteAccountButton() {
//        homePage.setDeleteButton();
//    }
//    @And("the user clicks the Continue button")
//    public void theUserClicksTheContinueButton() {
//        homePage.setContinueButton();
//    }
}
