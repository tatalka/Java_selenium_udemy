package usefulmethods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by olewc on 21/02/2017.
 */
public class GetTextDemo {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception{
        driver = new FirefoxDriver();
        baseUrl = "https://letskodeit.teachable.com/pages/practice";

        //maximize browser window
        driver.manage().window().maximize();
        // setting timeout
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testGetText() throws Exception{
        driver.get(baseUrl);
        WebElement buttonElement = driver.findElement(By.id("opentab"));
        String elementText = buttonElement.getText();

        System.out.println("text on element is : " + elementText);
    }

    @After
    public void tearDown() throws Exception{
        Thread.sleep(5000);

    }
}
