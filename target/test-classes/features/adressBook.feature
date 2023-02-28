@ysr
Feature: Adress Book Functionality

  Background:
    Given the user navigates to "My Account" module "Login" tab
    When The user enters the personal username and password
    And The user clicks on the My Account section at the top and right of the page.
    And The user clicks on My Account from the tabs that open under the My Account options.
    And The user clicks on the Address Book option from the tabs in the middle right part of My account page.

  @US10-TC01
  Scenario: Verify that the user should be able to click “New Address” in Address Book section
    When The user clicks New Address button on page of written Address Book Entries
    Then The user should be able to see Add Address at the top and left of the fields.

  @US10-TC02
  Scenario Outline: Verify that the user should to be able to add new address with valid credentials
    When The user clicks New Address button on page of written Address Book Entries
    Then The user should be able to see Add Address at the top and left of the fields.
    And The user types a first name with valid credential on First Name field '<firstName>'
    And The user types a last name with valid credential on Last Name field '<lastName>'
    And The user types a company with valid credential on Company field '<company>'
    And The user types a address with valid credential on Address field '<address>'
    And The user types a address with valid credential on Address two field '<addressTwo>'
    And The user types a city with valid credential on City field '<city>'
    And The user types a post code with valid credential on Post Code field '<postCode>'
    And The user chooses a country with valid credential on Country tab '<country>'
    And The user chooses a region with valid credential on Region '<region>'
    When The user clicks Continue button on right side and down of fields
    Then The user should be able to see  written "Your address has been successfully added" on middle of page and added new address on down of Address Book Entries.

    Examples:
      | firstName | lastName | company  | address      | addressTwo | city       | postCode | country | region                  |
      | Yasir     | TIRAK    | EuroTech | Gaard Street | N25        | Alveringem | 82375    | Belgium | Brussels-Capital Region |


  @US10-TC03
  Scenario Outline: Verify that the user should not be able to add new address as empty into Address 1 field
    When The user clicks New Address button on page of written Address Book Entries
    Then The user should be able to see Add Address at the top and left of the fields.
    And The user types a first name with valid credential on First Name field '<firstName>'
    And The user types a last name with valid credential on Last Name field '<lastName>'
    And The user types a company with valid credential on Company field '<company>'
    And The user leaves empty on Address field '<address>'
    And The user types a address with valid credential on Address two field '<addressTwo>'
    And The user types a city with valid credential on City field '<city>'
    And The user types a post code with valid credential on Post Code field '<postCode>'
    And The user chooses a country with valid credential on Country tab '<country>'
    And The user chooses a region with valid credential on Region '<region>'
    When The user clicks Continue button on right side and down of fields
    Then The user should be able to see  written "Address must be between 3 and 128 characters!" on down of Address field.

    Examples:
      | firstName | lastName | company  | address | addressTwo | city       | postCode | country | region                  |
      | Yasir     | TIRAK    | EuroTech |         | N25        | Alveringem | 82375    | Belgium | Brussels-Capital Region |

  @US10-TC04
  Scenario Outline: Verify that the user should not be able to add new address with less than 3 character into Address 1 field
    When The user clicks New Address button on page of written Address Book Entries
    Then The user should be able to see Add Address at the top and left of the fields.
    And The user types a first name with valid credential on First Name field '<firstName>'
    And The user types a last name with valid credential on Last Name field '<lastName>'
    And The user types a company with valid credential on Company field '<company>'
    And The user types a address  on Address field '<address>'
    And The user types a address with valid credential on Address two field '<addressTwo>'
    And The user types a city with valid credential on City field '<city>'
    And The user types a post code with valid credential on Post Code field '<postCode>'
    And The user chooses a country with valid credential on Country tab '<country>'
    And The user chooses a region with valid credential on Region '<region>'
    When The user clicks Continue button on right side and down of fields
    Then The user should be able to see  written "Address must be between 3 and 128 characters!" on down of Address field.

    Examples:
      | firstName | lastName | company  | address | addressTwo | city       | postCode | country | region                  |
      | Yasir     | TIRAK    | EuroTech | Ga      | N25        | Alveringem | 82375    | Belgium | Brussels-Capital Region |

  @US10-TC05
  Scenario Outline: Verify that the user should not be able to add new address with more than 128 character into Address 1 field
    When The user clicks New Address button on page of written Address Book Entries
    Then The user should be able to see Add Address at the top and left of the fields.
    And The user types a first name with valid credential on First Name field '<firstName>'
    And The user types a last name with valid credential on Last Name field '<lastName>'
    And The user types a company with valid credential on Company field '<company>'
    And The user types a address  on Address field '<address>'
    And The user types a address with valid credential on Address two field '<addressTwo>'
    And The user types a city with valid credential on City field '<city>'
    And The user types a post code with valid credential on Post Code field '<postCode>'
    And The user chooses a country with valid credential on Country tab '<country>'
    And The user chooses a region with valid credential on Region '<region>'
    When The user clicks Continue button on right side and down of fields
    Then The user should be able to see  written "Address must be between 3 and 128 characters!" on down of Address field.

    Examples:
      | firstName | lastName | company  | address                                                                                                                           | addressTwo | city       | postCode | country | region                  |
      | Yasir     | TIRAK    | EuroTech | 123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789 | N25        | Alveringem | 82375    | Belgium | Brussels-Capital Region |

  @US10-TC06
  Scenario Outline: Verify that the user should not be able to add new address with only space into Address 1 field
    When The user clicks New Address button on page of written Address Book Entries
    Then The user should be able to see Add Address at the top and left of the fields.
    And The user types a first name with valid credential on First Name field '<firstName>'
    And The user types a last name with valid credential on Last Name field '<lastName>'
    And The user types a company with valid credential on Company field '<company>'
    And The user types a address  on Address field '    <address>    '
    And The user types a address with valid credential on Address two field '<addressTwo>'
    And The user types a city with valid credential on City field '<city>'
    And The user types a post code with valid credential on Post Code field '<postCode>'
    And The user chooses a country with valid credential on Country tab '<country>'
    And The user chooses a region with valid credential on Region '<region>'
    When The user clicks Continue button on right side and down of fields
    Then The user should be able to see  written "Address must be between 3 and 128 characters!" on down of Address field.

    Examples:
      | firstName | lastName | company  | address | addressTwo | city       | postCode | country | region                  |
      | Yasir     | TIRAK    | EuroTech |         | N25        | Alveringem | 82375    | Belgium | Brussels-Capital Region |

  @US10-TC07
  Scenario Outline: Verify that the user should not be able to add new address with only numbers into City field
    When The user clicks New Address button on page of written Address Book Entries
    Then The user should be able to see Add Address at the top and left of the fields.
    And The user types a first name with valid credential on First Name field '<firstName>'
    And The user types a last name with valid credential on Last Name field '<lastName>'
    And The user types a company with valid credential on Company field '<company>'
    And The user types a address with valid credential on Address field '<address>'
    And The user types a address with valid credential on Address two field '<addressTwo>'
    And The user types a city name on City field '<city>'
    And The user types a post code with valid credential on Post Code field '<postCode>'
    And The user chooses a country with valid credential on Country tab '<country>'
    And The user chooses a region with valid credential on Region '<region>'
    When The user clicks Continue button on right side and down of fields
    Then The user should be able to see  written "Only numbers can not be used " on down of City field.

    Examples:
      | firstName | lastName | company  | address      | addressTwo | city     | postCode | country | region                  |
      | Yasir     | TIRAK    | EuroTech | Gaard Street | N25        | 12345678 | 82375    | Belgium | Brussels-Capital Region |

  @US10-TC08
  Scenario Outline: Verify that the user should not be able to add new address with less than 3 character into City field
    When The user clicks New Address button on page of written Address Book Entries
    Then The user should be able to see Add Address at the top and left of the fields.
    And The user types a first name with valid credential on First Name field '<firstName>'
    And The user types a last name with valid credential on Last Name field '<lastName>'
    And The user types a company with valid credential on Company field '<company>'
    And The user types a address with valid credential on Address field '<address>'
    And The user types a address with valid credential on Address two field '<addressTwo>'
    And The user types a city name on City field '<city>'
    And The user types a post code with valid credential on Post Code field '<postCode>'
    And The user chooses a country with valid credential on Country tab '<country>'
    And The user chooses a region with valid credential on Region '<region>'
    When The user clicks Continue button on right side and down of fields
    Then The user should be able to see  written "City must be between 2 and 128 characters!" on down of City field.

    Examples:
      | firstName | lastName | company  | address      | addressTwo | city | postCode | country | region                  |
      | Yasir     | TIRAK    | EuroTech | Gaard Street | N25        | A    | 82375    | Belgium | Brussels-Capital Region |

