package DGMARKT.stepDefs.Cart;

import DGMARKT.pages.cart.D_DeliveryMethodPage;
import DGMARKT.utilities.BrowserUtils;
import io.cucumber.java.en.Given;

public class D_DeliveryMethodStepDefs {
    D_DeliveryMethodPage d_deliveryMethodPage = new D_DeliveryMethodPage();

    @Given("The user inputs {string} into the comment textarea")
    public void the_user_inputs_into_the_comment_textarea(String comment) {
       d_deliveryMethodPage.textArea.sendKeys(comment);
       BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(d_deliveryMethodPage.continueButton);
    }
}
