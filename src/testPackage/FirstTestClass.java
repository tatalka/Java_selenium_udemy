package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestClass {

    public static void main(String[] args) {
    // selenium w chrome
        String baseURL = "http://www.google.com";

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","E:\\developernia\\selenium-java-3.0.1\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(baseURL);

        driver.quit();
    }
}

