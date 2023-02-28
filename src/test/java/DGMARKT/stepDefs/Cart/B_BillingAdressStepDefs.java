package DGMARKT.stepDefs.Cart;

import DGMARKT.pages.cart.B_BillingAddressPage;
import DGMARKT.utilities.BrowserUtils;
import io.cucumber.java.en.And;

public class B_BillingAdressStepDefs {
    B_BillingAddressPage b_billingAddressPage = new B_BillingAddressPage();
    public static String deliveryAddressfull;


    @And("The user clicks on the new billing address radio button")
    public void theUserClicksOnTheNewBillingAddressRadioButton() {
        b_billingAddressPage.newBillingRadioButton.click();
    }

    @And("the user fills in the {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void theUserFillsInThe(String firstname, String lastname, String company, String address_1, String address_2, String city, String postcode, String country, String region) {
        deliveryAddressfull = firstname + " " + lastname + ", " + address_1 + ", " + city + ", " + region + ", " + country;
        System.out.println(deliveryAddressfull);
        b_billingAddressPage.firstName.sendKeys(firstname);
        b_billingAddressPage.lastname.sendKeys(lastname);
        b_billingAddressPage.company.sendKeys(company);
        b_billingAddressPage.address_1.sendKeys(address_1);
        b_billingAddressPage.address_2.sendKeys(address_2);
        b_billingAddressPage.city.sendKeys(city);
        b_billingAddressPage.postcode.sendKeys(postcode);

        b_billingAddressPage.country.selectByVisibleText(country);
        BrowserUtils.waitFor(3);
        b_billingAddressPage.region.selectByVisibleText(region);

    }

    @And("The user clicks on the continue button and goes to delivery options")
    public void theUserClicksOnTheContinueButtonAndGoesToDeliveryOptions() {
        b_billingAddressPage.gotoDeliveryDetails.click();
    }
}
