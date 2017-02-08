package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstTestClass {

    public static void main(String[] args) {
    // tak sie wlacza przegladarke internet explorer
        System.setProperty("webdriver.ie.driver", "E:\\developernia\\selenium-java-3.0.1\\IEDriverServer.exe");
        String baseURL = "http://www.onet.pl";
        WebDriver driver;

        driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);

    }
}

