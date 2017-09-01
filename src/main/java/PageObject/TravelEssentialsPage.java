package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Maryia_Shynkarenka on 7/18/2017.
 */
public class TravelEssentialsPage extends AbstractPage {

    //Seats
    @FindBy(xpath = "//div[@data-test-id='test_seats']")
    WebElement sectionSeats;

    @FindBy(xpath = "//h3[@id='seats-descriptionTitle']")
    WebElement seatsTitleText;

    //Bags
    @FindBy(xpath = "//div[@data-test-id='test_bags']")
    WebElement sectionBags;
    //SH
    @FindBy(xpath = "//")
    WebElement bag0kg;

    @FindBy(xpath = "//ul//li[@data-test-id='bagList-button-index-0']//button")
    WebElement bag15kg;

    @FindBy(xpath = "//ul//li[@data-test-id='bagList-button-index-1']//button")
    WebElement bag20kg;

    @FindBy(xpath = "//ul//li[@data-test-id='bagList-button-index-2']//button")
    WebElement bag25kg;

    @FindBy(xpath = "//ul//li[@data-test-id='bagList-button-index-3']//button")
    WebElement bag40kg;

    @FindBy(xpath = "//ul//li//div[@data-test-id='bagOption-button-index-0']//button")
    WebElement bag1pieceSH;

    @FindBy(xpath = "//ul//li//div[@data-test-id='bagOption-button-index-0']//button")
    WebElement bag2pieceSH;

    @FindBy(xpath = "//ul//li//div[@data-test-id='bagOption-button-index-0']//button")
    WebElement bag3pieceSH;
    //LH
    @FindBy(xpath = "//")
    WebElement bag23kg;

    @FindBy(xpath = "//")
    WebElement bag46kg;

    @FindBy(xpath = "//")
    WebElement bag1pieceLH;

    @FindBy(xpath = "//")
    WebElement bag2pieceLH;

    //xpath for 1st pax: //ul//li[@data-test-id='bags-row-segment-0-pass-0']//div//ul//li[@data-test-id='bagList-button-index-2']//button - 20kg for 1pax
    //xpath for 2nd pax: //ul//li[@data-test-id='bags-row-segment-0-pass-1']//div//ul//li[@data-test-id='bagList-button-index-2']//button - 20kg for 2pax
    //etc



    //Sports
    @FindBy(xpath = "//div[@data-test-id='test_sports']")
    WebElement sectionSports;

    @FindBy(xpath = "//button[@data-test-id='test_continue_btn']")
    WebElement buttonContinue;

    @FindBy(xpath = "//button[@data-test-id='test_continue_without_bags_btn']")
    WebElement buttonWithoutBags;

    public TravelEssentialsPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver, this);
    }

    public void clickContinue(){
        waitElement(buttonContinue);
        clickElement(buttonContinue);
    }

    public void clickWithoutBags(){
        waitElement(buttonWithoutBags);
        clickElement(buttonWithoutBags);
    }
}
