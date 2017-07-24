package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by olewc on 7/24/2017.
 */
public class SearchPage {
    public static WebElement element = null;

    // returns the flight origin text box element
    public static WebElement originTextBox(WebDriver driver){
        element = driver.findElement(By.id("flight-origin"));
        return element;
    }

    public static void fillOriginTextBox(WebDriver driver, String origin){
        element = originTextBox(driver);
        element.sendKeys(origin);
    }

    // returns the flight destination text box element
    public static WebElement destinationTextBox(WebDriver driver){
        element = driver.findElement(By.id("flight-destination"));
        return element;
    }

    // returns the departure date text box element flight-departing
    public static WebElement departureDateTextBox(WebDriver driver){
        element = driver.findElement(By.id("flight-departing"));
        return element;
    }

    // returns the return date text box element
    public static WebElement returnDateTextBox(WebDriver driver){
        element = driver.findElement(By.id("flight-returning"));
        return element;
    }

    // returns the search button box element
    public static WebElement serchButton(WebDriver driver){
        element = driver.findElement(By.id("search-button"));
        return element;
    }

    // click on the search button
    public static void clickOnSearchButton(WebDriver driver){
        element = serchButton(driver);
        element.click();
    }

    // navigate to flights page
    public static void navigateToFlightsTab(WebDriver driver){
        element = driver.findElement(By.id("tab-flight-tab"));
        element.click();
    }
}
