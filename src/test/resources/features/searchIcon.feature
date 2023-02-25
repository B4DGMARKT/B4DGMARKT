Feature: Search Icon Functionality

@wipe
  Scenario Outline: Verify that the product is displayed when the user searches with special characters on the website
    Given The user should be logged and on the dashboard page
    When The user clicks search icon button on home page
    Then The user should be able to see search line on top of page with written ‘Search entire store here..’
    And The user types some "<characters>" in the product titles are written
    Then The user should be able to see the titles of the searched product as a result
    Examples:
      | characters |
      | "          |
      | -          |
      | &          |