package DGMARKT.pages;

import DGMARKT.utilities.BrowserUtils;
import DGMARKT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {

    @FindBy(id = "pt-login-link")
    public WebElement loginLink;
    @FindBy(xpath = "//a[text() = 'Logout']")
    public WebElement logoutLink;

    @FindBy(xpath = "//h2[text()='Account Logout']")
    public WebElement LogoutText;

    @FindBy(xpath = "(//span[text()='Continue'])[2]")
    public WebElement ContinueButton;

    public boolean loginLinkIsVisible(String Menu){
        Driver.get().findElement(By.xpath("//span[text()='" + Menu + "']")).click();
        BrowserUtils.waitFor(1);
        return loginLink.isDisplayed();
    }
}

