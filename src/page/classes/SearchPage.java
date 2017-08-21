package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by olewc on 21/08/2017.
 */
public class SearchPage {
    public static WebElement element = null;

    //  Returns the flight origin text box element

    public static WebElement originTexBox(WebDriver driver){
        element = driver.findElement(By.id("flight-origin-hp-flight"));
        return element;
    }

    public static void fillOriginTextBox (WebDriver driver, String origin){
        element = originTexBox(driver);
        element.sendKeys(origin);
    }

    public static WebElement destinationTextBox(WebDriver driver){
        element = driver.findElement(By.id("flight-destination-hp-flight"));
        return element;
    }

    public static WebElement departureDateTextBox(WebDriver driver){
        element = driver.findElement(By.id("flight-departing-hp-flight"));
        return element;
    }

    public static WebElement returnDateTextBox(WebDriver driver){
        element = driver.findElement(By.id("flight-returning-hp-flight"));
        return element;
    }

    public static WebElement searchButton(WebDriver driver){
        element = driver.findElement(By.cssSelector("#gcw-flights-form-hp-flight > div:nth-child(22) > label > button"));
        //element = driver.findElement(By.id("search-button"));
        return element;
    }

    public static void clickOnSearchButton(WebDriver driver){
        element = searchButton(driver);
        element.click();
    }

    public static void navigateToFlightsTab(WebDriver driver){
        element = driver.findElement(By.id("tab-flight-tab-hp"));
        element.click();
    }



}


