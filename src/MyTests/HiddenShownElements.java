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
public class HiddenShownElements {
    WebDriver driver;
    String baseUrl1;
    String baseUrl2;

    // wyglada na to ze że tutaj nie było żadnych ćwiczeń na kod
    // chodziło tylko o wytłumaczenie że elementy mogą być cały czas
    // dostępne, tylko nie pokazane na ekranie => w trybie hidden. cały czas
    // jest do nich dostęp.

    @Before
    public void startUp(){
        driver = new FirefoxDriver();
        baseUrl1 = "http://letskodeit.teachable.com/pages/practice";
        baseUrl2 = "http://expedia.com";
    }

    @Test
    public void test01(){
        driver.get(baseUrl1);

        WebElement textBox = driver.findElement(By.id("displayed-text"));
        WebElement showButton = driver.findElement(By.id("show-textbox"));
        WebElement hideButton = driver.findElement(By.id("hide-textbox"));

        System.out.println("Text Box Displayed: " + textBox.isDisplayed());
        hideButton.click();
        System.out.println("Text Box Displayed: " + textBox.isDisplayed());
    }

    @Test
    public void test02(){
        driver.get(baseUrl2);
        WebElement childDropdown = driver.findElement(By.id("package-1-age-select-1"));

        System.out.println("Child dropdown displayed: " + childDropdown.isDisplayed());
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}

