package DGMARKT.stepDefs;

import DGMARKT.pages.AddressBookPage;
import DGMARKT.pages.DashboardPage;
import DGMARKT.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class adressBookDefs {

    DashboardPage dashboardPage = new DashboardPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    AddressBookPage addressBookPage = new AddressBookPage();

    @When("The user clicks on the My Account section at the top and right of the page.")
    public void the_user_clicks_on_the_my_account_section_at_the_top_and_right_of_the_page() throws InterruptedException {
        Thread.sleep(500);
        dashboardPage.myAccountMenu.click();
    }

    @When("The user clicks on My Account from the tabs that open under the My Account options.")
    public void the_user_clicks_on_my_account_from_the_tabs_that_open_under_the_my_account_options() {
        dashboardPage.sectionMyAccount.click();
    }

    @When("The user clicks on the Address Book option from the tabs in the middle right part of My account page.")
    public void the_user_clicks_on_the_address_book_option_from_the_tabs_in_the_middle_right_part_of_my_account_page() {
        myAccountPage.addressBookButton.click();
    }

    @When("The user clicks New Address button on page of written Address Book Entries")
    public void theUserClicksNewAddressButtonOnPageOfWrittenAddressBookEntries() {
        addressBookPage.newAddress.click();

    }

    @Then("The user should be able to see Add Address at the top and left of the fields.")
    public void the_user_should_be_able_to_see_add_address_at_the_top_and_left_of_the_fields() {
        String title = addressBookPage.newAddressTitle.getText();
        Assert.assertEquals("Add Address", title);

    }

    @Then("The user types a first name with valid credential on First Name field {string}")
    public void the_user_types_a_first_name_with_valid_credential_on_first_name_field(String string) {
        addressBookPage.firstNameField(string);
    }

    @Then("The user types a last name with valid credential on Last Name field {string}")
    public void the_user_types_a_last_name_with_valid_credential_on_last_name_field(String string) {
        addressBookPage.lastNameField(string);
    }

    @Then("The user types a company with valid credential on Company field {string}")
    public void the_user_types_a_company_with_valid_credential_on_company_field(String string) {
        addressBookPage.companyField(string);
    }

    @And("The user types a address with valid credential on Address field {string}")
    public void theUserTypesAAddressWithValidCredentialOnAddressFieldAdress(String string) {
        addressBookPage.adressfield(string);
    }

    @And("The user types a address with valid credential on Address two field {string}")
    public void theUserTypesAAddressWithValidCredentialOnAddressTwoFieldAddressTwo(String string) {
        addressBookPage.adress2field(string);
    }

    @And("The user types a city with valid credential on City field {string}")
    public void theUserTypesACityWithValidCredentialOnCityFieldCity(String string) {
        addressBookPage.cityfield(string);
    }

    @And("The user types a post code with valid credential on Post Code field {string}")
    public void theUserTypesAPostCodeWithValidCredentialOnPostCodeFieldPostCode(String string) {
        addressBookPage.postCodeField(string);
    }

    @And("The user chooses a country with valid credential on Country tab {string}")
    public void theUserChoosesACountryWithValidCredentialOnCountryTabCountry(String string) {
        addressBookPage.countrySection(string);
    }

    @And("The user chooses a region with valid credential on Region {string}")
    public void theUserChoosesARegionWithValidCredentialOnRegionRegion(String string) {
        addressBookPage.regionSection(string);
    }

    @When("The user clicks Continue button on right side and down of fields")
    public void theUserClicksContinueButtonOnRightSideAndDownOfFields() {
        addressBookPage.continueButton.click();
    }


    @Then("The user should be able to see  written {string} on middle of page and added new address on down of Address Book Entries.")
    public void theUserShouldBeAbleToSeeWrittenOnMiddleOfPageAndAddedNewAddressOnDownOfAddressBookEntries(String string) {
        String addedText = addressBookPage.adressAddedTitle.getText();
        Assert.assertTrue(string.contains(addedText));
    }


    @And("The user leaves empty on Address field {string}")
    public void theUserLeavesEmptyOnAddressFieldAddress(String string) {
        addressBookPage.adressfield(string);
    }

    @Then("The user should be able to see  written {string} on down of Address field.")
    public void theUserShouldBeAbleToSeeWrittenOnDownOfAddressField(String string) {
        String addedText = addressBookPage.addressWarningMessage.getText();
        Assert.assertTrue(string.contains(addedText));
    }


    @And("The user types a address  on Address field {string}")
    public void theUserTypesAAddressOnAddressFieldAddress(String string) {
        addressBookPage.adressfield(string);
    }

    @And("The user types a city name on City field {string}")
    public void theUserTypesACityNameOnCityFieldCity(String string) {
        addressBookPage.cityfield(string);
    }

    @Then("The user should be able to see  written {string} on down of City field.")
    public void theUserShouldBeAbleToSeeWrittenOnDownOfCityField(String string) {
        String addedText = addressBookPage.cityWarningMessage.getText();
        Assert.assertTrue(string.contains(addedText));
    }


}
