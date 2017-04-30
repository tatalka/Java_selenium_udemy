package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestClass {

    public static void main(String[] args) {
        WebDriver driver;
        String baseURL = "https://pl.ogame.gameforge.com/";

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);

        // finding element by full text
        //driver.findElement(By.linkText("Oświadczanie o ochronie danych")).click();
        // finding element by partial text
        driver.findElement(By.partialLinkText("Oświadczanie o ")).click();


        //driver.quit();
    }
}

