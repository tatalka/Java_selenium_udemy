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
    String parentWindowHandle;
    WebElement searchBox;
    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl = "https://letskodeit.teachable.com/pages/practice";

    }
    @Test
    public void test01() throws InterruptedException {
        driver.get(baseUrl);
        parentWindowHandle = driver.getWindowHandle();
        System.out.println("current window handle: " + parentWindowHandle);
        WebElement openWindowButton = driver.findElement(By.id("openwindow"));
        openWindowButton.click();

        // here I get all the window handles
        Set<String> windowHandles = driver.getWindowHandles();

        for(String handle: windowHandles){
            System.out.println("handle : " + handle);
            // i switch to the other window here and perform action
            if(!handle.equals(parentWindowHandle)){
                driver.switchTo().window(handle);
                Thread.sleep(2000);
                searchBox = driver.findElement(By.id("search-courses"));
                searchBox.sendKeys("python");
                Thread.sleep(2000);
                driver.close(); // rożnica taka, że close aktualne okno zamyka. tylko.
                break;
            }
        }

        // here I want to switch back to parent window
        driver.switchTo().window(parentWindowHandle);

        // just to confirm, performing action on main page
        driver.findElement(By.id("name")).sendKeys("Krzysio");

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
