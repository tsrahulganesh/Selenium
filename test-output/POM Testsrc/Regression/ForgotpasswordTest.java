package Regression;

import POMpages.Forgotpasswordpage;
import POMpages.Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class ForgotpasswordTest {

    @Test
    public void ForgotpasswordTest1() throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://10.20.50.61/erp/");

        Forgotpasswordpage Forgot = new Forgotpasswordpage(driver);

        Forgot.setTxtUsername("abansode");
        Forgot.setTxtPassword("werwe");

        Forgot.clicklink();

    }
}









