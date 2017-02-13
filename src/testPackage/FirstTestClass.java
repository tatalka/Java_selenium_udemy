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

        // znajdowanie elementu po selektorze CSS
        /*
        teoretycznie id powinny byc unikatowe, ale zdarza sie ze nie jest
        wtedy mozna :
        1) input[id=displayed-text]  -> najdluzszy sposob. nazwa tagu, id
        2) #displayed-text   -> znajdzie wszystkie elementy z takim id, bo # to wlasnie id.
            oczywiscie wywali sie, bo selenium zglupieje jak nie bedzie jednego elementu
        3) input#displayed-text

        innym znakiem specjalnym jest "." czyli kropka, tak jak # oznaczal id, tak '.' oznacza klase.

        .displayed-class
        input.displayed-class
         */

    }
}

