Feature: Test the Cart Feature

@tag
  Scenario: Test for the SignIn Section
    Given I am on the home page
    When I add a product to Cart
    And I Proceed to CheckOut
    Then I should be able to see the SignIn Section
