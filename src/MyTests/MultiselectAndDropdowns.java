package MyTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by olewc on 04/06/2017.
 */
public class MultiselectAndDropdowns {
    WebDriver driver;
    String baseUrl1;
    String baseUrl2;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl1 = "http://www.expedia.com/";
        baseUrl2 = "http://html.com/attributes/select-multiple/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test01(){
        driver.get(baseUrl1);
        Select sel1 = new Select(driver.findElement(By.id("package-1-adults")));
        Select sel2 = new Select(driver.findElement(By.id("package-1-children")));

        // first example -> selecting by value
        sel1.selectByValue("6");

        // i can take all the values into the list element
        List<WebElement> options = sel1.getOptions();

        for (int i = 0; i < options.size(); i++){

            System.out.println(options.get(i).getText());
        }

        // second example - select by index
        sel2.selectByIndex(2);
    }

    @Test
    public void test02(){
        driver.get(baseUrl2);
        Select selection1 = new Select(driver.findElement(By.xpath(".//*[@id='post-291']//select")));
        selection1.selectByValue(("American"));
        selection1.selectByValue(("Andean"));
        selection1.selectByValue(("Greater"));
        selection1.selectByValue(("Lesser"));

        List<WebElement> chosenElements = selection1.getAllSelectedOptions();

        for(int i = 0; i < chosenElements.size(); i++){
            System.out.println("Value: " + chosenElements.get(i).getText());
        }

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
