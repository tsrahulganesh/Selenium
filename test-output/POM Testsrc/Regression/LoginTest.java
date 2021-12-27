package Regression;

import POMpages.Login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import util.OpenUrl;

import java.io.IOException;

import static Utility.ConfigReader.*;
import static util.OpenUrl.driver;


public class LoginTest  extends OpenUrl {



        @Test
        public void LoginTest1() throws IOException {

                /*WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();

                driver.get("https://10.20.50.61/erp/");*/

                Login login = new Login(driver);

                login.setTxtUsername("abansode");
                login.setTxtPassword("erp");
                login.clickLogin();

        }


}
