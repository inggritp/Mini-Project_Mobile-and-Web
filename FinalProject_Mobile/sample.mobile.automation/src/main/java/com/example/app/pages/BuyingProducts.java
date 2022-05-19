package com.example.app.pages;

import com.example.app.base.basePageObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

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

    public void buyFirstProduct(){
        click(firstProduct());
    }
    public void buySecondProduct(){
        click(secondProduct());
    }
    public void validateNumberInCart(){
        Assertions.assertTrue(find(numberinCart()).isDisplayed());
    }

}
