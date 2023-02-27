package DGMARKT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordChangePage extends BasePage{



    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccount;

    @FindBy(xpath = "(//a[text()='My Account'])[1]")
    public WebElement myAccountSecond;

    @FindBy(xpath = "//a[text()='Password']")
    public WebElement passwordForChange;

    @FindBy(css = "#input-password")
    public WebElement inputPassword;

    @FindBy(css = "#input-confirm")
    public WebElement inputConfirm;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//div[text()=' Success: Your password has been successfully updated.']")
    public WebElement changePswrdVrfyMsg;

    @FindBy(xpath = "//div[text()='Password confirmation does not match password!']")
    public WebElement changePswrdErrorVrfyMsg;


}
