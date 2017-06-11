package Generics;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by olewc on 08/06/2017.
 */
public class IsElementPresentDemo {
    private WebDriver driver;
    private String baseUrl;
    public GenericMethods gm;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl = "https://letskodeit.teachable.com/p/practice";
        gm = new GenericMethods(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test01ElementPresent(){
        driver.get(baseUrl);
        boolean result = gm.isElementPresent("//input[@id='name']", "xpath");
        System.out.println("Element is present ? : " + result);

        result = gm.isElementPresent("//input[@id='name_not_existing']", "xpath");
        System.out.println("Element is present ? : " + result);
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
