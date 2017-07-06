package Generics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by olewc on 7/6/2017.
 */
public class ScrollingUsingJavaScript {
    WebDriver driver;
    JavascriptExecutor js;

    @Before
    public void setUp(){
        driver =  new FirefoxDriver();
        js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test01() throws InterruptedException {
        js.executeScript("window.location='https://letskodeit.teachable.com/pages/practice'");
        Thread.sleep(3000);

        // scroll down the page
        js.executeScript("window.scrollBy(0,1900);");


        // scroll up the page
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-1900);");


        // scroll element into view
        Thread.sleep(3000);
        WebElement MouseHoverButton = driver.findElement(By.id("mousehover"));
        js.executeScript("arguments[0].scrollIntoView(true);",MouseHoverButton);
        // element hidden so few lines down
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-200);");


    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
