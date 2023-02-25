package DGMARKT.stepDefs;

import DGMARKT.pages.CheckoutPage;
import DGMARKT.pages.DashboardPage;
import DGMARKT.pages.SecondLoginPage;
import DGMARKT.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CurrencyStepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    SecondLoginPage secondLoginPage = new SecondLoginPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("The user navigates to {string} module {string} tab  and user should be logged and on the dashboard page")
    public void theUserNavigatesToModuleTabAndUserShouldBeLoggedAndOnTheDashboardPage(String module, String tab) {
//        secondLoginPage.navigatetoMyAccount(module, tab);
//        BrowserUtils.waitFor(1);
//        secondLoginPage.loginMain();
    }

    @When("The user changes the {string}")
    public void the_user_changes_the(String currencyType) {
        dashboardPage.currencySelection(currencyType);
    }

    @And("The user selects the {string} product")
    public void the_user_selects_the_product(String product) {
        dashboardPage.productSelection(product);
    }

    @Then("The user should be able to see the same {string} on the product")
    public void the_user_should_be_able_to_see_the_same_on_the_product(String expectedPrice) {
        Assert.assertEquals(expectedPrice, dashboardPage.costAndCurrency(expectedPrice));
    }


    @And("The user adds to cart the selected product")
    public void theUserAddsToCartTheSelectedProduct() {
        dashboardPage.addToCart();
    }

    @Then("The user should be able to see the {string} message")
    public void theUserShouldBeAbleToSeeTheMessage(String expectedAddedMessage) {
        Assert.assertEquals(expectedAddedMessage, dashboardPage.addedMessage());
    }

    @When("The user navigates to the {string} menu")
    public void theUserNavigatesToTheMenu(String checkout) {
        dashboardPage.checkoutMenu(checkout);
    }

    @And("The user fills the {string}, {string}, {string}, {string}, {string}")
    public void theUserFillsThe(String billingDetails, String deliveryDetails, String deliveryMethod, String paymentMethod, String confirmOrder) {
        checkoutPage.fillingCheckoutOptions(billingDetails, deliveryDetails, deliveryMethod, paymentMethod, confirmOrder);
    }

    @Then("The user should be able to see the {string} successfully ordered message")
    public void theUserShouldBeAbleToSeeTheSuccessfullyOrderedMessage(String expectedOrderedMessage) {
        Assert.assertEquals(expectedOrderedMessage, checkoutPage.orderSuccess());
    }


}
