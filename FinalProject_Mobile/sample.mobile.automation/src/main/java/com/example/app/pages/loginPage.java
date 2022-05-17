package com.example.app.pages;

import com.example.app.base.basePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class loginPage extends basePageObject {

    By logoutButton(){
        return By.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    By emailField(){
        return By.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    By passwordField(){
        return By.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }
    By loginButton(){
        return By.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }
    By passwordNull(){
        return By.xpath("//android.view.View[@content-desc=\"password can not empty\"]");
    }
    By emailNull(){
        return By.xpath("//android.view.View[@content-desc=\"email can not empty\"]");
    }
    By passwordorEmailInvallid(){
        return By.xpath("//android.view.View[@content-desc=\"Email atau password tidak valid.\"]");
    }
    By productLabel(){
        return By.xpath("//android.view.View[@content-desc=\"Products\"]");
    }

    public void clickLogoutButton(){
        click(logoutButton());
    }
    public void inputEmail(String email){
        type(emailField(),email);

    }
    public void inputPassword(String password){
        type(passwordField(),password);
    }
    public void clickLoginButton(){
        click(loginButton());
    }

    public void passwordNullDisplayed(){
        Assertions.assertTrue(find(passwordNull()).isDisplayed());
    }
    public void emailNullDisplayed(){
        Assertions.assertTrue(find(emailNull()).isDisplayed());
    }
    public void invalidEmailOrPasswordDisplayed(){
        Assertions.assertTrue(find(passwordorEmailInvallid()).isDisplayed());
    }
    public void productLabelDisplayed(){
        Assertions.assertTrue(find(productLabel()).isDisplayed());
    }
    public void loginButtonDisplayed(){
        Assertions.assertTrue(find(loginButton()).isDisplayed());
    }
    public void logoutButtonDisplayed(){
        Assertions.assertTrue(find(logoutButton()).isDisplayed());
    }
    public void clickEmailField(){
        click(emailField());
    }
    public void clickPasswordField(){
        click(passwordField());
    }


}
