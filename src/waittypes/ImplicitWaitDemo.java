package waittypes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by olewc on 6/12/2017.
 */
public class ImplicitWaitDemo {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl = "http://letskodeit.teachable.com/p/practice";
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void test(){
        driver.get(baseUrl);
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("user_email")).sendKeys("poziomka");

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
