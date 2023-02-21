@DGMARA-8
Feature: As a user, I should be able to  update My Account module.

  Background:
    Given the user should be able to login with "userEmailForEdit" and "userPasswordForEdit"

  @DGMARA-49
  Scenario: Verify that the user can update their account information.
    Given the user clicks myAccount and edit account button
    When The user enters new firstname in "firstname" field
    And The user enters new lastname in "lastname" field
    And The user enters new email in "email" field
    And The user enters new telephonenumber in "telephone" field
    And The user clicks Continue Button
    Then Verify that the user received a success alert


  @DGMARA-51
  Scenario Outline: Verify that the error message is displayed when the filed is filled by user incorrectly
    Given the user clicks myAccount and edit account button
    When The user enters "<firstname>" in "firstname" field
    And The user enters "<lastname>" in "lastname" field
    And The user enters "<email>" in "email" field
    And The user enters "<telephone>" in "telephone" field
    And The user clicks Continue Button
    Then Verify that the user received an error message

    Examples:
      | firstname | lastname | email          | telephone |
      |           | arslan   | hal1@gmail.com | 123456789 |
      | halil     |          | hal1@gmail.com | 123456789 |











