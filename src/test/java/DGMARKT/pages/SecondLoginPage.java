package DGMARKT.pages;

import DGMARKT.utilities.BrowserUtils;
import DGMARKT.utilities.ConfigurationReader;
import DGMARKT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondLoginPage extends BasePage {

    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccount;


    @FindBy(id = "pt-login-link")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement usernameInputBox;

    @FindBy(id = "input-password")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//span[text() = 'Login']")
    public WebElement loginButton;

    //@FindBy(xpath = "//i[@class='fa fa-check-circle']/..")
    @FindBy(xpath = "//button[text()='×']")
    public WebElement successMessage;

    public void loginMain(){
        usernameInputBox.sendKeys(ConfigurationReader.get("mainusername"));
        BrowserUtils.waitFor(1);
        passwordInputBox.sendKeys(ConfigurationReader.get("mainpassword"));
        BrowserUtils.waitFor(1);
        loginButton.click();

    }


}
