package Seleniumbasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closequit {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http:\\Naukri.com");
        driver.manage().window().maximize();
        driver.getTitle();
        driver.getCurrentUrl();
        driver.close();
        driver.quit();
    }

}
