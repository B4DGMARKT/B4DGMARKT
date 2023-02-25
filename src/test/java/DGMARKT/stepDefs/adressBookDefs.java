package DGMARKT.stepDefs;
import DGMARKT.pages.AddressBookPage;
import DGMARKT.pages.DashboardPage;
import DGMARKT.pages.MyAccountPage;
import DGMARKT.utilities.BrowserUtils;
import DGMARKT.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class adressBookDefs {

    DashboardPage dashboardPage= new DashboardPage();
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
        Assert.assertEquals("Add Address",title);

    }


}
