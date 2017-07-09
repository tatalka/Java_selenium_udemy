package Generics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by olewc on 7/9/2017.
 */
public class SwitchingToIframe {
    WebDriver driver;
    JavascriptExecutor js;
    String baseUrl;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        baseUrl = "https://letskodeit.teachable.com/pages/practice";
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get(baseUrl);
        js.executeScript("window.scrollBy(0,1000);");
        // przelaczanie do Iframe

        // 1) zapomoca id
        //driver.switchTo().frame("courses-iframe");
        // 2) za pomoca name
        //driver.switchTo().frame("iframe-name");
        // 3) za pomoca numeru kolejnego ramki
        driver.switchTo().frame(0);
        driver.findElement(By.id("search-courses")).sendKeys("poziomka");

        // przelaczenie sie z powrotem do glownego okna
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        // przewine zeby bylo widac
        js.executeScript("window.scrollBy(0,-900);");
        // i wpisze cos do okna znowu
        driver.findElement(By.id("name")).sendKeys("druga poziomka");

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
