@ysr
Feature: Adress Book Functionality

  Background:
    Given the user navigates to "My Account" module "Login" tab
    When The user enters the personal username and password
    And The user clicks on the My Account section at the top and right of the page.
    And The user clicks on My Account from the tabs that open under the My Account options.
    And The user clicks on the Address Book option from the tabs in the middle right part of My account page.

    Scenario: Verify that the user should be able to click “New Address” in Address Book section
      When The user clicks New Address button on page of written Address Book Entries
      Then The user should be able to see Add Address at the top and left of the fields.




