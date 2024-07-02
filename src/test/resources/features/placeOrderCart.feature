Feature: Add Laptop item to Shopping Cart
  Scenario Outline: Add Laptop
    Given the user is on the main page of the commerce site
    When the user isfilter for category Laptop
    And the user is choose the product <product>
    Then the user should see the success message confirming the item was added

    Examples:
      |browser|product|
      |chrome |MacBook air|
      |edge   |Sony vaio i5|
