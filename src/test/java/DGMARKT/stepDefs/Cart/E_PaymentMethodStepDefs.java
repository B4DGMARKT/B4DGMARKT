package DGMARKT.stepDefs.Cart;

import DGMARKT.pages.cart.E_PaymentMethodPage;
import DGMARKT.utilities.BrowserUtils;
import DGMARKT.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;

public class E_PaymentMethodStepDefs {
    E_PaymentMethodPage e_paymentMethodPage = new E_PaymentMethodPage();

    @Given("The User agrees the terms and conditions by selecting the checkbox")
    public void the_user_agrees_the_terms_and_conditions_by_selecting_the_checkbox() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("window.scrollBy(0,-300)", "");
        BrowserUtils.waitForClickablility(e_paymentMethodPage.chkAgreeTerms,5);
        //BrowserUtils.scrollToElement(e_paymentMethodPage.chkAgreeTerms);
        BrowserUtils.selectCheckBox(e_paymentMethodPage.chkAgreeTerms, true);
        BrowserUtils.waitFor(2);
    }
    @Given("the user clicks the continue button and goes to the confirmation section")
    public void the_user_clicks_the_continue_button_and_goes_to_the_confirmation_section() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("window.scrollBy(0,-300)", "");
        BrowserUtils.clickWithJS(e_paymentMethodPage.ContinueButton);
    }
}
