package com.qa.AutomationExercise.pages;

import io.cucumber.java.ro.Si;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class SignUpPage {
    public SignUpPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//b[.='Enter Account Information']")
    WebElement topHeader;
    @FindBy(css = "#id_gender1")
    WebElement gender;
    @FindBy(css = "#password")
    WebElement password;
    @FindBy(xpath = "//select[@id='days']")
    WebElement day;
    @FindBy(xpath = "//select[@id='months']")
    WebElement month;
    @FindBy(xpath = "//select[@id='years']")
    WebElement year;
    @FindBy(css = "#newsletter")
    WebElement newwsLetterCheckBox;
    @FindBy(css = "#optin")
    WebElement optin;

    @FindBy(xpath = "//input[@data-qa='first_name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@data-qa='last_name']")
    WebElement lastName;
    @FindBy(xpath = "//input[@data-qa='company']")
    WebElement company;
    @FindBy(xpath = "//input[@data-qa='address']")
    WebElement address;
    @FindBy(xpath = "//input[@data-qa='address2']")
    WebElement address2;
    @FindBy(xpath = "//select[@id='country']")
    WebElement country;
    @FindBy(xpath = "//input[@data-qa='state']")
    WebElement state;
    @FindBy(xpath = "//input[@data-qa='city']")
    WebElement city;
    @FindBy(xpath = "//input[@data-qa='zipcode']")
    WebElement zipcode;
    @FindBy(xpath = "//input[@data-qa='mobile_number']")
    WebElement mobileNumber;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    WebElement createButton;
    @FindBy(xpath = "//h2[@class='title text-center']//b[.='Account Created!']")
    WebElement titleAccountCreated;
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    WebElement continueButton;

    public String topHeaderExpected() {
        return BrowserUtils.getText(topHeader);
    }

    public void setUpSignOnInformation(WebDriver driver, String password, String day, String month, String year
    ) {
        gender.click();
        this.password.sendKeys(password);
        BrowserUtils.selectBy(this.day, day, "value");
        BrowserUtils.selectBy(this.month, month, "value");
        BrowserUtils.selectBy(this.year, year, "value");
        newwsLetterCheckBox.click();
        BrowserUtils.scrollWithJS(driver,newwsLetterCheckBox);
        optin.click();


    }

    public void setUpSignOnInformationPart2(WebDriver driver,
                                            String firstName, String lastName, String company,
                                            String address, String address2, String country, String state,
                                            String city, String zipCode, String mobileNumber) throws InterruptedException {
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.company.sendKeys(company);
        this.address.sendKeys(address);
        this.address2.sendKeys(address2);
        BrowserUtils.scrollWithJS(driver, this.address2);
        BrowserUtils.selectBy(this.country, country, "value");
        this.state.sendKeys(state);
        this.city.sendKeys(city);
        this.zipcode.sendKeys(zipCode);
        this.mobileNumber.sendKeys(mobileNumber);
        createButton.click();
        Thread.sleep(2000);


    }
public String expectedAccountCreated(){
        return BrowserUtils.getText(titleAccountCreated);
}

public  void continueButton(){
    continueButton.click();
}
}
