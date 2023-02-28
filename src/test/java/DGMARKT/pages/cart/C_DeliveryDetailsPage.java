package DGMARKT.pages.cart;

import DGMARKT.pages.BasePage;
import DGMARKT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class C_DeliveryDetailsPage extends BasePage {

    @FindBy(xpath = "//input[@name='shipping_address' and @type='radio' and @value='existing']")
    public WebElement existingBillingRadioButton;

    public Select deliveryAddress = new Select(Driver.get().findElement(By.xpath("(//select[@name='address_id'])[2]")));

    @FindBy(xpath = "//input[(@id='button-shipping-address')]")
    public WebElement gotoDeliveryMethod;


}
