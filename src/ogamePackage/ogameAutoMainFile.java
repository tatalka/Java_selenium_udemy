package ogamePackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by olewc on 6/21/2017.
 */
public class ogameAutoMainFile {
    WebDriver driver;
    WebElement element;
    String loginUrl;
    String password;
    String username;
    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        loginUrl = "https://pl.ogame.gameforge.com/";
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

    }

    @Test
    public void mainTest(){
        driver.get(loginUrl);
        element = driver.findElement(By.id("loginBtn"));
        element.click();
        element = driver.findElement(By.id("usernameLogin"));
        element.sendKeys("pimpek");
        element = driver.findElement(By.id("passwordLogin"));
        element.sendKeys("truskawka");
        Select listaUniwersow = new Select((driver.findElement(By.id("serverLogin"))));
        listaUniwersow.selectByVisibleText("Uriel");
        element = driver.findElement(By.id("loginSubmit"));
        element.click();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        //driver.quit();
    }
}
