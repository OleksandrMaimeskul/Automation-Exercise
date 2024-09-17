package com.qa.AutomationExercise.stepDefinisions;

import com.qa.AutomationExercise.pages.TestCase3_NegaritveLogin_Page;
import com.qa.AutomationExercise.pages.homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class SD_TestCase3_NwgativeLogin {
    WebDriver driver = DriverHelper.getDriver();
    homePage homePage = new homePage(driver);
    TestCase3_NegaritveLogin_Page testCase3 = new TestCase3_NegaritveLogin_Page(driver);

    @Given("User push SignUp\\/Login by click button on the homepage")

    public void user_push_sign_up_login_by_click_button_on_the_homepage() {
        homePage.setSignUpLoginButton();
    }

    @Given("the user enters the incorrect {string}, {string} and push login button")
    public void the_user_enters_the_incorrect_and_push_login_button(String email, String password) {
        testCase3.loginValidationNegativeScenario(email, password);
    }

    @Then("User verify that {string} is visible")
    public void user_verify_that_is_visible(String message) {
        Assert.assertEquals(testCase3.wrongEmailOrPasswordMessage(), message);
    }
}
