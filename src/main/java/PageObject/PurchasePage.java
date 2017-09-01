package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Maryia_Shynkarenka on 7/18/2017.
 */
public class PurchasePage extends AbstractPage {

    @FindBy(xpath = "//select[@data-test-id='test_cardType']//option[@value='1']")
    WebElement cardType;

    @FindBy(xpath = "//input[@data-test-id='test_cardNumber']")
    WebElement fieldCardNumber;

    @FindBy(xpath = "//select[@data-test-id='test_expiryMonth']//option[@value='11']")
    WebElement expiryMonth;

    @FindBy(xpath = "//select[@data-test-id='test_expiryYear']//option[@value='0']")
    WebElement expiryYear;

    @FindBy(xpath = "//input[@data-test-id='test_cvvNumber']")
    WebElement fieldCVVNumber;

    @FindBy(xpath = "//input[@data-test-id='test_fname']")
    WebElement fieldFirstName;

    @FindBy(xpath = "//input[@data-test-id='test_lname']")
    WebElement fieldFamilyName;

    @FindBy(xpath = "//input[@data-test-id='test_addLineOne']")
    WebElement fieldAddressLine1;

    @FindBy(xpath = "//input[@data-test-id='test_addLineTwo']")
    WebElement fieldAddressLine2;

    @FindBy(xpath = "//input[@data-test-id='test_cityName']")
    WebElement fieldCity;

    @FindBy(xpath = "//input[@data-test-id='test_postalCode']")
    WebElement fieldPostalCode;

    @FindBy(xpath = "//input[@data-test-id='test_stateName']")
    WebElement fieldState;

    @FindBy(xpath = "//select[@data-test-id='test_countryName']//option[@value='1']")
    WebElement country;

    public PurchasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,20);
        PageFactory.initElements(driver, this);
    }

    public void fillInCardDetails(PurchasePage purchasePage){
        waitElement(fieldCardNumber);
        clickElement(cardType);
    }

    public void selectCardType(){
        waitElement(fieldCardNumber);
        clickElement(cardType);
    }

    public void sendKeysCardNumber(String cardNumber){
        fieldCardNumber.sendKeys(cardNumber);
    }

    public void selectExpiryMonth() {
        clickElement(expiryMonth);
    }

    public void selectExpiryYear() {
        clickElement(expiryYear);
    }

    public void sendKeysCVVNumber(String cvvNumber){
        fieldCVVNumber.sendKeys(cvvNumber);
    }

    public void sendKeysFirstName(String firstName){
        fieldFirstName.sendKeys(firstName);
    }

    public void sendKeysFamilyName(String familyName){
        fieldFamilyName.sendKeys(familyName);
    }

    public void sendKeysAddressLine1(String addressLine1){
        fieldAddressLine1.sendKeys(addressLine1);
    }

    public void sendKeysAddressLine2(String addressLine2){
        fieldAddressLine2.sendKeys(addressLine2);
    }

    public void sendKeysCity(String city){
        fieldCity.sendKeys(city);
    }

    public void sendKeysPostalCode(String postalCode){
        fieldPostalCode.sendKeys(postalCode);
    }

    public void sendKeysState(String state){
        fieldState.sendKeys(state);
    }

    public void selectCountry() {
        clickElement(country);
    }
}
