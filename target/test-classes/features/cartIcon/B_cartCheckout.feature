#Users Story 2: As a user, I should be able to manage the cart by clicking the cart icon
@B4DGMAUT-7
Feature: Cart Checkout Fuctionality

  Background:
    Given The user navigates to "My Account" module "Login" tab  and user should be logged and on the dashboard page
    Given The user navigates to "Health & Beauty" submenu from the "Category" menu
    And The user clicks on the first product
    And The user clicks on the Add to Cart button
    And The user clicks on the Cart icon
    And The user clicks on the view cart button

  #3- Verify that the user should be able to go to the Checkout page from the cart icon and complete the checkout
  @B4DGMAUT-22
  Scenario Outline: the user should be able to go to the Checkout page from the cart icon and complete the checkout
    And The user clicks the checkout button
    And The user clicks on the new billing address radio button
    And the user fills in the "<firstname>" "<lastname>" "<company>" "<address_1>" "<address_2>" "<city>" "<postcode>" "<country>" "<region>"
    And The user clicks on the continue button and goes to delivery options
    And The user selects the I want to use an existing address radio button
    And The user inputs "nice product!" into the comment textarea
    And The User agrees the terms and conditions by selecting the checkbox
    And the user clicks the continue button and goes to the confirmation section
    And The user clicks the confirm order button
    Then The text "Your Order Has Been Placed!" should be displayed
    Examples:
      | firstname | lastname | company   | address_1 | address_2 | city | postcode | country       | region   |
      | Fevzi     | Altun    | Microsoft | address 1 | address 2 | city | 33333    | United States | Colorado |

