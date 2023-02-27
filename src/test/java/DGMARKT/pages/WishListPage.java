package DGMARKT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage{


@FindBy(xpath = "//a[@id='wishlist-total']")
public WebElement wishListIcon;

@FindBy(xpath = "//p[normalize-space()='Your wish list is empty.']")
    public WebElement yourWishListIsEmptyText;



}
