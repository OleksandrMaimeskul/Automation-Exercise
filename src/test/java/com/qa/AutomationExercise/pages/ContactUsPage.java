package com.qa.AutomationExercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

    public ContactUsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Contact us')]")
    WebElement contactUsButton;

    @FindBy(xpath = "//h2[contains(text(),'Get In Touch')]")
    WebElement getInTouchHeading;

    @FindBy(xpath = "//input[@name='name']")
    WebElement nameField;

    @FindBy(xpath = "//input[@name='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@name='subject']")
    WebElement subjectField;

    @FindBy(xpath = "//textarea[@name='message']")
    WebElement messageField;

    @FindBy(xpath = "//input[@type='file']")
    WebElement fileUpload;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitButton;

    @FindBy(xpath = "//div[contains(text(),'Success! Your details have been submitted successfully.')]")
    WebElement successMessage;

    @FindBy(xpath = "//button[contains(text(),'OK')]")
    WebElement okButton;

    @FindBy(xpath = "//a[@href='/']")
    WebElement homeButton;

    public void clickContactUs() {
        contactUsButton.click();
    }

    public boolean isGetInTouchVisible() {
        return getInTouchHeading.isDisplayed();
    }

    public void enterName(String name) {
        nameField.sendKeys(name);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterSubject(String subject) {
        subjectField.sendKeys(subject);
    }

    public void enterMessage(String message) {
        messageField.sendKeys(message);
    }

    public void uploadFile(String filePath) {
        fileUpload.sendKeys(filePath);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public boolean isSuccessMessageVisible() {
        return successMessage.isDisplayed();
    }

    public void clickOkButton() {
        okButton.click();
    }

    public void clickHomeButton() {
        homeButton.click();
    }
}

