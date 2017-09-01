package PageObject;

import businessobjects.PassengerDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Maryia_Shynkarenka on 7/18/2017.
 */
public class PaxInfoPage extends AbstractPage {
    @FindBy(xpath = "//option[text()='Mr']")
    WebElement titleMr;

    @FindBy(id = "test_adultFname-0-1")
    WebElement firstName;

    @FindBy(id = "test_adultLname-0-2")
    WebElement familyName;

    @FindBy(xpath = "//*[@id='test_email-3']")
    WebElement email;

    @FindBy(xpath = "//*[@id='test_confirmemail-6']")
    WebElement confirmEmail;

    @FindBy(xpath = "//*[@id='test_acode-4']")
    WebElement areaCode;

    @FindBy(xpath = "//*[@id='test_mobnumber-5']")
    WebElement localNumber;

    @FindBy(id = "test_continueTravelEsstl")
    WebElement continueButton;

    public PaxInfoPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver, this);
    }

    public void setPassengerDetails(PassengerDetails passengerDetails){
        waitElement (titleMr);
        clickElement(titleMr);
        firstName.sendKeys(passengerDetails.getFirstName());
        familyName.sendKeys(passengerDetails.getFamilyName());
        email.sendKeys(passengerDetails.getEmail());
        confirmEmail.sendKeys(passengerDetails.getEmail());
        areaCode.sendKeys(passengerDetails.getAreaCode());
        localNumber.sendKeys(passengerDetails.getLocalNumber());
    }

    public void clickContinue(){
        waitElement(continueButton);
        clickElement(continueButton);
    }
}



