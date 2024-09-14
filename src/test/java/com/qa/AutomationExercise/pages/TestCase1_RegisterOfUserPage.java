package com.qa.AutomationExercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class TestCase1_RegisterOfUserPage {
    public TestCase1_RegisterOfUserPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(linkText = "Signup / Login")
    WebElement signUpLoginButton;
    @FindBy(xpath = "//h2[.='New User Signup!']")
    WebElement newSignUpText;

    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement nameInput;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement emailInput;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    WebElement signUpButton;


    public void setSignUpLoginButton(){
        signUpLoginButton.click();
    }
    public String signUpTextExpected(){
        return BrowserUtils.getText(newSignUpText);
    }
    public void signUpData(String name, String email) throws InterruptedException {
        this.nameInput.sendKeys(name);
        this.emailInput.sendKeys(email);
        Thread.sleep(1000);
        signUpButton.click();
    }
}
