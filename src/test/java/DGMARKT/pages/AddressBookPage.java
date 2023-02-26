package DGMARKT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddressBookPage extends BasePage {

    @FindBy(xpath = "//a[.='New Address']")
    public WebElement newAddress;
    @FindBy(xpath = "//h2[.='Add Address']")
    public WebElement newAddressTitle;
    @FindBy(xpath = "//input[@id='input-firstname']")
    public WebElement firstNameField;
    @FindBy(xpath = "//input[@id='input-lastname']")
    public WebElement lastNameField;
    @FindBy(xpath = "//input[@id='input-company']")
    public WebElement companyField;
    @FindBy(xpath = "//fieldset[1]/div[4]//input[@class='form-control']")
    public WebElement adress1Field;
    @FindBy(xpath = "//fieldset[1]/div[5]//input[@class='form-control']")
    public WebElement adress2Field;
    @FindBy(xpath = "//input[@id='input-city']")
    public WebElement cityField;
    @FindBy(xpath = "//input[@id='input-postcode']")
    public WebElement postCodeField;
    @FindBy(xpath = "//select[@id='input-country']")
    public WebElement countrySection;
    @FindBy(xpath = "//select[@id='input-zone']")
    public WebElement regionSection;
    @FindBy(xpath = "//input[@class='btn btn-primary']")
    public WebElement continueButton;
    @FindBy(xpath = "//*[text()=\" Your address has been successfully added\"]")
    public WebElement adressAddedTitle;
    @FindBy(xpath = "//div[@class='text-danger']")
    public WebElement addressWarningMessage;

    public void firstNameField(String text){
        firstNameField.sendKeys(text);
    }
    public void lastNameField(String text){
        lastNameField.sendKeys(text);
    }
    public void companyField(String text){
        companyField.sendKeys(text);
    }
    public void adressfield(String text){
        adress1Field.sendKeys(text);
    }
    public void adress2field(String text){
        adress2Field.sendKeys(text);
    }
    public void cityfield(String text){
        cityField.sendKeys(text);
    }
    public void postCodeField(String text){
        postCodeField.sendKeys(text);
    }

    public void countrySection(String text){
        Select select = new Select(countrySection);
        select.selectByVisibleText(text);
    }
    public void regionSection(String text){
        Select select = new Select(regionSection);
        select.selectByVisibleText(text);
    }





}
