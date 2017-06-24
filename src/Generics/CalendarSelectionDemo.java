package Generics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by olewc on 6/24/2017.
 */
public class CalendarSelectionDemo {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl = "http://www.expedia.com";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get(baseUrl);

        // click on flights tab
        driver.findElement(By.id("tab-flight-tab")).click();

        // click on depart tab
        driver.findElement(By.id("flight-departing")).click();

        // ten test nie dziala - po kliknieciu w element lista rozwija sie i znika, wiec nie mozna wybrac dnia. na stronie kursu nie odpowiedzial
        System.out.println("kliknalem");
        Thread.sleep(5000);

        WebElement dateToSelect = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()=1]//button[text()='30']"));
        dateToSelect.click();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();


    }
}
