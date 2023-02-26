Feature: Logout Functionality
  # Users Story : As a user, I should be able to log out
  # Acceptance Criteria :
  # 1-Verify that the user has securely terminated the session

  #  Test case : User can log out by clickıng the logout link under the My Account menu

  Scenario:  User can log out by clickıng the logout link under the My Account menu
    Then The user should be on the main page and can see the "Your Store" text as title
    And the user navigates to "My Account" module "Login" tab
    And The user enters the personal username and password
    And The user can see the "×" success message
    When The user navigates to "My Account" module "Logout" tab
    Then The user can see the "Login" link under the "My Account" menu

  # Users Story : As a user, I should be able to log out
  # ok
  # Acceptance Criteria :
  # 2-Verify that there is no re-login with "Back to page" icon in browser .

  #  Test case :The user should not be logged in when the user logs in and then logs out and navigates to back in the browser
  @logout
  Scenario: The user should not be logged in when the user logs in and then logs out and navigates to back in the browser
    Then The user should be on the main page and can see the "Your Store" text as title
    And the user navigates to "My Account" module "Login" tab
    And The user enters the personal username and password
    And The user can see the "×" success message
    And The user navigates to "My Account" module "Logout" tab
    When The user navigates to back in the browser
    Then The user can see the "Login" link under the "My Account" menu