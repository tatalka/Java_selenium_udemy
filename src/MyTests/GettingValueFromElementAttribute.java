package MyTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by olewc on 07/06/2017.
 */
public class GettingValueFromElementAttribute {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl = "https://letskodeit.teachable.com/p/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test01(){
        driver.get(baseUrl);
        WebElement pageElement = driver.findElement(By.id("name"));
        String attributeVale = pageElement.getAttribute("class");
        String typeAttributeValue = pageElement.getAttribute("type");
        System.out.println("Value of attribute is : " + attributeVale);
        System.out.println("Value of attribute is : " + typeAttributeValue);
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
