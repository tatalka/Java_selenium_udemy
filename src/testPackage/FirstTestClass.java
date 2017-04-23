package testPackage;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstTestClass {

    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","E:\\developernia\\selenium-java-3.0.1\\geckodriver.exe");
        // od Selenium 3.1 i nowszych trzeba ustawiać właściwości tak jak wyżej, więc poprzednie wersje tego nie potrzebowały
        // property musi być ustawione ZANIM zainicjalizujemy driver.
        String baseURL = "http://www.onet.pl";

        // w tym filmiku pokazują sposób użycia DesiredCapabilities:
        DesiredCapabilities caps = DesiredCapabilities.firefox(); // tutaj ustawiamy ze chcemy kfirefoxa
        caps.setPlatform(Platform.WIN10);
        caps.setBrowserName("firefox");

        // nowy sposób inicjalizacji webdrivera, używa ustawień zdefiniowanych w klasie DesiredCapabilities
        // póki co ustawienia te nie mają znaczenia, jako platforme można podać coś innego, ale będzie to miało znaczenie
        // jak zacznie się używać grida.
        driver = new FirefoxDriver(caps);
        driver.get(baseURL);
        driver.manage().window().maximize();

        driver.quit();
    }
}

