package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestClass {

    public static void main(String[] args) {

        String baseURL = "http://demostore.x-cart.com";
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
        // ten znajduje wylacznie caly tekst:
        driver.findElement(By.linkText("Contact us")).click();
        // a temu wystarczy kawalek:
        driver.findElement(By.partialLinkText("Contact")).click();
        // na tej stronie z kursu cwiczenie nie dziala - prawdopodobnie
        // dlatego, ze tekst nie jest w "anchor" tylko w "span"

    }
}

