Feature: Login
  As a user
  I have to be able to login
  So that i can buy products


  Scenario Outline: Login
    Given I am on alta shop application
    When I click logout button on product page
    And I go to login page
    And I input "<email>"
    And Input "<password>"
    And I Click login button
    Then I get the "<result>"
    Examples:
      |email|password|result|
      |inggrit@gmail.com|Passwordtest321|product_page|
      |rosieposieee@wpdork.com  |Password123    |Email atau password tidak valid|
      |pondaaginggrit1@gmail.com|               |passsword can not be empty|
      |    |Password123               |email can not be empty              |
      |pondaaginggrit1@gmail.com|Password4444   |Email atau password tidak valid|


  Scenario: When i don't input anything in all fields
    Given I am on alta shop application
    When I click logout button on product page
    And I go to login page
    And I don't input anything in all fields
    And I clcik login button
    Then the all the error messages appear
