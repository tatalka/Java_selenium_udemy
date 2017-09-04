package testPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.classes.SearchPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by olewc on 21/08/2017.
 */
public class PageObjectModel {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp(){
        driver = new ChromeDriver();

        baseUrl = "https://www.expedia.ie/";

        // maximize browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get(baseUrl);
        SearchPage.clickHistoryHeader(driver);

        SearchPage.navigateToFlightsTab(driver);
        SearchPage.fillOriginTextBox(driver,"New York");
        Thread.sleep(3000);
        SearchPage.destinationTextBox(driver).sendKeys("Chicago");
        Thread.sleep(3000);
        SearchPage.departureDateTextBox(driver).sendKeys("25/12/2017");
        Thread.sleep(3000);
        SearchPage.returnDateTextBox(driver).clear();
        SearchPage.returnDateTextBox(driver).sendKeys("31/12/2017");
        Thread.sleep(3000);
        SearchPage.clickOnSearchButton(driver);
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
