package DGMARKT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookPage extends BasePage {

    @FindBy(xpath = "//a[.='New Address']")
    public WebElement newAddress;
    @FindBy(xpath = "//h2[.='Add Address']")
    public WebElement newAddressTitle;
}
