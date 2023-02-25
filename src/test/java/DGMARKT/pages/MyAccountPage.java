package DGMARKT.pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
    @FindBy(css = "a:nth-of-type(4)")
    public WebElement addressBookButton;
}
