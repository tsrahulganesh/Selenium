package Seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverManager2 {

    public static void main(String[] args) {

        //System.setProperty("webdriver.edge.driver","C:\\Selenium Installers\\Selenium\\Drivers\\msedgedriver.exe");
        //System.setProperty("webdriver.edge.driver","Drivers/msedgedriver.exe");
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        //driver.get("https://outlook.live.com/mail/0/inbox");
        driver.get("https://scriptinglogic.org/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle()); //Outlook – free personal email and calendar from Microsoft
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
    }
}








