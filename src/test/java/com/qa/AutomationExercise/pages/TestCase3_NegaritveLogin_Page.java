package com.qa.AutomationExercise.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class TestCase3_NegaritveLogin_Page {
    public TestCase3_NegaritveLogin_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement emailEnter;
    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement password;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    WebElement loginButton;

    @FindBy(xpath = "//p[.='Your email or password is incorrect!']")
    WebElement wrongEmailOrPasswordMessage;

    public void loginValidationNegativeScenario(String email, String password) {
        this.emailEnter.sendKeys(email);
        this.password.sendKeys(password);
        loginButton.click();
    }

    public String wrongEmailOrPasswordMessage() {

      return  BrowserUtils.getText(wrongEmailOrPasswordMessage);
    }
}
