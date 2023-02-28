package DGMARKT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    // test 2
    @FindBy(xpath = "//span[text()='Category']")
    public WebElement CategoryLink;

    @FindBy(xpath = "//span[text()='Health & Beauty']")
    public WebElement HealthBeautyCategory;

    @FindBy(xpath = "//a[text()='BaByliss 3663U - Hair rollers']")
    public WebElement product1;

    @FindBy(xpath= "//button[text()='Add to Cart']")
    public WebElement addToCartButton;
}

