package DGMARKT.pages;

import DGMARKT.utilities.BrowserUtils;
import DGMARKT.utilities.ConfigurationReader;
import DGMARKT.utilities.Driver;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditPage extends BasePage{
    @FindBy(xpath = "//a[.='My Account']")
    public WebElement myAccountBtn;

    @FindBy(xpath = "//a[.='Edit Account']")
    public WebElement editAccountBtn;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueBtnEditInfo;

    @FindBy(css = ".alert.alert-success.alert-dismissible")
    public WebElement successAlert;

    @FindBy(xpath = "//div[@class='text-danger']")
    public WebElement errorMessage;

    Faker faker = new Faker();
    String newFirstName;
    String newLastName;
    String newEmail;
    String newTelephone;

    public void editFirstName(String firstNameField) {
        WebElement infoField = Driver.get().findElement(By.name(firstNameField));
        infoField.clear();
        newFirstName = faker.name().firstName();
        infoField.sendKeys(newFirstName);
        System.out.println("newFirstName = " + newFirstName);
        BrowserUtils.waitFor(2);

    }

    public void editLastName(String lastNameField) {
        WebElement infoField = Driver.get().findElement(By.name(lastNameField));
        infoField.clear();
        newLastName = faker.name().lastName();
        infoField.sendKeys(newLastName);
        System.out.println("newLastName = " + newLastName);
        BrowserUtils.waitFor(2);

    }

    public void editEmail(String emailField) {
        WebElement infoField = Driver.get().findElement(By.name(emailField));
        infoField.clear();
        newEmail = faker.internet().emailAddress();
        infoField.sendKeys(newEmail);
        ConfigurationReader.set("userEmailForEdit", newEmail);
        System.out.println("newEmail = " + newEmail);
        BrowserUtils.waitFor(2);

    }

    public void editTelephone(String telephoneField) {
        WebElement infoField = Driver.get().findElement(By.name(telephoneField));
        infoField.clear();
        newTelephone = faker.phoneNumber().phoneNumber();
        infoField.sendKeys(newTelephone);
        System.out.println("newTelephone = " + newTelephone);
        BrowserUtils.waitFor(2);

    }

    public void editInformation(String info, String field) {
        WebElement infoField = Driver.get().findElement(By.name(field));
        infoField.clear();
        infoField.sendKeys(info);
        BrowserUtils.waitFor(2);
    }

    public void loginforEdit(String email,String password){
        navigatetoMyAccountDropdownMenu("My Account", "Login");
        loginEmail.sendKeys(ConfigurationReader.get(email));
        BrowserUtils.waitFor(1);
        loginPassword.sendKeys(ConfigurationReader.get(password));
        BrowserUtils.waitFor(1);
        loginButton.click();
    }

    public void verifyErrorMessageForEdit() {
        WebElement email = Driver.get().findElement(By.xpath("//input[@type='email']"));
               boolean control = email.getAttribute("validationMessage").equals("Please include an '@' in the email address. 'hal1gmail.com' is missing an '@'.");
        if (control) {
            Assert.assertTrue(control);
        } else {
            Assert.assertTrue(errorMessage.isDisplayed());
        }

    }
}
