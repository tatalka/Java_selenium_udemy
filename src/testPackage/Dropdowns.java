package testPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by olewc on 20/02/2017.
 */
public class Dropdowns {

    private WebDriver driver;
    private String baseUrl1;
    private String baseUrl2;

    @Before
    public void setUp() throws Exception{
        driver = new FirefoxDriver();
        baseUrl1 = "http://www.expedia.com";
        baseUrl2 = "http://www.htmlcodetutorial.com/forms/_SELECT_MULTIPLE.html";

        //maximize the window
        driver.manage().window().maximize();
        // set default timeout to 30 seconds
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testDropdown() throws Exception{
        driver.get(baseUrl1);
        Select sel1 = new Select(driver.findElement(By.id("package-1-adults")));


        Select sel2 = new Select(driver.findElement(By.id("package-1-children")));

        List<WebElement> options = sel1.getOptions();
        int size = options.size();
        System.out.println("Size of the first dropdown" + size);

        for (int i =0; i<size ; i++){
            String optionName = sel1.getOptions().get(i).getText();
            System.out.println(optionName);
        }

        // selecting by Value
        sel1.selectByValue("2");

        // selecting by Index
        // sel2.selectByIndex(2);
    }

    @Test
    public void testMultiSelect() throws  Exception{
        driver.get(baseUrl2);
        Select sel = new Select(driver.findElement(By.xpath(".//*[@id='wrapper']/article/section/div[3]/select")));
        sel.selectByValue("Chilean");
        Thread.sleep(5000);
        sel.deselectByValue("Chilean");
        sel.selectByValue("Lesser");
        sel.selectByValue("Greater");
    }

    @After
    public void tearDown() throws Exception{
        Thread.sleep(6000);
        //driver.quit();
    }

}


