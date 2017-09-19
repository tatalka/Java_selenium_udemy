package page.classes;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_TestCase {
    private WebDriver driver;
    private String baseUrl;
    static Logger log = Logger.getLogger(TestNG_TestCase.class);

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        baseUrl = "https://www.expedia.com/";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PropertyConfigurator.configure("F:\\Git_folder\\Java_selenium_udemy\\log4jFile.properties");
        driver.get(baseUrl);
    }

    @Test
    public void test1_fillBasicInfo() throws Exception {
        SearchPage.navigateToFlightsTab(driver);
        SearchPage.fillOriginTextBox(driver, "New York");
        SearchPage.fillDestinationTextBox(driver, "Chicago");
        SearchPage.fillDepartureDateTextBox(driver, "12/25/2014");
        SearchPage.fillReturnDateTextBox(driver, "12/31/2014");
        Thread.sleep(3000);
    }

    @Test
    public void test2_fillAdvancedInfo() {
        SearchPage.clickOnAdvancedLink(driver);
        SearchPage.clickNonStopCheckBox(driver);
        SearchPage.selectFlightClass(driver, "first");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
