package DGMARKT.stepDefs;


import DGMARKT.pages.DashboardPage;
import DGMARKT.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class searchIconDefs {

    String writtenCharacter;
    DashboardPage dashboardPage = new DashboardPage();

    @Given("The user should be in homepage")
    public void theUserShouldBeInHomepage() {

    }

    @When("The user clicks search icon button on home page")
    public void the_user_clicks_search_icon_button_on_home_page() {
        dashboardPage.searchIcon();
    }

    @Then("The user should be able to see search line on top of page with written ‘Search entire store here..’")
    public void the_user_should_be_able_to_see_search_line_on_top_of_page_with_written_search_entire_store_here() {
        Assert.assertEquals("Search entire store here ...", dashboardPage.searchFunctionField.getAttribute("placeholder"));
    }
    @And("The user types some {string} in search field")
    public void theUserTypesSomeInSearchField(String arg0) {
        WebElement seachField = dashboardPage.searchFunctionField;

        writtenCharacter = arg0;
        seachField.click();
        seachField.sendKeys(arg0);
        dashboardPage.searchButtoninSearch.click();
    }


    @Then("The user should be able to see the titles of the searched product as a result")
    public void the_user_should_be_able_to_see_the_titles_of_the_searched_product_as_a_result() {
        String productTitle = dashboardPage.firstProductinSearch.getAttribute("title").toLowerCase();
        Assert.assertTrue("Contains written character", productTitle.contains(writtenCharacter));

    }


    @Then("The user should be able to see search line on top of page with written {string}")
    public void theUserShouldBeAbleToSeeSearchLineOnTopOfPageWithWritten(String text) {
        String title = dashboardPage.noProductText.getText();
        Assert.assertEquals(text,title);

    }




}





