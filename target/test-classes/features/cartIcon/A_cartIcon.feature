#Users Story 2: As a user, I should be able to manage the cart by clicking the cart icon
@B4DGMAUT-7
Feature: Cart Icon Fuctionality

  Background:
    Given The user navigates to "My Account" module "Login" tab  and user should be logged and on the dashboard page

    #1-Verify that the user should be able to see the products added to the cart by clicking the cart icon
  @B4DGMAUT-20
  Scenario: the user should be able to see the products added to the cart by clicking the cart icon
    #Given The user navigates to "Health & Beauty" section from the Category menu
    Given The user navigates to "Health & Beauty" submenu from the "Category" menu
    And The user clicks on the first product
    And The user clicks on the Add to Cart button
    And The user clicks on the Cart icon
    Then The product "BABYLISS 3663U - HAIR ROLLERS" should be in the cart side bar


    #2- Verify that the user should be able to access the cart from the view cart button
  @B4DGMAUT-21
  Scenario: the user should be able to access the cart from the view cart button
    Given The user navigates to "Health & Beauty" submenu from the "Category" menu
    And The user clicks on the first product
    And The user clicks on the Add to Cart button
    And The user clicks on the Cart icon
    And The user clicks on the view cart button
    Then The product "BaByliss 3663U - Hair rollers" should be in the cart list



