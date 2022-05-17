package com.example.app.pages;

import com.example.app.base.basePageObject;
import com.example.app.utils.General;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class registerPage extends basePageObject {

    General general = new General();

    By registerButtonOnLoginPage(){
        return By.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }
    By fullnameField(){
        return By.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    By emailField(){
        return By.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }
    By passwordField(){
        return By.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    }
    By registerButton(){
        return By.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }
    MobileBy fullnameNull(){
        return (MobileBy) MobileBy.AccessibilityId("fullname can not empty");
    }
    MobileBy emailNull(){
        return (MobileBy) MobileBy.AccessibilityId("email can not empty");
    }
    MobileBy registeredEmail(){
        return (MobileBy) MobileBy.AccessibilityId("Gagal :(");
    }
    MobileBy passwordNull(){
        return (MobileBy) MobileBy.AccessibilityId("password can not empty");
    }

    public void clickRegisterButtonOnLoginPage(){
        click(registerButtonOnLoginPage());
    }
    public void clickFullnameField(){
        click(fullnameField());
    }
    public void clickEmailField(){
        click(emailField());
    }
    public void clickPasswordField(){
        click(passwordField());
    }
    public void clickRegisterButton(){
        click(registerButton());
    }
    public void inputFullname(String Fullname){
        type(fullnameField(),Fullname);
    }
    public void inputEmail(String Email){
        if (Email.equals("new")){
            type(emailField(),general.randomNumForEmail(Email));
        } else {
            type(emailField(),Email);
        }

    }
    public void inputPassword(String Password){
        type(passwordField(),Password);
    }
    public void verifyFullnameNull(){
        Assertions.assertTrue(findId(fullnameNull()).isDisplayed());
    }
    public void verifyEmailNull(){
        Assertions.assertTrue(findId(emailNull()).isDisplayed());
    }
    public void verifyPasswordNull(){
        Assertions.assertTrue(findId(passwordNull()).isDisplayed());
    }
    public void verifyRegisteredEmail(){
        Assertions.assertTrue(findId(registeredEmail()).isDisplayed());
    }
    public void clearFullnameField(){
        clear(fullnameField());
    }
    public void clearEmailField(){
        clear(emailField());
    }
    public void clearPasswordField(){
        clear(passwordField());
    }




}
