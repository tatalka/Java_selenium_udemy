package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestClass {

    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","E:\\developernia\\selenium-java-3.0.1\\geckodriver.exe");
        // od Selenium 3.1 i nowszych trzeba ustawiać właściwości tak jak wyżej, więc poprzednie wersje tego nie potrzebowały
        // property musi być ustawione ZANIM zainicjalizujemy driver.
        String baseURL = "http://www.onet.pl";

        // mozna już zainicjalizować drivera tutaj:
        driver = new FirefoxDriver();
        driver.get(baseURL);

        // driver.close(); // to polecenie nie działa. nie wiem czemu, quit tak.
        driver.quit();
    }
}

