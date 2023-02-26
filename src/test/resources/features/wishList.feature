@US06
Feature: As a user, I should be able to see the product in my wish list, when I like the product.

  Background:
    Given the user should be able to login with "mainpassword" and "mainusername"

  @US06_1

  Scenario: Verify that the user navigates to the wish list page by clicking the "wish list" icon without choosing a product.
    When The user clicks on the "wish list" icon on the homepage
    Then The user should be able to see "Your wish list is empty." text