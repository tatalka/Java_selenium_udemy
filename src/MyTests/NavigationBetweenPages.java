package MyTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by olewc on 29/05/2017.
 */
public class NavigationBetweenPages {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl = "http://letskodeit.teachable.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void test() throws InterruptedException{
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println("Title of the page is : "+title);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is : " + currentUrl);

        String urlToNavigate = "http://google.com";
        Thread.sleep(2000);
        driver.navigate().to(urlToNavigate);

        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);
    }

    @After
    public void tearDown(){
        driver.quit();

    }

}
