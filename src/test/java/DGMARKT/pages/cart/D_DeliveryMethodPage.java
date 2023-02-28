package DGMARKT.pages.cart;

import DGMARKT.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class D_DeliveryMethodPage extends BasePage {
    @FindBy(xpath = "//textarea[@name='comment']")
    public WebElement textArea;

    @FindBy(xpath = "//input[@id='button-shipping-method']")
    public WebElement continueButton;
}
