package com.example.steps;

import com.example.app.pages.BuyingProducts;
import com.example.app.pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyingSteps {

    BuyingProducts buyproduct = new BuyingProducts();
    loginPage logpage = new loginPage();

    @Given("I am on login page for buying product")
    public void iAmOnLoginPageForBuyingProduct() throws Exception {
        logpage.productLabelDisplayed();
        logpage.logoutButtonDisplayed();
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

    @And("I directed to product page")
    public void iDirectedToProductPage() {
        logpage.productLabelDisplayed();
    }

    @When("I click BELI button on first product")
    public void iClickBELIButtonOnFirstProduct() throws Exception {
        Thread.sleep(600);
        buyproduct.buyFirstProduct();
    }

    @Then("I validate the quantity of products in my cart increased")
    public void iValidateTheQuantityOfProductsInMyCartIncreased()throws Exception {
        Thread.sleep(600);
        buyproduct.validateNumberInCart();
    }

    @When("I click BELI button on second product")
    public void iClickBELIButtonOnSecondProduct() {
        buyproduct.buySecondProduct();
    }

}
