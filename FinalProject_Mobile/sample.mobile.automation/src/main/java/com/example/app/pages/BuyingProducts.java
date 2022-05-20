package com.example.app.pages;

import com.example.app.base.basePageObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class BuyingProducts extends basePageObject {

    By firstProduct(){
        return By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");
    }
    By secondProduct(){
        return By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[2]");
    }
    By numberinCart(){
        return By.xpath("(//android.widget.Button[@content-desc=\"1\"])");
    }
    By scrollProduct(){
        return By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[4]");
    }

    public void buyFirstProduct(){
        click(firstProduct());
    }
    public void buySecondProduct(){
        click(secondProduct());
    }
    public void validateNumberInCart(){
        Assertions.assertTrue(find(numberinCart()).isDisplayed());
    }
    public void validateProduct(){
        Assertions.assertTrue(find(scrollProduct()).isDisplayed());
    }
    public void clickProduct(){
        click(scrollProduct());
    }


}
