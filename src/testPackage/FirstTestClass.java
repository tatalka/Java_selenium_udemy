package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestClass {

    public static void main(String[] args) {

        String baseURL = "https://letskodeit.teachable.com/p/practice";
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);

        // teraz zrobie wyszukiwanie elementu po klasie.klasy nie musza, a wrecz czesto nie sa unikatowe na stronie.
        // w poniższym wyslaniu znakow nie ma pewności dokad poleca, bo są dwa elementy "inputs".
        // driver.findElement(By.className("inputs")).sendKeys("poziomka");
        // przed nazwa klasy mozna jak najbardziej podac nazwe tagu ktory ma ta klase tak jak w ponizszym:
        //driver.findElement(By.cssSelector("input.inputs")).sendKeys("gruszka");
        // jezeli element ma wiecej niz jedna klase, zeby go odnalezc, trzeba podac wszystkie (ponizej - dwie)
        //driver.findElement(By.cssSelector("input[class='inputs displayed-class']")).sendKeys("truskawka");
        // mozna rowniez to zrobic w ten sposob - tutaj nie ma znaczenia kolejnosc wypisanych klas:
        driver.findElement(By.cssSelector(".inputs.displayed-class")).sendKeys("jablko");
    }
}

