package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestClass {

    public static void main(String[] args) {
        WebDriver driver;
        String baseURL = "http://letskodeit.teachable.com/pages/practice/";

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);

        // w dół po gałęzi elementów schodzę za pomocą ">"
        driver.findElement(By.cssSelector("fieldset>#openwindow")).click();

        //driver.quit();
    }
}

