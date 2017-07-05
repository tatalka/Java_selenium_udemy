package Generics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by olewc on 7/5/2017.
 */
public class JavaScriptExecution {

    private WebDriver driver;
    String baseUrl;
    private JavascriptExecutor js;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl = "https://letskodeit.teachable.com/pages/practice";
        js = (JavascriptExecutor) driver;

        // maximize browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test01() throws Exception{
        // Navigation old style
        // driver.get(baseUrl);

        // Navigation using JavaScript
        js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice'");


        // find an element old way
        // WebElement textBox = driver.findElement(By.id("name"));
        Thread.sleep(3000); // bez tego sleepa program nie działa, bo js nie znajduje elementu
        // trochę to bez sensu, zwykłe wywołanie findElement działa bez zarzutu
        WebElement textBox = (WebElement) js.executeScript("return document.getElementById('name');");
        textBox.sendKeys("testing string");

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }


}

