package waittypes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by olewc on 6/13/2017.
 */
public class ExplicitWaitExample {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl = "http://letskodeit.teachable.com/p/practice";
    }

    @Test
    public void test(){
        driver.get(baseUrl);
        WebElement loginLink = driver.findElement(By.linkText("Login"));
        loginLink.click();

        WebDriverWait wait = new WebDriverWait(driver, 3);


        // explicit wait stosuje sie do tego konkretnego elementu a nie globalnie
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
        emailField.sendKeys("poziomka");
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
