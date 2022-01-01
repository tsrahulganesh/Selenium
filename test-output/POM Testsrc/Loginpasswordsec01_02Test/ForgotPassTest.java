package Loginpasswordsec01_02Test;

import POMpages.Loginpasswordsec01_02page.ForgotPass;

import POMpages.Loginpasswordsec01_02page.Login;
import org.testng.annotations.Test;
import Utility.OpenUrl;


import java.io.IOException;

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
        Forgot.setFavorite("sholoy");

        Forgot.clickbutton();
    }
}









