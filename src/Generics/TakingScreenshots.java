package Generics;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by olewc on 7/6/2017.
 */
public class TakingScreenshots {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl = "https://www.expedia.com";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get(baseUrl);
        driver.findElement(By.id("tab-flight-tab")).click();

        // find elements
        Thread.sleep(2000);
        WebElement flight_origin = driver.findElement(By.id("flight-origin"));
        WebElement flight_destination = driver.findElement(By.id("flight-destination"));
        WebElement departure_date = driver.findElement(By.id("flight-departing"));
        WebElement return_date = driver.findElement(By.id("flight-returning"));
        WebElement search = driver.findElement(By.id("search-button"));

        // perform actions
        Thread.sleep(2000);
        flight_origin.click();
        flight_origin.sendKeys("New York");
        Thread.sleep(2000);
        flight_destination.sendKeys("New York");
        Thread.sleep(2000);
        departure_date.sendKeys("07/07/2017");
        Thread.sleep(2000);
        return_date.sendKeys("07/07/2017");
        Thread.sleep(2000);
        search.click();
    }

    // metoda generujaca nowa nazwe dla pliku?
    public static String getRandomString(int length){
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyz1234567890";
        for(int i = 0; i< length; i++){
            int index = (int) Math.random() * characters.length();
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        String fileName = getRandomString(10) + ".png";
        String directory = "F:\\Screenshots";

        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File(directory+ "\\"+ fileName));


    }

}
