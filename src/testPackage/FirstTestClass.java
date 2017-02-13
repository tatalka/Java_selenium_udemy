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
        // tak znajduduje sie po nazwie klasy - uwaga, klasy zazwyczaj nie sa unikatowe!.
        driver.findElement(By.className("title")).click();
    }
}

