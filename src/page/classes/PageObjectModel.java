package page.classes;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by olewc on 7/24/2017.
 */
public class PageObjectModel {

    private WebDriver driver;
    private String baseUrl;

    static Logger log = Logger.getLogger(PageObjectModel.class);


    @Before
    public void setUp(){
        PropertyConfigurator.configure("F:\\Git_folder\\Java_selenium_udemy\\log4jConsole.properties");
        driver = new FirefoxDriver();
        baseUrl = "https://www.expedia.com/";

        log.info("costam z before");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test01(){
        driver.get(baseUrl);
        SearchPage.navigateToFlightsTab(driver);
        //SearchPage.originTextBox(driver).sendKeys("New York"); // linijka nizej jeszcze czytelniej
        SearchPage.fillOriginTextBox(driver,"New York");
        SearchPage.destinationTextBox(driver).sendKeys("Chicago");
        SearchPage.departureDateTextBox(driver).sendKeys("25/12/2017");
        SearchPage.returnDateTextBox(driver).sendKeys("31/12/2017");
        SearchPage.clickOnSearchButton(driver);

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
