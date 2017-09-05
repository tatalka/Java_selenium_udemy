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
 * Created by olewc on 7/10/2017.
 */
public class DragAndDropSimulation {
    WebDriver driver;
    String baseUrl;
    Actions actions;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl = "https:/jqueryui.com/droppable";
        actions = new Actions(driver);
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get(baseUrl);

        // najpierw trzeba się przełączyć na iframe

        driver.switchTo().frame(0);

        WebElement draggableElement = driver.findElement(By.id("draggable"));
        WebElement droppableElement = driver.findElement(By.id("droppable"));

        Thread.sleep(2000);

        // pierwszy sposob przeciagniecia alementu
        // actions.dragAndDrop(draggableElement,droppableElement).perform();

        // drugi sposob przeciagniecia elementu
        actions.clickAndHold(draggableElement).moveToElement(droppableElement).release().build().perform();



    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
