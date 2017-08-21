package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Created by olewc on 06/02/2017.
 */
public class FirstTestClass {

    public static void main(String[] args) {
        String baseURL = "http://www.onet.pl";
        System.setProperty("webdriver.gecko.driver","E:\\developernia\\SeleniumDrivery\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        driver.get(baseURL);
//        driver.close();
        System.setProperty("webdriver.chrome.driver","E:\\developernia\\SeleniumDrivery\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get(baseURL);

        chromeDriver.quit();
        

    }
}

