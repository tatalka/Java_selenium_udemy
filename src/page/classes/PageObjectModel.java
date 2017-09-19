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
        PropertyConfigurator.configure("F:\\Git_folder\\Java_selenium_udemy\\log4jFile.properties");
        driver = new FirefoxDriver();
        baseUrl = "https://www.expedia.com/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test01(){
        driver.get(baseUrl);
        SearchPage.navigateToFlightsTab(driver);
        log.info("navigate to flights tab");
        SearchPage.fillOriginTextBox(driver,"New York");
        log.info("enter the origin city");
        SearchPage.fillDestinationTextBox(driver,"Chicago");
        log.info("enter the destination city");
        SearchPage.fillDepartureDateTextBox(driver, "25/12/2017");
        log.info("enter departure date");
        SearchPage.fillReturnDateTextBox(driver, "31/12/2017");
        log.info("enter return date");
        SearchPage.clickOnSearchButton(driver);
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}