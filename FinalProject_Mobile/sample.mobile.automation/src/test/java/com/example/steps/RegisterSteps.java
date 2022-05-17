package com.example.steps;

import com.example.app.pages.loginPage;
import com.example.app.pages.registerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {

    loginPage loginpage = new loginPage();
    registerPage registpage = new registerPage();

    @Given("I am on product page for register")
    public void iAmOnProductPageForRegister() {
        loginpage.logoutButtonDisplayed();
    }

    @When("I click logout button")
    public void iClickLogoutButton() {
        loginpage.clickLogoutButton();
    }

    @And("I click register on login page")
    public void iClickRegisterOnLoginPage() {
        registpage.clickRegisterButtonOnLoginPage();
    }

    @And("I input fullname {string}")
    public void iInputFullname(String Fullname) throws Exception {
        Thread.sleep(600);
        registpage.clickFullnameField();
        registpage.inputFullname(Fullname);
    }

    @And("I input email {string}")
    public void iInputEmail(String Email) throws Exception {
        Thread.sleep(600);
        registpage.clickEmailField();
        registpage.inputEmail(Email);

    }

    @And("I input pass {string}")
    public void iInputPass(String Password) throws Exception {
        Thread.sleep(600);
        registpage.clickPasswordField();
        registpage.inputPassword(Password);

    }

    @And("click register button")
    public void clickRegisterButton() throws Exception {
        Thread.sleep(600);
        registpage.clickRegisterButton();
    }

    @Then("I get {string}")
    public void iGet(String Result) {
        if(Result.equals("product_page")){
            loginpage.productLabelDisplayed();
        } else if(Result.equals("Gagal :(")){
            registpage.verifyRegisteredEmail();
        } else if (Result.equals("fullname can not empty")){
            registpage.verifyFullnameNull();
        } else if(Result.equals("email can not empty")){
            registpage.verifyEmailNull();
        } else {
            registpage.verifyPasswordNull();
        }
    }

    @And("I don't input anything in register field")
    public void iDonTInputAnythingInRegisterField() throws Exception {
        Thread.sleep(600);
        registpage.clickFullnameField();
        Thread.sleep(400);
        registpage.clearFullnameField();
        Thread.sleep(400);
        registpage.clickEmailField();
        registpage.clearEmailField();
        registpage.clickPasswordField();
        registpage.clearPasswordField();
    }

    @Then("All the error meesages appear")
    public void allTheErrorMeesagesAppear() {
        registpage.verifyFullnameNull();
        registpage.verifyPasswordNull();
        registpage.verifyEmailNull();
    }
}
