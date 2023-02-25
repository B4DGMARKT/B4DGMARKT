Feature: Currency Functionality of Dgmarkt


  Scenario Outline: Verify that the currency selected by the user matches the currency on the products
    Given The user should be logged and on the dashboard page
    When The user changes the "<currency type>"
    And The user selects the "BaByliss 3663U - Hair rollers" product
    Then The user should be able to see the same "<cost and currency icon>" on the product

    Examples:
      | currency type    | cost and currency icon |
      | € Euro           | 133.38€                |
      | £ Pound Sterling | £104.13                |
      | $ US Dollar      | $170.00                |

  @cur
  Scenario Outline: Verify that the user is able to complete their purchase with the currency of their choice
    Given The user should be logged and on the dashboard page
    When The user changes the "<currency type>"
    And The user selects the "BaByliss 3663U - Hair rollers" product
    And The user adds to cart the selected product
    Then The user should be able to see the "shopping cart" message
    When The user navigates to the " Checkout" menu
    And The user fills the "Billing Details", "Delivery Details", "Delivery Method", "Payment Method", "Confirm Order"
    Then The user should be able to see the "Your order has been placed!" successfully ordered message

    Examples:
      | currency type    |
      | € Euro           |
      | £ Pound Sterling |
      | $ US Dollar      |

