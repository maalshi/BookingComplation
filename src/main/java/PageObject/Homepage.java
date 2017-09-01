package PageObject;

import businessobjects.Route;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Homepage extends AbstractPage {

    @FindBy (xpath = "//input[@id='origin']")
    WebElement originField;

    @FindBy (xpath = "//a[@data-test-id='test_booker_list_of_cities']")
    WebElement suggestion;

    @FindBy (xpath = "//input[@id='dest']")
    WebElement destinationField;

    @FindBy (xpath = "//[@id='passengersCount']")
    WebElement numberOfPax;

    @FindBy (xpath = "//li[@data-test-id='test_passengers_adult_item'][3]")
    WebElement numberOfPax2;

    @FindBy (xpath = "//button[@data-test-id='test_booker_search']")
    WebElement buttonFindFlights;

    public Homepage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void setRoute(Route route){
        waitElement(originField);
        clickElement(originField);
        originField.clear();
        originField.sendKeys(route.getOrigin());
        suggestion.click();
        waitElement(destinationField);
        destinationField.sendKeys(route.getDestination());
        suggestion.click();
    }

    public void clickFindFlights (){
        waitElement(buttonFindFlights);
        clickElement(buttonFindFlights);
    }
}
