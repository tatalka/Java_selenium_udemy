package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by olewc on 09/02/2017.
 */
public class IdXPATHdemo {
    public static void main (String[] args){
        WebDriver driver = new FirefoxDriver();
        String baseURL = "http://www.google.pl";
        driver.manage().window().maximize();
        driver.get(baseURL);
        driver.findElement(By.id("lst-ib")).sendKeys("blah");
        driver.findElement(By.xpath(".//*[@id='_fZl']")).click();

    }
}
