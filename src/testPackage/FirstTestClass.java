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
        // szukanie elementu po nazwie tagu. praktycznie nie uzywane, bo tagi nie sa unikatowe
        // wiec albo sie wywali, albo kliknie w miejsce ktorego nie mozna byc pewnym
        driver.findElement(By.tagName("a")).click();
    }
}

