package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class OpenUrl3 {
    public static WebDriver driver;

            @BeforeClass
    public void openBrowser() throws IOException {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();

                driver.get("http://[::1]/ip1/index.php/sessions/login\n");
            }

}
