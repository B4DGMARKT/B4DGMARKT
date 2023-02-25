package DGMARKT.stepDefs;

import DGMARKT.pages.DashboardPage;
import DGMARKT.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class searchIconDefs {

    String writtenCharacter  ;
    DashboardPage dashboardPage = new DashboardPage();
    @When("The user clicks search icon button on home page")
    public void the_user_clicks_search_icon_button_on_home_page() {
       dashboardPage.searchIcon();
    }
    @Then("The user should be able to see search line on top of page with written ‘Search entire store here..’")
    public void the_user_should_be_able_to_see_search_line_on_top_of_page_with_written_search_entire_store_here() {
       Assert.assertEquals("Search entire store here ...",dashboardPage.searchFunctionField.getText());
    }
    @And("The user types some {string} in the product titles are written")
    public void the_user_types_some_in_the_product_titles_are_written(String character) {

        WebElement seachField = dashboardPage.searchFunctionField;

        writtenCharacter = character;
        seachField.click();
        seachField.sendKeys(character);
        Driver.get().findElement(By.id("//button[@id='btn-search-category']")).click();

    }
    @Then("The user should be able to see the titles of the searched product as a result")
    public void the_user_should_be_able_to_see_the_titles_of_the_searched_product_as_a_result() {
        String productTitle = Driver.get().findElement(By.id("//ul[@class='ajax-result-list']/./li/div/div/a/div")).getText();

        Assert.assertTrue("Contains written character",productTitle.contains(writtenCharacter));

    }
}
