package DGMARKT.pages;

import DGMARKT.utilities.BrowserUtils;
import DGMARKT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Step 2: Billing Details ')]")
    public WebElement billingDetails;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement existingAddressForBilling;

    @FindBy(id = "button-payment-address")
    public WebElement continueBtnForBilling;

    @FindBy(xpath = "//a[contains(text(),'Step 3: Delivery Details ')]")
    public WebElement deliveryDetails;

    @FindBy(xpath = "(//input[@type='radio'])[3]")
    public WebElement existingAddressForDelivery;

    @FindBy(id = "button-shipping-address")
    public WebElement continueBtnForDeliveryDetails;

    @FindBy(xpath = "//a[contains(text(),'Step 4: Delivery Method ')]")
    public WebElement deliveryMethod;

    @FindBy(name = "shipping_method")
    public WebElement flatShipping;

    @FindBy(id = "button-shipping-method")
    public WebElement continueBtnForDeliveryMethod;

    @FindBy(xpath = "//a[contains(text(),'Step 5: Payment Method ')]")
    public WebElement paymentMethod;

    @FindBy(name = "payment_method")
    public WebElement cashOnDelivery;

    @FindBy(name = "agree")
    public WebElement termsAndConditions;

    @FindBy(id = "button-payment-method")
    public WebElement continueBtnForPaymentMethod;

    @FindBy(xpath = "//a[contains(text(),'Step 6: Confirm Order ')]")
    public WebElement confirmOrder;

    @FindBy(id = "button-confirm")
    public WebElement confirmButton;

    @FindBy(xpath = "//h1[text()='Your order has been placed!']")
    public WebElement placedOrderMessage;

    public void fillingCheckoutOptions(String billingDetails, String deliveryDetails, String deliveryMethod, String paymentMethod, String confirmOrder) {
        WebElement billingDetailsMenu = Driver.get().findElement(By.xpath("//a[contains(text(),'Step 2: " + billingDetails + " ')]"));
        billingDetailsMenu.click();
        billingDetailsMenu.click();
        existingAddressForBilling.click();
        continueBtnForBilling.click();
        WebElement deliveryDetailsMenu = Driver.get().findElement(By.xpath("//a[contains(text(),'Step 3: " + deliveryDetails + "')]"));
        deliveryDetailsMenu.click();
        deliveryDetailsMenu.click();
        existingAddressForDelivery.click();
        continueBtnForDeliveryDetails.click();
        WebElement deliveryMethodMenu = Driver.get().findElement(By.xpath("//a[contains(text(),'Step 4: " + deliveryMethod + "')]"));
        deliveryMethodMenu.click();
        deliveryMethodMenu.click();
        flatShipping.click();
        continueBtnForDeliveryMethod.click();
        WebElement paymentMethodMenu = Driver.get().findElement(By.xpath("//a[contains(text(),'Step 5: " + paymentMethod + "')]"));
        paymentMethodMenu.click();
        paymentMethodMenu.click();
        cashOnDelivery.click();
        termsAndConditions.click();
        continueBtnForPaymentMethod.click();
        WebElement confirmOrderMenu = Driver.get().findElement(By.xpath("//a[contains(text(),'Step 6: " + confirmOrder + "')]"));
        confirmOrderMenu.click();
        confirmOrderMenu.click();
        confirmButton.click();
    }

    public String orderSuccess() {
        return Driver.get().findElement(By.xpath("//h1[text()='Your order has been placed!']")).getText();
    }

}
