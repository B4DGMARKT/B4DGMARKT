package DGMARKT.stepDefs.Cart;

import DGMARKT.pages.SecondLoginPage;
import DGMARKT.pages.cart.A_CartIconPage;
import DGMARKT.utilities.BrowserUtils;
import DGMARKT.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class A_CartIconStepDefs {
    SecondLoginPage secondLoginPage = new SecondLoginPage();
    A_CartIconPage aCartIconPage = new A_CartIconPage();

    @Given("The user navigates to {string} submenu from the {string} menu")
    public void theUserNavigatesToSubmenuFromTheMenu(String subMenu, String menu) {
        BrowserUtils.waitFor(3);
        aCartIconPage.hoverTheMenu(menu);
        BrowserUtils.waitFor(2);
        aCartIconPage.hoverTheSubMenu(subMenu);
        BrowserUtils.waitFor(2);
        aCartIconPage.navigateToSubMenu(subMenu);
        BrowserUtils.clickWithJS(aCartIconPage.HealthBeautyCategory);
    }

    @And("The user clicks on the first product")
    public void theUserClicksOnTheFirstProduct() {
        BrowserUtils.scrollToElement(aCartIconPage.scroll);
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(aCartIconPage.product1);
        //BrowserUtils.waitFor(2);
        //cartPage.product1.click();

    }

    @And("The user clicks on the Add to Cart button")
    public void theUserClicksOnTheAddToCartButton() {
        BrowserUtils.scrollToElement(aCartIconPage.scroll);
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(aCartIconPage.addToCartButton);
    }

    @And("The user clicks on the Cart icon")
    public void theUserClicksOnTheCartIcon() {
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(aCartIconPage.cartIcon);
    }
    @Then("The product {string} should be in the cart side bar")
    public void theProductShouldBeInTheCartSideBar(String productName) {
        BrowserUtils.waitFor(2);
        String actualProductSideBy = aCartIconPage.productOnTheSide.getText();
        Assert.assertEquals(productName, actualProductSideBy);
    }

    @And("The user clicks on the view cart button")
    public void theUserClicksOnTheViewCartButton() {
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(aCartIconPage.viewCartButton);
    }


    @Then("The product {string} should be in the cart list")
    public void theProductShouldBeInTheCartList(String productName) {
        BrowserUtils.scrollToElement(aCartIconPage.scroll);
        BrowserUtils.waitFor(2);
        String actualProduct = Driver.get().findElement(By.xpath("(//a[text()='BaByliss 3663U - Hair rollers'])[2]")).getText();
        Assert.assertEquals(productName, actualProduct);
    }

    @And("The user clicks the checkout button")
    public void theUserClicksTheCheckoutButton() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("window.scrollBy(0,200)", "");
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(aCartIconPage.checkOutButton);
    }


    @And("The user clicks on the {string}")
    public void theUserClicksOnThe(String productName) {
        BrowserUtils.scrollToElement(aCartIconPage.scroll);
        BrowserUtils.waitFor(2);
        aCartIconPage.clickOnTheProduct(productName);
    }
}
