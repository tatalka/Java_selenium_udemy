package testPackage;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstTestClass {

    public static void main(String[] args) {
    // pokazanie w działaniu klasy DesiredCapabilities
        System.setProperty("webdriver.gecko.driver","E:\\developernia\\selenium-java-3.0.1\\geckodriver.exe");

        String baseURL = "http://www.onet.pl";
        WebDriver driver;
        DesiredCapabilities caps = DesiredCapabilities.firefox();

        caps.setBrowserName("Firefox");
        caps.setPlatform(Platform.WIN10);

        driver = new FirefoxDriver(caps);
        driver.manage().window().maximize();
        driver.get(baseURL);

        // za cholerę na razie nie wiem po co ta klasa, podobno jest w użyciu przy okazji grida. 
    }
}

