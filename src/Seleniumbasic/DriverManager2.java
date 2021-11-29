package Seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverManager2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver","C:\\Selenium Installers\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://naukri.com");
        driver.manage().window().maximize();

        //System.setProperty("webdriver.edge.driver","C:\\Selenium Installers\\Selenium\\Drivers\\msedgedriver.exe");
        WebDriverManager.edgedriver().setup();
        WebDriver driver1 = new EdgeDriver();
        driver1.get("https://outlook.live.com/mail/0/inbox");

        //driver1.get("http://naukri.com");
        driver1.manage().window().maximize();
    }
}








