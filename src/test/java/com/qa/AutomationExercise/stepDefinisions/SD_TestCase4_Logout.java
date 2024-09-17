package com.qa.AutomationExercise.stepDefinisions;

import com.qa.AutomationExercise.pages.TestCase3_NegaritveLogin_Page;
import com.qa.AutomationExercise.pages.homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class SD_TestCase4_Logout {
    WebDriver driver = DriverHelper.getDriver();
    com.qa.AutomationExercise.pages.homePage homePage = new homePage(driver);

    @Given("User push logout button")
    public void user_push_logout_button() {

        homePage.setLogoutButton();
    }

}
