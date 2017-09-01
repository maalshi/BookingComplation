package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Maryia_Shynkarenka on 7/18/2017.
 */
public class ConfirmationPage extends AbstractPage {

    @FindBy (xpath = "//span[@data-test-id='test_confirmation_header_make']")
    WebElement bookingHeader;

    @FindBy (xpath = "//span[@data-test-id='test_pnr']")
    WebElement bookingReference;

    @FindBy (xpath = "//a[text()='Manage My Account']")
    WebElement linkMMB;

    @FindBy (xpath = "//div[@data-test-id='total']")
    WebElement total;

    public ConfirmationPage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver,this);
    }

    public void takePNR(){
        waitElement(bookingReference);
        System.out.println(bookingReference.getText() + " Blare");
    }
}
