package DGMARKT.stepDefs.Cart;

import DGMARKT.pages.cart.F_ConfirmOrderPage;
import DGMARKT.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class F_ConfirmOrderStepDefs {
F_ConfirmOrderPage f_confirmOrderPage = new F_ConfirmOrderPage();
    @Given("The user clicks the confirm order button")
    public void the_user_clicks_the_confirm_order_button() {
        BrowserUtils.waitFor(2);
        Assert.assertEquals("BaByliss 3663U - Hair rollers",f_confirmOrderPage.productName.getText());
        BrowserUtils.clickWithJS(f_confirmOrderPage.ConfirmButton);
    }
    @Then("The text {string} should be displayed")
    public void the_text_should_be_displayed(String confirmMessage) {
        BrowserUtils.waitFor(2);
        Assert.assertEquals(confirmMessage.trim(), f_confirmOrderPage.confirmationMessage.getText().trim());
    }
}
