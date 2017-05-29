package MyTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BasicActions {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://letskodeit.teachable.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void firstTest(){
        driver.get(baseUrl);
        driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/sign_in']")).click();
        System.out.println("Clicked on login link");
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("poziomka");
        System.out.println("Sending keys to username field");
        driver.findElement(By.id("user_password")).sendKeys("test");
        System.out.println("Sending keys to username field");
        driver.findElement(By.id("user_email")).clear();
        System.out.println("Clearing the username field");
    }

    @After
    public void tearDown() throws Exception {
        //driver.quit();
    }
}