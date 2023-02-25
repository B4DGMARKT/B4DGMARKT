#Users Story: As a user, I should be able to manage the cart by clicking the cart icon
#Acceptance Criteria :
#1-Verify that the user should be able to see the products added to the cart by clicking the cart icon

  Feature: As a user, I should be able to manage the cart by clicking the cart icon
    Background:  Login successfully
      Then The user should be on the main page and can see the "Your Store" text as title
      When the user navigates to "My Account" module "Login" tab
      And The user enters the personal username and password
      Then The user should be on the dashboard page and can see the "×" success message

    Scenario: the user should be able to see the products added to the cart by clicking the cart icon

    #2- Verify that the user should be able to access the cart from the view cart button
    #3- Verify that the user should be able to go to the Checkout page from the cart icon and complete the checkout

