package PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Maryia_Shynkarenka on 7/17/2017.
 */
public abstract class AbstractPage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private static Logger LOGGER = Logger.getLogger(AbstractPage.class);

    public void waitElement(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickElement(WebElement element){
        element.click();
        LOGGER.info(element + " has been clicked");
    }

    public void sendKeysElement(WebElement element, String value){
        element.sendKeys(value);
        LOGGER.info(element + " has been clicked");
    }
}
