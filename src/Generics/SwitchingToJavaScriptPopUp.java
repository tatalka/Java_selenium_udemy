package Generics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by olewc on 7/9/2017.
 */
public class SwitchingToJavaScriptPopUp {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl = "https://letskodeit.teachable.com/pages/practice";
        driver.get(baseUrl);
    }

    @Test
    public void test01() throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys("Sebastian");
        Thread.sleep(3000);
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(3000);

        Alert alertObject = driver.switchTo().alert();
        Thread.sleep(3000);
        alertObject.accept();
    }

    @Test
    public void test02() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys("Sebastian");
        Thread.sleep(3000);
        driver.findElement(By.id("confirmbtn")).click();

        Alert confirmObject = driver.switchTo().alert();
        Thread.sleep(3000);
        confirmObject.accept();
        // a to dla cancela
        //confirm.dismiss();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
