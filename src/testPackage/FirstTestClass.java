package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestClass {

    public static void main(String[] args) {
        WebDriver driver;
        String baseURL = "http://demostore.x-cart.com/";

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);

        driver.findElement(By.tagName("a")).click();

        //driver.quit();
    }
}

