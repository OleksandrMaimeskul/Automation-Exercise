package com.qa.AutomationExercise.stepDefinisions;

import com.qa.AutomationExercise.pages.SignUpPage;
import com.qa.AutomationExercise.pages.TestCase1_RegisterOfUserPage;
import com.qa.AutomationExercise.pages.TestCase2_Login_Page;
import com.qa.AutomationExercise.pages.homePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class testCase2_Login {
    WebDriver driver = DriverHelper.getDriver();

    TestCase2_Login_Page testCase2LoginPage = new TestCase2_Login_Page(driver);
    homePage homePage = new homePage(driver);
    @Given("User verify that home page is visible successfully with color {string}")
    public void userVerifyThatHomePageIsVisibleSuccessfullyWithColorRgba(String homePageActualColor) {
        Assert.assertEquals(homePage.homePageExpectedColor(), homePageActualColor);
    }
    @Given("User push SignUp\\/Login by click the button on the homepage")
    public void userPushSignUpLoginByClickTheButtonOnTheHomepage() {
        homePage.setSignUpLoginButton();
    }

    @And("the user enters the correct {string}, {string} and push login button")
    public void theUserEntersTheCorrectWhatIsWonderfulEmailForTestGmailComAndPushLoginButton(String email, String password) {
        testCase2LoginPage.loginValidationFunct(email, password);

    }
    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String validateOfUserLoginActual) {
        Assert.assertEquals(testCase2LoginPage.validationOfUserLoginName(), validateOfUserLoginActual);
    }


}
