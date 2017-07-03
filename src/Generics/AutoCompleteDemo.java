package Generics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by olewc on 6/25/2017.
 */
public class AutoCompleteDemo {
    WebDriver driver;
    String baseUrl;
    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl = "http://www.southwest.com";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test00() {
        driver.get(baseUrl);
        String searchingText = "New York/Newark, NJ - EWR";
        String partialText = "New York";

        WebElement departTextBox = driver.findElement(By.id("air-city-departure"));
        departTextBox.sendKeys(partialText);

        WebElement autocompleteElement = driver.findElement(By.id("air-city-departure-menu"));
        List<WebElement> results = autocompleteElement.findElements(By.tagName("li"));
        int sizeOfList = results.size();
        System.out.println(sizeOfList);

        for(WebElement result : results ){
            if (result.getText().equals(searchingText)){
                result.click();
                System.out.println("znalazlem tekst : " + result.getText());
            }
            else{
                System.out.println(result.getText());
            }

        }
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
