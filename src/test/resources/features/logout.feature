Feature: Logout Functionality
  # Users Story : As a user, I should be able to log out
  # Acceptance Criteria :
  # 1-Verify that the user has securely terminated the session

  #  Test case : User can log out by clickıng the logout link under the My Account menu

Scenario:  User should be able to log out
Then The user should be on the main page and can see the "Your Store" text as title
And the user navigates to "My Account" module "Login" tab
And The user enters the personal username and password
And The user can see the "×" success message
When The user navigates to "My Account" module "Logout" tab
Then The user can see the "Login" link under the "My Account" menu

  # Users Story : As a user, I should be able to log out
  # Acceptance Criteria :
  # 1-Verify that the user has securely terminated the session

  #  Test case : When user logs in and closes the browser and opens a new browser the user must not be logged in automatically
  @wip
  Scenario: User should not be logged in automatically when he opens a browser after closing his browser he logged in
    Then The user should be on the main page and can see the "Your Store" text as title
    Then The user should be on the main page and can see the "Your Store" text as title
    And the user navigates to "My Account" module "Login" tab
    And The user enters the personal username and password
    And The user can see the "×" success message
  #  And The user opens a new browser

  # Users Story : As a user, I should be able to log out
  # Acceptance Criteria :
  # 2-Verify that there is no re-login with "Back to page" icon in browser .