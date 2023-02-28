package DGMARKT.pages.cart;

import DGMARKT.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class F_ConfirmOrderPage extends BasePage {

    @FindBy(xpath = "(//a[text()='BaByliss 3663U - Hair rollers'])[2]")
    public WebElement productName;
    @FindBy(xpath = "//h1[text()='Your order has been placed!']")
    public WebElement confirmationMessage;

    @FindBy(xpath = "//input[@value='Confirm Order']")
    public  WebElement ConfirmButton;

    @FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
    public  WebElement CartIsEmptyMessage;

}
