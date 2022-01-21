package POMTestsrc2.Invoiceplanclient;

import POMpages.client.Forgotpass;
import POMpages.client.Login;
import Utility.Openurl2;
import org.testng.annotations.Test;

import java.io.IOException;


public class ForgotpassTest extends Openurl2 {

    @Test
    public void forgotPassTest() throws IOException {
        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.get("http://[::1]/ip-8am/index.php/sessions/login");
        driver.get(getUrl());*/

        Login login = new Login(driver);
        login.clickForgotPass();

        Forgotpass forgotpass  =new Forgotpass(driver);

        forgotpass.setTxtemail("amol@gmail.com");
        //forgotpass.clickReset();
    }

}












