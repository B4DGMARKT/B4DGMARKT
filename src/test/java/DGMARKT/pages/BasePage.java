package DGMARKT.pages;

import DGMARKT.utilities.BrowserUtils;
import DGMARKT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {

        PageFactory.initElements(Driver.get(), this);

    }
        public void navigatetoMyAccount(String module, String tab) {
            BrowserUtils.waitFor(2);
            Driver.get().findElement(By.xpath("//span[text()='" + module + "']")).click();
            BrowserUtils.waitFor(2);
            Driver.get().findElement(By.xpath("//*[text()='" + tab + "']")).click();
            BrowserUtils.waitFor(1);

    }







}
