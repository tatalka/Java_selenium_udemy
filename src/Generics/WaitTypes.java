package Generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by olewc on 6/15/2017.
 */
public class WaitTypes {
    WebDriver driver;

    public WaitTypes(WebDriver driver){
        this.driver = driver;
    }

    public WebElement waitForElement(By locator, int timeout){
        WebElement element = null;

        try{
            System.out.println("Waiting for max:: " + timeout + " sedonds for element.");
            WebDriverWait wait = new WebDriverWait(driver, timeout);

            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

            System.out.println("Element appeared on webpage.");
        }
        catch(Exception e){
            System.out.println("Element not appeared on the web page");
        }
        return  element;
    }
}
