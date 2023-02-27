package DGMARKT.stepDefs;

import DGMARKT.pages.CartPage;
import DGMARKT.pages.SecondLoginPage;
import DGMARKT.utilities.BrowserUtils;
import io.cucumber.java.en.Given;

public class cartStepDefs {
    SecondLoginPage secondLoginPage = new SecondLoginPage();
    CartPage cartPage = new CartPage();

    @Given("The user navigates to {string} section from the {string} menu")
    public void the_user_navigates_to_section_from_the_menu(String string, String string2) {
        cartPage.CategoryLink.click();
        BrowserUtils.waitFor(1);
        cartPage.HealthBeautyCategory.click();
    }

    @Given("The user clicks on the product {string}")
    public void the_user_clicks_on_the_product(String string) {
        cartPage.product1.click();

    }

    @Given("The user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String string) {
        BrowserUtils.waitFor(2);
        cartPage.product1.click();
    }
}
