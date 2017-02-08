package testPackage;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstTestClass {

    public static void main(String[] args) {
    // tak sie wlacza przegladarke chrome
        System.setProperty("webdriver.chrome.driver", "E:\\developernia\\selenium-java-3.0.1\\chromedriver.exe");
        String baseURL = "http://www.onet.pl";
        WebDriver driver;

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);

    }
}

