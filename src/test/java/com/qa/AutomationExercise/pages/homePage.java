package com.qa.AutomationExercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
    public homePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='nav navbar-nav']//a[.=' Delete Account']")
    WebElement deleteButton;
    @FindBy(xpath = "//div[@class='pull-right']//a[.='Continue']")
    WebElement continueButton;

    public void setDeleteButton() {
        deleteButton.click();
    }

    public void setContinueButton() {
        continueButton.click();
    }
}


