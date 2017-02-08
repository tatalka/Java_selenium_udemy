package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



/**
 * Created by olewc on 06/02/2017.
 */
public class FirstTestClass {

    public static void main(String[] args) {
        String baseURL = "http://www.onet.pl";
        System.setProperty("webdriver.gecko.driver","E:\\developernia\\selenium-java-3.0.1\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        driver.get(baseURL);
//        driver.close();
        System.setProperty("webdriver.chrome.driver","E:\\developernia\\selenium-java-3.0.1\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get(baseURL);
        

    }
}

