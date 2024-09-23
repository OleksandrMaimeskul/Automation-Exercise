package com.qa.AutomationExercise.stepDefinitions;

import com.qa.AutomationExercise.pages.ContactUsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class SD_ContacUS {

    WebDriver driver = DriverHelper.getDriver();
    ContactUsPage contactUsPage = new ContactUsPage(driver);

    @Given("User is on the home page and clicks on the Contact Us button")
    public void user_is_on_the_home_page_and_clicks_on_the_contact_us_button() {
        contactUsPage.clickContactUs();
    }

    @Then("User should see the Get In Touch heading")
    public void user_should_see_the_get_in_touch_heading() {
        Assert.assertTrue(contactUsPage.isGetInTouchVisible());
    }

    @When("User enters {string} in the name field")
    public void user_enters_in_the_name_field(String name) {
        contactUsPage.enterName(name);
    }

    @When("User enters {string} in the email field")
    public void user_enters_in_the_email_field(String email) {
        contactUsPage.enterEmail(email);
    }

    @When("User enters {string} in the subject field")
    public void user_enters_in_the_subject_field(String subject) {
        contactUsPage.enterSubject(subject);
    }

    @When("User enters {string} in the message field")
    public void user_enters_in_the_message_field(String message) {
        contactUsPage.enterMessage(message);
    }

    @When("User uploads the file {string}")
    public void user_uploads_the_file(String filePath) {
        contactUsPage.uploadFile(filePath);
    }

    @When("User clicks the Submit button")
    public void user_clicks_the_submit_button() {
        contactUsPage.clickSubmitButton();
    }

    @Then("User should see the success message {string}")
    public void user_should_see_the_success_message(String expectedMessage) {
        Assert.assertTrue(contactUsPage.isSuccessMessageVisible());
    }

    @When("User clicks the OK button")
    public void user_clicks_the_ok_button() {
        contactUsPage.clickOkButton();
    }

    @When("User clicks the Home button")
    public void user_clicks_the_home_button() {
        contactUsPage.clickHomeButton();
    }
}