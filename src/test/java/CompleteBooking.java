import PageObject.*;
import businessobjects.Constants;
import businessobjects.PassengerDetails;
import businessobjects.Route;
import org.testng.annotations.Test;

/**
 * Created by Maryia_Shynkarenka on 7/17/2017.
 */
public class CompleteBooking extends BaseTest {

    @Test
    public void bookingCompletion() {
        driver.get("https://www-deva2.aerlingus.com/html/en-US/home.html");
        Homepage homepage = new Homepage(driver);
        homepage.setRoute(new Route(Constants.ORIGIN, Constants.DESTINATION));
        homepage.clickFindFlights();

        FlightResultsPage results = new FlightResultsPage(driver);
        results.clickContinue();

        PaxInfoPage pax = new PaxInfoPage(driver);
        pax.setPassengerDetails(new PassengerDetails(Constants.NAME, Constants.SURNAME, Constants.EMAIL, Constants.EMAIL, Constants.AREA_CODE, Constants.LOCAL_NUMBER));
        pax.clickContinue();

        TravelEssentialsPage essentials = new TravelEssentialsPage(driver);
        essentials.clickContinue();
        essentials.clickWithoutBags();

        TravelExtrasPage extras = new TravelExtrasPage(driver);
        extras.clickContinue();

        PurchasePage purchase = new PurchasePage(driver);
        purchase.selectCardType();
        purchase.sendKeysCardNumber("4002933640008365");
        purchase.selectExpiryMonth();
        purchase.selectExpiryYear();
        purchase.sendKeysCVVNumber("123");
        purchase.sendKeysFirstName("John");
        purchase.sendKeysFamilyName("Blare");
        purchase.sendKeysAddressLine1("Street 1");
        purchase.sendKeysAddressLine2("Street 2");
        purchase.sendKeysCity("dub");
        purchase.sendKeysState("dub");
        purchase.selectCountry();


        ConfirmationPage confirmation = new ConfirmationPage(driver);
        confirmation.takePNR();

    }
}
