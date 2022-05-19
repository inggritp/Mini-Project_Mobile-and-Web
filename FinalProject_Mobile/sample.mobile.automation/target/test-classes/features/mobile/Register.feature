#Feature: Register
#  As a user
#  I should be able to create new account
#  So that i can buy products
#
#
#
#  Scenario Outline: Register
#    Given I am on product page for register
#    When I click logout button
#    And I click register on login page
#    And I input fullname "<Fullname>"
#    And I input email "<Email>"
#    And I input pass "<Password>"
#    And click register button
#    Then I get "<Result>"
#    Examples:
#      |Fullname|Email|Password|Result|
#      |Inggrit     |new|Rosieeposie45|product_page|
#      |Inggrit     |inggrit@gmail.com|Password3211|Gagal :(|
#      |            |jichuuu@gmail.com                    |Halloo321   |fullname can not empty|
#      |Kim Jisoo   |                         |Halloo321   |email can not empty|
#      |Kim Jisoo   |jichuuu@gmail.com                     |            |password can not empty|
#
#
#  Scenario: When i don't input anything in all register field
#    Given I am on product page for register
#    When I click logout button
#    And I click register on login page
#    And I don't input anything in register field
#    And click register button
#    Then All the error meesages appear
