package DGMARKT.stepDefs;

import DGMARKT.pages.FirstLoginPage;
import DGMARKT.pages.SecondLoginPage;
import DGMARKT.utilities.BrowserUtils;
import DGMARKT.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    FirstLoginPage firstLoginPage = new FirstLoginPage();
    SecondLoginPage secondLoginPage = new SecondLoginPage();


    @Then("The user should be on the main page and can see the {string} text as title")
    public void the_user_should_be_on_the_main_page_and_can_see_the_text_as_title(String expectedTitle) {
        Assert.assertEquals(expectedTitle, Driver.get().getTitle());
    }

    @When("the user navigates to {string} module {string} tab")
    public void the_user_clicks_the_link_under_menu(String myAccountMenu, String loginLink) {
        secondLoginPage.navigatetoMyAccount(myAccountMenu, loginLink);
    }

    @When("The user enters the personal username and password")
    public void the_user_enters_the_personal_username_and_password() {
        secondLoginPage.loginMain();
    }

    @Then("The user should be on the dashboard page and can see the {string} success message")
    public void the_user_should_be_on_the_dashboard_page_and_can_see_the_success_message(String expectedSuccessMessage) {
        BrowserUtils.waitFor(1);
        Assert.assertEquals(expectedSuccessMessage, secondLoginPage.successMessage.getText());
    }

}
