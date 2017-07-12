package ActionClasses;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by olewc on 7/11/2017.
 */
public class UsingSliders {
    WebDriver driver;
    String baseUrl;
    Actions actions;

    @Before
    public void startUp(){
        driver = new FirefoxDriver();
        baseUrl = "http://jqueryui.com/slider/";
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get(baseUrl);
        driver.switchTo().frame(0);
        WebElement element = driver.findElement(By.xpath(".//*[@id='slider']/span"));
        actions = new Actions(driver);

        Thread.sleep(3000);
        actions.dragAndDropBy(element,100,0).perform();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
