package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestClass {

    public static void main(String[] args) {
        WebDriver driver;
        String baseURL = "http://www.google.com";

        //System.setProperty("webdriver.firefox.driver","E:\\developernia\\selenium-java-3.0.1\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);

        // znajdz element o takim id i wyslij do nie go tekst
        // jezeli pojawi się ten błąd podczas kompilacji :
        //Error:(20, 54) java: incompatible types: java.lang.String cannot be converted to java.lang.CharSequence[]
        // to we właściwościach projektu trzeba przestawić poziom języka na 1.8 (albo i nowszy) i bedzie ok.
        driver.findElement(By.id("lst-ib")).sendKeys("poziomka");

        // tutaj albo mogę znowu znaleźć guzik po id :
        driver.findElement(By.id("_fZl")).click();

        // albo znaleźć jego xpath (czasami nie ma id, albo po prostu łatwiej:
        //driver.findElement(By.xpath(".//*[@id='_fZl']")).click();

        //driver.quit(); // zakomentowałem bo za szybko działa i od razu zamyka
    }
}

