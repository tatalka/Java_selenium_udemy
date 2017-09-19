package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by olewc on 7/24/2017.
 */
public class SearchPage {
    public static WebElement element = null;

    public static void clickLogo(WebDriver driver){
        element = driver.findElement(By.id("header-logo"));
        element.click();
    }

    public static WebElement originTextBox(WebDriver driver){
        element = driver.findElement(By.id("flight-origin-hp-flight"));
        return element;
    }

    public static void fillOriginTextBox(WebDriver driver, String origin){
        element = originTextBox(driver);
        element.sendKeys(origin);
    }

    public static WebElement destinationTextBox(WebDriver driver){
        element = driver.findElement(By.id("flight-destination-hp-flight"));
        return element;
    }

    public static void fillDestinationTextBox(WebDriver driver, String destination){
        element = destinationTextBox(driver);
        element.sendKeys(destination);
    }

    public static WebElement departureDateTextBox(WebDriver driver){
        element = driver.findElement(By.id("flight-departing-hp-flight"));
        return element;
    }

    public static void fillDepartureDateTextBox(WebDriver driver, String departureDate){
        element = departureDateTextBox(driver);
        element.sendKeys(departureDate);
    }

    // returns the return date text box element
    public static WebElement returnDateTextBox(WebDriver driver){
        element = driver.findElement(By.id("flight-returning-hp-flight"));
        return element;
    }

    public static void fillReturnDateTextBox (WebDriver driver, String returnDate){
        element = returnDateTextBox(driver);
        element.sendKeys(returnDate);
    }

    // returns the search button box element
    public static WebElement serchButton(WebDriver driver){
        //element = driver.findElement(By.id("search-button")); // div.cols-nested:nth-child(22) > label:nth-child(1)
        element = driver.findElement(By.cssSelector("div.cols-nested:nth-child(22) > label:nth-child(1)"));
        return element;
    }

    // click on the search button
    public static void clickOnSearchButton(WebDriver driver){
        element = serchButton(driver);
        element.click();
    }

    // navigate to flights page
    public static void navigateToFlightsTab(WebDriver driver){
        element = driver.findElement(By.id("tab-flight-tab-hp"));
        element.click();
    }

    // click on advanced link
    public static  void clickOnAdvancedLink(WebDriver driver){
        element = driver.findElement(By.id("flight-advanced-options-hp-flight"));
        element.click();
    }

    //click on direct flight checkbox
    public static void clickNonStopCheckBox(WebDriver driver){
        element = driver.findElement(By.id("advanced-flight-nonstop-label-hp-flight"));
        element.click();
    }

    // click on first element / first class from the drop down

    public static void selectFlightClass(WebDriver driver, String flightClass){
        Select options = new Select(driver.findElement(By.id("flight-advanced-preferred-class-hp-flight")));
        options.selectByValue(flightClass);
    }

}
