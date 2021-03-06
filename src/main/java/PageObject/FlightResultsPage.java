package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Maryia_Shynkarenka on 7/17/2017.
 */
public class FlightResultsPage extends AbstractPage {
    @FindBy(xpath = "//button[@data-test-id='test_continue_btn']")
    WebElement buttonContinue;

    public FlightResultsPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 20);
        PageFactory.initElements(this.driver, this);
    }

    public void clickContinue(){
        waitElement(buttonContinue);
        clickElement(buttonContinue);
    }
}
