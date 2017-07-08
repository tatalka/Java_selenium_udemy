package Generics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

/**
 * Created by olewc on 7/8/2017.
 */
public class WindowHandles {
    WebDriver driver;
    String baseUrl;
    String windowHandle;
    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl = "https://letskodeit.teachable.com/pages/practice";
    }
    @Test
    public void test01(){
        driver.get(baseUrl);
        windowHandle = driver.getWindowHandle();
        System.out.println("current window handle: " + windowHandle);
        WebElement openWindowButton = driver.findElement(By.id("openwindow"));
        openWindowButton.click();

        Set<String> windowHandles = driver.getWindowHandles();

        for(String handle: windowHandles){
            System.out.println("handle : " + handle);
        }
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
