package DGMARKT.stepDefs;

import DGMARKT.pages.DashboardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CurrencyStepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    @Given("The user should be logged and on the dashboard page")
    public void the_user_should_be_logged_and_on_the_dashboard_page() {

    }
    @When("The user changes the {string}")
    public void the_user_changes_the(String currencyType) {
        dashboardPage.currencySelection(currencyType);
    }
    @Then("The user selects the {string} product")
    public void the_user_selects_the_product(String product) {
        dashboardPage.productSelection(product);
    }
    @Then("The user should be able to see the same {string} on the product")
    public void the_user_should_be_able_to_see_the_same_on_the_product(String expectedPrice) {
        Assert.assertEquals(expectedPrice, dashboardPage.costAndCurrency(expectedPrice));
    }




}
