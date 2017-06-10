package Generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by olewc on 08/06/2017.
 */
public class GenericMethods {
    WebDriver driver;

    public GenericMethods(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getElement(String locator, String type){
        type = type.toLowerCase();
        if(type.equals("id")){
            System.out.println("Element found with id : " + locator);// tutaj chyba + locator
            return this.driver.findElement(By.id(locator));
        }
        else if (type.equals("xpath")){
            System.out.println("Element found with xpath : " + locator);
            return this.driver.findElement(By.xpath(locator));
        }
        else{
            System.out.println("Locator type not supported");
            return null;
        }
    }

    public List<WebElement> getElementList(String locator, String type){
        type = type.toLowerCase();
        if(type.equals("id")){
            System.out.println("Element fount with id : " + locator);
            return this.driver.findElements(By.id(locator));
        }
        else if(type.equals("xpath")){
            System.out.println("Element found with xpath : " + locator);
            return this.driver.findElements(By.xpath(locator));
        }
        else{
            System.out.println("Locator type not supported!");
            return null;
        }
    }
}
