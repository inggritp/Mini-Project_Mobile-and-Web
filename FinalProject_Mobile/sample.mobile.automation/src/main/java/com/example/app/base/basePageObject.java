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
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.example.app.drivers.AndroidDriverInit.driver;


public class basePageObject {



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
        find(locator).getCenter();
        find(locator).click();
    }
    public void type(By locator, String input){
        find(locator).sendKeys(input);
    }
    public boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public boolean mobileIsDisplayed (MobileBy locator){
        return findId(locator).isDisplayed();
    }
    public void clear(By locator){
        find(locator).clear();
    }
    public void scroll(){
        TouchAction action = new TouchAction(driver);
        Dimension sizeDevice = driver.manage().window().getSize();
        action.press(PointOption.point((int) (sizeDevice.getWidth() * 0.5), (int) (sizeDevice.getHeight() * 0.8)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point((int) (sizeDevice.getWidth() * 0.5), (int) (sizeDevice.getHeight() * 0.2)))
                .release().perform();


    }


}
