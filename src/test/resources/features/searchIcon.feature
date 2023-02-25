Feature: Search Icon Functionality

  Background:
    Given The user should be in homepage
    When The user clicks search icon button on home page
    Then The user should be able to see search line on top of page with written ‘Search entire store here..’

  Scenario Outline: Verify that the product is displayed when the user searches with special characters on the website
    And The user types some '<characters>' in search field
    Then The user should be able to see the titles of the searched product as a result
    Examples:
      | characters |
      | "          |
      | -          |
      | &          |

  Scenario Outline: Verify that the product is displayed when the user searches for the exact item on the website
    And The user types some '<words>' in search field
    Then The user should be able to see the titles of the searched product as a result
    Examples:
      | words  |
      | laptop |
      | cable  |
      | wifi   |

  Scenario Outline: Verify that the message "product not found" is displayed when the user searches for the item that is not on the website
    And The user types some '<words>' in search field
    Then The user should be able to see search line on top of page with written "There is no product that matches the search criteria."
    Examples:
      | words      |
      | mouse      |
      | microphone |
      | phone      |

