package DGMARKT.stepDefs.Cart;

import DGMARKT.pages.cart.C_DeliveryDetailsPage;
import DGMARKT.utilities.BrowserUtils;
import io.cucumber.java.en.And;

public class C_DeliveryDetailsStepDefs {

    C_DeliveryDetailsPage deliveryDetailsPage = new C_DeliveryDetailsPage();

    @And("The user selects the I want to use an existing address radio button")
    public void theUserSelectsTheIWantToUseAnExistingAddressRadioButton() {
        BrowserUtils.clickWithJS(deliveryDetailsPage.existingBillingRadioButton);
        deliveryDetailsPage.deliveryAddress.selectByVisibleText("Fevzi Altun, address 1, city, Colorado, United States");
        BrowserUtils.clickWithJS(deliveryDetailsPage.gotoDeliveryMethod);
    }
}
