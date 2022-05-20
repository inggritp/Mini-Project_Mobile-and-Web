Feature: Buying Products
  As a user i should be able to click buy button
  So that i can do transactions

  Scenario: Buying first product
    Given I am on login page for buying product
    And I directed to product page
    When I click BELI button on first product
    Then I validate the quantity of products in my cart increased


  Scenario: Buying second product
    Given I am on login page for buying product
    And I directed to product page
    When I click BELI button on second product
    Then I validate the quantity of products in my cart increased


  Scenario: Buying item using scroll action
    Given I am on login page for buying product
    And I directed to product page
    When I do scroll and click BELI button on one product
    Then I validate the product and it's quantity in my cart increased
