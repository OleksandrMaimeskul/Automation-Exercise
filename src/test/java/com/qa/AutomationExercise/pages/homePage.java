package com.qa.AutomationExercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class homePage {
    public homePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@style='color: orange;']")
    WebElement homePageWithColor;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']//a[.=' Delete Account']")
    WebElement deleteButton;
    @FindBy(xpath = "//div[@class='pull-right']//a[.='Continue']")
    WebElement continueButton;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']//a[.=' Logout']")
    WebElement logoutButton;
    @FindBy(linkText = "Signup / Login")
    WebElement signUpLoginButton;

    @FindBy(xpath = "//li//b[.='Olehandro']")
    WebElement homePage;

    public String homePageExpectedColor(){
        String expectedColor = homePageWithColor.getCssValue("color");
        return expectedColor;
    }
    public void setDeleteButton() {
        deleteButton.click();
    }

    public void setContinueButton() {
        continueButton.click();
    }

    public void setLogoutButton() {
        logoutButton.click();
    }

    public String homePageExpected() {
        return BrowserUtils.getText(homePageWithColor);
    }

    public void setSignUpLoginButton(){
        signUpLoginButton.click();
    }
}


