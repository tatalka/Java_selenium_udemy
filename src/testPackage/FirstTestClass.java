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

        // wildcards w wyszukiwaniu:
        // "^"  -> represents starting text (starts with)
        // tutaj po dostawieniu daszka znajdzie dwa takie elementy - jeden mial klase inputs
        // a drugi dwie klasy :  inputs i displayed-class
        // driver.findElement(By.cssSelector("input[class^='inputs']")).sendKeys("jablko");
        // "$"  -> represents ending text
        // w przykladzie ponizszym bez dolara nie znalazly tego elementu, poniewaz ma on rowniez
        // klase 'inputs'. Dolar jako wildcard zalatwia sprawe bo mowi - klasy koncza sie na [blabla]
        // po dolarze nie musi byc kompletna nazwa klasy, wystarczy kawalek. BTW - to moze byc dowolny
        // atrybut, nie musi byc klasa, tez bedzie dzialac.
        // driver.findElement(By.cssSelector("input[class='displayed-class'")).sendKeys("gruszka");
        // "*"  -> represents the text contained
        // gwiazdka pozwala na znalezienie atrybutu ktorego wartosc po prostu zawiera wyslany string:
        driver.findElement(By.cssSelector("input[placeholder*='Enter'")).sendKeys("pomarancza");


    }
}

