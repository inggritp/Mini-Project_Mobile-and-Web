package com.example.steps;

import com.example.app.pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {

    loginPage logpage = new loginPage();

    @Given("I am successfully login to my account")
    public void iAmSuccessfullyLoginToMyAccount()throws Exception {
        logpage.productLabelDisplayed();
        logpage.clickLogoutButton();
        Thread.sleep(600);
        logpage.clickEmailField();
        Thread.sleep(600);
        logpage.inputEmail("inggrit@gmail.com");
        Thread.sleep(600);
        logpage.clickPasswordField();
        logpage.inputPassword("Passwordtest321");
        logpage.clickLoginButton();

    }

    @When("I click logout button on product page for logout")
    public void iClickLogoutButtonOnProductPageForLogout()throws Exception {
        Thread.sleep(600);
        logpage.productLabelDisplayed();
        logpage.clickLogoutButton();
    }

    @Then("I successfully logout")
    public void iSuccessfullyLogout() {
        logpage.logoutButtonDisplayed();
    }
}
