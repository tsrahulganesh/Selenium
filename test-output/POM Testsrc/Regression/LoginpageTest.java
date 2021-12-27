package Regression;

import POMpages.Login;
import POMpages.Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

import static Utility.ConfigReader.getUrl;


public class LoginpageTest {



    @Test
    public void LoginpageTest1() throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://10.20.50.61/erp/");

        Loginpage login = new Loginpage(driver);

        login.setTxtUsername("abansode");
        login.setTxtPassword("erp");
        login.clickLogin();

    }


}
