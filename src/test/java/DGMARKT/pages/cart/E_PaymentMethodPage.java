package DGMARKT.pages.cart;

import DGMARKT.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class E_PaymentMethodPage extends BasePage {

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement chkAgreeTerms;

    @FindBy(xpath = "//input[@id='button-payment-method']")
    public WebElement ContinueButton;


}
