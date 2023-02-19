Feature: Login Functionality

  @wip
  Scenario: I should be able to first login
    Then The user should be on the main page and can see the "Your Store" text as title
    When the user navigates to "My Account" module "Login" tab
    And The user enters the personal username and password
    Then The user should be on the dashboard page and can see the " Congratulation! Login Successfully" success message
