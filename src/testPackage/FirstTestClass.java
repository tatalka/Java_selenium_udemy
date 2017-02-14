package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestClass {

    public static void main(String[] args) {

        String baseURL = "https://letskodeit.teachable.com/p/practice";
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);

        // finding children elements
        // '>' wskazuje na child element
        driver.findElement(By.cssSelector("fieldset>input#displayed-text")).sendKeys("jablko");



    }
}

