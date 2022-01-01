package Invoiceplanclient;
import POMpages.client.Forgotpass;
import POMpages.client.Login;
import Utility.OpenUrl;
import Utility.Openurl2;
import org.testng.annotations.Test;
import java.io.IOException;


public class ForgotpassTest extends Openurl2 {

        @Test
        public void ForgotPassTest1() throws IOException {

       /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://10.20.50.61/erp/");*/

            Login login = new Login(driver);
            login.clickForgotPass();




            ForgotpassTest Forgot = new ForgotpassTest (driver);
            Forgot.setFavorite("sholoy");

            Forgot.clickbutton();
        }
    }










}
