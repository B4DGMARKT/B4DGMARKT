package DGMARKT.stepDefs;


import DGMARKT.pages.LogoutPage;
import DGMARKT.pages.SecondLoginPage;
import DGMARKT.utilities.BrowserUtils;
import DGMARKT.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;



public class LogoutStepDefs {
     SecondLoginPage secondLoginPage = new SecondLoginPage();
     LogoutPage logoutPage = new LogoutPage();

    /* the followıng pre steps are in logınStepDefs

      Then The user should be on the main page and can see the "Your Store" text as title
      And the user navigates to "My Account" module "Login" tab
      And The user enters the personal username and password
     */
    @Then("The user can see the {string} success message")
    public void the_user_can_see_the_success_message(String expectedSuccessMessage) {
        BrowserUtils.waitFor(1);
        Assert.assertEquals(expectedSuccessMessage, secondLoginPage.successMessage.getText());
        secondLoginPage.successMessage.click();
        BrowserUtils.waitFor(2);
    }

    @When("The user navigates to {string} module {string} tab")
    public void the_user_navigates_to_module_tab(String myAccountMenu, String LogoutLink) {
        BrowserUtils.waitFor(2);
        Driver.get().findElement(By.xpath("//span[text()='" + myAccountMenu + "']")).click();
        BrowserUtils.waitFor(2);
        Driver.get().findElement(By.xpath("//a[text()='" + LogoutLink + "']")).click();
        BrowserUtils.waitFor(2);
        //secondLoginPage.navigatetoMyAccount(myAccountMenu, LogoutLink);

    }

    @Then("The user can see the {string} link under the {string} menu")
    public void the_user_can_see_the_link_under_the_menu(String loginLink, String myAccountMenu) {
        // BrowserUtils.waitFor(2);
        //  Driver.get().findElement(By.xpath("//span[text()='" + myAccountMenu + "']")).click();
        BrowserUtils.waitFor(3);
    }

    @When("The user navigates to back in the browser")
    public void the_user_navigates_to_back_in_the_browser() {
       Driver.get().navigate().back();
    }
}
