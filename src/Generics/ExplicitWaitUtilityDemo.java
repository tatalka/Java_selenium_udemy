package Generics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by olewc on 6/15/2017.
 */
public class ExplicitWaitUtilityDemo {
    private WebDriver driver;
    private String baseUrl;
    WaitTypes wt;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl = "http://letskodeit.teachable.com/pages/practice";
        wt = new WaitTypes(driver);
        driver.manage().window().maximize();
    }

    @Test
    public void test(){
        driver.get(baseUrl);
        WebElement loginLink = driver.findElement(By.linkText("Login"));
        loginLink.click();

        WebElement emailField = wt.waitForElement(By.id("user_email"),3);
        emailField.sendKeys("poziomka");

        wt.clickWhenReady(By.name("commit"),3);
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}


