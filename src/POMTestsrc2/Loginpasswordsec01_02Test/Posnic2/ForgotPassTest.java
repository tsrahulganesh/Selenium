package POMTestsrc2.Loginpasswordsec01_02Test.Posnic2;

import POMpages.Loginpasswordsec01_02page.Posnic2.ForgotPass;
import POMpages.Loginpasswordsec01_02page.Posnic2.Loginpage;
import Utility.OpenUrl;
import org.testng.annotations.Test;

import java.io.IOException;

public class ForgotPassTest extends OpenUrl {

    @Test
    public void ForgotPassTest1() throws IOException {

       /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://10.20.50.61/erp/");*/

        Loginpage login = new Loginpage(driver);
        login.clickForgotPass();


        ForgotPass Forgot = new ForgotPass (driver);
        Forgot.setFavorite("sholoy");

        Forgot.clickbutton();
    }
}









