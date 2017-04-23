package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstTestClass {

    public static void main(String[] args) {
    // uruchomienie testow selenium w IE 11
        String baseURL = "http://www.google.com";
        WebDriver driver;

        // dodanie do zmiennej systemowej path sciezki do katalogu z driverami
        // powoduje ze juz nie trzeba ustawiac tej zmiennej ponizje - bedzie dzialac tak czy siak.
        System.setProperty("webdriver.ie.driver","E:\\developernia\\selenium-java-3.0.1\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();

        driver.get(baseURL);


        driver.quit();
    }
}

