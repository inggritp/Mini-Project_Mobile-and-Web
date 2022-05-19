package com.example.app.base;


import com.example.app.utils.General;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.example.app.drivers.AndroidDriverInit.driver;


public class basePageObject {

    General general = new General();

    public AndroidDriver<AndroidElement> getDriver(){
        return driver;

    }
    public WebDriverWait onWait(){
        return new WebDriverWait(getDriver(),5,1200);
    }
    public AndroidElement find(By locator){
        return (AndroidElement) onWait().until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
    public AndroidElement findId(MobileBy locator){
        return (AndroidElement) onWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void click(By locator){
        find(locator).click();
    }
    public void type(By locator, String input){
        find(locator).sendKeys(input);
    }
    public boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }
    public String getText(By locator){
        return find(locator).getText();
    }
    public boolean mobileIsDisplayed (MobileBy locator){
        return findId(locator).isDisplayed();
    }
    public void clear(By locator){
        find(locator).clear();
    }

}
