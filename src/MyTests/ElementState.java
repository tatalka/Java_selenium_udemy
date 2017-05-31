package MyTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by olewc on 31/05/2017.
 */
public class ElementState {

    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() throws Exception{
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @Test
    public void test1() throws  Exception{
        WebElement elementOne = driver.findElement(By.id("gs_htif0"));
        System.out.println("is element one enabled?" + elementOne.isEnabled());

        WebElement elementTwo = driver.findElement(By.id("gs_taif0"));
        System.out.println("is element two enabled?" + elementTwo.isEnabled());

        WebElement elementThree = driver.findElement(By.id("lst-ib"));
        System.out.println("is element three enabled?" + elementThree.isEnabled());


        elementOne.sendKeys("Element pierwszy");
        Thread.sleep(3000);

        elementTwo.sendKeys("Element drugi");
        Thread.sleep(3000);

        elementThree.sendKeys("Element trzeci");

        // element.sendKeys("poziomka");
        // wedlug kursu to powinno sie nie udac, bo element ma status disabled, ale
        // ale dziala mimo atrybutu "disabled"

        // wyglada wiec na to ze od czasu jak to pisal - juz mozna to robic.
        // nauka z tego odcinka taka, ze mozna sprawdzac stan elementu
    }

    @After
    public void tearDown() throws Exception{
        Thread.sleep(3000);
        driver.quit();
    }
}
