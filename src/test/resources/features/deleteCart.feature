Feature: Delete item in Shopping Cart
  Scenario Outline: Delete Item
    Given the user already
    When the user isfilter for category Laptop
    And the user is choose the product <product>
    Then the user should see the success message confirming the item was added

    Examples:
      |browser|product|
      |chrome |MacBook air|
      |edge   |Sony vaio i5|
