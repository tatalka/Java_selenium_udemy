package MyTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by olewc on 03/06/2017.
 */
public class ElementLists {
    WebDriver driver;
    String baseUrl;


    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl = "https://letskodeit.teachable.com/p/practice";
    }

    @Test
    public void test01(){
        driver.get(baseUrl);
        List<WebElement> elementsList = driver.findElements(By.xpath("//input[contains(@name,'cars')]"));

        for(int i = 0; i < elementsList.size();i++){
            elementsList.get(i).click();

        }

        System.out.println("Tablica ma rozmiar : " + elementsList.size());

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
