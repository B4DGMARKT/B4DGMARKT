package DGMARKT.pages.cart;

import DGMARKT.pages.BasePage;
import DGMARKT.utilities.BrowserUtils;
import DGMARKT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class A_CartIconPage extends BasePage {
    // test case 1
    @FindBy(xpath = "//span[text()='Category']")
    public WebElement CategoryLink;

    @FindBy(xpath = "(//a[@class='a-mega-second-link'])[1]")
    public WebElement HealthBeautyCategory;

    @FindBy(xpath = "//a[text()='BaByliss 3663U - Hair rollers']")
    public WebElement product1;

    @FindBy(xpath = "(//a[@class='a-mega-second-link'])[1]")
    public WebElement Televisions;
    @FindBy(xpath = "//a[text()='Cello C1920FS 19\" LED-backlit LCD TV']")
    public WebElement product2;


    @FindBy(xpath = "//h1")
    public WebElement scroll;

    @FindBy(xpath= "//button[text()='Add to Cart']")
    public WebElement addToCartButton;

    @FindBy(xpath="//button[contains(@class,\"btn btn-inverse btn-block btn-lg dropdown-toggle\")]")
    public WebElement cartIcon;

    @FindBy(xpath = "//td[@class= 'text-left cart-info']/a")
    public WebElement productOnTheSide;
    @FindBy(xpath = "//strong[text()=' View Cart']")
    public WebElement  viewCartButton;

    @FindBy(xpath="//a[text()='Checkout']")
    public WebElement checkOutButton;

    public void  hoverTheMenu(String menuName) {
        WebElement menu = Driver.get().findElement(By.xpath("//span[text()='" + menuName + "']"));

        //WebElement menu = Driver.get().findElement(By.xpath("//a[@href='Camera']"));
           System.out.println(menu.getText());
        BrowserUtils.hover(menu);
    }
    public void  hoverTheSubMenu(String subMenuName) {
        WebElement subMenu = Driver.get().findElement(By.xpath("//a[text()='" + subMenuName + "']"));

        //WebElement menu = Driver.get().findElement(By.xpath("//a[@href='Camera']"));
        //System.out.println(subMenu.getText());
        BrowserUtils.hover(subMenu);
    }
    public void navigateToSubMenu(String SubMenuName) {
        WebElement subMenu = Driver.get().findElement(By.xpath("//span[text()='" + SubMenuName + "']"));
        BrowserUtils.clickWithJS(subMenu);

    }
    public void clickOnTheProduct(String productName) {
        WebElement product = Driver.get().findElement(By.xpath( "//a[text()=' " + productName + "']"));
        BrowserUtils.clickWithJS(product);
    }
}

