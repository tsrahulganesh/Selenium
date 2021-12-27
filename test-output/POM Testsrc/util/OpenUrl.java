package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import static Utility.ConfigReader.getUrl;
public class OpenUrl {
    public static WebDriver driver;

            @BeforeClass
    public void openBrowser() throws IOException {
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();

                driver.get("https://10.20.50.61/erp/");
            }

}
