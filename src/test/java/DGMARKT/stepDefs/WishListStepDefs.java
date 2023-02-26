package DGMARKT.stepDefs;

import DGMARKT.pages.BasePage;
import DGMARKT.pages.WishListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WishListStepDefs extends BasePage {

WishListPage wishListPage = new WishListPage();

    @When("The user clicks on the {string} icon on the homepage")
    public void the_user_clicks_on_the_icon_on_the_homepage(String wishListIcon) {
wishListPage.wishListIcon.click();

    }
    @Then("The user should be able to see {string} text")
    public void the_user_should_be_able_to_see_text(String yourWishListIsEmptyText) {
        String expectedText = wishListPage.yourWishListIsEmptyText.getText();
        String actualText = "Your wish list is empty.";
        Assert.assertEquals(expectedText, actualText);
    }

}
