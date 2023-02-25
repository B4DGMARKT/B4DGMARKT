package DGMARKT.pages;

import DGMARKT.utilities.BrowserUtils;
import DGMARKT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//span[text()='Currency']")
    public WebElement currencyMenu;

    @FindBy(xpath = "//button[text()='€ Euro']")
    public WebElement currencyEuro;

    @FindBy(xpath = "//button[text()='£ Pound Sterling']")
    public WebElement currencyPound;

    @FindBy(xpath = "//button[text()='$ US Dollar']")
    public WebElement currencyDollar;

    @FindBy(xpath = "//a[text()='Nicky Clarke NGP201 Hair Dryer Set']")
    public WebElement selectedProduct;

    @FindBy(xpath = "//span[text()='$467.00']")
    public WebElement productCost;

    @FindBy(id = "button-cart")
    public WebElement addToCartButton;

    @FindBy(className = "alert alert-fix alert-success alert-dismissible")
    public WebElement addedMessage;

    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    public WebElement cartIcon;

    @FindBy(xpath = "//strong[text()=' Checkout']")
    public WebElement checkoutBtn;

    @FindBy(xpath = "//div[@class='dropdown-toggle search-button']")
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@id='text-search']")
    public WebElement searchFunctionField;

    @FindBy(xpath = "//button[@id='btn-search-category']")
    public WebElement searchButtoninSearch;
    @FindBy(xpath = "(//*[@id=\"content\"]/div[3]/div[1])/div/div/div/div/a/img")
    public WebElement firstProductinSearch;

    @FindBy(xpath = "//p[contains(text(),'There is no product that matches the search criter')]")
    public WebElement noProductText;

    @FindBy(xpath = "//span[.='My Account']")
    public WebElement myAccountMenu;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right pt-account']//a[normalize-space()='My Account']")
    public WebElement sectionMyAccount;


    public void currencySelection(String currencyType) {
        BrowserUtils.clickWithJS(currencyMenu);
        WebElement currencyTypes = Driver.get().findElement(By.xpath("//button[text()='" + currencyType + "']"));
        currencyTypes.click();
    }

    public void productSelection(String productName) {
        Driver.get().navigate().refresh();
        WebElement product = Driver.get().findElement(By.xpath("//a[text()='" + productName + "']"));
        BrowserUtils.clickWithJS(product);
    }

    public String costAndCurrency(String price) {
        return Driver.get().findElement(By.xpath("//span[text()='" + price + "']")).getText();
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public String addedMessage() {
        BrowserUtils.waitFor(2);
        return Driver.get().findElement(By.xpath("//a[text()='shopping cart']")).getText();
    }

    public void checkoutMenu(String checkout) {
        cartIcon.click();
        WebElement checkoutButton = Driver.get().findElement(By.xpath("//strong[text()='" + checkout + "']"));
        checkoutButton.click();
    }


    public void searchIcon(){
        searchIcon.click();
    }

    public void myAccountMenu(){
        myAccountMenu.click();
        sectionMyAccount.click();
    }

}