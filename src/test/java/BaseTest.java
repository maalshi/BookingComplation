import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by Maryia_Shynkarenka on 7/17/2017.
 */
public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void initDriver(){
        //DesiredCapabilities capabilities = new DesiredCapabilities.firefox();
        //System.setProperty("chromedriver", "D:\\webdrivers\\browsers\\chromedriver.exe" );
        System.setProperty("webdriver.gecko.driver", "D:\\webdrivers\\browsers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeDriver(){
        driver.quit();
    }
}
