package DGMARKT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    // test 2
    @FindBy(xpath = "//span[text()='Category']")
    WebElement CategoryLınk;

    @FindBy(xpath = "//span[text()='Health & Beauty']")
    WebElement HealthBeautyCategory;

    @FindBy(xpath = "//a[text()='BaByliss 3663U - Hair rollers']")
    WebElement product1;

    @FindBy(xpath= "//button[text()='Add to Cart']")
    WebElement addToCartButton;
}
