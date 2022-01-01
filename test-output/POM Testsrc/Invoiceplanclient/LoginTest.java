package Invoiceplanclient;

import POMpages.Loginpasswordsec01_02page.Login;

import Utility.Openurl2;
import org.testng.annotations.Test;
import Utility.OpenUrl;

import java.io.IOException;


public class LoginTest  extends Openurl2 {

    @Test
    public void LoginTest1() throws IOException {

                /*WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();

                driver.get("https://10.20.50.61/erp/");*/

        Login login = new Login(driver);

        login.setTxtUsername(getUsername());
        login.setTxtPassword(getPassword());
        login.clickLogin();

    }


}