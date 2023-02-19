package DGMARKT.pages;

import DGMARKT.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstLoginPage extends BasePage {

    @FindBy(name = "email")
    public WebElement firstEmailInputBox;

    @FindBy(name = "password")
    public WebElement firstPasswordInputBox;

    @FindBy(name = "login")
    public WebElement firstLoginButton;

    @FindBy(xpath = "//input[@class='cbk_newsletter']")
    public WebElement popUp;

    @FindBy(xpath = "//a[text()='Close']")
    public WebElement closePopUp;

    public void firstLogin() {
        firstEmailInputBox.sendKeys(ConfigurationReader.get("firstemail"));
        firstPasswordInputBox.sendKeys(ConfigurationReader.get("firstpassword"));
        firstLoginButton.click();
        popUp.click();
        closePopUp.click();
    }
    public void loginPanelM(){


    }


}
