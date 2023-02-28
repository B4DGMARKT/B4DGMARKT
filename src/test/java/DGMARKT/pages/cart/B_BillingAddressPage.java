package DGMARKT.pages.cart;

import DGMARKT.pages.BasePage;
import DGMARKT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class B_BillingAddressPage extends BasePage {


    @FindBy(xpath = "//input[@value='new' and @type='radio']")
    public WebElement newBillingRadioButton;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastname;

    @FindBy(xpath = "//input[@name='company']")
    public WebElement company;

    @FindBy(xpath = "//input[@name='address_1']")
    public WebElement address_1;

    @FindBy(xpath = "//input[@name='address_2']")
    public WebElement address_2;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@name='postcode']")
    public WebElement postcode;
    public Select country = new Select(Driver.get().findElement(By.xpath("//select[@id='input-payment-country']")));

    //@FindBy(xpath = "//select[@id='input-payment-country']")
    // public  WebElement country;
    public Select region = new Select(Driver.get().findElement(By.xpath("//select[@id='input-payment-zone']")));

    // @FindBy(xpath = "//select[@id='input-payment-zone']")
    // public  WebElement region;

    @FindBy(xpath = "//input[(@id='button-payment-address')]")
    public WebElement gotoDeliveryDetails;

    public Select billingAddress = new Select(Driver.get().findElement(By.xpath("(//select[@name='address_id'])[1]")));

    @FindBy(xpath = "//input[@id='button-shipping-address']")
    public WebElement continueButton;

    public  String deliveryAddressFull = firstName.getText() + " " + lastname.getText() +
            ", " + address_1.getText() + ", " + city.getText() + ", " +
            region.getFirstSelectedOption().getText() + ", " +
            country.getFirstSelectedOption().getText();


}
