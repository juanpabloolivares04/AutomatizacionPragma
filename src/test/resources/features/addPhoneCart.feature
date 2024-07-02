Feature: Add Phone item to Shopping Cart
  Scenario Outline: Add Phone
    Given the user is on the main page of the commerce site
    When the user is filter for category phone
    And the user is choose the product <product>
    Then the user should see the success message confirming the item was added

    Examples:
      |browser|product|
      |chrome |MacBook air|
      |edge   |Sony vaio i5|
