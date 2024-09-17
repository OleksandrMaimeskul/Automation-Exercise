package com.qa.AutomationExercise.stepDefinisions;

import com.qa.AutomationExercise.pages.SignUpPage;
import com.qa.AutomationExercise.pages.TestCase1_RegisterOfUserPage;
import com.qa.AutomationExercise.pages.homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class SD_TestCase5_CreateOfAccountWithExistingEmail {
    WebDriver driver = DriverHelper.getDriver();
    SignUpPage signUpPage = new SignUpPage(driver);
    TestCase1_RegisterOfUserPage testCaseOne = new TestCase1_RegisterOfUserPage(driver);
    com.qa.AutomationExercise.pages.homePage homePage = new homePage(driver);
    @Given("User click on signUp\\/Login button")
    public void userClickOnSignUpLoginButton() {
        homePage.setSignUpLoginButton();
    }
    @Then("User enter {string} and {string} and click SignUp button")
    public void user_enter_and_and_click_sign_up_button(String name, String email) throws InterruptedException {
        testCaseOne.signUpData(name, email);
    }

    @Then("User validate {string} which occured due to use of existing user email")
    public void userValidateWhichOccuredDueToUseOfExistingUserEmail(String ExistingEmailmessage) {
        Assert.assertEquals(signUpPage.existingEmail(),ExistingEmailmessage);
    }
}
