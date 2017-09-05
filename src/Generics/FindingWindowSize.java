package Generics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by olewc on 7/5/2017.
 */
public class FindingWindowSize {
    WebDriver driver;
    String baseUrl;
    JavascriptExecutor js;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;

        // maximize window & timeouts
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test01() {
        // opening website with JavaScript
        js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice'");

        // finding size of window // znowu musze czekac żeby znalazło
        long height = (long) js.executeScript("return window.innerHeight;");
        long width = (long) js.executeScript("return window.innerWidth;");

        System.out.println("Width : " + width + " height : " + height);

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
