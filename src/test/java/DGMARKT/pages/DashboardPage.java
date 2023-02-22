package DGMARKT.pages;

import DGMARKT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

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

    public void currencySelection(String currencyType){
        currencyMenu.click();
        WebElement currencyTypes = Driver.get().findElement(By.xpath("//button[text()='" + currencyType + "']"));
        currencyTypes.click();
    }

    public void productSelection(String productName){
        WebElement product = Driver.get().findElement(By.xpath("//a[text()='" + productName + "']"));
        product.click();
    }

    public String costAndCurrency(String price){
        return Driver.get().findElement(By.xpath("//span[text()='" + price + "']")).getText();
    }

}