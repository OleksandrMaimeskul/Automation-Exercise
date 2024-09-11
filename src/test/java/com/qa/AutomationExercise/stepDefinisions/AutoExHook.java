package com.qa.AutomationExercise.stepDefinisions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class AutoExHook {
    public WebDriver driver;
    @Before
    public void setup(){
        driver= DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("url"));
    }
    @After
    public void tearDown(Scenario scenario){
        BrowserUtils.getScreenShootCuCumber(driver,scenario);
//        driver.quit();
    }
}
