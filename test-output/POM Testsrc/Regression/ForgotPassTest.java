package Regression;

import POMpages.ForgotPass;

import POMpages.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import util.OpenUrl;


import java.io.IOException;

import static Utility.ConfigReader.getPassword;
import static Utility.ConfigReader.getUsername;
import static util.OpenUrl.driver;

public class ForgotPassTest extends OpenUrl {

    @Test
    public void ForgotPassTest1() throws IOException {

       /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://10.20.50.61/erp/");*/

        Login login = new Login(driver);
        login.clickForgotPass();




        ForgotPass Forgot = new ForgotPass (driver);
        Forgot.setTxtUsername("abansode2");

        Forgot.clickbutton();
    }
}









