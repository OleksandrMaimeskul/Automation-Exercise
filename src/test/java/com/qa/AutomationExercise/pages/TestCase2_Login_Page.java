package com.qa.AutomationExercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class TestCase2_Login_Page {
    public TestCase2_Login_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement emailEnter;
    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement password;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    WebElement loginButton;
    @FindBy(xpath = "//a//b[.='Olehandro']")
    WebElement logginAsUser;

    @FindBy(xpath = "//ul//li[.=' Logout']")
    WebElement loggoutButton;
    public void loginValidationFunct(String email,String password){
        this.emailEnter.sendKeys(email);
        this.password.sendKeys(password);
        loginButton.click();

    }
    public String validationOfUserLoginName(){
        return BrowserUtils.getText(logginAsUser);
    }
    public void setLoggoutButton(){
        loggoutButton.click();
    }

}
