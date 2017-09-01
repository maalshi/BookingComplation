package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.basic.BasicTreeUI;

/**
 * Created by Maryia_Shynkarenka on 7/18/2017.
 */
public class TravelExtrasPage extends AbstractPage {

    //sections
    @FindBy(xpath = "//div[@id='lounge']")
    WebElement addLoungeSection;

    //lounge
    @FindBy(xpath = "//section[1]//ul//div//li[1]//button[@id='test_addProduct_0']")
    WebElement addLoungeOutbound1;

    @FindBy(xpath = "//section[1]//ul//div//li[2]//button[@id='test_addProduct_0']")
    WebElement addLoungeOutbound2;

    @FindBy(xpath = "//section[1]//a[@data-test-id='test_lounge_add_for_all']")
    WebElement linkAddForAllLoungeOutbound;

    @FindBy(xpath = "//section[2]//ul//div//li[1]//button[@id='test_addProduct_0']")
    WebElement addLoungeInbound1;

    @FindBy(xpath = "//section[2]//ul//div//li[2]//button[@id='test_addProduct_0']")
    WebElement addLoungeInbound2;

    @FindBy(xpath = "//section[2]//a[@data-test-id='test_lounge_add_for_all']")
    WebElement linkAddForAllLoungeInbound;

    @FindBy(xpath = "//button[@data-test-id='test_continue']")
    WebElement buttonContinue;

    public TravelExtrasPage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver,this);
    }

    public void clickContinue(){
        waitElement(buttonContinue);
        clickElement(buttonContinue);
    }
}
