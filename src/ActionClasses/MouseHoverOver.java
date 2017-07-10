package ActionClasses;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by olewc on 7/10/2017.
 */
public class MouseHoverOver {
    WebDriver driver;
    String baseUrl;
    JavascriptExecutor jse;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl = "https://letskodeit.teachable.com/pages/practice";
        jse = (JavascriptExecutor)driver;
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get(baseUrl);
        jse.executeScript("window.scrollBy(0,600);");
        Thread.sleep(2000);

        WebElement mainElement = driver.findElement(By.id("mousehover"));

        // tworze klase actions - ona robi różne akcje w javascripcie - m. innymi klika albo hoveruje
        Actions actionHover = new Actions(driver);

        // trzeba okreslic jaka to ma byc akcja, a potem potwierdzic .perform()
        actionHover.moveToElement(mainElement).perform();

        Thread.sleep(2000);
        WebElement subElement = driver.findElement(By.xpath(".//*[@class='mouse-hover']//a[text()='Top']"));

        // za pomoca tej klasy mozna rowniez kliknac w guzik
        actionHover.moveToElement(subElement).click().perform();

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
