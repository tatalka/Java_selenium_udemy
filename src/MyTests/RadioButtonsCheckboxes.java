package MyTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by olewc on 03/06/2017.
 */
public class RadioButtonsCheckboxes {
    WebDriver driver;
    String baseUrl;

    @Before
    public void SetUp(){
        driver = new FirefoxDriver();
        baseUrl = "https://letskodeit.teachable.com/p/practice";
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get(baseUrl);
        WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
        bmwRadioBtn.click();

        Thread.sleep(2000);

        WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
        benzRadioBtn.click();

        WebElement bmwCheckbox = driver.findElement(By.id("bmwcheck"));
        WebElement benzCheckbox = driver.findElement(By.id("benzcheck"));
        WebElement hondaCheckbox = driver.findElement(By.id("hondacheck"));

        Thread.sleep(2000);

        bmwCheckbox.click();

        Thread.sleep(2000);

        benzCheckbox.click();

        Thread.sleep(2000);

        hondaCheckbox.click();

        // sprawdzenie czy jest wybrane

        System.out.println("BMW Radio is selected? : " + bmwRadioBtn.isSelected());
        System.out.println("Benz Radio is selected? : " + benzRadioBtn.isSelected());

        System.out.println("BMW checkbox is selected? : " + bmwCheckbox.isSelected());
        System.out.println("Benz checkbox is selected? : " + benzCheckbox.isSelected());
        System.out.println("Honda checkbox is selected? : " + hondaCheckbox.isSelected());



    }

    @After
    public void tearDown() throws InterruptedException {

        Thread.sleep(2000);

        driver.quit();


    }
}
