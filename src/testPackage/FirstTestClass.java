package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestClass {

    public static void main(String[] args) {

        //System.setProperty("webdriver.gecko.driver","C:\\olew\\selenium_drivers\\geckodriver.exe");
        String baseURL = "http://www.google.com";
        WebDriver driver;

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);

    }
}

